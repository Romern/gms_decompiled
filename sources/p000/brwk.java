package p000;

/* renamed from: brwk */
final /* synthetic */ class brwk implements Runnable {

    /* renamed from: a */
    private final brwm f143523a;

    /* renamed from: b */
    private final Runnable f143524b;

    public brwk(brwm brwm, Runnable runnable) {
        this.f143523a = brwm;
        this.f143524b = runnable;
    }

    public final void run() {
        brwm brwm = this.f143523a;
        Runnable runnable = this.f143524b;
        if (brwm.f143530d) {
            return;
        }
        if (brwm.f143528b == null) {
            brwm.f143527a.add(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            brwm.f143529c.mo25570a(chuv.m149608a(th), new chtr());
        }
    }
}
