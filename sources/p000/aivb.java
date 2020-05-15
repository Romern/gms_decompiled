package p000;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import android.net.wifi.aware.SubscribeDiscoverySession;
import java.util.List;

/* renamed from: aivb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aivb extends aiva {

    /* renamed from: a */
    final /* synthetic */ bqgy f69840a;

    /* renamed from: b */
    final /* synthetic */ aivc f69841b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aivb(aivc aivc, aivn aivn, String str, bqgy bqgy) {
        super(aivn, str);
        this.f69841b = aivc;
        this.f69840a = bqgy;
    }

    public final void onServiceDiscovered(PeerHandle peerHandle, byte[] bArr, List list) {
        aiui aiui = this.f69841b.f69845d;
        DiscoverySession discoverySession = this.f69839d;
        aivd aivd = aiui.f69785a;
        aivd.mo38092a(new aiun(aivd, discoverySession, peerHandle, aiui.f69786b, bArr, list, aiui.f69787c));
    }

    public final void onSessionConfigFailed() {
        this.f69840a.mo69136a((Throwable) new RuntimeException(String.format("Failed to subscribe to %s over WiFi Aware", this.f69841b.f69842a)));
    }

    public final void onSessionTerminated() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aivb", "onSessionTerminated", 1394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("WiFi Aware subscription for serviceId %s was terminated.", this.f69841b.f69842a);
        this.f69841b.f69843b.mo38027e(this.f69839d);
    }

    public final void onSubscribeStarted(SubscribeDiscoverySession subscribeDiscoverySession) {
        this.f69839d = subscribeDiscoverySession;
        this.f69840a.mo69138b(subscribeDiscoverySession);
    }
}
