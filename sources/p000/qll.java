package p000;

import android.os.Build;

/* renamed from: qll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qll implements dfp {

    /* renamed from: a */
    private static volatile qll f41655a;

    private qll() {
    }

    /* renamed from: o */
    public static qll m32362o() {
        qll qll = f41655a;
        if (qll == null) {
            synchronized (qll.class) {
                qll = f41655a;
                if (qll == null) {
                    qll = new qll();
                    f41655a = qll;
                }
            }
        }
        return qll;
    }

    /* renamed from: b */
    public final boolean mo8863b() {
        return cdjh.f180979a.mo6606a().mo77728H();
    }

    /* renamed from: c */
    public final boolean mo8864c() {
        return cdjl.f180997a.mo6606a().mo77700f();
    }

    /* renamed from: d */
    public final int mo8865d() {
        return (int) cdjl.f180997a.mo6606a().mo77717w();
    }

    /* renamed from: e */
    public final boolean mo8866e() {
        return cdjl.f180997a.mo6606a().mo77705k();
    }

    /* renamed from: f */
    public final boolean mo8867f() {
        return cdjh.f180979a.mo6606a().mo77722B();
    }

    /* renamed from: g */
    public final boolean mo8868g() {
        if (ssw.m36269a()) {
            return cdjl.f180997a.mo6606a().mo77689C();
        }
        return cdjl.f180997a.mo6606a().mo77688B();
    }

    /* renamed from: h */
    public final boolean mo8869h() {
        return cdjl.f180997a.mo6606a().mo77701g();
    }

    /* renamed from: i */
    public final boolean mo8870i() {
        return cdjl.f180997a.mo6606a().mo77714t();
    }

    /* renamed from: j */
    public final boolean mo8871j() {
        return cdjh.f180979a.mo6606a().mo77749n();
    }

    /* renamed from: k */
    public final boolean mo8872k() {
        return cdjl.f180997a.mo6606a().mo77693G();
    }

    /* renamed from: l */
    public final boolean mo8873l() {
        return false;
    }

    /* renamed from: m */
    public final bnic mo8874m() {
        return bnic.m109490a("com.google.android.gms.phenotype.COMMITTED", "com.google.android.gms.phenotype.UPDATE");
    }

    /* renamed from: a */
    public final boolean mo8862a() {
        int i = Build.VERSION.SDK_INT;
        return false;
    }

    /* renamed from: n */
    public final bnic mo8875n() {
        return bnon.f131923a;
    }
}
