package p000;

/* renamed from: ahpt */
final /* synthetic */ class ahpt implements Runnable {

    /* renamed from: a */
    private final ahpu f67750a;

    /* renamed from: b */
    private final aisv f67751b;

    public ahpt(ahpu ahpu, aisv aisv) {
        this.f67750a = ahpu;
        this.f67751b = aisv;
    }

    public final void run() {
        ahpu ahpu = this.f67750a;
        aisv aisv = this.f67751b;
        String str = aisv.f69126a;
        ahrc a = ahrc.m56404a(aisv);
        srn srn = ahkm.f67363a;
        ahkm.m55981a(ahpu.f67753b);
        ahpu.f67754c.mo36844a(ahpu.f67752a, str, a, bvif.WEB_RTC);
    }
}
