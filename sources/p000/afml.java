package p000;

/* renamed from: afml */
final /* synthetic */ class afml implements aubq {

    /* renamed from: a */
    private final afmm f64383a;

    public afml(afmm afmm) {
        this.f64383a = afmm;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        afmm afmm = this.f64383a;
        synchronized (afmm.f64387d.f64400h) {
            afmp.m53240a(afmm.f64386c, aucb);
            afmm.f64385b = false;
            for (afmk afmk : afmm.f64384a) {
                if (!aucb.mo50384b()) {
                    afmk.f64381a.mo50390a(aucb.mo50387e());
                } else {
                    afmk.mo34964a();
                }
            }
            afmm.f64384a.clear();
            afmp afmp = afmm.f64387d;
            boolean b = aucb.mo50384b();
            if (afmp.f64400h.size() > 1) {
                afmp.f64400h.removeFirst();
                ((afmm) afmp.f64400h.getFirst()).mo34965a();
            } else if (b) {
                afmp.f64400h.removeFirst();
            }
        }
    }
}
