package p000;

/* renamed from: gfy */
final /* synthetic */ class gfy implements Runnable {

    /* renamed from: a */
    private final ggf f18116a;

    /* renamed from: b */
    private final int f18117b;

    public gfy(ggf ggf, int i) {
        this.f18116a = ggf;
        this.f18117b = i;
    }

    public final void run() {
        ggf ggf = this.f18116a;
        ggf.f18127b = this.f18117b;
        if (ggf.f18128c == 0) {
            ggf.stopSelf();
            ggf.mo11787f();
        }
    }
}
