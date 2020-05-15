package p000;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdl {

    /* renamed from: a */
    private static final bed f3041a = bed.m2754a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final bed f3042b = bed.m2754a("d", "a");

    /* renamed from: c */
    private static final bed f3043c = bed.m2754a("nm");

    /* renamed from: a */
    public static bcj m2735a(axw axw) {
        Rect rect = axw.f2513g;
        return new bcj(Collections.emptyList(), axw, "__container", -1, 1, -1, null, Collections.emptyList(), new bbk(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fb  */
    /* renamed from: a */
    public static bcj m2736a(bef bef, axw axw) {
        ArrayList arrayList;
        Float f;
        char c;
        char c2;
        bef bef2 = bef;
        axw axw2 = axw;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        bef.mo3024c();
        Float valueOf = Float.valueOf(0.0f);
        int i = 1;
        boolean z = false;
        long j = -1;
        float f2 = 0.0f;
        int i2 = 0;
        String str = null;
        bbk bbk = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f3 = 1.0f;
        float f4 = 0.0f;
        int i6 = 0;
        int i7 = 0;
        bbi bbi = null;
        bbj bbj = null;
        int i8 = 1;
        bba bba = null;
        boolean z2 = false;
        String str2 = null;
        long j2 = 0;
        String str3 = "UNSET";
        float f5 = 0.0f;
        while (bef.mo3026e()) {
            switch (bef2.mo3019a(f3041a)) {
                case 0:
                    str3 = bef.mo3029h();
                    bef2 = bef;
                    i = 1;
                    z = false;
                    continue;
                case 1:
                    j2 = (long) bef.mo3032k();
                    bef2 = bef;
                    i = 1;
                    z = false;
                    continue;
                case 2:
                    str = bef.mo3029h();
                    bef2 = bef;
                    i = 1;
                    z = false;
                    continue;
                case 3:
                    Float f6 = valueOf;
                    int k = bef.mo3032k();
                    if (k < 6) {
                        i2 = new int[]{1, 2, 3, 4, 5, 6, 7}[k];
                        bef2 = bef;
                        valueOf = f6;
                        i = 1;
                        z = false;
                        continue;
                    } else {
                        bef2 = bef;
                        valueOf = f6;
                        i = 1;
                        z = false;
                        i2 = 7;
                    }
                case 4:
                    bef2 = bef;
                    j = (long) bef.mo3032k();
                    i = 1;
                    z = false;
                    continue;
                case 5:
                    bef2 = bef;
                    i3 = (int) (((float) bef.mo3032k()) * ben.m2828a());
                    i = 1;
                    z = false;
                    continue;
                case 6:
                    bef2 = bef;
                    i4 = (int) (((float) bef.mo3032k()) * ben.m2828a());
                    i = 1;
                    z = false;
                    continue;
                case 7:
                    i5 = Color.parseColor(bef.mo3029h());
                    bef2 = bef;
                    i = 1;
                    z = false;
                    continue;
                case 8:
                    bbk = bcv.m2707a(bef, axw);
                    bef2 = bef;
                    i = 1;
                    z = false;
                    continue;
                case 9:
                    i8 = new int[]{1, 2, 3, 4}[bef.mo3032k()];
                    axw2.mo2858a(1);
                    bef2 = bef;
                    i = 1;
                    z = false;
                    continue;
                case 10:
                    f = valueOf;
                    bef.mo3021a();
                    while (bef.mo3026e()) {
                        bef.mo3024c();
                        int i9 = 0;
                        bbg bbg = null;
                        bbc bbc = null;
                        while (bef.mo3026e()) {
                            String f7 = bef.mo3027f();
                            int hashCode = f7.hashCode();
                            if (hashCode != 111) {
                                if (hashCode != 3588) {
                                    if (hashCode != 104433) {
                                        if (hashCode == 3357091 && f7.equals("mode")) {
                                            c = 0;
                                            if (c == 0) {
                                                String h = bef.mo3029h();
                                                int hashCode2 = h.hashCode();
                                                if (hashCode2 != 97) {
                                                    if (hashCode2 != 105) {
                                                        if (hashCode2 == 115 && h.equals("s")) {
                                                            c2 = 1;
                                                            if (c2 != 0) {
                                                                if (c2 == 1) {
                                                                    i9 = 2;
                                                                } else if (c2 != 2) {
                                                                    bek.m2805a("Unknown mask mode " + f7 + ". Defaulting to Add.");
                                                                } else {
                                                                    axw2.mo2859a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                                    i9 = 3;
                                                                }
                                                            }
                                                            i9 = 1;
                                                        }
                                                    } else if (h.equals("i")) {
                                                        c2 = 2;
                                                        if (c2 != 0) {
                                                        }
                                                        i9 = 1;
                                                    }
                                                } else if (h.equals("a")) {
                                                    c2 = 0;
                                                    if (c2 != 0) {
                                                    }
                                                    i9 = 1;
                                                }
                                                c2 = 65535;
                                                if (c2 != 0) {
                                                }
                                                i9 = 1;
                                            } else if (c == 1) {
                                                bbg = bcw.m2714d(bef, axw);
                                            } else if (c == 2) {
                                                bbc = bcw.m2712b(bef, axw);
                                            } else if (c != 3) {
                                                bef.mo3033l();
                                            } else {
                                                z = bef.mo3030i();
                                            }
                                        }
                                    } else if (f7.equals("inv")) {
                                        c = 3;
                                        if (c == 0) {
                                        }
                                    }
                                } else if (f7.equals("pt")) {
                                    c = 1;
                                    if (c == 0) {
                                    }
                                }
                            } else if (f7.equals("o")) {
                                c = 2;
                                if (c == 0) {
                                }
                            }
                            c = 65535;
                            if (c == 0) {
                            }
                        }
                        bef.mo3025d();
                        arrayList2.add(new bbs(i9, bbg, bbc, z));
                        z = false;
                    }
                    axw2.mo2858a(arrayList2.size());
                    bef.mo3023b();
                    break;
                case 11:
                    f = valueOf;
                    bef.mo3021a();
                    while (bef.mo3026e()) {
                        bbo a = bcz.m2718a(bef, axw);
                        if (a != null) {
                            arrayList3.add(a);
                        }
                    }
                    bef.mo3023b();
                    break;
                case 12:
                    Float f8 = valueOf;
                    bef.mo3024c();
                    while (bef.mo3026e()) {
                        int a2 = bef2.mo3019a(f3042b);
                        if (a2 == 0) {
                            bbi = new bbi(bcw.m2711a(bef2, axw2, bda.f3023a));
                        } else if (a2 != i) {
                            bef.mo3028g();
                            bef.mo3033l();
                        } else {
                            bef.mo3021a();
                            if (bef.mo3026e()) {
                                bbj = bcu.m2706a(bef, axw);
                            }
                            while (bef.mo3026e()) {
                                bef.mo3033l();
                            }
                            bef.mo3023b();
                        }
                    }
                    bef.mo3025d();
                    valueOf = f8;
                    continue;
                case 13:
                    f = valueOf;
                    bef.mo3021a();
                    ArrayList arrayList4 = new ArrayList();
                    while (bef.mo3026e()) {
                        bef.mo3024c();
                        while (bef.mo3026e()) {
                            if (bef2.mo3019a(f3043c) != 0) {
                                bef.mo3028g();
                                bef.mo3033l();
                            } else {
                                arrayList4.add(bef.mo3029h());
                            }
                        }
                        bef.mo3025d();
                    }
                    bef.mo3023b();
                    axw2.mo2859a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    break;
                case 14:
                    f3 = (float) bef.mo3031j();
                    valueOf = valueOf;
                    continue;
                case 15:
                    f4 = (float) bef.mo3031j();
                    valueOf = valueOf;
                    continue;
                case 16:
                    i6 = (int) (((float) bef.mo3032k()) * ben.m2828a());
                    continue;
                case 17:
                    i7 = (int) (((float) bef.mo3032k()) * ben.m2828a());
                    continue;
                case 18:
                    f5 = (float) bef.mo3031j();
                    valueOf = valueOf;
                    continue;
                case 19:
                    f2 = (float) bef.mo3031j();
                    valueOf = valueOf;
                    continue;
                case 20:
                    bba = bcw.m2709a(bef2, axw2, z);
                    continue;
                case 21:
                    str2 = bef.mo3029h();
                    continue;
                case 22:
                    z2 = bef.mo3030i();
                    continue;
                default:
                    f = valueOf;
                    bef.mo3028g();
                    bef.mo3033l();
                    break;
            }
            bef2 = bef;
            valueOf = f;
            i = 1;
            z = false;
        }
        Float f9 = valueOf;
        bef.mo3025d();
        float f10 = f5 / f3;
        float f11 = f2 / f3;
        ArrayList arrayList5 = new ArrayList();
        if (f10 > 0.0f) {
            arrayList = arrayList2;
            arrayList5.add(new beo(axw, f9, f9, null, 0.0f, Float.valueOf(f10)));
        } else {
            arrayList = arrayList2;
        }
        if (f11 <= 0.0f) {
            f11 = axw2.f2515i;
        }
        Float valueOf2 = Float.valueOf(1.0f);
        arrayList5.add(new beo(axw, valueOf2, valueOf2, null, f10, Float.valueOf(f11)));
        arrayList5.add(new beo(axw, f9, f9, null, f11, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            axw2.mo2859a("Convert your Illustrator layers to shape layers.");
        }
        return new bcj(arrayList3, axw, str3, j2, i2, j, str, arrayList, bbk, i3, i4, i5, f3, f4, i6, i7, bbi, bbj, arrayList5, i8, bba, z2);
    }
}
