package p000;

/* renamed from: kmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmh implements klo {

    /* renamed from: a */
    private final kkp f24464a;

    public kmh(kkp kkp) {
        this.f24464a = kkp;
    }

    /* renamed from: a */
    private static int m18163a(bngx bngx, kpb kpb) {
        boolean z = false;
        for (int i = 0; i < bngx.size(); i++) {
            if (((kjl) bngx.get(i)).mo14530a(kpb)) {
                if (z) {
                    return i;
                }
                z = true;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        bnia j = bnic.m109500j();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            j.mo67752b((Iterable) ((kjl) i.next()).mo14517b());
        }
        bnic a = j.mo67751a();
        if (a.contains(kpb.POSTAL_ADDRESS) && (a.contains(kpb.POSTAL_ADDRESS_LOCALITY) || a.contains(kpb.POSTAL_ADDRESS_POSTAL_CODE))) {
            bngs j2 = bngx.m109377j();
            bnre i2 = bngx.listIterator();
            while (i2.hasNext()) {
                kjl kjl = (kjl) i2.next();
                if (kjl.mo14530a(kpb.POSTAL_ADDRESS)) {
                    j2.mo67668c(kjl.mo14529a(kpb.POSTAL_ADDRESS_STREET_ADDRESS));
                } else {
                    j2.mo67668c(kjl);
                }
            }
            bngx = j2.mo67664a();
        }
        bnia j3 = bnic.m109500j();
        bnre i3 = bngx.listIterator();
        while (i3.hasNext()) {
            j3.mo67752b((Iterable) ((kjl) i3.next()).mo14517b());
        }
        bnic a2 = j3.mo67751a();
        int a3 = m18163a(bngx, kpb.POSTAL_ADDRESS_STREET_ADDRESS);
        int a4 = m18163a(bngx, kpb.POSTAL_ADDRESS_POSTAL_CODE);
        klm a5 = kln.m18126a();
        for (int i4 = 0; i4 < bngx.size(); i4++) {
            kjl kjl2 = (kjl) bngx.get(i4);
            if (i4 == a3 && !a2.contains(kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS)) {
                kjl a6 = kjl2.mo14529a(kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
                a5.mo14678a(a6);
                if (this.f24464a.mo14601t()) {
                    a5.mo14679a(kll.m18116a(kmh.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), a6.mo14517b()));
                }
            } else if (i4 != a4 || a2.contains(kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE)) {
                a5.mo14678a(kjl2);
            } else {
                kjl a7 = kjl2.mo14529a(kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);
                a5.mo14678a(a7);
                if (this.f24464a.mo14601t()) {
                    a5.mo14679a(kll.m18116a(kmh.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), a7.mo14517b()));
                }
            }
        }
        return a5.mo14676a();
    }
}
