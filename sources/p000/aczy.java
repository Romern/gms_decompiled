package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: aczy */
final /* synthetic */ class aczy implements bmxz {

    /* renamed from: a */
    static final bmxz f61179a = new aczy();

    private aczy() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        adaa adaa = adab.f61183a;
        PackageManager packageManager = ((Context) obj).getPackageManager();
        if (((Boolean) aczt.f61173a.mo58455c()).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            if (packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback")) {
                return true;
            }
        }
        return false;
    }
}
