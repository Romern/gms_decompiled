package p000;

import java.util.ArrayList;

/* renamed from: bdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdg {

    /* renamed from: a */
    private static final bed f3032a = bed.m2754a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final bed f3033b = bed.m2754a("p", "k");

    /* renamed from: c */
    private static final bed f3034c = bed.m2754a("n", "v");

    /* renamed from: a */
    static bbr m2725a(bef bef, axw axw) {
        bef bef2 = bef;
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        bbb bbb = null;
        bbc bbc = null;
        bbe bbe = null;
        bbe bbe2 = null;
        bba bba = null;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        bba bba2 = null;
        boolean z = false;
        while (bef.mo3026e()) {
            switch (bef2.mo3019a(f3032a)) {
                case 0:
                    str = bef.mo3029h();
                    break;
                case 1:
                    bef.mo3024c();
                    int i4 = -1;
                    while (bef.mo3026e()) {
                        int a = bef2.mo3019a(f3033b);
                        if (a == 0) {
                            i4 = bef.mo3032k();
                        } else if (a != 1) {
                            bef.mo3028g();
                            bef.mo3033l();
                        } else {
                            bbb = bcw.m2710a(bef2, axw, i4);
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
                    bba = bcw.m2708a(bef, axw);
                    break;
                case 7:
                    i2 = bcb.m2654a()[bef.mo3032k() - 1];
                    break;
                case 8:
                    i3 = bcc.m2656a()[bef.mo3032k() - 1];
                    break;
                case 9:
                    f = (float) bef.mo3031j();
                    break;
                case 10:
                    z = bef.mo3030i();
                    break;
                case 11:
                    bef.mo3021a();
                    while (bef.mo3026e()) {
                        bef.mo3024c();
                        String str2 = null;
                        bba bba3 = null;
                        while (bef.mo3026e()) {
                            int a2 = bef2.mo3019a(f3034c);
                            if (a2 != 0) {
                                bba bba4 = bba2;
                                if (a2 != 1) {
                                    bef.mo3028g();
                                    bef.mo3033l();
                                    bba2 = bba4;
                                } else {
                                    bba3 = bcw.m2708a(bef, axw);
                                    bba2 = bba4;
                                }
                            } else {
                                str2 = bef.mo3029h();
                            }
                        }
                        bba bba5 = bba2;
                        bef.mo3025d();
                        if (!str2.equals("o")) {
                            if (str2.equals("d") || str2.equals("g")) {
                                axw.mo2861c();
                                arrayList.add(bba3);
                            }
                            bba2 = bba5;
                        } else {
                            bba2 = bba3;
                        }
                    }
                    bba bba6 = bba2;
                    bef.mo3023b();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bba2 = bba6;
                    break;
                default:
                    bef.mo3028g();
                    bef.mo3033l();
                    break;
            }
        }
        return new bbr(str, i, bbb, bbc, bbe, bbe2, bba, i2, i3, f, arrayList, bba2, z);
    }
}
