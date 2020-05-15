package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: bdgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdgf {

    /* renamed from: a */
    public static final bnrt f105574a = bnrt.m110178a("bdgf");

    /* renamed from: b */
    public final String f105575b;

    /* renamed from: c */
    public final String f105576c;

    /* renamed from: d */
    public final String f105577d;

    /* renamed from: e */
    public final aytx f105578e;

    /* renamed from: f */
    public final long f105579f;

    /* renamed from: g */
    public final Long f105580g;

    /* renamed from: h */
    public final bmzi f105581h;

    /* renamed from: i */
    public final int f105582i;

    public bdgf(String str, String str2, String str3, int i, Long l, aytx aytx, bmzi bmzi) {
        this.f105575b = str;
        this.f105576c = str2;
        this.f105577d = str3;
        this.f105582i = i;
        this.f105580g = l;
        this.f105578e = aytx;
        this.f105579f = aytx.mo54435a().getTotalSpace() / 1024;
        this.f105581h = bmzi;
    }

    /* renamed from: a */
    public static bdgf m90732a(Context context, bmzi bmzi) {
        int i;
        bmxy.m108581a(context);
        String packageName = context.getPackageName();
        int i2 = bdjb.f105722b;
        String packageName2 = context.getPackageName();
        String a = bdjb.m90890a();
        String str = null;
        if (!(a == null || packageName2 == null || !a.startsWith(packageName2))) {
            int length = packageName2.length();
            a = a.length() != length ? a.substring(length + 1) : null;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            bnrq bnrq = (bnrq) f105574a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdgf", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68420a("Failed to get PackageInfo for: %s", packageName);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.type.watch")) {
            int i4 = Build.VERSION.SDK_INT;
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        } else {
            i = 3;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            i = 5;
        }
        return new bdgf(packageName, a, str, i, 305185984L, new aytx(context), bmzi);
    }
}
