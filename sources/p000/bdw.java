package p000;

import java.util.ArrayList;

/* renamed from: bdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdw {

    /* renamed from: a */
    private static final bed f3058a = bed.m2754a("nm", "hd", "it");

    /* renamed from: a */
    static bbz m2747a(bef bef, axw axw) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3058a);
            if (a == 0) {
                str = bef.mo3029h();
            } else if (a == 1) {
                z = bef.mo3030i();
            } else if (a != 2) {
                bef.mo3033l();
            } else {
                bef.mo3021a();
                while (bef.mo3026e()) {
                    bbo a2 = bcz.m2718a(bef, axw);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                bef.mo3023b();
            }
        }
        return new bbz(str, arrayList, z);
    }
}
