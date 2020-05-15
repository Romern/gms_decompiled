package p000;

import java.util.ArrayList;

/* renamed from: buld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buld implements buko {

    /* renamed from: a */
    private final Iterable f154132a;

    public buld(buko buko, buko buko2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(buko);
        arrayList.add(buko2);
        this.f154132a = arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Iterable], assign insn: 0x0001: IGET  (r1v0 ? I:java.lang.Iterable) = (r13v0 'this' buld A[THIS]) buld.a java.lang.Iterable */
    /* renamed from: a */
    public final double mo72791a(double d, double d2, buje buje) {
        ? r1 = this.f154132a;
        int size = r1.size();
        double d3 = 0.0d;
        for (int i = 0; i < size; i++) {
            d3 += ((buko) r1.get(i)).mo72791a(d, d2, buje);
        }
        return d3;
    }
}
