package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;
import java.nio.charset.Charset;

/* renamed from: ajmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajmi extends ajys {

    /* renamed from: a */
    final /* synthetic */ ajsn f70912a;

    /* renamed from: b */
    final /* synthetic */ ajmm f70913b;

    public ajmi(ajmm ajmm, ajsn ajsn) {
        this.f70913b = ajmm;
        this.f70912a = ajsn;
    }

    /* renamed from: a */
    public final void mo38774a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams) {
        ajmm ajmm = this.f70913b;
        NearbySharingChimeraService nearbySharingChimeraService = ajmm.f70922b.f70935c;
        ajmg ajmg = new ajmg(this, onShareTargetDiscoveredParams, ajmm.f70921a, this.f70912a);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajmg);
    }

    /* renamed from: a */
    public final void mo38775a(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams) {
    }

    /* renamed from: a */
    public final void mo38776a(OnShareTargetLostParams onShareTargetLostParams) {
        NearbySharingChimeraService nearbySharingChimeraService = this.f70913b.f70922b.f70935c;
        ajmh ajmh = new ajmh(this, onShareTargetLostParams, this.f70912a);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44424a(ajmh);
    }
}
