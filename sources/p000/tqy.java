package p000;

/* renamed from: tqy */
public final /* synthetic */ class tqy implements aubw {

    /* renamed from: a */
    private final trs f46519a;

    /* renamed from: b */
    private final tqj f46520b;

    /* renamed from: c */
    private final C0034at f46521c;

    public tqy(trs trs, tqj tqj, C0034at atVar) {
        this.f46519a = trs;
        this.f46520b = tqj;
        this.f46521c = atVar;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        trs trs = this.f46519a;
        tqj tqj = this.f46520b;
        C0034at atVar = this.f46521c;
        Void voidR = (Void) obj;
        tql tql = (tql) trs.f46560f.mo2448b();
        boolean z = false;
        if (!(tql == null || tql.mo26735a() == null)) {
            z = true;
        }
        bmxy.m108589a(z, "Delete was requested before data was available.");
        bngs j = bngx.m109377j();
        bnre i = ((bngx) tql.mo26735a()).listIterator();
        while (i.hasNext()) {
            tqj tqj2 = (tqj) i.next();
            if (!tqj2.equals(tqj)) {
                j.mo67668c(tqj2);
            }
        }
        trs.f46560f.mo2450b(tql.m37363a(tql.mo26737c(), j.mo67664a(), tql.mo26736b()));
        atVar.mo2450b(tql.m37365a((Object) null));
    }
}
