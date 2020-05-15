package p000;

/* renamed from: bdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdz {

    /* renamed from: a */
    private static final bed f3062a = bed.m2754a("s", "e", "o", "nm", "m", "hd");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcw.a(bef, axw, boolean):bba
     arg types: [bef, axw, int]
     candidates:
      bcw.a(bef, axw, int):bbb
      bcw.a(bef, axw, bea):java.util.List
      bcw.a(bef, axw, boolean):bba */
    /* renamed from: a */
    static bce m2750a(bef bef, axw axw) {
        bba bba = null;
        bba bba2 = null;
        bba bba3 = null;
        int i = 0;
        boolean z = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3062a);
            if (a == 0) {
                bba = bcw.m2709a(bef, axw, false);
            } else if (a == 1) {
                bba2 = bcw.m2709a(bef, axw, false);
            } else if (a == 2) {
                bba3 = bcw.m2709a(bef, axw, false);
            } else if (a == 3) {
                bef.mo3029h();
            } else if (a == 4) {
                int k = bef.mo3032k();
                if (k == 1) {
                    i = 1;
                } else if (k == 2) {
                    i = 2;
                } else {
                    throw new IllegalArgumentException("Unknown trim path type " + k);
                }
            } else if (a != 5) {
                bef.mo3033l();
            } else {
                z = bef.mo3030i();
            }
        }
        return new bce(i, bba, bba2, bba3, z);
    }
}
