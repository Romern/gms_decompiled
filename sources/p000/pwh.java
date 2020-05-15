package p000;

/* renamed from: pwh */
final /* synthetic */ class pwh implements Runnable {

    /* renamed from: a */
    private final pwi f40469a;

    /* renamed from: b */
    private final int f40470b;

    public pwh(pwi pwi, int i) {
        this.f40469a = pwi;
        this.f40470b = i;
    }

    public final void run() {
        prc prc;
        pwi pwi = this.f40469a;
        int i = this.f40470b;
        pwi.f40471a.mo23673b("onUpdateVolume() deviceId=%s, delta=%d", pwi.f40472b, Integer.valueOf(i));
        pjc a = pwi.mo23766a();
        if (a == null) {
            pwi.f40471a.mo23675c("Call onUpdateVolume() when group's device controller is not connected. deviceId=%s", pwi.f40472b);
            return;
        }
        String str = pwi.f40472b;
        prb prb = a.f39318g;
        if (prb != null) {
            synchronized (prb.f40094b) {
                prc = (prc) prb.f40094b.get(str);
            }
        } else {
            prc = null;
        }
        if (prc == null) {
            pwi.f40471a.mo23675c("Call onUpdateVolume() when multizone device with ID %s is not found in thegroup's device controller.", pwi.f40472b);
            return;
        }
        double d = prc.f40104d;
        double d2 = (double) i;
        double d3 = pwi.f40475e;
        Double.isNaN(d2);
        pwi.mo23767a(d + (d2 / d3));
    }
}
