package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: kmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmw implements klx {

    /* renamed from: a */
    public static final /* synthetic */ int f24491a = 0;

    /* renamed from: b */
    private static final bnhe f24492b;

    /* renamed from: c */
    private static final bnhe f24493c;

    /* renamed from: d */
    private static final bnhe f24494d;

    /* renamed from: e */
    private static final bngx f24495e;

    /* renamed from: f */
    private static final bnhe f24496f;

    /* renamed from: g */
    private final kli f24497g;

    /* renamed from: h */
    private final kkp f24498h;

    /* renamed from: i */
    private final bnic f24499i;

    static {
        bnha a = bnhe.m109406a(30);
        a.mo67695b("username", kpb.USERNAME);
        a.mo67695b("password", kpb.PASSWORD);
        a.mo67695b("emailAddress", kpb.EMAIL_ADDRESS);
        a.mo67695b("name", kpb.PERSON_NAME);
        a.mo67695b("phone", kpb.PHONE_NUMBER);
        a.mo67695b("postalAddress", kpb.POSTAL_ADDRESS);
        a.mo67695b("postalCode", kpb.POSTAL_ADDRESS_POSTAL_CODE);
        a.mo67695b("creditCardNumber", kpb.PAYMENT_CARD_NUMBER);
        a.mo67695b("creditCardSecurityCode", kpb.PAYMENT_CARD_CVN);
        a.mo67695b("creditCardExpirationDate", kpb.PAYMENT_CARD_EXPIRATION_DATE);
        a.mo67695b("creditCardExpirationMonth", kpb.PAYMENT_CARD_EXPIRATION_MONTH);
        a.mo67695b("creditCardExpirationYear", kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        a.mo67695b("current-password", kpb.PASSWORD);
        a.mo67695b("give-name", kpb.PERSON_NAME_GIVEN);
        a.mo67695b("additional-name", kpb.PERSON_NAME_MIDDLE);
        a.mo67695b("family-name", kpb.PERSON_NAME_FAMILY);
        a.mo67695b("address-line1", kpb.POSTAL_ADDRESS_STREET_ADDRESS);
        a.mo67695b("address-line2", kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
        a.mo67695b("address-level2", kpb.POSTAL_ADDRESS_LOCALITY);
        a.mo67695b("address-level1", kpb.POSTAL_ADDRESS_REGION);
        a.mo67695b("country", kpb.POSTAL_ADDRESS_COUNTRY);
        a.mo67695b("country-name", kpb.POSTAL_ADDRESS_COUNTRY);
        a.mo67695b("postal-code", kpb.POSTAL_ADDRESS_POSTAL_CODE);
        a.mo67695b("cc-number", kpb.PAYMENT_CARD_NUMBER);
        a.mo67695b("cc-exp", kpb.PAYMENT_CARD_EXPIRATION_DATE);
        a.mo67695b("cc-exp-month", kpb.PAYMENT_CARD_EXPIRATION_MONTH);
        a.mo67695b("cc-exp-year", kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        a.mo67695b("cc-csc", kpb.PAYMENT_CARD_CVN);
        a.mo67695b("tel", kpb.PHONE_NUMBER);
        a.mo67695b("email", kpb.EMAIL_ADDRESS);
        f24492b = a.mo67618b();
        bnha a2 = bnhe.m109406a(13);
        a2.mo67695b("given-name", kpb.PERSON_NAME_GIVEN);
        a2.mo67695b("new-password", kpb.NEW_PASSWORD);
        a2.mo67695b("street-address", kpb.POSTAL_ADDRESS_STREET_ADDRESS);
        a2.mo67695b("cc-name", kpb.PAYMENT_CARD_HOLDER_NAME);
        a2.mo67695b("cc-given-name", kpb.PERSON_NAME_GIVEN);
        a2.mo67695b("cc-family-name", kpb.PERSON_NAME_FAMILY);
        a2.mo67695b("tel-country-code", kpb.PHONE_COUNTRY_CODE);
        a2.mo67695b("tel-national", kpb.PHONE_NATIONAL);
        a2.mo67695b("bday", kpb.BIRTHDATE_FULL);
        a2.mo67695b("bday-day", kpb.BIRTHDATE_DAY);
        a2.mo67695b("bday-month", kpb.BIRTHDATE_MONTH);
        a2.mo67695b("bday-year", kpb.BIRTHDATE_YEAR);
        a2.mo67695b("sex", kpb.GENDER);
        f24493c = a2.mo67618b();
        bnha a3 = bnhe.m109406a(12);
        a3.mo67695b("AUTOFILL_HINT_USERNAME", kpb.USERNAME);
        a3.mo67695b("AUTOFILL_HINT_PASSWORD", kpb.PASSWORD);
        a3.mo67695b("AUTOFILL_HINT_EMAIL_ADDRESS", kpb.EMAIL_ADDRESS);
        a3.mo67695b("AUTOFILL_HINT_NAME", kpb.PERSON_NAME);
        a3.mo67695b("AUTOFILL_HINT_PHONE", kpb.PHONE_NUMBER);
        a3.mo67695b("AUTOFILL_HINT_POSTAL_ADDRESS", kpb.POSTAL_ADDRESS);
        a3.mo67695b("AUTOFILL_HINT_POSTAL_CODE", kpb.POSTAL_ADDRESS_POSTAL_CODE);
        a3.mo67695b("AUTOFILL_HINT_CREDIT_CARD_NUMBER", kpb.PAYMENT_CARD_NUMBER);
        a3.mo67695b("AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE", kpb.PAYMENT_CARD_CVN);
        a3.mo67695b("AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE", kpb.PAYMENT_CARD_EXPIRATION_DATE);
        a3.mo67695b("AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH", kpb.PAYMENT_CARD_EXPIRATION_MONTH);
        a3.mo67695b("AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR", kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        f24494d = a3.mo67618b();
        bngs b = bngx.m109371b(10);
        b.mo67668c(new kmv("username", kpb.USERNAME));
        b.mo67668c(new kmv("new.?password", kpb.NEW_PASSWORD));
        b.mo67668c(new kmv("password", kpb.PASSWORD));
        b.mo67668c(new kmv("email.?address", kpb.EMAIL_ADDRESS));
        b.mo67668c(new kmv("first.?name|given.?name", kpb.PERSON_NAME_GIVEN));
        b.mo67668c(new kmv("last.?name|family.?name", kpb.PERSON_NAME_FAMILY));
        b.mo67668c(new kmv("bday.?day", kpb.BIRTHDATE_DAY));
        b.mo67668c(new kmv("bday.?month", kpb.BIRTHDATE_MONTH));
        b.mo67668c(new kmv("bday.?year", kpb.BIRTHDATE_YEAR));
        b.mo67668c(new kmv("one.?time.?code", kpb.OTP_FULL));
        f24495e = b.mo67664a();
        bnha a4 = bnhe.m109406a(58);
        a4.mo67695b("addressRegion", kpb.POSTAL_ADDRESS_REGION);
        a4.mo67695b("addressLocality", kpb.POSTAL_ADDRESS_LOCALITY);
        a4.mo67695b("streetAddress", kpb.POSTAL_ADDRESS_STREET_ADDRESS);
        a4.mo67695b("extendedAddress", kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
        a4.mo67695b("extendedPostalCode", kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);
        a4.mo67695b("addressCountry", kpb.POSTAL_ADDRESS_COUNTRY);
        a4.mo67695b("personName", kpb.PERSON_NAME);
        a4.mo67695b("personGivenName", kpb.PERSON_NAME_GIVEN);
        a4.mo67695b("personFamilyName", kpb.PERSON_NAME_FAMILY);
        a4.mo67695b("personMiddleName", kpb.PERSON_NAME_MIDDLE);
        a4.mo67695b("personMiddleInitial", kpb.PERSON_NAME_MIDDLE_INITAL);
        a4.mo67695b("personNamePrefix", kpb.PERSON_NAME_PREFIX);
        a4.mo67695b("personNameSuffix", kpb.PERSON_NAME_SUFFIX);
        a4.mo67695b("phoneNumber", kpb.PHONE_NUMBER);
        a4.mo67695b("phoneNumberDevice", kpb.PHONE_NUMBER);
        a4.mo67695b("phoneCountryCode", kpb.PHONE_COUNTRY_CODE);
        a4.mo67695b("phoneNational", kpb.PHONE_NATIONAL);
        a4.mo67695b("newUsername", kpb.NEW_USERNAME);
        a4.mo67695b("newPassword", kpb.NEW_PASSWORD);
        a4.mo67695b("gender", kpb.GENDER);
        a4.mo67695b("birthDateFull", kpb.BIRTHDATE_FULL);
        a4.mo67695b("birthDateDay", kpb.BIRTHDATE_DAY);
        a4.mo67695b("birthDateMonth", kpb.BIRTHDATE_MONTH);
        a4.mo67695b("birthDateYear", kpb.BIRTHDATE_YEAR);
        a4.mo67695b("smsOTPCode", kpb.OTP_FULL);
        a4.mo67695b("smsOTPCode1", kpb.OTP_1);
        a4.mo67695b("smsOTPCode2", kpb.OTP_2);
        a4.mo67695b("smsOTPCode3", kpb.OTP_3);
        a4.mo67695b("smsOTPCode4", kpb.OTP_4);
        a4.mo67695b("smsOTPCode5", kpb.OTP_5);
        a4.mo67695b("smsOTPCode6", kpb.OTP_6);
        a4.mo67695b("smsOTPCode7", kpb.OTP_7);
        a4.mo67695b("smsOTPCode8", kpb.OTP_8);
        a4.mo67695b("AUTOFILL_HINT_POSTAL_ADDRESS_REGION", kpb.POSTAL_ADDRESS_REGION);
        a4.mo67695b("AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY", kpb.POSTAL_ADDRESS_LOCALITY);
        a4.mo67695b("AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS", kpb.POSTAL_ADDRESS_STREET_ADDRESS);
        a4.mo67695b("AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS", kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
        a4.mo67695b("AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE", kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);
        a4.mo67695b("AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY", kpb.POSTAL_ADDRESS_COUNTRY);
        a4.mo67695b("AUTOFILL_HINT_PERSON_NAME", kpb.PERSON_NAME);
        a4.mo67695b("AUTOFILL_HINT_PERSON_NAME_GIVEN", kpb.PERSON_NAME_GIVEN);
        a4.mo67695b("AUTOFILL_HINT_PERSON_NAME_FAMILY", kpb.PERSON_NAME_FAMILY);
        a4.mo67695b("AUTOFILL_HINT_PERSON_NAME_MIDDLE", kpb.PERSON_NAME_MIDDLE);
        a4.mo67695b("AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL", kpb.PERSON_NAME_MIDDLE_INITAL);
        a4.mo67695b("AUTOFILL_HINT_PERSON_NAME_PREFIX", kpb.PERSON_NAME_PREFIX);
        a4.mo67695b("AUTOFILL_HINT_PERSON_NAME_SUFFIX", kpb.PERSON_NAME_SUFFIX);
        a4.mo67695b("AUTOFILL_HINT_PHONE_NUMBER", kpb.PHONE_NUMBER);
        a4.mo67695b("AUTOFILL_HINT_PHONE_NUMBER_DEVICE", kpb.PHONE_NUMBER);
        a4.mo67695b("AUTOFILL_HINT_PHONE_COUNTRY_CODE", kpb.PHONE_COUNTRY_CODE);
        a4.mo67695b("AUTOFILL_HINT_PHONE_NATIONAL", kpb.PHONE_NATIONAL);
        a4.mo67695b("AUTOFILL_HINT_NEW_USERNAME", kpb.NEW_USERNAME);
        a4.mo67695b("AUTOFILL_HINT_NEW_PASSWORD", kpb.NEW_PASSWORD);
        a4.mo67695b("AUTOFILL_HINT_GENDER", kpb.GENDER);
        a4.mo67695b("AUTOFILL_HINT_BIRTH_DATE_FULL", kpb.BIRTHDATE_FULL);
        a4.mo67695b("AUTOFILL_HINT_BIRTH_DATE_DAY", kpb.BIRTHDATE_DAY);
        a4.mo67695b("AUTOFILL_HINT_BIRTH_DATE_MONTH", kpb.BIRTHDATE_MONTH);
        a4.mo67695b("AUTOFILL_HINT_BIRTH_DATE_YEAR", kpb.BIRTHDATE_YEAR);
        a4.mo67695b("AUTOFILL_HINT_SMS_OTP", kpb.OTP_FULL);
        f24496f = a4.mo67618b();
    }

    public kmw(kkp kkp, Set set) {
        this.f24498h = kkp;
        this.f24499i = bnic.m109495a((Collection) set);
        this.f24497g = kkp.mo14608z().mo14627a(getClass());
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
        bmxv bmxv;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        bnre i2 = klu.f24439a.listIterator();
        while (true) {
            if (!i2.hasNext()) {
                break;
            }
            kom kom = (kom) i2.next();
            bnia j = bnic.m109500j();
            bnrd a = kom.f24610i.iterator();
            while (a.hasNext()) {
                String str = (String) a.next();
                kpb kpb = (kpb) f24492b.get(str);
                if (kpb == null) {
                    kpb = (kpb) f24493c.get(str);
                }
                if (kpb == null && this.f24498h.mo14591j()) {
                    bnia j2 = bnic.m109500j();
                    for (String str2 : bmyx.m108640a('|').mo66918a((CharSequence) str)) {
                        kpb kpb2 = (kpb) f24494d.get(str2);
                        if (kpb2 == null) {
                            bnre i3 = f24495e.listIterator();
                            while (true) {
                                if (!i3.hasNext()) {
                                    break;
                                }
                                kmv kmv = (kmv) i3.next();
                                if (kmv.f24489a.matcher(str2).find()) {
                                    j2.mo67629b(kmv.f24490b);
                                    break;
                                }
                            }
                        } else {
                            j2.mo67629b(kpb2);
                        }
                    }
                    bnic a2 = j2.mo67751a();
                    if (!a2.isEmpty()) {
                        j.mo67752b((Iterable) a2);
                    }
                }
                if (kpb != null) {
                    j.mo67629b(kpb);
                } else if (!bmwb.m108443a("off", str) && !bmwb.m108443a("on", str)) {
                    this.f24497g.mo14628a("Unsupported field type provided by app=%s", str);
                }
            }
            bnic a3 = j.mo67751a();
            if (!a3.isEmpty()) {
                kjk a4 = kjl.m17933a(kom);
                a4.mo14527b(a3);
                a4.mo14526a(lbc.AUTOFILL_HINTS);
                bmxv = bmxv.m108566b(a4.mo14524a());
            } else {
                bnia j3 = bnic.m109500j();
                if (this.f24498h.mo14595n()) {
                    bnrd a5 = kom.f24610i.iterator();
                    while (a5.hasNext()) {
                        kpb kpb3 = (kpb) f24496f.get((String) a5.next());
                        if (kpb3 != null) {
                            j3.mo67629b(kpb3);
                        }
                    }
                }
                bnic a6 = j3.mo67751a();
                if (!a6.isEmpty()) {
                    kjk a7 = kjl.m17933a(kom);
                    a7.mo14527b(a6);
                    a7.mo14526a(lbc.EXTENDED_AUTOFILL_HINTS);
                    bmxv = bmxv.m108566b(a7.mo14524a());
                } else {
                    bmxv = bmvz.f131120a;
                }
            }
            if (!bmxv.mo66813a()) {
                arrayList2.add(kom);
            } else {
                kjl kjl = (kjl) bmxv.mo66814b();
                if (kjl.mo14518c() == lbc.EXTENDED_AUTOFILL_HINTS || !bnpf.m110057c(kjl.mo14517b(), this.f24499i).isEmpty()) {
                    arrayList.add(kjl);
                } else {
                    arrayList2.add(kom);
                }
            }
        }
        if (arrayList.stream().filter(kmu.f24488a).count() > 1) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kjl kjl2 = (kjl) it.next();
                if (kjl2.mo14530a(kpb.POSTAL_ADDRESS)) {
                    it.remove();
                    arrayList2.add(kjl2.mo14516a());
                }
            }
        }
        if (!this.f24498h.mo14600s()) {
            bngx = bngx.m109376e();
        } else {
            bngs j4 = bngx.m109377j();
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                kjl kjl3 = (kjl) arrayList.get(i);
                j4.mo67668c(klv.m18138a(kjl3.mo14518c(), kjl3.mo14516a(), kjl3.mo14517b()));
            }
            bngx = j4.mo67664a();
        }
        return new klw(arrayList, arrayList2, bmvz.f131120a, bngx);
    }
}
