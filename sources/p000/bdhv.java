package p000;

/* renamed from: bdhv */
final /* synthetic */ class bdhv implements Runnable {

    /* renamed from: a */
    private final bdhx f105675a;

    /* renamed from: b */
    private final Runnable f105676b;

    public bdhv(bdhx bdhx, Runnable runnable) {
        this.f105675a = bdhx;
        this.f105676b = runnable;
    }

    public final void run() {
        bdhx bdhx = this.f105675a;
        try {
            this.f105676b.run();
        } catch (Throwable th) {
            bdhx.f105679a.mo6481a(th);
            throw th;
        }
    }
}
