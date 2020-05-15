package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajkd implements ajsn {

    /* renamed from: a */
    final /* synthetic */ NearbySharingChimeraService f70783a;

    public ajkd(NearbySharingChimeraService nearbySharingChimeraService) {
        this.f70783a = nearbySharingChimeraService;
    }

    /* renamed from: a */
    public final void mo38707a(ShareTarget shareTarget) {
        this.f70783a.mo44424a(new ajka(this, shareTarget));
    }

    /* renamed from: b */
    public final void mo38709b(ShareTarget shareTarget) {
        this.f70783a.mo44424a(new ajkb(this, shareTarget));
    }

    /* renamed from: a */
    public final void mo38708a(ShareTarget shareTarget, int i) {
        this.f70783a.mo44424a(new ajkc(this, shareTarget, i));
    }
}
