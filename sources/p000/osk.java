package p000;

/* renamed from: osk */
final /* synthetic */ class osk implements Runnable {

    /* renamed from: a */
    private final osq f38322a;

    public osk(osq osq) {
        this.f38322a = osq;
    }

    public final void run() {
        osq osq = this.f38322a;
        pao pao = osq.f38349m;
        pbm pbm = (pbm) pao;
        pbm.f38780f.post(new paw(pbm, osq.f38347k, osq.f38344h));
    }
}
