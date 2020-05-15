package p000;

/* renamed from: brxz */
final /* synthetic */ class brxz implements Runnable {

    /* renamed from: a */
    private final bryb f143617a;

    /* renamed from: b */
    private final chuv f143618b;

    /* renamed from: c */
    private final chtr f143619c;

    public brxz(bryb bryb, chuv chuv, chtr chtr) {
        this.f143617a = bryb;
        this.f143618b = chuv;
        this.f143619c = chtr;
    }

    public final void run() {
        bryb bryb = this.f143617a;
        chuv chuv = this.f143618b;
        chtr chtr = this.f143619c;
        bryb.f143630h = chuv;
        bryb.f143631i = chtr;
        bryb.f143628f = true;
        bryb.mo70078c();
    }
}
