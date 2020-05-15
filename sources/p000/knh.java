package p000;

import com.google.autofill.detection.p098ml.Model;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* renamed from: knh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class knh implements klx {

    /* renamed from: b */
    private static final bnig f24516b;

    /* renamed from: c */
    private static final bnig f24517c;

    /* renamed from: d */
    private static final bnic f24518d = bnic.m109493a(kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE);

    /* renamed from: e */
    private static final bnig f24519e;

    /* renamed from: a */
    public final Model f24520a;

    /* renamed from: f */
    private final boolean f24521f;

    /* renamed from: g */
    private final boolean f24522g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnid.b(java.lang.Object, java.lang.Iterable):void
     arg types: [kpb, bnic]
     candidates:
      bnhp.b(java.lang.Object, java.lang.Object):void
      bnid.b(java.lang.Object, java.lang.Iterable):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnid.a(java.lang.Object, java.lang.Object[]):void
     arg types: [kpb, kpb[]]
     candidates:
      bnid.a(java.lang.Object, java.lang.Object):void
      bnhp.a(java.lang.Object, java.lang.Iterable):void
      bnid.a(java.lang.Object, java.lang.Object[]):void */
    static {
        bnid a = bnig.m109513a();
        a.mo67760b((Object) kpb.USERNAME, (Iterable) bnic.m109489a(kpb.PASSWORD));
        a.mo67760b((Object) kpb.PASSWORD, (Iterable) bnic.m109490a(kpb.USERNAME, kpb.NEW_PASSWORD));
        a.mo67760b((Object) kpb.PHONE_COUNTRY_CODE, (Iterable) bnic.m109489a(kpb.PHONE_NATIONAL));
        a.mo67760b((Object) kpb.PHONE_NATIONAL, (Iterable) bnic.m109489a(kpb.PHONE_COUNTRY_CODE));
        a.mo67760b((Object) kpb.NEW_USERNAME, (Iterable) bnic.m109489a(kpb.NEW_PASSWORD));
        a.mo67760b((Object) kpb.NEW_PASSWORD, (Iterable) bnic.m109490a(kpb.NEW_USERNAME, kpb.NEW_PASSWORD));
        a.mo67760b((Object) kpb.PERSON_NAME, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS, kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_POSTAL_CODE, new kpb[0]));
        a.mo67760b((Object) kpb.PERSON_NAME_GIVEN, (Iterable) bnic.m109493a(kpb.PERSON_NAME_FAMILY, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PERSON_NAME_PREFIX, kpb.PERSON_NAME_SUFFIX));
        a.mo67760b((Object) kpb.PERSON_NAME_MIDDLE, (Iterable) bnic.m109493a(kpb.PERSON_NAME_FAMILY, kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PERSON_NAME_PREFIX, kpb.PERSON_NAME_SUFFIX));
        a.mo67760b((Object) kpb.PERSON_NAME_FAMILY, (Iterable) bnic.m109493a(kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PERSON_NAME_PREFIX, kpb.PERSON_NAME_SUFFIX));
        a.mo67760b((Object) kpb.PERSON_NAME_MIDDLE_INITAL, (Iterable) bnic.m109493a(kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_FAMILY, kpb.PERSON_NAME_PREFIX, kpb.PERSON_NAME_SUFFIX));
        a.mo67760b((Object) kpb.PERSON_NAME_PREFIX, (Iterable) bnic.m109493a(kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PERSON_NAME_FAMILY, kpb.PERSON_NAME_SUFFIX));
        a.mo67760b((Object) kpb.PERSON_NAME_SUFFIX, (Iterable) bnic.m109493a(kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PERSON_NAME_PREFIX, kpb.PERSON_NAME_FAMILY));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS, (Iterable) bnic.m109489a(kpb.POSTAL_ADDRESS_COUNTRY));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_COUNTRY, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, new kpb[0]));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_POSTAL_CODE, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_MONTH));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_REGION, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, new kpb[0]));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_LOCALITY, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, new kpb[0]));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_STREET_ADDRESS, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, new kpb[0]));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, new kpb[0]));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, (Iterable) bnic.m109494a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_REGION, new kpb[0]));
        a.mo67760b((Object) kpb.PAYMENT_CARD_NUMBER, (Iterable) bnic.m109494a(kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY));
        a.mo67760b((Object) kpb.PAYMENT_CARD_HOLDER_NAME, (Iterable) bnic.m109494a(kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY));
        a.mo67760b((Object) kpb.PAYMENT_CARD_CVN, (Iterable) bnic.m109494a(kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY));
        a.mo67760b((Object) kpb.PAYMENT_CARD_EXPIRATION_MONTH, (Iterable) bnic.m109494a(kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, new kpb[0]));
        a.mo67760b((Object) kpb.PAYMENT_CARD_EXPIRATION_YEAR, (Iterable) bnic.m109494a(kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_NUMBER, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, new kpb[0]));
        a.mo67760b((Object) kpb.PAYMENT_CARD_EXPIRATION_DATE, (Iterable) bnic.m109493a(kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_NUMBER, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY));
        f24516b = a.mo67757a();
        bnid a2 = bnig.m109513a();
        a2.mo67760b((Object) kpb.USERNAME, (Iterable) bnic.m109494a(kpb.NEW_PASSWORD, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.PAYMENT_CARD_HOLDER_NAME));
        a2.mo67760b((Object) kpb.PASSWORD, (Iterable) bnic.m109494a(kpb.NEW_USERNAME, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.PAYMENT_CARD_HOLDER_NAME));
        a2.mo67760b((Object) kpb.PHONE_NUMBER, (Iterable) bnic.m109490a(kpb.PHONE_NATIONAL, kpb.PHONE_COUNTRY_CODE));
        a2.mo67760b((Object) kpb.PHONE_COUNTRY_CODE, (Iterable) bnic.m109489a(kpb.PHONE_NUMBER));
        a2.mo67760b((Object) kpb.PHONE_NATIONAL, (Iterable) bnic.m109489a(kpb.PHONE_NUMBER));
        a2.mo67760b((Object) kpb.NEW_USERNAME, (Iterable) bnic.m109494a(kpb.PASSWORD, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.PAYMENT_CARD_HOLDER_NAME));
        a2.mo67760b((Object) kpb.NEW_PASSWORD, (Iterable) bnic.m109494a(kpb.USERNAME, kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.PAYMENT_CARD_HOLDER_NAME));
        a2.mo67760b((Object) kpb.PERSON_NAME, (Iterable) bnic.m109492a(kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PERSON_NAME_FAMILY));
        a2.mo67760b((Object) kpb.PERSON_NAME_GIVEN, (Iterable) bnic.m109489a(kpb.PERSON_NAME));
        a2.mo67760b((Object) kpb.PERSON_NAME_MIDDLE, (Iterable) bnic.m109489a(kpb.PERSON_NAME));
        a2.mo67760b((Object) kpb.PERSON_NAME_FAMILY, (Iterable) bnic.m109489a(kpb.PERSON_NAME));
        a2.mo67760b((Object) kpb.PERSON_NAME_MIDDLE_INITAL, (Iterable) bnic.m109489a(kpb.PERSON_NAME));
        a2.mo67760b((Object) kpb.POSTAL_ADDRESS, (Iterable) bnic.m109492a(kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS));
        a2.mo67760b((Object) kpb.POSTAL_ADDRESS_REGION, (Iterable) bnic.m109489a(kpb.POSTAL_ADDRESS));
        a2.mo67760b((Object) kpb.POSTAL_ADDRESS_LOCALITY, (Iterable) bnic.m109489a(kpb.POSTAL_ADDRESS));
        a2.mo67760b((Object) kpb.POSTAL_ADDRESS_STREET_ADDRESS, (Iterable) bnic.m109489a(kpb.POSTAL_ADDRESS));
        a2.mo67760b((Object) kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, (Iterable) bnic.m109489a(kpb.POSTAL_ADDRESS));
        a2.mo67760b((Object) kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, (Iterable) bnic.m109489a(kpb.POSTAL_ADDRESS));
        a2.mo67760b((Object) kpb.PAYMENT_CARD_NUMBER, (Iterable) bnic.m109492a(kpb.NEW_USERNAME, kpb.NEW_PASSWORD, kpb.USERNAME, kpb.PASSWORD));
        a2.mo67760b((Object) kpb.PAYMENT_CARD_HOLDER_NAME, (Iterable) bnic.m109492a(kpb.NEW_USERNAME, kpb.NEW_PASSWORD, kpb.USERNAME, kpb.PASSWORD));
        a2.mo67760b((Object) kpb.PAYMENT_CARD_CVN, (Iterable) bnic.m109492a(kpb.NEW_USERNAME, kpb.NEW_PASSWORD, kpb.USERNAME, kpb.PASSWORD));
        a2.mo67760b((Object) kpb.PAYMENT_CARD_EXPIRATION_MONTH, (Iterable) bnic.m109492a(kpb.NEW_USERNAME, kpb.NEW_PASSWORD, kpb.USERNAME, kpb.PASSWORD));
        a2.mo67760b((Object) kpb.PAYMENT_CARD_EXPIRATION_YEAR, (Iterable) bnic.m109492a(kpb.NEW_USERNAME, kpb.NEW_PASSWORD, kpb.USERNAME, kpb.PASSWORD));
        a2.mo67760b((Object) kpb.PAYMENT_CARD_EXPIRATION_DATE, (Iterable) bnic.m109492a(kpb.NEW_USERNAME, kpb.NEW_PASSWORD, kpb.USERNAME, kpb.PASSWORD));
        f24517c = a2.mo67757a();
        bnid a3 = bnig.m109513a();
        a3.mo67760b((Object) kpb.USERNAME, (Iterable) bnic.m109491a(kpb.EMAIL_ADDRESS, kpb.PHONE_NATIONAL, kpb.PHONE_NUMBER));
        a3.mo67760b((Object) kpb.NEW_USERNAME, (Iterable) bnic.m109492a(kpb.EMAIL_ADDRESS, kpb.PHONE_NATIONAL, kpb.PHONE_NUMBER, kpb.USERNAME));
        a3.mo67759a((Object) kpb.NEW_PASSWORD, (Object[]) new kpb[]{kpb.PASSWORD});
        a3.mo67760b((Object) kpb.EMAIL_ADDRESS, (Iterable) bnic.m109492a(kpb.USERNAME, kpb.NEW_USERNAME, kpb.PHONE_NATIONAL, kpb.PHONE_NUMBER));
        a3.mo67760b((Object) kpb.PHONE_NATIONAL, (Iterable) bnic.m109491a(kpb.USERNAME, kpb.NEW_USERNAME, kpb.EMAIL_ADDRESS));
        a3.mo67760b((Object) kpb.PHONE_NUMBER, (Iterable) bnic.m109491a(kpb.USERNAME, kpb.NEW_USERNAME, kpb.EMAIL_ADDRESS));
        a3.mo67760b((Object) kpb.POSTAL_ADDRESS_POSTAL_CODE, (Iterable) bnic.m109490a(kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_REGION));
        a3.mo67760b((Object) kpb.POSTAL_ADDRESS_LOCALITY, (Iterable) bnic.m109490a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_REGION));
        a3.mo67760b((Object) kpb.POSTAL_ADDRESS_REGION, (Iterable) bnic.m109490a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_LOCALITY));
        f24519e = a3.mo67757a();
    }

    public knh(Model model, kkp kkp) {
        this.f24520a = model;
        this.f24521f = kkp.mo14600s();
        this.f24522g = kkp.mo14577E();
    }

    /* renamed from: a */
    public final bqgg mo14691a(klu klu, bqgj bqgj) {
        HashMap hashMap = new HashMap();
        bnre i = klu.f24439a.listIterator();
        while (i.hasNext()) {
            kom kom = (kom) i.next();
            hashMap.put(kom, bqgj.mo25819b(new kmy(this, kom)));
        }
        return bqga.m112782b(hashMap.values()).mo69216a(new kmz(this, hashMap, klu), bqgj);
    }

    /* renamed from: a */
    public final void mo14693a(kjx kjx) {
    }

    /* renamed from: b */
    public final void mo14694b(kjx kjx) {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final klw mo14692a(klu klu) {
        Stream stream;
        Map map;
        try {
            bngx bngx = klu.f24439a;
            int size = bngx.size();
            if (size < 10) {
                stream = bngx.stream();
            } else {
                stream = bngx.parallelStream();
            }
            Stream map2 = stream.map(new knb(this));
            if (size < 10) {
                map = (Map) map2.collect(Collectors.toMap(kne.f24512a, knf.f24513a));
            } else {
                map = (Map) map2.collect(Collectors.toConcurrentMap(knc.f24510a, knd.f24511a));
            }
            this.f24520a.reset();
            return mo14722a(klu, map);
        } catch (Throwable th) {
            this.f24520a.reset();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
     arg types: [java.util.Collection, java.util.Comparator]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, java.lang.Object, java.lang.Object):void
     arg types: [int, java.lang.String, java.lang.Float, java.lang.Float]
     candidates:
      bmxy.a(boolean, java.lang.String, int, int):void
      bmxy.a(boolean, java.lang.String, long, long):void
      bmxy.a(boolean, java.lang.String, long, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    public final klw mo14722a(klu klu, Map map) {
        bnge bnge;
        float f;
        klu klu2 = klu;
        bnge s = bnge.m109299s();
        for (Map.Entry entry : map.entrySet()) {
            bnre i = ((bngx) entry.getValue()).listIterator();
            while (i.hasNext()) {
                s.mo67268a((Model.Result.FieldPrediction) i.next(), (kom) entry.getKey());
            }
        }
        bnge bnge2 = new bnge(klu2.f24439a.size(), 1);
        HashSet hashSet = new HashSet();
        Iterable<Model.Result.FieldPrediction> a = bnjd.m109576a((Iterable) map.values(), Comparator.comparingDouble(kna.f24508a).reversed());
        bngs j = bngx.m109377j();
        for (Model.Result.FieldPrediction fieldPrediction : a) {
            float f2 = 0.2f;
            if (fieldPrediction.getConfidence() <= 0.2f) {
                break;
            }
            kpb type = fieldPrediction.getType();
            Iterator it = bnge.mo67361a(fieldPrediction).iterator();
            while (true) {
                if (!it.hasNext()) {
                    s = bnge;
                    break;
                }
                kom kom = (kom) it.next();
                float confidence = fieldPrediction.getConfidence();
                if (this.f24522g) {
                    f = type != kpb.NEW_USERNAME ? type == kpb.NEW_PASSWORD ? 0.75f : 0.5f : 0.75f;
                    if (f24516b.mo67271d(type)) {
                        f -= ((float) bnpf.m110055b(f24516b.mo67692g(type), hashSet).size()) * 0.1f;
                    }
                    if (f24517c.mo67271d(type)) {
                        f = (((float) bnpf.m110055b(f24517c.mo67692g(type), hashSet).size()) * 0.1f) + f;
                    }
                } else {
                    f = 0.5f;
                }
                bnge bnge3 = bnge;
                bmxy.m108597a(true, "min (%s) must be less than or equal to max (%s)", (Object) Float.valueOf(f2), (Object) Float.valueOf(0.75f));
                if (confidence <= Math.min(Math.max(f, 0.2f), 0.75f)) {
                    s = bnge3;
                    break;
                }
                if (this.f24522g) {
                    if (hashSet.contains(type) && f24518d.contains(type)) {
                        s = bnge3;
                        break;
                    }
                    if (!f24519e.mo67692g(type).containsAll(bnge2.mo67361a(kom))) {
                        bnge = bnge3;
                        f2 = 0.2f;
                    }
                }
                if (type == kpb.NEW_USERNAME) {
                    bnge2.mo67310c(kom, kpb.USERNAME);
                } else if (type == kpb.NEW_PASSWORD) {
                    bnge2.mo67310c(kom, kpb.PASSWORD);
                }
                bnge2.mo67268a(kom, type);
                if (this.f24521f) {
                    j.mo67668c(klv.m18138a(!this.f24520a.isLiteModel() ? lbc.CLIENT_ML : lbc.ML_LITE, kom, bnic.m109489a(type)));
                }
                hashSet.add(type);
                bnge = bnge3;
                f2 = 0.2f;
            }
        }
        bngs j2 = bngx.m109377j();
        bngs j3 = bngx.m109377j();
        bnre i2 = klu2.f24439a.listIterator();
        while (i2.hasNext()) {
            kom kom2 = (kom) i2.next();
            Set a2 = bnge2.mo67361a(kom2);
            if (a2.isEmpty()) {
                j3.mo67668c(kom2);
            } else {
                kjk a3 = kjl.m17933a(kom2);
                a3.mo14525a(a2);
                a3.mo14526a(!this.f24520a.isLiteModel() ? lbc.CLIENT_ML : lbc.ML_LITE);
                j2.mo67668c(a3.mo14524a());
            }
        }
        return new klw(j2.mo67664a(), j3.mo67664a(), bmvz.f131120a, j.mo67664a());
    }
}
