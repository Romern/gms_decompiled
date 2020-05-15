package p000;

import java.util.ArrayList;

/* renamed from: bdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdc {

    /* renamed from: a */
    private static final bed f3026a = bed.m2754a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final bed f3027b = bed.m2754a("shapes");

    /* renamed from: a */
    static bat m2721a(bef bef, axw axw) {
        ArrayList arrayList = new ArrayList();
        bef.mo3024c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3026a);
            if (a == 0) {
                c = bef.mo3029h().charAt(0);
            } else if (a == 1) {
                bef.mo3031j();
            } else if (a == 2) {
                d = bef.mo3031j();
            } else if (a == 3) {
                str = bef.mo3029h();
            } else if (a == 4) {
                str2 = bef.mo3029h();
            } else if (a != 5) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                bef.mo3024c();
                while (bef.mo3026e()) {
                    if (bef.mo3019a(f3027b) != 0) {
                        bef.mo3028g();
                        bef.mo3033l();
                    } else {
                        bef.mo3021a();
                        while (bef.mo3026e()) {
                            arrayList.add((bbz) bcz.m2718a(bef, axw));
                        }
                        bef.mo3023b();
                    }
                }
                bef.mo3025d();
            }
        }
        bef.mo3025d();
        return new bat(arrayList, c, d, str, str2);
    }
}
