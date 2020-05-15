package p000;

import android.graphics.PointF;
import java.util.List;

/* renamed from: bcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcv {

    /* renamed from: a */
    private static final bed f3018a = bed.m2754a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final bed f3019b = bed.m2754a("k");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcw.a(bef, axw, boolean):bba
     arg types: [bef, axw, int]
     candidates:
      bcw.a(bef, axw, int):bbb
      bcw.a(bef, axw, bea):java.util.List
      bcw.a(bef, axw, boolean):bba */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ae, code lost:
        if (r0.f3118b == 1.0f) goto L_0x01b5;
     */
    /* renamed from: a */
    public static bbk m2707a(bef bef, axw axw) {
        bba bba;
        bba bba2;
        bbc bbc;
        bba bba3;
        bbf bbf;
        bbl bbl;
        bbd bbd;
        bba bba4;
        bba bba5;
        bbd bbd2;
        bbl bbl2;
        bbf bbf2;
        bba bba6;
        bba bba7;
        bba bba8;
        bba bba9;
        bba bba10;
        bef bef2 = bef;
        axw axw2 = axw;
        int n = bef.mo3035n();
        if (n == 3) {
            bef.mo3024c();
            bba5 = null;
            bba4 = null;
            bbd = null;
            bbl = null;
            bbf = null;
            bba3 = null;
            bbc = null;
            bba2 = null;
            bba = null;
        } else {
            bba5 = null;
            bba4 = null;
            bbd = null;
            bbl = null;
            bbf = null;
            bba3 = null;
            bbc = null;
            bba2 = null;
            bba = null;
        }
        while (bef.mo3026e()) {
            switch (bef2.mo3019a(f3018a)) {
                case 0:
                    bba bba11 = bba4;
                    bef.mo3024c();
                    while (bef.mo3026e()) {
                        if (bef2.mo3019a(f3019b) != 0) {
                            bef.mo3028g();
                            bef.mo3033l();
                        } else {
                            bbd = bct.m2704a(bef, axw);
                        }
                    }
                    bef.mo3025d();
                    bba4 = bba11;
                    continue;
                case 1:
                    bbl = bct.m2705b(bef, axw);
                    continue;
                case 2:
                    bbf = new bbf(bcw.m2711a(bef2, axw2, bdt.f3054a));
                    continue;
                case 3:
                    axw2.mo2859a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    bbc = bcw.m2712b(bef, axw);
                    continue;
                case 6:
                    bba2 = bcw.m2709a(bef2, axw2, false);
                    continue;
                case 7:
                    bba = bcw.m2709a(bef2, axw2, false);
                    continue;
                case 8:
                    bba3 = bcw.m2709a(bef2, axw2, false);
                    continue;
                case 9:
                    bba4 = bcw.m2709a(bef2, axw2, false);
                    continue;
                default:
                    bef.mo3028g();
                    bef.mo3033l();
                    continue;
            }
            bba a = bcw.m2709a(bef2, axw2, false);
            if (a.f2844a.isEmpty()) {
                List list = a.f2844a;
                Float valueOf = Float.valueOf(0.0f);
                bba9 = bba4;
                list.add(new beo(axw, valueOf, valueOf, null, 0.0f, Float.valueOf(axw2.f2515i)));
                bba10 = a;
            } else {
                bba bba12 = a;
                bba9 = bba4;
                if (((beo) bba12.f2844a.get(0)).f3103b == null) {
                    List list2 = bba12.f2844a;
                    Float valueOf2 = Float.valueOf(0.0f);
                    bba10 = bba12;
                    list2.set(0, new beo(axw, valueOf2, valueOf2, null, 0.0f, Float.valueOf(axw2.f2515i)));
                } else {
                    bba10 = bba12;
                }
            }
            bba5 = bba10;
            bba4 = bba9;
        }
        bba bba13 = bba4;
        if (n == 3) {
            bef.mo3025d();
        }
        if (bbd == null || (bbd.mo2975c() && ((PointF) ((beo) bbd.f2828a.get(0)).f3103b).equals(0.0f, 0.0f))) {
            bbd2 = null;
        } else {
            bbd2 = bbd;
        }
        if (bbl == null || (!(bbl instanceof bbh) && bbl.mo2975c() && ((PointF) ((beo) bbl.mo2974b().get(0)).f3103b).equals(0.0f, 0.0f))) {
            bbl2 = null;
        } else {
            bbl2 = bbl;
        }
        if (bba5 == null || (bba5.mo2975c() && ((Float) ((beo) bba5.f2844a.get(0)).f3103b).floatValue() == 0.0f)) {
            bba5 = null;
        }
        if (bbf != null) {
            if (bbf.mo2975c()) {
                ber ber = (ber) ((beo) bbf.f2844a.get(0)).f3103b;
                if (ber.f3117a == 1.0f) {
                }
            }
            bbf2 = bbf;
            if (bba3 != null || (bba3.mo2975c() && ((Float) ((beo) bba3.f2844a.get(0)).f3103b).floatValue() == 0.0f)) {
                bba6 = null;
            } else {
                bba6 = bba3;
            }
            bba7 = bba13;
            if (bba7 != null || (bba7.mo2975c() && ((Float) ((beo) bba7.f2844a.get(0)).f3103b).floatValue() == 0.0f)) {
                bba8 = null;
            } else {
                bba8 = bba7;
            }
            return new bbk(bbd2, bbl2, bbf2, bba5, bbc, bba2, bba, bba6, bba8);
        }
        bbf2 = null;
        if (bba3 != null) {
        }
        bba6 = null;
        bba7 = bba13;
        if (bba7 != null) {
        }
        bba8 = null;
        return new bbk(bbd2, bbl2, bbf2, bba5, bbc, bba2, bba, bba6, bba8);
    }
}
