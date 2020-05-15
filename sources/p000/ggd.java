package p000;

/* renamed from: ggd */
final /* synthetic */ class ggd implements Runnable {

    /* renamed from: a */
    private final ggf f18124a;

    /* renamed from: b */
    private final int f18125b;

    public ggd(ggf ggf, int i) {
        this.f18124a = ggf;
        this.f18125b = i;
    }

    public final void run() {
        ggf ggf = this.f18124a;
        int i = this.f18125b;
        if (i != Integer.MAX_VALUE && ggf.stopSelfResult(i)) {
            ggf.mo11787f();
        }
    }
}
