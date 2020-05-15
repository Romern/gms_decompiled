package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: asjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjw {
    /* renamed from: a */
    public static void m74254a(Context context, int i) {
        atao atao = new atao(context);
        bxvd da = bpbx.f135635S.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx = (bpbx) da.f164949b;
        bpbx.f135657c = 126;
        int i2 = 1;
        bpbx.f135655a |= 1;
        bxvd da2 = boxj.f135256c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boxj boxj = (boxj) da2.f164949b;
        boxj.f135259b = i - 1;
        boxj.f135258a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx2 = (bpbx) da.f164949b;
        boxj boxj2 = (boxj) da2.mo74062i();
        boxj2.getClass();
        bpbx2.f135641E = boxj2;
        bpbx2.f135656b |= 2;
        bpbx bpbx3 = (bpbx) da.mo74062i();
        if (askc.m74274c(askc.m74272b()) && !spn.m35859a()) {
            qwo a = atao.f89962b.mo24334a(new atan(bpbx3));
            a.mo24329b(atao.f89961a.getPackageName());
            int a2 = boyl.m111667a(bpbx3.f135657c);
            if (a2 != 0) {
                i2 = a2;
            }
            a.mo24328b(i2 - 1);
            a.mo24327b();
        }
        ((Boolean) askd.f89118j.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public static boolean m74257b(Context context) {
        sre.m36089i(context);
        return !context.getPackageManager().hasSystemFeature("android.software.device_admin");
    }

    /* renamed from: d */
    public static boolean m74259d(Context context) {
        sdo.m34960a();
        return m74258c(context) && new atkm(context).mo50021g();
    }

    /* renamed from: c */
    public static boolean m74258c(Context context) {
        int i = Build.VERSION.SDK_INT;
        try {
            return !soz.m35810g(context) && !m74257b(context);
        } catch (SecurityException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m74255a() {
        if (spn.m35859a()) {
            return true;
        }
        try {
            return rpr.m34216b().getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        } catch (NoSuchMethodError e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m74256a(Context context) {
        return m74258c(context) && m74255a();
    }
}
