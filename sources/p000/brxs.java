package p000;

/* renamed from: brxs */
final /* synthetic */ class brxs implements Runnable {

    /* renamed from: a */
    private final brxw f143583a;

    /* renamed from: b */
    private final int f143584b;

    public brxs(brxw brxw, int i) {
        this.f143583a = brxw;
        this.f143584b = i;
    }

    public final void run() {
        brxw brxw = this.f143583a;
        int i = this.f143584b;
        if (brxw.f143601g) {
            return;
        }
        if (brxw.f143598d.f143594e != 4) {
            brxw.f143597c += i;
        } else {
            brxw.f143602h.mo70029a(i);
        }
    }
}
