package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;

/* renamed from: xfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfb extends xfd {

    /* renamed from: a */
    private final xlw f52109a;

    public xfb(xlw xlw) {
        this.f52109a = xlw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        AuthenticatorResponse authenticatorResponse;
        xkg xkg = (xkg) obj;
        if (xkg.f52499a != xkj.CTAP1_ERR_SUCCESS) {
            authenticatorResponse = xpv.m43283a(((Integer) new xfc().mo66855c(xkg.f52499a)).intValue());
        } else {
            xkh xkh = xkg.f52500b;
            if (xkh instanceof xks) {
                xks xks = (xks) xkh;
                xpb xpb = new xpb();
                xpb.mo29990c(xks.f52591f.f31776a);
                xpb.f52852a = xks.f52594i.f52688a;
                xpb.mo29991d(xks.f52593h);
                xpb.mo29988a(xks.f52592g);
                xpb.mo29989b(this.f52109a.mo29926b());
                authenticatorResponse = xpb.mo29987a();
            } else {
                throw new IllegalArgumentException("Ctap2Response does not contain correct ResponseData.");
            }
        }
        xpw xpw = new xpw();
        xpw.f52903a = authenticatorResponse;
        return xpw.mo30021a();
    }
}
