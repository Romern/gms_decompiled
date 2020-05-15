package p000;

import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: gzm */
final /* synthetic */ class gzm implements C1247om {

    /* renamed from: a */
    private final gzz f19296a;

    public gzm(gzz gzz) {
        this.f19296a = gzz;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        gzz gzz = this.f19296a;
        if (gzz.f19328q.size() > 1) {
            gzz.f19334w.mo2453l(3);
            gzz.f19332u.mo2453l(gzz.f19328q);
            return bqdx.m112674a(gzz.f19326o.mo12355a(), new gzi(gzz), gzz.f19320i);
        }
        gzz.f19327p = (InternalSignInCredentialWrapper) gzz.f19328q.get(0);
        return hdz.m14238c(adco.FETCH_TOS_AND_PP);
    }
}
