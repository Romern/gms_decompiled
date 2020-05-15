package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;

/* renamed from: ajji */
public final /* synthetic */ class ajji implements aubw {

    /* renamed from: a */
    private final NearbySharingChimeraService f70749a;

    public ajji(NearbySharingChimeraService nearbySharingChimeraService) {
        this.f70749a = nearbySharingChimeraService;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        NearbySharingChimeraService nearbySharingChimeraService = this.f70749a;
        if (!((Boolean) obj).booleanValue()) {
            nearbySharingChimeraService.mo44424a(new ajjh(nearbySharingChimeraService));
        }
    }
}
