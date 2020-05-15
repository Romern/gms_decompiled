package com.google.android.gms.credential.manager.operations;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsIntentOperation extends qld {
    public SettingsIntentOperation() {
    }

    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        if (!cdqa.f181544a.mo6606a().mo78168b()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.credential.manager.PasswordManagerActivity"), -1, (int) C0126R.string.pwm_password_manager, 62);
        googleSettingsItem.f29960f = true;
        googleSettingsItem.f29965k = true;
        googleSettingsItem.f29968n = "com.google.android.gms.credential.manager.PasswordManagerActivity";
        googleSettingsItem.f29967m = true;
        googleSettingsItem.f29963i = String.valueOf(TextUtils.expandTemplate(getResources().getString(C0126R.string.pwm_page_description), ""));
        googleSettingsItem.mo17614a(getResources().getString(C0126R.string.pwm_password_manager));
        googleSettingsItem.mo17614a(getResources().getString(C0126R.string.common_passwords));
        googleSettingsItem.mo17614a(getResources().getString(C0126R.string.common_password));
        return googleSettingsItem;
    }

    protected SettingsIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
