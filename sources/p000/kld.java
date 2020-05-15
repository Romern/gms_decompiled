package p000;

import java.util.Map;

/* renamed from: kld */
final /* synthetic */ class kld implements bqeh {

    /* renamed from: a */
    private final klf f24405a;

    /* renamed from: b */
    private final bqgg f24406b;

    /* renamed from: c */
    private final bqgg f24407c;

    /* renamed from: d */
    private final koq f24408d;

    /* renamed from: e */
    private final kck f24409e;

    public kld(klf klf, bqgg bqgg, bqgg bqgg2, koq koq, kck kck) {
        this.f24405a = klf;
        this.f24406b = bqgg;
        this.f24407c = bqgg2;
        this.f24408d = koq;
        this.f24409e = kck;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        klf klf = this.f24405a;
        bqgg bqgg = this.f24406b;
        bqgg bqgg2 = this.f24407c;
        koq koq = this.f24408d;
        kck kck = this.f24409e;
        kln kln = (kln) obj;
        klw klw = (klw) bqgg.get();
        Map map = (Map) bqgg2.get();
        bngs b = bngx.m109371b(kln.f24427a.size());
        bnre i = kln.f24427a.listIterator();
        while (i.hasNext()) {
            b.mo67668c(klf.mo14674a((kjl) i.next(), map));
        }
        bnia j = bnic.m109500j();
        bnia j2 = bnic.m109500j();
        bnre i2 = kln.f24428b.listIterator();
        while (i2.hasNext()) {
            kjl kjl = (kjl) i2.next();
            if (kjl.mo14530a(kpb.UNKNOWN_DATA_TYPE)) {
                j2.mo67629b(klf.mo14674a(kjl, map));
            } else {
                j.mo67629b(klf.mo14674a(kjl, map));
                if (!kjl.mo14530a(kpb.NOT_APPLICABLE)) {
                    klf.f24421h.mo14628a("Detector ignoring field with types: %s", kjl.mo14517b());
                }
            }
        }
        bngs j3 = bngx.m109377j();
        j3.mo67666b((Iterable) klw.f24445c);
        j3.mo67666b((Iterable) kln.f24429c);
        return bqga.m112775a(new kjs(klf.m18101a(b.mo67664a(), klw.f24446d, map, klf.mo14675a(koq.f24634b, kck)), j.mo67751a(), j2.mo67751a(), j3.mo67664a()));
    }
}
