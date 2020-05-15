package com.google.android.gms.auth.managed.intentoperations;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.managed.p029ui.PhoneskyDpcInstallChimeraActivity;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupWorkProfileSettingsIntentOperation extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity").putExtras(new Bundle()), 7, (int) C0126R.string.auth_device_management_setup_work_profile_settings_entry, 60);
        if (!m6703a(this)) {
            return null;
        }
        return googleSettingsItem;
    }

    /* renamed from: a */
    public static boolean m6703a(Context context) {
        int i = Build.VERSION.SDK_INT;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        return ccgh.f178939a.mo75920b().mo75927d() && PhoneskyDpcInstallChimeraActivity.m6729a(context) && devicePolicyManager.getDeviceOwner() == null && devicePolicyManager.getProfileOwner() == null;
    }
}
