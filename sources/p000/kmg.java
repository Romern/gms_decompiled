package p000;

/* renamed from: kmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmg implements klo {

    /* renamed from: a */
    private static final bnic f24462a = bnic.m109494a(kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, new kpb[0]);

    /* renamed from: b */
    private final kkp f24463b;

    public kmg() {
        this(kkp.m18062I());
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        boolean z;
        bnia j = bnic.m109500j();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            j.mo67752b((Iterable) ((kjl) i.next()).mo14517b());
        }
        bnic a = j.mo67751a();
        if (a.contains(kpb.PAYMENT_CARD_HOLDER_NAME)) {
            z = bnpf.m110055b(a, f24462a).size() > 1;
        } else {
            z = !bnpf.m110055b(a, f24462a).isEmpty();
        }
        int i2 = -1;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < bngx.size(); i3++) {
            kjl kjl = (kjl) bngx.get(i3);
            if (kjl.mo14530a(kpb.PAYMENT_CARD_EXPIRATION_MONTH)) {
                z3 = true;
            } else if (kjl.mo14530a(kpb.PAYMENT_CARD_EXPIRATION_YEAR)) {
                z2 = true;
            } else if (kjl.mo14530a(kpb.PAYMENT_CARD_EXPIRATION_DATE)) {
                i2 = i3;
            }
        }
        klm a2 = kln.m18126a();
        for (int i4 = 0; i4 < bngx.size(); i4++) {
            kjl kjl2 = (kjl) bngx.get(i4);
            if (i4 != i2) {
                if (!kjl2.mo14530a(kpb.PERSON_NAME) || !kjl2.mo14530a(kpb.PAYMENT_CARD_HOLDER_NAME)) {
                    a2.mo14678a(kjl2);
                } else if (!z) {
                    kjl d = kjl2.mo14533d(kpb.PAYMENT_CARD_HOLDER_NAME);
                    if (this.f24463b.mo14601t()) {
                        a2.mo14679a(kll.m18116a(kmg.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), d.mo14517b()));
                    }
                    a2.mo14678a(kjl2.mo14533d(kpb.PAYMENT_CARD_HOLDER_NAME));
                } else {
                    kjl d2 = kjl2.mo14533d(kpb.PERSON_NAME);
                    if (this.f24463b.mo14601t()) {
                        a2.mo14679a(kll.m18116a(kmg.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), d2.mo14517b()));
                    }
                    a2.mo14678a(d2);
                }
            } else if (z3 && !z2) {
                kjl a3 = kjl2.mo14529a(kpb.PAYMENT_CARD_EXPIRATION_YEAR);
                if (this.f24463b.mo14601t()) {
                    a2.mo14679a(kll.m18116a(kmg.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), a3.mo14517b()));
                }
                a2.mo14678a(a3);
            } else if (!z3 && z2) {
                kjl a4 = kjl2.mo14529a(kpb.PAYMENT_CARD_EXPIRATION_MONTH);
                if (this.f24463b.mo14601t()) {
                    a2.mo14679a(kll.m18116a(kmg.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), a4.mo14517b()));
                }
                a2.mo14678a(kjl2.mo14529a(kpb.PAYMENT_CARD_EXPIRATION_MONTH));
            } else {
                a2.mo14678a(kjl2);
            }
        }
        return a2.mo14676a();
    }

    public kmg(kkp kkp) {
        bmxy.m108581a(kkp);
        this.f24463b = kkp;
    }
}
