package p000;

/* renamed from: jqs */
final /* synthetic */ class jqs implements Runnable {

    /* renamed from: a */
    private final jqw f23078a;

    /* renamed from: b */
    private final Runnable f23079b;

    public jqs(jqw jqw, Runnable runnable) {
        this.f23078a = jqw;
        this.f23079b = runnable;
    }

    public final void run() {
        jqw jqw = this.f23078a;
        Runnable runnable = this.f23079b;
        if (!jqw.f23089d) {
            jqw.f23088c.add(runnable);
        } else {
            runnable.run();
        }
    }
}
