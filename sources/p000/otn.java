package p000;

import android.net.wifi.WifiInfo;

/* renamed from: otn */
final /* synthetic */ class otn implements Runnable {

    /* renamed from: a */
    private final oto f38409a;

    /* renamed from: b */
    private final boolean f38410b;

    /* renamed from: c */
    private final String f38411c;

    /* renamed from: d */
    private final int f38412d;

    /* renamed from: e */
    private final WifiInfo f38413e;

    public otn(oto oto, boolean z, String str, int i, WifiInfo wifiInfo) {
        this.f38409a = oto;
        this.f38410b = z;
        this.f38411c = str;
        this.f38412d = i;
        this.f38413e = wifiInfo;
    }

    public final void run() {
        oto oto = this.f38409a;
        boolean z = this.f38410b;
        String str = this.f38411c;
        int i = this.f38412d;
        WifiInfo wifiInfo = this.f38413e;
        if (!z) {
            oto.f38419f.f38424e.mo17418b(bpdn.PROTOCOL_IO_ERROR, bpdo.SOCKET_FAIL, "Couldn't connect to receiver socket");
            oto.f38419f.f38422c.mo22619a(2, Integer.valueOf(oto.f38414a), Integer.valueOf(oto.f38419f.f38429j), 302, null);
            return;
        }
        oto.f38419f.mo22616a(str, i, wifiInfo);
    }
}
