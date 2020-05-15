package p000;

import java.util.ArrayList;

/* renamed from: bct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bct {

    /* renamed from: a */
    private static final bed f3015a = bed.m2754a("k", "x", "y");

    /* renamed from: a */
    public static bbd m2704a(bef bef, axw axw) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (bef.mo3035n() == 1) {
            bef.mo3021a();
            while (bef.mo3026e()) {
                if (bef.mo3035n() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new baf(axw, bdj.m2732a(bef, axw, ben.m2828a(), bdo.f3049a, z)));
            }
            bef.mo3023b();
            bdk.m2734a(arrayList);
        } else {
            arrayList.add(new beo(bdi.m2730b(bef, ben.m2828a())));
        }
        return new bbd(arrayList);
    }

    /* renamed from: b */
    static bbl m2705b(bef bef, axw axw) {
        bef.mo3024c();
        bbd bbd = null;
        bba bba = null;
        bba bba2 = null;
        boolean z = false;
        while (bef.mo3035n() != 4) {
            int a = bef.mo3019a(f3015a);
            if (a == 0) {
                bbd = m2704a(bef, axw);
            } else if (a != 1) {
                if (a != 2) {
                    bef.mo3028g();
                    bef.mo3033l();
                } else if (bef.mo3035n() == 6) {
                    bef.mo3033l();
                    z = true;
                } else {
                    bba2 = bcw.m2708a(bef, axw);
                }
            } else if (bef.mo3035n() == 6) {
                bef.mo3033l();
                z = true;
            } else {
                bba = bcw.m2708a(bef, axw);
            }
        }
        bef.mo3025d();
        if (z) {
            axw.mo2859a("Lottie doesn't support expressions.");
        }
        return bbd == null ? new bbh(bba, bba2) : bbd;
    }
}
