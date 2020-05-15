package p000;

/* renamed from: klc */
final /* synthetic */ class klc implements bmxj {

    /* renamed from: a */
    private final klf f24404a;

    public klc(klf klf) {
        this.f24404a = klf;
    }

    public final Object apply(Object obj) {
        klf klf = this.f24404a;
        klw klw = (klw) obj;
        bngs b = bngx.m109371b(klw.f24443a.size() + klw.f24444b.size());
        b.mo67666b((Iterable) klw.f24443a);
        bnre i = klw.f24444b.listIterator();
        while (i.hasNext()) {
            b.mo67668c(kjl.m17933a((kom) i.next()).mo14524a());
        }
        return klf.f24418e.mo14681a(b.mo67664a());
    }
}
