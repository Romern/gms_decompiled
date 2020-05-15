package p000;

/* renamed from: bdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdr {

    /* renamed from: a */
    private static final bed f3052a = bed.m2754a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    static bbv m2742a(bef bef, axw axw) {
        String str = null;
        bbl bbl = null;
        bbe bbe = null;
        bba bba = null;
        boolean z = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3052a);
            if (a == 0) {
                str = bef.mo3029h();
            } else if (a == 1) {
                bbl = bct.m2705b(bef, axw);
            } else if (a == 2) {
                bbe = bcw.m2713c(bef, axw);
            } else if (a == 3) {
                bba = bcw.m2708a(bef, axw);
            } else if (a != 4) {
                bef.mo3033l();
            } else {
                z = bef.mo3030i();
            }
        }
        return new bbv(str, bbl, bbe, bba, z);
    }
}
