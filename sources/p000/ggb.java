package p000;

/* renamed from: ggb */
final /* synthetic */ class ggb implements Runnable {

    /* renamed from: a */
    private final ggf f18120a;

    /* renamed from: b */
    private final gge f18121b;

    public ggb(ggf ggf, gge gge) {
        this.f18120a = ggf;
        this.f18121b = gge;
    }

    public final void run() {
        ggf ggf = this.f18120a;
        gge gge = this.f18121b;
        ggf.f18128c = 2;
        ggc ggc = new ggc(ggf, ggf.f18127b);
        if (gge != null) {
            gge.mo11776a(ggc);
        }
    }
}
