package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* renamed from: kmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmd implements klo {

    /* renamed from: a */
    private static final bnig f24455a;

    /* renamed from: b */
    private final kkp f24456b;

    /* renamed from: c */
    private final kli f24457c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnid.b(java.lang.Object, java.lang.Iterable):void
     arg types: [kpb, bnic]
     candidates:
      bnhp.b(java.lang.Object, java.lang.Object):void
      bnid.b(java.lang.Object, java.lang.Iterable):void */
    static {
        bnid a = bnig.m109513a();
        a.mo67760b((Object) kpb.USERNAME, (Iterable) bnic.m109491a(kpb.EMAIL_ADDRESS, kpb.PHONE_NATIONAL, kpb.PHONE_NUMBER));
        a.mo67760b((Object) kpb.NEW_USERNAME, (Iterable) bnic.m109491a(kpb.EMAIL_ADDRESS, kpb.PHONE_NATIONAL, kpb.PHONE_NUMBER));
        a.mo67760b((Object) kpb.EMAIL_ADDRESS, (Iterable) bnic.m109492a(kpb.USERNAME, kpb.NEW_USERNAME, kpb.PHONE_NATIONAL, kpb.PHONE_NUMBER));
        a.mo67760b((Object) kpb.PHONE_NATIONAL, (Iterable) bnic.m109491a(kpb.USERNAME, kpb.NEW_USERNAME, kpb.EMAIL_ADDRESS));
        a.mo67760b((Object) kpb.PHONE_NUMBER, (Iterable) bnic.m109491a(kpb.USERNAME, kpb.NEW_USERNAME, kpb.EMAIL_ADDRESS));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_POSTAL_CODE, (Iterable) bnic.m109490a(kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_REGION));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_LOCALITY, (Iterable) bnic.m109490a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_REGION));
        a.mo67760b((Object) kpb.POSTAL_ADDRESS_REGION, (Iterable) bnic.m109490a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_LOCALITY));
        f24455a = a.mo67757a();
    }

    public kmd(kkp kkp) {
        bmxy.m108581a(kkp);
        this.f24456b = kkp;
        this.f24457c = kkp.mo14608z().mo14627a(getClass());
    }

    /* renamed from: a */
    private static String m18158a(Collection collection) {
        String str = (String) collection.stream().map(kmc.f24454a).collect(Collectors.joining(", "));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        kjl kjl;
        Set set;
        klm a = kln.m18126a();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            kjl kjl2 = (kjl) i.next();
            if (kjl2.mo14517b().size() <= 1) {
                a.mo14678a(kjl2);
            } else {
                HashSet hashSet = new HashSet();
                bnrd a2 = kjl2.mo14517b().iterator();
                boolean z = false;
                while (a2.hasNext()) {
                    kpb kpb = (kpb) a2.next();
                    if (f24455a.mo67271d(kpb)) {
                        set = f24455a.mo67692g(kpb);
                    } else {
                        set = bnon.f131923a;
                    }
                    if (set.containsAll(hashSet)) {
                        hashSet.add(kpb);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    bnic b = kjl2.mo14517b();
                    this.f24457c.mo14630b("Unsupported multi-labeled field processed from %s to %s", m18158a(b), m18158a(hashSet));
                }
                if (hashSet.size() != kjl2.mo14517b().size()) {
                    kjl = kjl2.mo14528a(hashSet);
                } else {
                    kjl = kjl2;
                }
                a.mo14678a(kjl);
                if (this.f24456b.mo14601t() && !kjl.mo14517b().equals(kjl2.mo14517b())) {
                    a.mo14679a(kll.m18116a(kmd.class.getSimpleName(), kjl2.mo14516a(), kjl2.mo14517b(), kjl.mo14517b()));
                }
            }
        }
        return a.mo14676a();
    }
}
