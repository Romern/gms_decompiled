package p000;

/* renamed from: kmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmx implements klx {

    /* renamed from: a */
    private static final bnhe f24500a;

    /* renamed from: b */
    private final kli f24501b;

    /* renamed from: c */
    private final kkp f24502c;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("UNKNOWN_TYPE", kpb.UNKNOWN_DATA_TYPE);
        h.mo67695b("NAME_FIRST", kpb.PERSON_NAME_GIVEN);
        h.mo67695b("NAME_MIDDLE", kpb.PERSON_NAME_MIDDLE);
        h.mo67695b("NAME_LAST", kpb.PERSON_NAME_FAMILY);
        h.mo67695b("NAME_MIDDLE_INITIAL", kpb.PERSON_NAME_MIDDLE_INITAL);
        h.mo67695b("NAME_FULL", kpb.PERSON_NAME);
        h.mo67695b("NAME_SUFFIX", kpb.PERSON_NAME_SUFFIX);
        h.mo67695b("EMAIL_ADDRESS", kpb.EMAIL_ADDRESS);
        h.mo67695b("PHONE_HOME_NUMBER", kpb.PHONE_NUMBER);
        h.mo67695b("PHONE_HOME_COUNTRY_CODE", kpb.PHONE_COUNTRY_CODE);
        h.mo67695b("PHONE_HOME_WHOLE_NUMBER", kpb.PHONE_NUMBER);
        h.mo67695b("ADDRESS_HOME_LINE1", kpb.POSTAL_ADDRESS_STREET_ADDRESS);
        h.mo67695b("ADDRESS_HOME_LINE2", kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
        h.mo67695b("ADDRESS_HOME_APT_NUM", kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
        h.mo67695b("ADDRESS_HOME_CITY", kpb.POSTAL_ADDRESS_LOCALITY);
        h.mo67695b("ADDRESS_HOME_STATE", kpb.POSTAL_ADDRESS_REGION);
        h.mo67695b("ADDRESS_HOME_ZIP", kpb.POSTAL_ADDRESS_POSTAL_CODE);
        h.mo67695b("ADDRESS_HOME_COUNTRY", kpb.POSTAL_ADDRESS_COUNTRY);
        h.mo67695b("CREDIT_CARD_NAME_FULL", kpb.PAYMENT_CARD_HOLDER_NAME);
        h.mo67695b("CREDIT_CARD_NUMBER", kpb.PAYMENT_CARD_NUMBER);
        h.mo67695b("CREDIT_CARD_EXP_MONTH", kpb.PAYMENT_CARD_EXPIRATION_MONTH);
        h.mo67695b("CREDIT_CARD_EXP_2_DIGIT_YEAR", kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        h.mo67695b("CREDIT_CARD_EXP_4_DIGIT_YEAR", kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        h.mo67695b("CREDIT_CARD_EXP_DATE_2_DIGIT_YEAR", kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        h.mo67695b("CREDIT_CARD_EXP_DATE_4_DIGIT_YEAR", kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        h.mo67695b("CREDIT_CARD_VERIFICATION_CODE", kpb.PAYMENT_CARD_CVN);
        h.mo67695b("PASSWORD", kpb.PASSWORD);
        h.mo67695b("ACCOUNT_CREATION_PASSWORD", kpb.NEW_PASSWORD);
        h.mo67695b("ADDRESS_HOME_STREET_ADDRESS", kpb.POSTAL_ADDRESS);
        h.mo67695b("NOT_ACCOUNT_CREATION_PASSWORD", kpb.PASSWORD);
        h.mo67695b("USERNAME", kpb.USERNAME);
        h.mo67695b("USERNAME_AND_EMAIL_ADDRESS", kpb.USERNAME_OR_EMAIL);
        h.mo67695b("NEW_PASSWORD", kpb.NEW_PASSWORD);
        h.mo67695b("PROBABLY_NEW_PASSWORD", kpb.NEW_PASSWORD);
        f24500a = h.mo67618b();
    }

    public kmx(kkp kkp) {
        this.f24502c = kkp;
        this.f24501b = kkp.mo14608z().mo14627a(getClass());
    }

    /* renamed from: a */
    public final bqgg mo14691a(klu klu, bqgj bqgj) {
        return klr.m18129a(this, klu, bqgj);
    }

    /* renamed from: a */
    public final void mo14693a(kjx kjx) {
    }

    /* renamed from: b */
    public final void mo14694b(kjx kjx) {
    }

    /* renamed from: a */
    public final klw mo14692a(klu klu) {
        int i;
        bngx bngx;
        bnic bnic;
        bngs j = bngx.m109377j();
        bngs j2 = bngx.m109377j();
        bnre i2 = klu.f24439a.listIterator();
        while (true) {
            if (!i2.hasNext()) {
                break;
            }
            kom kom = (kom) i2.next();
            bnia j3 = bnic.m109500j();
            kol kol = kom.f24623v;
            if (kol != null) {
                bnre i3 = ((koh) kol).f24573b.listIterator();
                while (i3.hasNext()) {
                    kok kok = (kok) i3.next();
                    if ("ua-autofill-hints".equals(kok.mo14744a())) {
                        String b = kok.mo14745b();
                        kpb kpb = (kpb) f24500a.get(b);
                        if (kpb == null) {
                            this.f24501b.mo14628a("Unsupported field type provided by Chrome=%s", b);
                        } else {
                            j3.mo67629b(kpb);
                        }
                    }
                }
                bnic = j3.mo67751a();
            } else {
                bnic = j3.mo67751a();
            }
            if (bnic.isEmpty()) {
                j2.mo67668c(kom);
            } else {
                kjk a = kjl.m17933a(kom);
                a.mo14527b(bnic);
                a.mo14526a(lbc.WEBVIEW_HINTS);
                j.mo67668c(a.mo14524a());
            }
        }
        bngx a2 = j.mo67664a();
        if (!this.f24502c.mo14600s()) {
            bngx = bngx.m109376e();
        } else {
            bngs j4 = bngx.m109377j();
            int size = a2.size();
            for (i = 0; i < size; i++) {
                kjl kjl = (kjl) a2.get(i);
                j4.mo67668c(klv.m18138a(kjl.mo14518c(), kjl.mo14516a(), kjl.mo14517b()));
            }
            bngx = j4.mo67664a();
        }
        return new klw(j.mo67664a(), j2.mo67664a(), bmvz.f131120a, bngx);
    }
}
