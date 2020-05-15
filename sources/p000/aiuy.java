package p000;

import android.net.wifi.aware.PublishDiscoverySession;

/* renamed from: aiuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiuy extends aiva {

    /* renamed from: a */
    final /* synthetic */ bqgy f69827a;

    /* renamed from: b */
    final /* synthetic */ String f69828b;

    /* renamed from: c */
    final /* synthetic */ aiuz f69829c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiuy(aiuz aiuz, aivn aivn, String str, bqgy bqgy, String str2) {
        super(aivn, str);
        this.f69829c = aiuz;
        this.f69827a = bqgy;
        this.f69828b = str2;
    }

    public final void onPublishStarted(PublishDiscoverySession publishDiscoverySession) {
        this.f69839d = publishDiscoverySession;
        this.f69827a.mo69138b(publishDiscoverySession);
    }

    public final void onSessionConfigFailed() {
        this.f69827a.mo69136a((Throwable) new RuntimeException(String.format("Failed to publish %s with service id %s over WiFi Aware", this.f69828b, this.f69829c.f69830a)));
    }

    public final void onSessionTerminated() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aiuy", "onSessionTerminated", 1222, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("WiFi Aware publish for serviceId %s was terminated.", this.f69829c.f69830a);
        this.f69829c.f69831b.mo38027e(this.f69839d);
    }
}
