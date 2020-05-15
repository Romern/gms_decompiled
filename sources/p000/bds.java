package p000;

/* renamed from: bds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bds {

    /* renamed from: a */
    private static final bed f3053a = bed.m2754a("nm", "c", "o", "tr", "hd");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcw.a(bef, axw, boolean):bba
     arg types: [bef, axw, int]
     candidates:
      bcw.a(bef, axw, int):bbb
      bcw.a(bef, axw, bea):java.util.List
      bcw.a(bef, axw, boolean):bba */
    /* renamed from: a */
    static bbw m2743a(bef bef, axw axw) {
        String str = null;
        bba bba = null;
        bba bba2 = null;
        bbk bbk = null;
        boolean z = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3053a);
            if (a == 0) {
                str = bef.mo3029h();
            } else if (a == 1) {
                bba = bcw.m2709a(bef, axw, false);
            } else if (a == 2) {
                bba2 = bcw.m2709a(bef, axw, false);
            } else if (a == 3) {
                bbk = bcv.m2707a(bef, axw);
            } else if (a != 4) {
                bef.mo3033l();
            } else {
                z = bef.mo3030i();
            }
        }
        return new bbw(str, bba, bba2, bbk, z);
    }
}
