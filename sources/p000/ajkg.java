package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajkg implements ajud {

    /* renamed from: a */
    final /* synthetic */ NearbySharingChimeraService f70790a;

    public ajkg(NearbySharingChimeraService nearbySharingChimeraService) {
        this.f70790a = nearbySharingChimeraService;
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.f70790a.mo44424a(new ajkf(this, shareTarget, transferMetadata));
    }
}
