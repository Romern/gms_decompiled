package p000;

/* renamed from: otk */
final /* synthetic */ class otk implements Runnable {

    /* renamed from: a */
    private final otl f38399a;

    /* renamed from: b */
    private final Runnable f38400b;

    public otk(otl otl, Runnable runnable) {
        this.f38399a = otl;
        this.f38400b = runnable;
    }

    public final void run() {
        otl otl = this.f38399a;
        Runnable runnable = this.f38400b;
        C1585otp otp = otl.f38406f;
        bnsn bnsn = C1585otp.f38420a;
        otp.f38425f.removeCallbacks(runnable);
        otl.f38406f.mo22614a();
        otl.f38406f.f38424e.mo17418b(bpdn.PROTOCOL_IO_ERROR, bpdo.WIFI_NETWORK_UNAVAILABLE, "Wifi network request failed - hard loss of network");
        C1585otp otp2 = otl.f38406f;
        otp2.f38422c.mo22619a(2, null, Integer.valueOf(otp2.f38429j), 303, null);
    }
}
