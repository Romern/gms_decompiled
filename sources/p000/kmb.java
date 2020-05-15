package p000;

import java.util.Collections;

/* renamed from: kmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmb implements klo {

    /* renamed from: a */
    private final kkp f24453a;

    public kmb() {
        this(kkp.m18062I());
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        bnia j = bnic.m109500j();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            j.mo67752b((Iterable) ((kjl) i.next()).mo14517b());
        }
        bnic a = j.mo67751a();
        bnia j2 = bnic.m109500j();
        boolean contains = a.contains(kpb.PAYMENT_CARD_NUMBER);
        if (this.f24453a.mo14593l() ? !contains : !(contains && (a.contains(kpb.PAYMENT_CARD_CVN) || a.contains(kpb.PAYMENT_CARD_EXPIRATION_DATE) || (a.contains(kpb.PAYMENT_CARD_EXPIRATION_MONTH) && a.contains(kpb.PAYMENT_CARD_EXPIRATION_YEAR))))) {
            j2.mo67629b(kpb.PAYMENT_CARD_NUMBER);
            j2.mo67629b(kpb.PAYMENT_CARD_CVN);
            j2.mo67629b(kpb.PAYMENT_CARD_EXPIRATION_DATE);
            j2.mo67629b(kpb.PAYMENT_CARD_EXPIRATION_MONTH);
            j2.mo67629b(kpb.PAYMENT_CARD_EXPIRATION_YEAR);
            j2.mo67629b(kpb.PAYMENT_CARD_HOLDER_NAME);
            if (!a.contains(kpb.POSTAL_ADDRESS) && (!a.contains(kpb.POSTAL_ADDRESS_STREET_ADDRESS) || (!a.contains(kpb.POSTAL_ADDRESS_LOCALITY) && !a.contains(kpb.POSTAL_ADDRESS_POSTAL_CODE)))) {
                j2.mo67629b(kpb.POSTAL_ADDRESS_STREET_ADDRESS);
                j2.mo67629b(kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
                j2.mo67629b(kpb.POSTAL_ADDRESS_LOCALITY);
                j2.mo67629b(kpb.POSTAL_ADDRESS_REGION);
                j2.mo67629b(kpb.POSTAL_ADDRESS_POSTAL_CODE);
                j2.mo67629b(kpb.POSTAL_ADDRESS_COUNTRY);
            }
        }
        bnic a2 = j2.mo67751a();
        klm a3 = kln.m18126a();
        bnre i2 = bngx.listIterator();
        while (i2.hasNext()) {
            kjl kjl = (kjl) i2.next();
            if (Collections.disjoint(kjl.mo14517b(), a2)) {
                a3.mo14678a(kjl);
            } else {
                a3.mo14680b(kjl);
                if (this.f24453a.mo14601t()) {
                    a3.mo14679a(klk.m18113a(kmb.class.getSimpleName(), kjl.mo14516a()));
                }
            }
        }
        return a3.mo14676a();
    }

    public kmb(kkp kkp) {
        bmxy.m108581a(kkp);
        this.f24453a = kkp;
    }
}
