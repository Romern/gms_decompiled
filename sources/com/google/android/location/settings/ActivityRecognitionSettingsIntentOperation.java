package com.google.android.location.settings;

import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActivityRecognitionSettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        int i = Build.VERSION.SDK_INT;
        if (!ceyg.f183508a.mo6606a().enableDrivingModeGoogleSetting()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.location.settings.AR_MODE_SETTING"), 0, getString(C0126R.string.driving_mode_driving), 25);
        googleSettingsItem.f29960f = false;
        return googleSettingsItem;
    }
}
