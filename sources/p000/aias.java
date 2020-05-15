package p000;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aias */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aias extends buqn {

    /* renamed from: a */
    final /* synthetic */ DiscoveryChimeraService f68578a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aias(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.f68578a = discoveryChimeraService;
    }

    public final void run() {
        srn srn = ahsd.f67925a;
        ahsa ahsa = this.f68578a.f80531b;
        synchronized (ahsa.f67915e) {
            ahsa.f67916f.add(ahrz.UNSUBSCRIBE_BACKGROUND);
        }
        ahsa.f67912b.mo72987c(ahsa.f67913c);
        this.f68578a.f80532c.mo37035a();
        this.f68578a.f80533d.mo37367a(1);
    }
}
