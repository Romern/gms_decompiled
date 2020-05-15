package p000;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* renamed from: hcz */
final /* synthetic */ class hcz implements C1247om {

    /* renamed from: a */
    private final hdf f19485a;

    public hcz(hdf hdf) {
        this.f19485a = hdf;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hdf hdf = this.f19485a;
        AuthorizationRequest authorizationRequest = hdf.f19496b;
        if (authorizationRequest.f10201c && hdf.f19503i == null) {
            return hdf.mo12402a(1);
        }
        if (hdf.f19504j == null) {
            return hdf.mo12402a(2);
        }
        if (authorizationRequest.f10202d && hdf.f19505k == null) {
            return hdf.mo12402a(3);
        }
        return bqga.m112775a(bmxv.m108566b(adcq.BUILD_GOOGLE_SIGN_IN_ACCOUNT));
    }
}
