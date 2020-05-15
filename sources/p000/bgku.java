package p000;

/* renamed from: bgku */
final /* synthetic */ class bgku implements Runnable {

    /* renamed from: a */
    private final bgkv f116724a;

    /* renamed from: b */
    private final Runnable f116725b;

    public bgku(bgkv bgkv, Runnable runnable) {
        this.f116724a = bgkv;
        this.f116725b = runnable;
    }

    public final void run() {
        bgkv bgkv = this.f116724a;
        try {
            this.f116725b.run();
        } catch (NullPointerException e) {
            bgkv.f116726a.run();
        }
    }
}
