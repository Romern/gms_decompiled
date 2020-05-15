package p000;

/* renamed from: pwg */
final /* synthetic */ class pwg implements Runnable {

    /* renamed from: a */
    private final pwi f40467a;

    /* renamed from: b */
    private final int f40468b;

    public pwg(pwi pwi, int i) {
        this.f40467a = pwi;
        this.f40468b = i;
    }

    public final void run() {
        pwi pwi = this.f40467a;
        int i = this.f40468b;
        pwi.f40471a.mo23673b("onSetVolume() deviceId=%s, volume=%d", pwi.f40472b, Integer.valueOf(i));
        if (pwi.mo23766a() == null) {
            pwi.f40471a.mo23677d("Call onSetVolume() when group's device controller is not connected. deviceId=%s", pwi.f40472b);
            return;
        }
        double d = (double) i;
        double d2 = pwi.f40475e;
        Double.isNaN(d);
        pwi.mo23767a(d / d2);
    }
}
