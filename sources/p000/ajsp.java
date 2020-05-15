package p000;

import com.google.android.gms.nearby.sharing.SharingChimeraTileService;

/* renamed from: ajsp */
public final /* synthetic */ class ajsp implements aubw {

    /* renamed from: a */
    private final SharingChimeraTileService f71244a;

    public ajsp(SharingChimeraTileService sharingChimeraTileService) {
        this.f71244a = sharingChimeraTileService;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        SharingChimeraTileService sharingChimeraTileService = this.f71244a;
        if (!((Boolean) obj).booleanValue()) {
            sharingChimeraTileService.mo44505a("com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity");
        } else {
            sharingChimeraTileService.mo44505a("com.google.android.gms.nearby.sharing.SettingsActivity");
        }
    }
}
