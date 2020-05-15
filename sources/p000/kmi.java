package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: kmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kmi implements klo {

    /* renamed from: a */
    private final kkp f24465a;

    public kmi(kkp kkp) {
        this.f24465a = kkp;
    }

    /* renamed from: a */
    private static bmxv m18165a(kjl kjl, boolean z, kpb kpb, Set set) {
        bnic b = kjl.mo14517b();
        if (b.size() <= 1) {
            return bmvz.f131120a;
        }
        boolean contains = b.contains(kpb);
        boolean z2 = !Collections.disjoint(b, set);
        if (!contains || !z2) {
            return bmvz.f131120a;
        }
        if (!z) {
            return kjl.mo14532c((kpb[]) set.toArray(new kpb[0]));
        }
        return kjl.mo14532c(kpb);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static boolean m18166a(Collection r6, Collection collection) {
        HashSet hashSet = new HashSet(collection);
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            kjl kjl = (kjl) r6.get(i);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kpb kpb = (kpb) it.next();
                if (kjl.mo14530a(kpb)) {
                    hashSet.remove(kpb);
                    break;
                }
            }
        }
        return hashSet.isEmpty();
    }

    /* renamed from: a */
    public final kln mo14681a(bngx bngx) {
        boolean a = m18166a(bngx, bnic.m109490a(kpb.PERSON_NAME_FAMILY, kpb.PERSON_NAME_GIVEN));
        boolean a2 = m18166a(bngx, bnic.m109490a(kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR));
        boolean a3 = m18166a(bngx, bnic.m109490a(kpb.PHONE_COUNTRY_CODE, kpb.PHONE_NUMBER));
        bnic a4 = bnic.m109494a(kpb.PERSON_NAME_FAMILY, kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PERSON_NAME_PREFIX, kpb.PERSON_NAME_SUFFIX, new kpb[0]);
        bnic a5 = bnic.m109490a(kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR);
        klm a6 = kln.m18126a();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            kjl kjl = (kjl) i.next();
            bmxv a7 = m18165a(kjl, a, kpb.PERSON_NAME, a4);
            bmxv a8 = m18165a(a7.mo66813a() ? (kjl) a7.mo66814b() : kjl, a2, kpb.PAYMENT_CARD_EXPIRATION_DATE, a5);
            bmxv a9 = m18165a(kjl, a3, kpb.PHONE_NUMBER, bnic.m109489a(kpb.PHONE_NATIONAL));
            if (a7.mo66813a()) {
                kjl kjl2 = (kjl) a7.mo66814b();
                a6.mo14678a(kjl2);
                if (this.f24465a.mo14601t()) {
                    a6.mo14679a(kll.m18116a(kmi.class.getSimpleName(), kjl.mo14516a(), kjl.mo14517b(), kjl2.mo14517b()));
                }
            } else if (a8.mo66813a()) {
                kjl kjl3 = (kjl) a8.mo66814b();
                a6.mo14678a(kjl3);
                if (this.f24465a.mo14601t()) {
                    a6.mo14679a(kll.m18116a(kmi.class.getSimpleName(), kjl.mo14516a(), kjl.mo14517b(), kjl3.mo14517b()));
                }
            } else if (a9.mo66813a()) {
                kjl kjl4 = (kjl) a9.mo66814b();
                a6.mo14678a(kjl4);
                if (this.f24465a.mo14601t()) {
                    a6.mo14679a(kll.m18116a(kmi.class.getSimpleName(), kjl.mo14516a(), kjl.mo14517b(), kjl4.mo14517b()));
                }
            } else {
                a6.mo14678a(kjl);
            }
        }
        return a6.mo14676a();
    }
}
