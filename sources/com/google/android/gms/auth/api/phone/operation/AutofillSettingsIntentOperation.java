package com.google.android.gms.auth.api.phone.operation;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AutofillSettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!cceb.m129359c() || !ibb.m15152a(this)) {
            return null;
        }
        Intent a = mo24067a("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_SETTINGS");
        if (cceb.m129363g()) {
            return new GoogleSettingsItem(a, 8, getString(C0126R.string.f7406x9d36d85c), 61);
        }
        return new GoogleSettingsItem(a, 0, getString(C0126R.string.sms_code_autofill_settings_title_v2), 61);
    }
}
