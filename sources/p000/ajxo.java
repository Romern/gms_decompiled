package p000;

import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: ajxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajxo extends ajys {

    /* renamed from: a */
    public rod f71511a;

    public ajxo(rod rod) {
        this.f71511a = rod;
    }

    /* renamed from: a */
    public final void mo38774a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams) {
        if (this.f71511a != null) {
            akbe.m59276a().mo39145a(onShareTargetDiscoveredParams.f81089a, this.f71511a);
            this.f71511a.mo24968a(new ajxl(onShareTargetDiscoveredParams));
        }
    }

    /* renamed from: a */
    public final void mo38775a(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams) {
        rod rod = this.f71511a;
        if (rod != null) {
            rod.mo24968a(new ajxn(onShareTargetDistanceChangedParams));
        }
    }

    /* renamed from: a */
    public final void mo38776a(OnShareTargetLostParams onShareTargetLostParams) {
        if (this.f71511a != null) {
            akbe.m59276a().mo39144a(onShareTargetLostParams.f81092a);
            this.f71511a.mo24968a(new ajxm(onShareTargetLostParams));
        }
    }
}
