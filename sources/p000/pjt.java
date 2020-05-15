package p000;

/* renamed from: pjt */
final /* synthetic */ class pjt implements Runnable {

    /* renamed from: a */
    private final pjx f39396a;

    public pjt(pjx pjx) {
        this.f39396a = pjx;
    }

    public final void run() {
        pjx pjx = this.f39396a;
        if (pjx.f39403f != null) {
            if (pjx.f39407j) {
                pjx.f39400c.mo23856a("Timeout when discovering the new endpoint of %s.", pjx.f39230a);
            } else if (pjx.mo23213c()) {
                pjx.f39400c.mo23856a("Timeout when connecting to the new endpoint of %s.", pjx.f39230a);
            } else if (pjx.mo23211b()) {
                pjx.f39400c.mo23856a("Timeout when joining the app on new endpoint of %s.", pjx.f39230a);
            }
            pjx.f39407j = false;
            pjx.f39401d.mo23463b(pjx.f39405h);
            pjx.mo23284a(2901);
        }
    }
}
