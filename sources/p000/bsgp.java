package p000;

import java.util.Arrays;

/* renamed from: bsgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgp extends bsgi implements bsfi {

    /* renamed from: b */
    private bsbs f144530b;

    /* renamed from: c */
    private final double f144531c;

    /* renamed from: d */
    private final double f144532d;

    /* renamed from: e */
    private bsgq f144533e;

    public bsgp(bsep bsep) {
        bmxy.m108581a(bsep);
        this.f144531c = bsep.mo70338a();
        if (bsep.mo70339b() > 1.0d) {
            this.f144532d = bsep.mo70339b();
        } else {
            this.f144532d = 1.0d;
        }
    }

    /* renamed from: a */
    public final double mo70531a(bsft bsft) {
        double d;
        double d2;
        bsft bsft2 = bsft;
        bsbs bsbs = this.f144530b;
        if (bsbs == null || this.f144533e == null) {
            return 1.0d;
        }
        double a = ayuo.m84842a(bsbs.mo70228a(bsft2.f144501b[1]));
        double a2 = ayuo.m84842a(this.f144530b.mo70230b(bsft2.f144501b[0]));
        bsgq bsgq = this.f144533e;
        double d3 = this.f144532d;
        double d4 = this.f144531c;
        double b = bsgq.f144539f.mo70229b(ayuo.m84844a(a2));
        double a3 = bsgq.f144539f.mo70227a(ayuo.m84844a(a));
        double d5 = bsgq.f144537d;
        double d6 = bsgq.f144534a;
        double d7 = (b - d5) / d6;
        double d8 = (a3 - bsgq.f144538e) / d6;
        if (d7 < 0.0d || d7 + 1.0d > ((double) bsgq.f144535b) || d8 < 0.0d || d8 + 1.0d > ((double) bsgq.f144536c)) {
            d = 5.0E-6d;
        } else {
            int floor = (int) Math.floor(d7);
            double d9 = (double) floor;
            Double.isNaN(d9);
            double d10 = d7 - d9;
            int floor2 = (int) Math.floor(d8);
            double d11 = (double) floor2;
            Double.isNaN(d11);
            double d12 = d8 - d11;
            double a4 = bsgq.mo70534a(d10, floor, floor2);
            int i = floor2 + 1;
            if (i < bsgq.f144536c) {
                d2 = bsgq.mo70534a(d10, floor, i);
            } else {
                d2 = 0.0d;
            }
            d = ((1.0d - d12) * a4) + (d12 * d2);
        }
        if (Double.isInfinite(d)) {
            d = 5.0E-7d;
        } else if (Double.isNaN(d)) {
            d = 5.0E-7d;
        }
        return Math.pow(d, 1.0d / d3) + d4;
    }

    /* renamed from: a */
    public final void mo70262a(bsbs bsbs, bsbs bsbs2) {
        this.f144530b = bsbs2;
        this.f144533e = null;
    }

    /* renamed from: b */
    public final void mo70533b() {
        this.f144528a = null;
        this.f144533e = null;
    }

    /* renamed from: a */
    public final void mo70532a() {
        boolean z;
        bsgp bsgp = this;
        bsfs bsfs = bsgp.f144528a;
        bsgq bsgq = null;
        if (!(bsfs == null || bsgp.f144530b == null)) {
            bmxy.m108588a(bsfs.f144497c == 9);
            bsfa bsfa = (bsfa) bsgp.f144528a;
            bmxy.m108581a(bsfa.f144428a);
            if (!bsfa.f144428a.isEmpty()) {
                bngx bngx = bsfa.f144428a;
                bsbs bsbs = bsgp.f144530b;
                double d = bsfa.f144429b;
                if (bngx != null && !bngx.isEmpty()) {
                    int size = bngx.size();
                    double d2 = -1.7976931348623157E308d;
                    double d3 = Double.MAX_VALUE;
                    double d4 = Double.MAX_VALUE;
                    int i = 0;
                    double d5 = -1.7976931348623157E308d;
                    while (i < size) {
                        bsez bsez = (bsez) bngx.get(i);
                        double a = bsbs.mo70227a(ayuo.m84849b(bsez.f144425a));
                        double b = bsbs.mo70229b(ayuo.m84849b(bsez.f144426b));
                        d3 = Math.min(d3, a);
                        d4 = Math.min(d4, b);
                        d5 = Math.max(d5, a);
                        d2 = Math.max(d2, b);
                        i++;
                        size = size;
                        d = d;
                    }
                    double d6 = d;
                    int ceil = (int) Math.ceil(((d2 - d4) / d6) + 1.0d);
                    int ceil2 = (int) Math.ceil(((d5 - d3) / d6) + 1.0d);
                    int i2 = ceil * ceil2;
                    double[] dArr = new double[i2];
                    Arrays.fill(dArr, 5.0E-6d);
                    int size2 = bngx.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        bsez bsez2 = (bsez) bngx.get(i3);
                        double a2 = bsbs.mo70227a(ayuo.m84849b(bsez2.f144425a));
                        int i4 = size2;
                        bngx bngx2 = bngx;
                        int round = (int) Math.round((bsbs.mo70229b(ayuo.m84849b(bsez2.f144426b)) - d4) / d6);
                        int round2 = (int) Math.round((a2 - d3) / d6);
                        if (round >= 0 && round <= ceil - 1 && round2 >= 0 && round2 <= ceil2 - 1) {
                            double d7 = bsez2.f144427c;
                            int a3 = bsgq.m115756a(round, round2, ceil);
                            if (a3 < i2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bmxy.m108588a(z);
                            dArr[a3] = d7;
                        }
                        i3++;
                        bngx = bngx2;
                        size2 = i4;
                    }
                    bsgq = new bsgq(dArr, d4, d3, d6, ceil, bsbs);
                }
                bsgp = this;
            } else {
                return;
            }
        }
        bsgp.f144533e = bsgq;
    }
}
