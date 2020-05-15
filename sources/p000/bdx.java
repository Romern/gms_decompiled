package p000;

/* renamed from: bdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdx {

    /* renamed from: a */
    static final bed f3059a = bed.m2754a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static bca m2748a(bef bef, axw axw) {
        int i = 0;
        String str = null;
        bbg bbg = null;
        boolean z = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3059a);
            if (a == 0) {
                str = bef.mo3029h();
            } else if (a == 1) {
                i = bef.mo3032k();
            } else if (a == 2) {
                bbg = bcw.m2714d(bef, axw);
            } else if (a != 3) {
                bef.mo3033l();
            } else {
                z = bef.mo3030i();
            }
        }
        return new bca(str, i, bbg, z);
    }
}
