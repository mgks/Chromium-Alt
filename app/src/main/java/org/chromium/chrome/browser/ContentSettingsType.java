
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/content_settings/core/common/content_settings_types.h

package org.chromium.chrome.browser;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ContentSettingsType.CONTENT_SETTINGS_TYPE_DEFAULT,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_COOKIES,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_IMAGES,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_JAVASCRIPT,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PLUGINS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_POPUPS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_GEOLOCATION,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_NOTIFICATIONS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_AUTO_SELECT_CERTIFICATE,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_MIXEDSCRIPT,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_MEDIASTREAM_MIC,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_MEDIASTREAM_CAMERA,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PROTOCOL_HANDLERS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PPAPI_BROKER,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_AUTOMATIC_DOWNLOADS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_MIDI_SYSEX,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_SSL_CERT_DECISIONS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PROTECTED_MEDIA_IDENTIFIER,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_APP_BANNER,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_SITE_ENGAGEMENT,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_DURABLE_STORAGE,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_USB_CHOOSER_DATA,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_BLUETOOTH_GUARD,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_BACKGROUND_SYNC,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_AUTOPLAY,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_IMPORTANT_SITE_INFO,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PERMISSION_AUTOBLOCKER_DATA,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_ADS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_ADS_DATA,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_MIDI,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PASSWORD_PROTECTION,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_MEDIA_ENGAGEMENT,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_SOUND,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_CLIENT_HINTS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_SENSORS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_ACCESSIBILITY_EVENTS,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_CLIPBOARD_READ,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_CLIPBOARD_WRITE,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PLUGINS_DATA,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_PAYMENT_HANDLER,
    ContentSettingsType.CONTENT_SETTINGS_TYPE_USB_GUARD,
    ContentSettingsType.CONTENT_SETTINGS_NUM_TYPES
})
@Retention(RetentionPolicy.SOURCE)
public @interface ContentSettingsType {
  /**
   * "DEFAULT" is only used as an argument to the Content Settings Window opener; there it means
   * "whatever was last shown".
   */
  int CONTENT_SETTINGS_TYPE_DEFAULT = -1;
  int CONTENT_SETTINGS_TYPE_COOKIES = 0;
  int CONTENT_SETTINGS_TYPE_IMAGES = 1;
  int CONTENT_SETTINGS_TYPE_JAVASCRIPT = 2;
  int CONTENT_SETTINGS_TYPE_PLUGINS = 3;
  /**
   * This setting governs both popups and unwanted redirects like tab-unders and framebusting.
   * TODO(csharrison): Consider renaming it to POPUPS_AND_REDIRECTS, but it might not be worth the
   * trouble.
   */
  int CONTENT_SETTINGS_TYPE_POPUPS = 4;
  int CONTENT_SETTINGS_TYPE_GEOLOCATION = 5;
  int CONTENT_SETTINGS_TYPE_NOTIFICATIONS = 6;
  int CONTENT_SETTINGS_TYPE_AUTO_SELECT_CERTIFICATE = 7;
  int CONTENT_SETTINGS_TYPE_MIXEDSCRIPT = 8;
  int CONTENT_SETTINGS_TYPE_MEDIASTREAM_MIC = 9;
  int CONTENT_SETTINGS_TYPE_MEDIASTREAM_CAMERA = 10;
  int CONTENT_SETTINGS_TYPE_PROTOCOL_HANDLERS = 11;
  int CONTENT_SETTINGS_TYPE_PPAPI_BROKER = 12;
  int CONTENT_SETTINGS_TYPE_AUTOMATIC_DOWNLOADS = 13;
  int CONTENT_SETTINGS_TYPE_MIDI_SYSEX = 14;
  int CONTENT_SETTINGS_TYPE_SSL_CERT_DECISIONS = 15;
  int CONTENT_SETTINGS_TYPE_PROTECTED_MEDIA_IDENTIFIER = 16;
  int CONTENT_SETTINGS_TYPE_APP_BANNER = 17;
  int CONTENT_SETTINGS_TYPE_SITE_ENGAGEMENT = 18;
  int CONTENT_SETTINGS_TYPE_DURABLE_STORAGE = 19;
  int CONTENT_SETTINGS_TYPE_USB_CHOOSER_DATA = 20;
  int CONTENT_SETTINGS_TYPE_BLUETOOTH_GUARD = 21;
  int CONTENT_SETTINGS_TYPE_BACKGROUND_SYNC = 22;
  int CONTENT_SETTINGS_TYPE_AUTOPLAY = 23;
  int CONTENT_SETTINGS_TYPE_IMPORTANT_SITE_INFO = 24;
  int CONTENT_SETTINGS_TYPE_PERMISSION_AUTOBLOCKER_DATA = 25;
  int CONTENT_SETTINGS_TYPE_ADS = 26;
  /**
   * Website setting which stores metadata for the subresource filter to aid in decisions for
   * whether or not to show the UI.
   */
  int CONTENT_SETTINGS_TYPE_ADS_DATA = 27;
  /**
   * This is special-cased in the permissions layer to always allow, and as such doesn't have
   * associated prefs data.
   */
  int CONTENT_SETTINGS_TYPE_MIDI = 28;
  /**
   * This content setting type is for caching password protection service's verdicts of each origin.
   */
  int CONTENT_SETTINGS_TYPE_PASSWORD_PROTECTION = 29;
  /**
   * Website setting which stores engagement data for media related to a specific origin.
   */
  int CONTENT_SETTINGS_TYPE_MEDIA_ENGAGEMENT = 30;
  /**
   * Content setting which stores whether or not the site can play audible sound. This will not
   * block playback but instead the user will not hear it.
   */
  int CONTENT_SETTINGS_TYPE_SOUND = 31;
  /**
   * Website setting which stores the list of client hints (and the preference expiration time for
   * each of the client hints) that the origin requested the browser to remember. Spec:
   * http://httpwg.org/http-extensions/client-hints.html#accept-ch-lifetime. The setting is stored
   * as a dictionary that includes the mapping from different client hints to their respective
   * expiration times (seconds since epoch). The browser is expected to send all the unexpired
   * client hints in the HTTP request headers for every resource requested from that origin.
   */
  int CONTENT_SETTINGS_TYPE_CLIENT_HINTS = 32;
  /**
   * Generic Sensor API covering ambient-light-sensor, accelerometer, gyroscope and magnetometer are
   * all mapped to a single content_settings_type. Setting for the Generic Sensor API covering
   * ambient-light-sensor, accelerometer, gyroscope and magnetometer. These are all mapped to a
   * single ContentSettingsType.
   */
  int CONTENT_SETTINGS_TYPE_SENSORS = 33;
  /**
   * Content setting which stores whether or not the user has granted the site permission to respond
   * to accessibility events, which can be used to provide a custom accessibility experience.
   * Requires explicit user consent because some users may not want sites to know they're using
   * assistive technology.
   */
  int CONTENT_SETTINGS_TYPE_ACCESSIBILITY_EVENTS = 34;
  /**
   * Content setting which stores whether or not the user has granted the site full (read/write
   * without a gesture) permission to access the system clipboard.
   */
  int CONTENT_SETTINGS_TYPE_CLIPBOARD_READ = 35;
  /**
   * This is special-cased in the permissions layer to always allow, and as such doesn't have
   * associated prefs data.
   */
  int CONTENT_SETTINGS_TYPE_CLIPBOARD_WRITE = 36;
  /**
   * Used to store whether the user has ever changed the Flash permission for a site.
   */
  int CONTENT_SETTINGS_TYPE_PLUGINS_DATA = 37;
  /**
   * Used to store whether to allow a website to install a payment handler.
   */
  int CONTENT_SETTINGS_TYPE_PAYMENT_HANDLER = 38;
  /**
   * Content setting which stores whether to allow sites to ask for permission to access USB
   * devices. If this is allowed specific device permissions are stored under
   * CONTENT_SETTINGS_TYPE_USB_CHOOSER_DATA.
   */
  int CONTENT_SETTINGS_TYPE_USB_GUARD = 39;
  int CONTENT_SETTINGS_NUM_TYPES = 40;
}