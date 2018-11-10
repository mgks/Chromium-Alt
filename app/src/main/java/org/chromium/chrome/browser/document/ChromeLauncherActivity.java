// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.document;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.Browser;
import android.util.Log;

import org.chromium.ChromiumConfig;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.ChromeActionModeCallback;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.LaunchIntentDispatcher;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/**
 * Dispatches incoming intents to the appropriate activity based on the current configuration and
 * Intent fired.
 */
public class ChromeLauncherActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Third-party code adds disk access to Activity.onCreate. http://crbug.com/619824
        StrictMode.ThreadPolicy oldPolicy = StrictMode.allowThreadDiskReads();
        TraceEvent.begin("ChromeLauncherActivity.onCreate");
        try {
            super.onCreate(savedInstanceState);

            if (VrModuleProvider.getIntentDelegate().isVrIntent(getIntent())) {
                // We need to turn VR mode on as early as possible in the intent handling flow to
                // avoid brightness flickering when handling VR intents.
                VrModuleProvider.getDelegate().setVrModeEnabled(this, true);
            }

            @LaunchIntentDispatcher.Action
            int dispatchAction = LaunchIntentDispatcher.dispatch(this, getIntent());
            switch (dispatchAction) {
                case LaunchIntentDispatcher.Action.FINISH_ACTIVITY:
                    Log.d("MGKS1", String.valueOf(dispatchAction));
                    finish();
                    break;
                case LaunchIntentDispatcher.Action.FINISH_ACTIVITY_REMOVE_TASK:
                    Log.d("MGKS2", String.valueOf(dispatchAction));
                    ApiCompatibilityUtils.finishAndRemoveTask(this);
                    break;
                default:
                    Log.d("MGKS3", String.valueOf(dispatchAction));
                    assert false : "Intent dispatcher finished with action " + dispatchAction + ", finishing anyway";
                    finish();
                    break;
            }
        } finally {
            StrictMode.setThreadPolicy(oldPolicy);
            TraceEvent.end("ChromeLauncherActivity.onCreate");
        }
        //custom_launch(ChromeLauncherActivity.this);
    }

    public static void custom_launch(Context context){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ChromiumConfig.open_url));
        // Let Chrome know that this intent is from Chrome, so that it does not close the app when
        // the user presses 'back' button.
        intent.putExtra(Browser.EXTRA_APPLICATION_ID, context.getPackageName());
//        intent.putExtra(Browser.EXTRA_CREATE_NEW_TAB, true);
        intent.setPackage(context.getPackageName());
        context.startActivity(intent);
    }
}
