package p000;

import java.util.ArrayList;

/* renamed from: bdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdy {

    /* renamed from: a */
    private static final bed f3060a = bed.m2754a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final bed f3061b = bed.m2754a("n", "v");

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
    /* renamed from: a */
    static bcd m2749a(bef bef, axw axw) {
        char c;
        bef bef2 = bef;
        ArrayList arrayList = new ArrayList();
        String str = null;
        bba bba = null;
        baz baz = null;
        bbc bbc = null;
        bba bba2 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        boolean z = false;
        while (bef.mo3026e()) {
            switch (bef2.mo3019a(f3060a)) {
                case 0:
                    str = bef.mo3029h();
                    break;
                case 1:
                    baz = bcw.m2715e(bef, axw);
                    break;
                case 2:
                    bba2 = bcw.m2708a(bef, axw);
                    break;
                case 3:
                    bbc = bcw.m2712b(bef, axw);
                    break;
                case 4:
                    i = bcb.m2654a()[bef.mo3032k() - 1];
                    break;
                case 5:
                    i2 = bcc.m2656a()[bef.mo3032k() - 1];
                    break;
                case 6:
                    f = (float) bef.mo3031j();
                    break;
                case 7:
                    z = bef.mo3030i();
                    break;
                case 8:
                    bef.mo3021a();
                    while (bef.mo3026e()) {
                        bef.mo3024c();
                        bba bba3 = null;
                        String str2 = null;
                        while (bef.mo3026e()) {
                            int a = bef2.mo3019a(f3061b);
                            if (a == 0) {
                                str2 = bef.mo3029h();
                            } else if (a != 1) {
                                bef.mo3028g();
                                bef.mo3033l();
                            } else {
                                bba3 = bcw.m2708a(bef, axw);
                            }
                        }
                        bef.mo3025d();
                        int hashCode = str2.hashCode();
                        if (hashCode != 100) {
                            if (hashCode != 103) {
                                if (hashCode == 111 && str2.equals("o")) {
                                    c = 0;
                                    if (c != 0) {
                                        bba = bba3;
                                    } else if (c == 1 || c == 2) {
                                        axw.mo2861c();
                                        arrayList.add(bba3);
                                    }
                                }
                            } else if (str2.equals("g")) {
                                c = 2;
                                if (c != 0) {
                                }
                            }
                        } else if (str2.equals("d")) {
                            c = 1;
                            if (c != 0) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    }
                    bef.mo3023b();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    bef.mo3033l();
                    break;
            }
        }
        return new bcd(str, bba, arrayList, baz, bbc, bba2, i, i2, f, z);
    }
}
