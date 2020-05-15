package p000;

import android.content.ComponentName;
import android.os.Build;

/* renamed from: nzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzg {

    /* renamed from: a */
    public static final bmzi f36999a = bmzn.m108681a(nzd.f36996a);

    /* renamed from: b */
    public static final bmzi f37000b = bmzn.m108681a(nze.f36997a);

    /* renamed from: c */
    public static final bmzi f37001c = bmzn.m108681a(nzf.f36998a);

    /* renamed from: d */
    public static final ComponentName f37002d = new ComponentName("com.google.android.gms", "com.google.android.gms.car.SetupActivity");

    /* renamed from: e */
    public static final ComponentName f37003e = new ComponentName("com.google.android.gms", "com.google.android.gms.car.setup.PreSetupActivity");

    /* renamed from: f */
    public static final ComponentName f37004f = new ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.wifi.CarWifiConnectionService");

    /* renamed from: g */
    public static final ComponentName f37005g = new ComponentName("com.google.android.gms", "com.google.android.gms.car.CarErrorDisplayActivity");

    /* renamed from: a */
    static ComponentName m28222a() {
        int i = Build.VERSION.SDK_INT;
        if (ccrv.m131379c()) {
            return new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService");
        }
        return new ComponentName("com.google.android.gms", "com.google.android.gms.car.CarService");
    }
}
