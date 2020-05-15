package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

/* renamed from: ajju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajju implements ajud {

    /* renamed from: a */
    final /* synthetic */ NearbySharingChimeraService f70767a;

    public ajju(NearbySharingChimeraService nearbySharingChimeraService) {
        this.f70767a = nearbySharingChimeraService;
    }

    /* renamed from: a */
    public final void mo38711a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.f70767a.mo44424a(new ajjt(this, shareTarget, transferMetadata));
    }
}
