package p000;

import android.net.wifi.aware.PublishDiscoverySession;

/* renamed from: aito */
final /* synthetic */ class aito implements Runnable {

    /* renamed from: a */
    private final aitq f69711a;

    /* renamed from: b */
    private final PublishDiscoverySession f69712b;

    public aito(aitq aitq, PublishDiscoverySession publishDiscoverySession) {
        this.f69711a = aitq;
        this.f69712b = publishDiscoverySession;
    }

    public final void run() {
        this.f69711a.mo38028f(this.f69712b);
    }
}
