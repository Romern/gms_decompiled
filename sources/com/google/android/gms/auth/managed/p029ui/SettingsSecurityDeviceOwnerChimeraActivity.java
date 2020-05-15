package com.google.android.gms.auth.managed.p029ui;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;

/* renamed from: com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsSecurityDeviceOwnerChimeraActivity extends FragmentActivity {

    /* renamed from: a */
    private static final sek f11088a = ght.m13171a("AuthManaged", "SettingsSecurityDeviceOwnerChimeraActivity");

    /* renamed from: b */
    private static final Intent f11089b = new Intent("com.google.android.apps.work.clouddpc.ACTION_DO_STATUS_UI").setPackage("com.google.android.apps.work.clouddpc");

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivityForResult(f11089b, 1);
    }

    /* renamed from: a */
    public static boolean m6733a(Context context) {
        int i = Build.VERSION.SDK_INT;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        if (devicePolicyManager == null) {
            return false;
        }
        sek sek = f11088a;
        String valueOf = String.valueOf(devicePolicyManager.getDeviceOwner() == null ? "n/a" : devicePolicyManager.getDeviceOwner());
        sek.mo25412b(valueOf.length() == 0 ? new String("device owner: ") : "device owner: ".concat(valueOf), new Object[0]);
        if (!devicePolicyManager.isDeviceOwnerApp("com.google.android.apps.work.clouddpc") || f11089b.resolveActivityInfo(context.getPackageManager(), 0) == null) {
            return false;
        }
        return true;
    }
}
