package p000;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: bdfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdfu implements cayy {

    /* renamed from: a */
    private final cijl f105561a;

    /* renamed from: b */
    private final cijl f105562b;

    public bdfu(cijl cijl, cijl cijl2) {
        this.f105561a = cijl;
        this.f105562b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        String str;
        String str2;
        int i;
        bmxv b = ((bdfr) this.f105562b).mo6445a();
        bdge bdge = new bdge();
        bdge.f105572a = (Application) ((cayz) this.f105561a).f176439a;
        if (b.mo66813a()) {
            bdge.f105573b = ((bdhu) b.mo66814b()).mo58045a();
        }
        Context context = bdge.f105572a;
        bmzi bmzi = bdge.f105573b;
        bmxy.m108581a(context);
        String packageName = context.getPackageName();
        int i2 = bdjb.f105722b;
        String packageName2 = context.getPackageName();
        String a = bdjb.m90890a();
        if (a == null || packageName2 == null || !a.startsWith(packageName2)) {
            str = a;
        } else {
            int length = packageName2.length();
            str = a.length() != length ? a.substring(length + 1) : null;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            str2 = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            bnrq bnrq = (bnrq) bdgf.f105574a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdgf", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68420a("Failed to get PackageInfo for: %s", packageName);
            str2 = null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.type.watch")) {
            int i4 = Build.VERSION.SDK_INT;
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        } else {
            i = 3;
        }
        int i5 = Build.VERSION.SDK_INT;
        bdgf bdgf = new bdgf(packageName, str, str2, packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i, 305185984L, new aytx(context), bmzi);
        cazf.m127593a(bdgf, "Cannot return null from a non-@Nullable @Provides method");
        return bdgf;
    }
}
