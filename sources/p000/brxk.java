package p000;

/* renamed from: brxk */
final /* synthetic */ class brxk implements Runnable {

    /* renamed from: a */
    private final brxw f143565a;

    /* renamed from: b */
    private final Runnable f143566b;

    public brxk(brxw brxw, Runnable runnable) {
        this.f143565a = brxw;
        this.f143566b = runnable;
    }

    public final void run() {
        brxw brxw = this.f143565a;
        try {
            this.f143566b.run();
        } catch (Throwable th) {
            chqr chqr = brxw.f143599e;
            if (chqr != null) {
                chqr.mo25570a(chuv.m149608a(th), new chtr());
                chqs chqs = brxw.f143602h;
                if (chqs != null && brxw.f143598d.f143594e == 4) {
                    chqs.mo70031a((String) null, th);
                }
            }
        }
    }
}
