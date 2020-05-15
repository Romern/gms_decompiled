package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bffh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bffh {
    /* renamed from: a */
    private static final List m96557a(List list, int i) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        while (i < size) {
            arrayList.add((bffg) list.get(i));
            i += 2;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo61576a(List list) {
        List list2 = list;
        int size = list.size();
        int i = 0;
        if (size == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((bffg) list2.get(0));
            return arrayList;
        }
        List a = mo61576a(m96557a(list2, 0));
        List a2 = mo61576a(m96557a(list2, 1));
        int i2 = size / 2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (i < i2) {
            double d = (double) i;
            Double.isNaN(d);
            double d2 = (double) size;
            Double.isNaN(d2);
            double d3 = (d * -6.283185307179586d) / d2;
            bffg bffg = new bffg(Math.cos(d3), Math.sin(d3));
            bffg bffg2 = (bffg) a2.get(i);
            double d4 = bffg.f113635a;
            double d5 = bffg2.f113635a;
            double d6 = bffg.f113636b;
            double d7 = bffg2.f113636b;
            bffg bffg3 = new bffg((d4 * d5) - (d6 * d7), (d4 * d7) + (d6 * d5));
            bffg bffg4 = (bffg) a.get(i);
            arrayList2 = arrayList2;
            arrayList2.add(new bffg(bffg4.f113635a + bffg3.f113635a, bffg4.f113636b + bffg3.f113636b));
            arrayList3.add(new bffg(bffg4.f113635a - bffg3.f113635a, bffg4.f113636b - bffg3.f113636b));
            i++;
            a2 = a2;
            arrayList3 = arrayList3;
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }
}
