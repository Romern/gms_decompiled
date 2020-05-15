package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: baya */
final /* synthetic */ class baya implements bqeh {

    /* renamed from: a */
    private final bayg f102075a;

    /* renamed from: b */
    private final Set f102076b;

    public baya(bayg bayg, Set set) {
        this.f102075a = bayg;
        this.f102076b = set;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bayg bayg = this.f102075a;
        Set set = this.f102076b;
        ArrayList arrayList = new ArrayList();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList arrayList2 = new ArrayList();
        for (bavt bavt : (List) obj) {
            if (set.contains(bavt)) {
                try {
                    arrayList2.add(bqdx.m112673a(bayg.f102088c.mo56075b(bavt), new bayc(arrayList), bayg.f102094i));
                } catch (bbdb e) {
                }
            } else {
                bbda bbda = bayg.f102088c;
                arrayList2.add(bqdx.m112673a(bqdx.m112674a(bbda.f102393c.mo56079a(bavt), new bbcx(bbda, bavt), bbda.f102401k), new bayb(bayg, atomicInteger, bavt), bayg.f102094i));
            }
        }
        return bqga.m112782b(arrayList2).mo69216a(new bayd(bayg, atomicInteger, arrayList), bayg.f102094i);
    }
}
