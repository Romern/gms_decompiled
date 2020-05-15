package p000;

import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hcg */
final /* synthetic */ class hcg implements Runnable {

    /* renamed from: a */
    private final hdf f19464a;

    public hcg(hdf hdf) {
        this.f19464a = hdf;
    }

    public final void run() {
        hdf hdf = this.f19464a;
        hdf.mo12405a(new hdh(Status.f30107a, bmxv.m108566b(new AuthorizationResult(hdf.f19503i, hdf.f19504j, hdf.f19505k, bnfi.m109235a(hdf.f19509o).mo67501a(hcu.f19479a).mo67505b(), hdf.f19518x, null))));
    }
}
