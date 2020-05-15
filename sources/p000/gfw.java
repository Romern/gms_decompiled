package p000;

/* renamed from: gfw */
final /* synthetic */ class gfw implements Runnable {

    /* renamed from: a */
    private final gfx f18111a;

    /* renamed from: b */
    private final Runnable f18112b;

    public gfw(gfx gfx, Runnable runnable) {
        this.f18111a = gfx;
        this.f18112b = runnable;
    }

    public final void run() {
        gfx gfx = this.f18111a;
        Runnable runnable = this.f18112b;
        gfx.f18113a.getLooper().quit();
        runnable.run();
    }
}
