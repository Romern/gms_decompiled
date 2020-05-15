package p000;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdm {

    /* renamed from: a */
    static final bed f3044a = bed.m2754a("id", "layers", "w", "h", "p", "u");

    /* renamed from: b */
    private static final bed f3045b = bed.m2754a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: c */
    private static final bed f3046c = bed.m2754a("list");

    /* renamed from: d */
    private static final bed f3047d = bed.m2754a("cm", "tm", "dr");

    /* renamed from: a */
    public static axw m2737a(bef bef) {
        int i;
        int i2;
        float f;
        float f2;
        C1246ol olVar;
        ArrayList arrayList;
        HashMap hashMap;
        float f3;
        int i3;
        int i4;
        bef bef2 = bef;
        float a = ben.m2828a();
        C1230nw nwVar = new C1230nw();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C1246ol olVar2 = new C1246ol();
        axw axw = new axw();
        bef.mo3024c();
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (bef.mo3026e()) {
            float f7 = f6;
            int i7 = 1;
            switch (bef2.mo3019a(f3045b)) {
                case 0:
                    i5 = bef.mo3032k();
                    f6 = f7;
                    continue;
                case 1:
                    i6 = bef.mo3032k();
                    f6 = f7;
                    continue;
                case 2:
                    f4 = (float) bef.mo3031j();
                    f6 = f7;
                    hashMap4 = hashMap4;
                    arrayList3 = arrayList3;
                    continue;
                case 3:
                    f5 = ((float) bef.mo3031j()) - 440.32f;
                    f6 = f7;
                    hashMap4 = hashMap4;
                    arrayList3 = arrayList3;
                    continue;
                case 4:
                    f6 = (float) bef.mo3031j();
                    hashMap4 = hashMap4;
                    arrayList3 = arrayList3;
                    continue;
                case 5:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    olVar = olVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    String[] split = bef.mo3029h().split("\\.");
                    if (!ben.m2838a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        axw.mo2859a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    olVar = olVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    bef.mo3021a();
                    int i8 = 0;
                    while (bef.mo3026e()) {
                        bcj a2 = bdl.m2736a(bef2, axw);
                        if (a2.f2983u == 3) {
                            i8++;
                        }
                        arrayList2.add(a2);
                        nwVar.mo15540b(a2.f2966d, a2);
                        if (i8 > 4) {
                            bek.m2805a("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    bef.mo3023b();
                    break;
                case 7:
                    bef.mo3021a();
                    while (bef.mo3026e()) {
                        ArrayList arrayList4 = new ArrayList();
                        C1230nw nwVar2 = new C1230nw();
                        bef.mo3024c();
                        ArrayList arrayList5 = arrayList3;
                        C1246ol olVar3 = olVar2;
                        float f8 = f5;
                        String str = null;
                        String str2 = null;
                        int i9 = 0;
                        HashMap hashMap5 = hashMap4;
                        int i10 = 0;
                        while (bef.mo3026e()) {
                            float f9 = f3;
                            int a3 = bef2.mo3019a(f3044a);
                            if (a3 != 0) {
                                int i11 = i6;
                                if (a3 == 1) {
                                    bef.mo3021a();
                                    while (bef.mo3026e()) {
                                        bcj a4 = bdl.m2736a(bef2, axw);
                                        nwVar2.mo15540b(a4.f2966d, a4);
                                        arrayList4.add(a4);
                                        i5 = i5;
                                    }
                                    i3 = i5;
                                    bef.mo3023b();
                                } else if (a3 == 2) {
                                    i9 = bef.mo3032k();
                                    f3 = f9;
                                    i6 = i11;
                                } else if (a3 == 3) {
                                    i10 = bef.mo3032k();
                                    f3 = f9;
                                    i6 = i11;
                                } else if (a3 == 4) {
                                    str = bef.mo3029h();
                                    f3 = f9;
                                    i6 = i11;
                                } else if (a3 != 5) {
                                    bef.mo3028g();
                                    bef.mo3033l();
                                    i3 = i5;
                                } else {
                                    bef.mo3029h();
                                    i3 = i5;
                                }
                                f3 = f9;
                                i6 = i11;
                                i5 = i3;
                            } else {
                                str2 = bef.mo3029h();
                                f3 = f9;
                            }
                        }
                        float f10 = f3;
                        int i12 = i5;
                        int i13 = i6;
                        bef.mo3025d();
                        if (str != null) {
                            ayp ayp = new ayp(i9, i10, str2, str);
                            hashMap3.put(ayp.f2568c, ayp);
                            hashMap4 = hashMap5;
                            arrayList3 = arrayList5;
                            olVar2 = olVar3;
                            f5 = f8;
                            f4 = f10;
                            i6 = i13;
                            i5 = i12;
                        } else {
                            hashMap2.put(str2, arrayList4);
                            hashMap4 = hashMap5;
                            arrayList3 = arrayList5;
                            olVar2 = olVar3;
                            f5 = f8;
                            f4 = f10;
                            i6 = i13;
                            i5 = i12;
                        }
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    olVar = olVar2;
                    f = f3;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    bef.mo3023b();
                    break;
                case 8:
                    bef.mo3024c();
                    while (bef.mo3026e()) {
                        if (bef2.mo3019a(f3046c) != 0) {
                            bef.mo3028g();
                            bef.mo3033l();
                        } else {
                            bef.mo3021a();
                            while (bef.mo3026e()) {
                                bas a5 = bdd.m2722a(bef);
                                hashMap4.put(a5.f2807b, a5);
                            }
                            bef.mo3023b();
                        }
                    }
                    bef.mo3025d();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    olVar = olVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    break;
                case 9:
                    bef.mo3021a();
                    while (bef.mo3026e()) {
                        bat a6 = bdc.m2721a(bef2, axw);
                        olVar2.mo15637a(a6.hashCode(), a6);
                    }
                    bef.mo3023b();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    olVar = olVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    break;
                case 10:
                    bef.mo3021a();
                    while (bef.mo3026e()) {
                        bef.mo3024c();
                        while (bef.mo3026e()) {
                            int a7 = bef2.mo3019a(f3047d);
                            if (a7 == 0) {
                                bef.mo3029h();
                                i4 = 1;
                            } else if (a7 == i4) {
                                bef.mo3031j();
                                i4 = 1;
                            } else if (a7 != 2) {
                                bef.mo3028g();
                                bef.mo3033l();
                                i4 = 1;
                            } else {
                                bef.mo3031j();
                                i4 = 1;
                            }
                        }
                        bef.mo3025d();
                        arrayList3.add(new bax());
                        i7 = 1;
                    }
                    bef.mo3023b();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    olVar = olVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    olVar = olVar2;
                    f = f4;
                    f2 = f5;
                    i = i5;
                    i2 = i6;
                    bef.mo3028g();
                    bef.mo3033l();
                    break;
            }
            f6 = f7;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            olVar2 = olVar;
            f5 = f2;
            f4 = f;
            i6 = i2;
            i5 = i;
        }
        axw.f2513g = new Rect(0, 0, (int) (((float) i5) * a), (int) (((float) i6) * a));
        axw.f2514h = f4;
        axw.f2515i = f5;
        axw.f2516j = f6;
        axw.f2512f = arrayList2;
        axw.f2511e = nwVar;
        axw.f2507a = hashMap2;
        axw.f2508b = hashMap3;
        axw.f2510d = olVar2;
        axw.f2509c = hashMap4;
        return axw;
    }
}
