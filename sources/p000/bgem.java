package p000;

/* renamed from: bgem */
final /* synthetic */ class bgem implements Runnable {

    /* renamed from: a */
    private final bgeo f116278a;

    public bgem(bgeo bgeo) {
        this.f116278a = bgeo;
    }

    public final void run() {
        bgeo bgeo = this.f116278a;
        if (bgeo.f116282c == 2) {
            bget bget = bgeo.f116283d;
            bget.f116292a.f116294a.mo62759n().mo62802a(bgeo.f116281b, new bges(bgeo.f116286g));
            bgeo.f116282c = 3;
        }
    }
}
