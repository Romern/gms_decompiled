package com.google.android.gms.thunderbird.util.locationsettings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSettingsResetIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("thunderbird.intent.action.LOCATION_SETTINGS_RESET".equals(intent.getAction())) {
            auhu.m77081a().mo50542a(this, intent);
        }
    }
}
