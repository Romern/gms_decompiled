package p000;

import android.graphics.Path;

/* renamed from: bdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdf {

    /* renamed from: a */
    private static final bed f3030a = bed.m2754a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final bed f3031b = bed.m2754a("p", "k");

    /* renamed from: a */
    static bbq m2724a(bef bef, axw axw) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        bbb bbb = null;
        bbc bbc = null;
        bbe bbe = null;
        bbe bbe2 = null;
        int i = 0;
        boolean z = false;
        while (bef.mo3026e()) {
            switch (bef.mo3019a(f3030a)) {
                case 0:
                    str = bef.mo3029h();
                    break;
                case 1:
                    bef.mo3024c();
                    int i2 = -1;
                    while (bef.mo3026e()) {
                        int a = bef.mo3019a(f3031b);
                        if (a == 0) {
                            i2 = bef.mo3032k();
                        } else if (a != 1) {
                            bef.mo3028g();
                            bef.mo3033l();
                        } else {
                            bbb = bcw.m2710a(bef, axw, i2);
                        }
                    }
                    bef.mo3025d();
                    break;
                case 2:
                    bbc = bcw.m2712b(bef, axw);
                    break;
                case 3:
                    if (bef.mo3032k() == 1) {
                        i = 1;
                        break;
                    } else {
                        i = 2;
                        break;
                    }
                case 4:
                    bbe = bcw.m2713c(bef, axw);
                    break;
                case 5:
                    bbe2 = bcw.m2713c(bef, axw);
                    break;
                case 6:
                    if (bef.mo3032k() == 1) {
                        fillType = Path.FillType.WINDING;
                        break;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    }
                case 7:
                    z = bef.mo3030i();
                    break;
                default:
                    bef.mo3028g();
                    bef.mo3033l();
                    break;
            }
        }
        return new bbq(str, i, fillType, bbb, bbc, bbe, bbe2, z);
    }
}
