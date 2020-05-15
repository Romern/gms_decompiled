package com.google.android.gms.kids.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SupervisionStatusIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.kids.settings.UPDATE_SUPERVISION_STATUS".equals(intent.getAction())) {
            getSharedPreferences("settings", 0).edit().putBoolean("has_supervised_account", intent.getBooleanExtra("is_supervised", false)).apply();
        }
    }
}
