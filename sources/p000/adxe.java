package p000;

import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: adxe */
final /* synthetic */ class adxe implements bmxz {

    /* renamed from: a */
    static final bmxz f62861a = new adxe();

    private adxe() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        bsjf bsjf = (bsjf) obj;
        if (TextUtils.equals(bsjf.f144787b, cere.m138101b())) {
            return false;
        }
        try {
            rpr.m34216b().getPackageManager().getPackageInfo(bsjf.f144787b, 0);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return true;
        }
    }
}
