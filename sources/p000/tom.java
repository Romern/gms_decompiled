package p000;

/* renamed from: tom */
final /* synthetic */ class tom implements aubg {

    /* renamed from: a */
    private final bngx f46410a;

    public tom(bngx bngx) {
        this.f46410a = bngx;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        bngx bngx = this.f46410a;
        bnic bnic = top.f46413a;
        if (bngx.size() == 0) {
            return bngx.m109376e();
        }
        bngs j = bngx.m109377j();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            j.mo67666b((Iterable) ((aucb) i.next()).mo50386d());
        }
        return j.mo67664a();
    }
}
