package p000;

/* renamed from: ggc */
final /* synthetic */ class ggc implements Runnable {

    /* renamed from: a */
    private final ggf f18122a;

    /* renamed from: b */
    private final int f18123b;

    public ggc(ggf ggf, int i) {
        this.f18122a = ggf;
        this.f18123b = i;
    }

    public final void run() {
        ggf ggf = this.f18122a;
        ggf.f18129d.post(new ggd(ggf, this.f18123b));
    }
}
