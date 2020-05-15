package p000;

import android.graphics.Path;

/* renamed from: bdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdv {

    /* renamed from: a */
    private static final bed f3057a = bed.m2754a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    static bby m2746a(bef bef, axw axw) {
        String str = null;
        baz baz = null;
        bbc bbc = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3057a);
            if (a == 0) {
                str = bef.mo3029h();
            } else if (a == 1) {
                baz = bcw.m2715e(bef, axw);
            } else if (a == 2) {
                bbc = bcw.m2712b(bef, axw);
            } else if (a == 3) {
                z = bef.mo3030i();
            } else if (a == 4) {
                i = bef.mo3032k();
            } else if (a != 5) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                z2 = bef.mo3030i();
            }
        }
        return new bby(str, z, i != 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING, baz, bbc, z2);
    }
}
