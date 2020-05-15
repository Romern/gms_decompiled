package p000;

import android.net.Network;
import android.net.wifi.WifiInfo;

/* renamed from: otj */
final /* synthetic */ class otj implements Runnable {

    /* renamed from: a */
    private final otl f38393a;

    /* renamed from: b */
    private final Runnable f38394b;

    /* renamed from: c */
    private final Network f38395c;

    /* renamed from: d */
    private final String f38396d;

    /* renamed from: e */
    private final int f38397e;

    /* renamed from: f */
    private final WifiInfo f38398f;

    public otj(otl otl, Runnable runnable, Network network, String str, int i, WifiInfo wifiInfo) {
        this.f38393a = otl;
        this.f38394b = runnable;
        this.f38395c = network;
        this.f38396d = str;
        this.f38397e = i;
        this.f38398f = wifiInfo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otp.a(android.net.Network, java.lang.String, int, android.net.wifi.WifiInfo, boolean):void
     arg types: [android.net.Network, java.lang.String, int, android.net.wifi.WifiInfo, int]
     candidates:
      otp.a(java.lang.String, int, android.net.wifi.WifiInfo, android.net.Network, boolean):void
      otp.a(android.net.Network, java.lang.String, int, android.net.wifi.WifiInfo, boolean):void */
    public final void run() {
        otl otl = this.f38393a;
        Runnable runnable = this.f38394b;
        Network network = this.f38395c;
        String str = this.f38396d;
        int i = this.f38397e;
        WifiInfo wifiInfo = this.f38398f;
        if (!otl.f38401a) {
            C1585otp otp = otl.f38406f;
            bnsn bnsn = C1585otp.f38420a;
            otp.f38425f.removeCallbacks(runnable);
            otl.f38401a = true;
            otl.f38406f.mo22615a(network, str, i, wifiInfo, false);
            otl.f38406f.mo22614a();
        }
    }
}
