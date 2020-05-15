package com.google.android.libraries.matchstick.settings;

import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickSettingsOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        boolean c = mo24068c();
        StringBuilder sb = new StringBuilder(26);
        sb.append("isForSearchIndexing: ");
        sb.append(c);
        String sb2 = sb.toString();
        boolean z = false;
        azoj.m85930a("MatchstickSettingsOperation", sb2, new Object[0]);
        int i = Build.VERSION.SDK_INT;
        if (cfeo.m138865V() && azot.m85974f(getApplicationContext(), (TelephonyManager) getSystemService("phone"))) {
            z = true;
        }
        if (!mo24068c() && !z) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.matchstick.settings.MATCHSTICK_SETTINGS"), 5, getResources().getString(C0126R.string.phone_number_settings_label), 37);
        if (mo24068c()) {
            googleSettingsItem.f29965k = true;
            googleSettingsItem.f29967m = z;
            googleSettingsItem.f29968n = "MatchstickSettings";
        }
        return googleSettingsItem;
    }
}
