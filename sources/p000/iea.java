package p000;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: iea */
final /* synthetic */ class iea implements bmxj {

    /* renamed from: a */
    static final bmxj f20785a = new iea();

    private iea() {
    }

    public final Object apply(Object obj) {
        icj icj = (icj) obj;
        bnhe bnhe = ied.f20788a;
        GoogleSignInAccount googleSignInAccount = icj.f20735b;
        if (googleSignInAccount != null) {
            return bmxv.m108567c(googleSignInAccount);
        }
        throw idw.m15304a(rzy.m34725a(icj.f20734a));
    }
}
