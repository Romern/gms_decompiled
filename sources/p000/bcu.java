package p000;

/* renamed from: bcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcu {

    /* renamed from: a */
    private static final bed f3016a = bed.m2754a("a");

    /* renamed from: b */
    private static final bed f3017b = bed.m2754a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static bbj m2706a(bef bef, axw axw) {
        bef.mo3024c();
        bbj bbj = null;
        while (bef.mo3026e()) {
            if (bef.mo3019a(f3016a) != 0) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                bef.mo3024c();
                baz baz = null;
                baz baz2 = null;
                bba bba = null;
                bba bba2 = null;
                while (bef.mo3026e()) {
                    int a = bef.mo3019a(f3017b);
                    if (a == 0) {
                        baz = bcw.m2715e(bef, axw);
                    } else if (a == 1) {
                        baz2 = bcw.m2715e(bef, axw);
                    } else if (a == 2) {
                        bba = bcw.m2708a(bef, axw);
                    } else if (a != 3) {
                        bef.mo3028g();
                        bef.mo3033l();
                    } else {
                        bba2 = bcw.m2708a(bef, axw);
                    }
                }
                bef.mo3025d();
                bbj = new bbj(baz, baz2, bba, bba2);
            }
        }
        bef.mo3025d();
        return bbj == null ? new bbj(null, null, null, null) : bbj;
    }
}
