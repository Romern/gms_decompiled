package p000;

import android.net.wifi.aware.DiscoverySession;

/* renamed from: aitp */
final /* synthetic */ class aitp implements Runnable {

    /* renamed from: a */
    private final aitq f69713a;

    /* renamed from: b */
    private final DiscoverySession f69714b;

    public aitp(aitq aitq, DiscoverySession discoverySession) {
        this.f69713a = aitq;
        this.f69714b = discoverySession;
    }

    public final void run() {
        this.f69713a.mo38029g(this.f69714b);
    }
}
