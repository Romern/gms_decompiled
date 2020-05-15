package p000;

/* renamed from: pmi */
final /* synthetic */ class pmi implements Runnable {

    /* renamed from: a */
    private final pmj f39695a;

    public pmi(pmj pmj) {
        this.f39695a = pmj;
    }

    public final void run() {
        ppz ppz;
        pmj pmj = this.f39695a;
        if (pmj.f39646g.mo23398a() && (ppz = ppz.f40045d) != null) {
            for (ppc ppc : ppz.mo23549d().values()) {
                pmj.mo23415a(ppc);
            }
        }
        pmj.f39699c = null;
    }
}
