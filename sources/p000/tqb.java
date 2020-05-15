package p000;

/* renamed from: tqb */
final /* synthetic */ class tqb implements C0038ax {

    /* renamed from: a */
    private final tqe f46475a;

    public tqb(tqe tqe) {
        this.f46475a = tqe;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tqe tqe = this.f46475a;
        tql tql = (tql) obj;
        if (tql.mo26735a() != null && tql.mo26737c() == 1) {
            int size = ((bngx) tql.mo26735a()).size();
            if (tqe.f46483f > size) {
                tqe.f46481d.mo26715a(47005);
                if (size == 0) {
                    tqe.f46481d.mo26715a(47018);
                }
            }
            tqe.f46483f = size;
            tqe.mo26717a();
        }
    }
}
