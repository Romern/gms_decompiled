package p000;

import com.google.location.nearby.direct.service.NearbyDirectChimeraService;

/* renamed from: bvdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvdw extends buqn {

    /* renamed from: a */
    final /* synthetic */ NearbyDirectChimeraService f155684a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bvdw(NearbyDirectChimeraService nearbyDirectChimeraService, String str) {
        super(str);
        this.f155684a = nearbyDirectChimeraService;
    }

    public final void run() {
        srn srn = bvcm.f155598a;
        this.f155684a.f191777a.getLooper().quit();
    }
}
