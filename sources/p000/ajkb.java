package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajkb */
final /* synthetic */ class ajkb implements Runnable {

    /* renamed from: a */
    private final ajkd f70778a;

    /* renamed from: b */
    private final ShareTarget f70779b;

    public ajkb(ajkd ajkd, ShareTarget shareTarget) {
        this.f70778a = ajkd;
        this.f70779b = shareTarget;
    }

    public final void run() {
        ajkd ajkd = this.f70778a;
        ShareTarget shareTarget = this.f70779b;
        NearbySharingChimeraService nearbySharingChimeraService = ajkd.f70783a;
        for (ajmx ajmx : nearbySharingChimeraService.f80901m.values()) {
            ajmx.f70944a.mo38709b(shareTarget);
        }
        nearbySharingChimeraService.f80911w.mo38807c(shareTarget);
    }
}
