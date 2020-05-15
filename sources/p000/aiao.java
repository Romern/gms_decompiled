package p000;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiao extends buqn {

    /* renamed from: a */
    final /* synthetic */ DiscoveryChimeraService f68574a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiao(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.f68574a = discoveryChimeraService;
    }

    public final void run() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DiscoveryService destroy EventLoop");
        this.f68574a.f80534e.mo72981a();
    }
}
