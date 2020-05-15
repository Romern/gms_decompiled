package p000;

/* renamed from: tpz */
final /* synthetic */ class tpz implements C0038ax {

    /* renamed from: a */
    private final tqe f46473a;

    public tpz(tqe tqe) {
        this.f46473a = tqe;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tqe tqe = this.f46473a;
        tql tql = (tql) obj;
        if (tql.mo26735a() != null && tql.mo26737c() == 1) {
            bnre i = ((bngx) tql.mo26735a()).listIterator();
            int i2 = 0;
            while (i.hasNext()) {
                C0034at atVar = (C0034at) i.next();
                if (atVar.mo2448b() != null) {
                    bnre i3 = ((bsjx) atVar.mo2448b()).mo70638c().listIterator();
                    while (i3.hasNext()) {
                        i2 += ((bskf) i3.next()).mo70642a().size();
                    }
                }
            }
            if (tqe.f46482e > i2) {
                tqe.f46481d.mo26715a(47004);
                if (i2 == 0) {
                    tqe.f46481d.mo26715a(47017);
                }
            }
            tqe.f46482e = i2;
            tqe.mo26717a();
        }
    }
}
