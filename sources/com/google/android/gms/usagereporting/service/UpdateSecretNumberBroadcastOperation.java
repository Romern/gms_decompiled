package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateSecretNumberBroadcastOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int intExtra;
        if (chdz.m148557d() && (intExtra = intent.getIntExtra("OPT_VALUE", 0)) != 0) {
            avvn a = avvn.m79436a();
            synchronized (a.f93986a) {
                SharedPreferences b = a.mo51647b();
                rzz.m34727a(b, "Unexpected null from getPrefs.");
                SharedPreferences.Editor edit = b.edit();
                edit.putInt("DeviceWideCbSecretNumber", intExtra);
                edit.apply();
            }
        }
    }
}
