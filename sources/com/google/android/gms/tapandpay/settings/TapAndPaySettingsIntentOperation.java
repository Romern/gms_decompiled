package com.google.android.gms.tapandpay.settings;

import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPaySettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        int i = Build.VERSION.SDK_INT;
        if (!aswg.m74932a(this, atxx.m76530c(this)) || cfuc.f185713a.mo6606a().mo82732h()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity"), 4, (int) C0126R.string.tp_google_pay, 56);
        googleSettingsItem.f29960f = true;
        return googleSettingsItem;
    }
}
