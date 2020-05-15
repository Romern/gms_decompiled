package p000;

import com.google.location.nearby.direct.service.NearbyDirectChimeraService;

/* renamed from: bvdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdv extends buqn {

    /* renamed from: a */
    final /* synthetic */ int f155682a;

    /* renamed from: b */
    final /* synthetic */ NearbyDirectChimeraService f155683b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bvdv(NearbyDirectChimeraService nearbyDirectChimeraService, String str, int i) {
        super(str);
        this.f155683b = nearbyDirectChimeraService;
        this.f155682a = i;
    }

    public final void run() {
        srn srn = bvcm.f155598a;
        this.f155683b.stopSelf(this.f155682a);
    }
}
