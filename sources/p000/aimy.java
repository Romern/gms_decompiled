package p000;

import android.net.wifi.p2p.WifiP2pConfig;

/* renamed from: aimy */
final /* synthetic */ class aimy implements Runnable {

    /* renamed from: a */
    private final ainc f69226a;

    /* renamed from: b */
    private final WifiP2pConfig.Builder f69227b;

    public aimy(ainc ainc, WifiP2pConfig.Builder builder) {
        this.f69226a = ainc;
        this.f69227b = builder;
    }

    public final void run() {
        ainc ainc = this.f69226a;
        if (!ainc.mo37703a(this.f69227b.build())) {
            ainc.mo37704c();
            throw new RuntimeException("Failed to create group.");
        }
    }
}
