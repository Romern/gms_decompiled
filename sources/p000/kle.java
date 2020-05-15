package p000;

import java.util.concurrent.Callable;

/* renamed from: kle */
final /* synthetic */ class kle implements Callable {

    /* renamed from: a */
    private final klf f24410a;

    /* renamed from: b */
    private final koq f24411b;

    /* renamed from: c */
    private final kjx f24412c;

    /* renamed from: d */
    private final kck f24413d;

    public kle(klf klf, koq koq, kjx kjx, kck kck) {
        this.f24410a = klf;
        this.f24411b = koq;
        this.f24412c = kjx;
        this.f24413d = kck;
    }

    public final Object call() {
        klf klf = this.f24410a;
        koq koq = this.f24411b;
        kjx kjx = this.f24412c;
        kck kck = this.f24413d;
        klp a = klf.f24416c.mo14682a(koq);
        bnic bnic = a.f24431b;
        bnic bnic2 = a.f24432c;
        klt a2 = klu.m18134a();
        a2.mo14686a(kjx);
        a2.mo14687b(a.f24430a);
        a2.mo14685a(bnic2);
        bnre i = klf.f24414a.listIterator();
        while (i.hasNext()) {
            kkc kkc = (kkc) i.next();
            int a3 = kkc.mo14567a();
            a2.f24435a.mo67695b(Integer.valueOf(a3), kkc.mo14568a(bnic, bnic2));
        }
        klu a4 = a2.mo14684a();
        klw a5 = klf.f24417d.mo14692a(a2.mo14684a());
        bngs b = bngx.m109371b(a5.f24443a.size() + a5.f24444b.size());
        b.mo67666b((Iterable) a5.f24443a);
        bnre i2 = a5.f24444b.listIterator();
        while (i2.hasNext()) {
            b.mo67668c(kjl.m17933a((kom) i2.next()).mo14524a());
        }
        kln a6 = klf.f24418e.mo14681a(b.mo67664a());
        bngs b2 = bngx.m109371b(a6.f24427a.size());
        bnre i3 = a6.f24427a.listIterator();
        while (i3.hasNext()) {
            b2.mo67668c(klf.mo14674a((kjl) i3.next(), a4.f24442d));
        }
        bnia j = bnic.m109500j();
        bnia j2 = bnic.m109500j();
        bnre i4 = a6.f24428b.listIterator();
        while (i4.hasNext()) {
            kjl kjl = (kjl) i4.next();
            if (kjl.mo14530a(kpb.UNKNOWN_DATA_TYPE)) {
                j2.mo67629b(klf.mo14674a(kjl, a4.f24442d));
            } else {
                j.mo67629b(klf.mo14674a(kjl, a4.f24442d));
                if (!kjl.mo14530a(kpb.NOT_APPLICABLE)) {
                    klf.f24421h.mo14628a("Detector ignoring field with types: %s", kjl.mo14517b());
                }
            }
        }
        bngs j3 = bngx.m109377j();
        j3.mo67666b((Iterable) a5.f24445c);
        j3.mo67666b((Iterable) a6.f24429c);
        return new kjs(klf.m18101a(b2.mo67664a(), a5.f24446d, a4.f24442d, klf.mo14675a(koq.f24634b, kck)), j.mo67751a(), j2.mo67751a(), j3.mo67664a());
    }
}
