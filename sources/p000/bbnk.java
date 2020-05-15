package p000;

import java.util.Collections;
import java.util.Map;

/* renamed from: bbnk */
final /* synthetic */ class bbnk implements bmxj {

    /* renamed from: a */
    private final bbnm f102951a;

    public bbnk(bbnm bbnm) {
        this.f102951a = bbnm;
    }

    public final Object apply(Object obj) {
        bbnu bbnu = (bbnu) obj;
        bbnu bbnu2 = this.f102951a.f102954b;
        bxvd bxvd = (bxvd) bbnu.mo74142c(5);
        bxvd.mo73625a((bxvk) bbnu);
        bbnr bbnr = (bbnr) bxvd;
        Map b = bbnv.m88252b(bbnu2);
        for (Integer num : b.keySet()) {
            int intValue = num.intValue();
            int a = bbnv.m88245a(Collections.unmodifiableList(((bbnu) bbnr.f164949b).f102984b), intValue);
            if (a == -1) {
                bbnr.mo56246a(bbnv.m88246a(intValue));
            } else {
                bbnr.mo56244a(a, bbnv.m88247a(bbnr.mo56243a(a)));
            }
        }
        for (Map.Entry entry : b.entrySet()) {
            int intValue2 = ((Integer) entry.getKey()).intValue();
            Long l = (Long) entry.getValue();
            if (l != null) {
                int b2 = bbnv.m88251b(Collections.unmodifiableList(((bbnu) bbnr.f164949b).f102987e), intValue2);
                if (b2 == -1) {
                    long longValue = l.longValue();
                    bbnr.mo56247a(bbnv.m88248a(intValue2, longValue, longValue));
                } else {
                    bbnr.mo56245a(b2, bbnv.m88249a(bbnr.mo56248b(b2), l.longValue()));
                }
            }
        }
        return (bbnu) bbnr.mo74062i();
    }
}
