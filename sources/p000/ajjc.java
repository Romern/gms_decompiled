package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: ajjc */
public final /* synthetic */ class ajjc implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService f70736a;

    public ajjc(NearbySharingChimeraService nearbySharingChimeraService) {
        this.f70736a = nearbySharingChimeraService;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.f70736a;
        if (nearbySharingChimeraService.mo44453r() == null) {
            nearbySharingChimeraService.mo44440e();
        }
        nearbySharingChimeraService.f80899k.mo39174c(nearbySharingChimeraService.mo44449n());
        nearbySharingChimeraService.f80898b.mo38782a(nearbySharingChimeraService.mo44448m());
        if (nearbySharingChimeraService.mo44446k()) {
            nearbySharingChimeraService.mo44422a();
        }
        nearbySharingChimeraService.mo44457v();
    }
}
