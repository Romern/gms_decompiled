package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdk {

    /* renamed from: a */
    static final bed f3040a = bed.m2754a("k");

    /* renamed from: a */
    static List m2733a(bef bef, axw axw, float f, bea bea) {
        ArrayList arrayList = new ArrayList();
        if (bef.mo3035n() == 6) {
            axw.mo2859a("Lottie doesn't support expressions.");
            return arrayList;
        }
        bef.mo3024c();
        while (bef.mo3026e()) {
            if (bef.mo3019a(f3040a) != 0) {
                bef.mo3033l();
            } else if (bef.mo3035n() == 1) {
                bef.mo3021a();
                if (bef.mo3035n() != 7) {
                    while (bef.mo3026e()) {
                        arrayList.add(bdj.m2732a(bef, axw, f, bea, true));
                    }
                } else {
                    arrayList.add(bdj.m2732a(bef, axw, f, bea, false));
                }
                bef.mo3023b();
            } else {
                arrayList.add(bdj.m2732a(bef, axw, f, bea, false));
            }
        }
        bef.mo3025d();
        m2734a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static void m2734a(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            beo beo = (beo) list.get(i2);
            i2++;
            beo beo2 = (beo) list.get(i2);
            beo.f3107f = Float.valueOf(beo2.f3106e);
            if (beo.f3104c == null && (obj = beo2.f3103b) != null) {
                beo.f3104c = obj;
                if (beo instanceof baf) {
                    ((baf) beo).mo2952a();
                }
            }
        }
        beo beo3 = (beo) list.get(i);
        if ((beo3.f3103b == null || beo3.f3104c == null) && list.size() > 1) {
            list.remove(beo3);
        }
    }
}
