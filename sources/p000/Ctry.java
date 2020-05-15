package p000;

/* renamed from: try  reason: invalid class name */
final /* synthetic */ class Ctry implements C0038ax {

    /* renamed from: a */
    private final trz f46570a;

    public Ctry(trz trz) {
        this.f46570a = trz;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        trz trz = this.f46570a;
        tql tql = (tql) obj;
        if (((tql) trz.f46571a.f46559e.mo2448b()).mo26735a() != null && trz.f46572d.mo2448b() != null) {
            bnre i = ((bngx) ((tql) trz.f46571a.f46559e.mo2448b()).mo26735a()).listIterator();
            while (i.hasNext()) {
                C0034at atVar = (C0034at) i.next();
                if (((bsjx) atVar.mo2448b()).mo70636a().equals(((bsjx) trz.f46572d.mo2448b()).mo70636a())) {
                    trz.f46572d.mo2450b((bsjx) atVar.mo2448b());
                    return;
                }
            }
            trz.f46572d.mo2450b((Object) null);
        }
    }
}
