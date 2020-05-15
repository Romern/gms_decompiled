package p000;

/* renamed from: bcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcx {

    /* renamed from: a */
    private static final bed f3020a = bed.m2754a("nm", "p", "s", "hd", "d");

    /* renamed from: a */
    static bbn m2716a(bef bef, axw axw, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = null;
        bbl bbl = null;
        bbe bbe = null;
        boolean z3 = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3020a);
            if (a == 0) {
                str = bef.mo3029h();
            } else if (a == 1) {
                bbl = bct.m2705b(bef, axw);
            } else if (a == 2) {
                bbe = bcw.m2713c(bef, axw);
            } else if (a == 3) {
                z3 = bef.mo3030i();
            } else if (a != 4) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                z2 = bef.mo3032k() == 3;
            }
        }
        return new bbn(str, bbl, bbe, z2, z3);
    }
}
