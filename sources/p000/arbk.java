package p000;

/* renamed from: arbk */
final /* synthetic */ class arbk implements arql {

    /* renamed from: a */
    private final arbr f87285a;

    /* renamed from: b */
    private final armu f87286b;

    /* renamed from: c */
    private final int f87287c;

    public arbk(arbr arbr, armu armu, int i) {
        this.f87285a = arbr;
        this.f87286b = armu;
        this.f87287c = i;
    }

    /* renamed from: a */
    public final void mo48368a() {
        arbr arbr = this.f87285a;
        armu armu = this.f87286b;
        int i = this.f87287c;
        arbr.f87299b.mo25416d("Discovering nearby device timed out.", new Object[0]);
        if (cgpg.m146448b()) {
            arbr.mo48373b();
        }
        armu.mo48348a(i);
    }
}
