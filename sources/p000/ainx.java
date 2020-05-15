package p000;

import android.net.wifi.WifiConfiguration;

/* renamed from: ainx */
final /* synthetic */ class ainx implements Runnable {

    /* renamed from: a */
    private final ainz f69299a;

    /* renamed from: b */
    private final WifiConfiguration f69300b;

    public ainx(ainz ainz, WifiConfiguration wifiConfiguration) {
        this.f69299a = ainz;
        this.f69300b = wifiConfiguration;
    }

    public final void run() {
        if (!this.f69299a.mo37732a(this.f69300b, 11)) {
            throw new RuntimeException("Failed to stop the Wifi hotspot because setting the AP state failed.");
        }
    }
}
