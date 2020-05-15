package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ayvr */
final /* synthetic */ class ayvr implements bqeg {

    /* renamed from: a */
    private final ayvu f98573a;

    /* renamed from: b */
    private final List f98574b;

    /* renamed from: c */
    private final bqgy f98575c;

    /* renamed from: d */
    private final ayvx f98576d;

    public ayvr(ayvu ayvu, List list, bqgy bqgy, ayvx ayvx) {
        this.f98573a = ayvu;
        this.f98574b = list;
        this.f98575c = bqgy;
        this.f98576d = ayvx;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        ayvu ayvu = this.f98573a;
        List<ayvw> list = this.f98574b;
        bqgy bqgy = this.f98575c;
        ayvx ayvx = this.f98576d;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        ArrayList arrayList2 = new ArrayList(size + size + 1);
        arrayList2.add(bqgy);
        for (ayvw ayvw : list) {
            try {
                bqgg a = ayvu.f98582c.mo54453a(ayvw);
                ayvy ayvy = new ayvy(ayvw, a);
                arrayList.add(ayvy);
                List<ayvv> a2 = ayvu.mo54456a(ayvy.f98587a.getClass());
                List<ayvv> a3 = ayvu.mo54456a(ayvw.class);
                ArrayList arrayList3 = new ArrayList(a2.size() + a3.size());
                for (ayvv ayvv : a2) {
                    arrayList3.add(ayvu.m84945a(ayvy, ayvv));
                }
                for (ayvv ayvv2 : a3) {
                    arrayList3.add(ayvu.m84945a(ayvy, ayvv2));
                }
                arrayList2.add(bqdx.m112673a(bqga.m112774a((Iterable) arrayList3), bmxm.m108539a(null), bqfb.INSTANCE));
                arrayList2.add(a);
            } catch (Throwable th) {
                arrayList2.add(bqga.m112777a(th));
            }
        }
        bqgg a4 = bqga.m112785c(arrayList2).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
        for (ayzy ayzy : ayvu.f98581b) {
        }
        return bqga.m112782b(arrayList2).mo69214a(new ayvs(ayvx, bqgy, a4), ayvu.f98580a);
    }
}
