package p000;

import android.content.ComponentName;
import android.os.Build;

/* renamed from: vqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqx {

    /* renamed from: a */
    static final ComponentName f49825a = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.wifi.CarWifiConnectionService");

    /* renamed from: b */
    public static final ComponentName f49826b = new ComponentName("com.google.android.gms", "com.google.android.location.drivingmode.AutoLaunchService");

    /* renamed from: c */
    private static final ComponentName f49827c = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.DrivingModeFrxActivity");

    /* renamed from: d */
    private static final ComponentName f49828d = new ComponentName("com.google.android.gms", "com.google.android.location.drivingmode.DrivingModeFrxActivity");

    /* renamed from: a */
    public static ComponentName m41080a() {
        return ccrj.m131353b() ? f49826b : f49825a;
    }

    /* renamed from: b */
    public static ComponentName m41081b() {
        int i = Build.VERSION.SDK_INT;
        return new ComponentName("com.google.android.gms", m41083d());
    }

    /* renamed from: c */
    public static ComponentName m41082c() {
        return ccrj.m131353b() ? f49828d : f49827c;
    }

    /* renamed from: d */
    public static String m41083d() {
        return !ccrj.m131353b() ? "com.google.android.gms.carsetup.DrivingModeSettingsActivity" : "com.google.android.location.drivingmode.DrivingModeSettingsActivity";
    }
}
