package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;
import java.nio.charset.Charset;

/* renamed from: ajmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajmk extends ajyy {

    /* renamed from: a */
    final /* synthetic */ ajud f70918a;

    /* renamed from: b */
    final /* synthetic */ ajmm f70919b;

    public ajmk(ajmm ajmm, ajud ajud) {
        this.f70919b = ajmm;
        this.f70918a = ajud;
    }

    /* renamed from: a */
    public final void mo38778a(OnTransferUpdateParams onTransferUpdateParams) {
        ajmm ajmm = this.f70919b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmm.f70922b.f70935c;
        ajmj ajmj = new ajmj(this, onTransferUpdateParams, ajmm.f70921a, this.f70918a);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajmj);
    }
}
