package com.google.android.gms.cast.settings;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastSettingsIntentOperation extends qld {
    /* renamed from: a */
    public final List mo6342a() {
        GoogleSettingsItem googleSettingsItem;
        GoogleSettingsItem[] googleSettingsItemArr = new GoogleSettingsItem[2];
        Context applicationContext = getApplicationContext();
        ssh a = ssh.m36213a(applicationContext);
        GoogleSettingsItem googleSettingsItem2 = null;
        if (!ccye.f180256a.mo6606a().mo77066c() || !qay.m31789c() || a.mo26045d()) {
            googleSettingsItem = null;
        } else {
            googleSettingsItem = new GoogleSettingsItem(pzv.m31724a(applicationContext), 6, applicationContext.getString(C0126R.string.cast_media_control), 12);
            googleSettingsItem.f29960f = false;
        }
        googleSettingsItemArr[0] = googleSettingsItem;
        Context applicationContext2 = getApplicationContext();
        if (ccye.f180256a.mo6606a().mo77065b()) {
            googleSettingsItem2 = new GoogleSettingsItem(new Intent().setClassName(applicationContext2, "com.google.android.gms.cast.settings.CastSettingsActivity").putExtra("ACTIVITY_TYPE", "Debug"), 2, applicationContext2.getString(C0126R.string.cast_settings_debug), 11);
            googleSettingsItem2.f29961g = !ccye.f180256a.mo6606a().mo77064a();
        }
        googleSettingsItemArr[1] = googleSettingsItem2;
        return Arrays.asList(googleSettingsItemArr);
    }

    public final void onCreate() {
    }
}
