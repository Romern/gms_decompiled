package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: bejm */
final /* synthetic */ class bejm implements bqeh {

    /* renamed from: a */
    private final bejp f111659a;

    /* renamed from: b */
    private final int f111660b;

    /* renamed from: c */
    private final List f111661c;

    public bejm(bejp bejp, int i, List list) {
        this.f111659a = bejp;
        this.f111660b = i;
        this.f111661c = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bejp bejp = this.f111659a;
        int i = this.f111660b;
        List list = this.f111661c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) bqga.m112780a((Future) list.get(i2))).booleanValue()) {
                belw belw = (belw) bejp.f111667a.get(i2);
                arrayList.add(bqga.m112775a((Object) null));
            }
        }
        return bqga.m112785c(arrayList).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
    }
}
