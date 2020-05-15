package p000;

import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: gzp */
final /* synthetic */ class gzp implements C1247om {

    /* renamed from: a */
    private final gzz f19299a;

    public gzp(gzz gzz) {
        this.f19299a = gzz;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        long j;
        gzz gzz = this.f19299a;
        if (gzz.f19327p.mo7477a()) {
            j = cccf.f178743a.mo6606a().mo75762b();
        } else {
            j = cccf.f178743a.mo6606a().mo75761a();
        }
        gzz.f19331t = j;
        gzz.f19334w.mo2453l(4);
        gzz.f19332u.mo2453l(bngx.m109356a(gzz.f19327p));
        if (!TextUtils.isEmpty(gzz.f19327p.f10233g.f10253f)) {
            gzz.f19330s = gzz.f19327p.f10233g;
            return bqga.m112775a(bmxv.m108566b(adco.EXTEND_CONFIRMATION));
        }
        hvd hvd = gzz.f19319h;
        String str = gzz.f19317f;
        BeginSignInRequest beginSignInRequest = gzz.f19316e;
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = gzz.f19327p;
        sdo.m34977c(str);
        sdo.m34959a(beginSignInRequest);
        sdo.m34959a(internalSignInCredentialWrapper);
        roz b = rpa.m34196b();
        b.f43472a = new hww(str, beginSignInRequest, internalSignInCredentialWrapper);
        return bqdx.m112673a(adbb.m50100a(((rjx) hvd).mo24701a(b.mo24977a())), new gzl(gzz), gzz.f19320i);
    }
}
