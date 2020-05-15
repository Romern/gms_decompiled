package p000;

/* renamed from: kmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmk implements klo {

    /* renamed from: a */
    private final kkp f24467a;

    public kmk(kkp kkp) {
        this.f24467a = kkp;
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        klm a = kln.m18126a();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            kjl kjl = (kjl) i.next();
            bmxv c = kjl.mo14532c(kpb.UNKNOWN_DATA_TYPE, kpb.NOT_APPLICABLE);
            if (c.mo66813a()) {
                a.mo14678a((kjl) c.mo66814b());
                if (this.f24467a.mo14601t() && !((kjl) c.mo66814b()).mo14517b().equals(kjl.mo14517b())) {
                    a.mo14679a(kll.m18116a(kmk.class.getSimpleName(), kjl.mo14516a(), kjl.mo14517b(), ((kjl) c.mo66814b()).mo14517b()));
                }
            } else {
                a.mo14680b(kjl);
                if (this.f24467a.mo14601t()) {
                    a.mo14679a(klk.m18113a(kmk.class.getSimpleName(), kjl.mo14516a()));
                }
            }
        }
        return a.mo14676a();
    }
}
