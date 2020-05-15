package p000;

import java.io.PrintWriter;

/* renamed from: bsch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsch implements bsct {

    /* renamed from: d */
    private static final adyn f144054d = adyn.m51430a(2);

    /* renamed from: a */
    final bscg f144055a;

    /* renamed from: b */
    bsbl f144056b = null;

    /* renamed from: c */
    private long f144057c;

    /* renamed from: e */
    private final adyn f144058e;

    /* renamed from: f */
    private final adyn f144059f;

    /* renamed from: g */
    private final adyn f144060g;

    /* renamed from: h */
    private final int f144061h;

    /* renamed from: i */
    private bsbs f144062i;

    public bsch(bscg bscg, int i) {
        this.f144055a = bscg;
        this.f144058e = new adyn(2, 1);
        adyn adyn = new adyn(2, 2);
        this.f144059f = adyn;
        adyn.mo33931a();
        adyn adyn2 = new adyn(2, 2);
        this.f144060g = adyn2;
        adyn2.mo33932a(0, 0, 6.25d);
        this.f144060g.mo33932a(1, 1, 6.25d);
        this.f144061h = i;
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        return 15;
    }

    /* renamed from: a */
    public final void mo70207a(long j, float f) {
    }

    /* renamed from: a */
    public final void mo70210a(long j, bscd bscd) {
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
    }

    /* renamed from: a */
    public final void mo70212a(long j, bsde bsde) {
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
    }

    /* renamed from: b */
    public final long mo70214b() {
        return this.f144057c;
    }

    /* renamed from: c */
    public final void mo70215c() {
        this.f144062i = null;
        this.f144056b = null;
    }

    /* renamed from: d */
    public final void mo70216d() {
        mo70215c();
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        double d;
        bsbj bsbj = null;
        if (this.f144062i == null) {
            return null;
        }
        bscg bscg = this.f144055a;
        adyn adyn = bscg.f144049a;
        adyn adyn2 = bscg.f144050b;
        if (adyn2 != null) {
            d = Math.sqrt((adyn2.mo33930a(0, 0) + adyn2.mo33930a(1, 1)) / 2.0d);
            double d2 = (double) (this.f144061h / 1000);
            if (d < d2) {
                d = d2;
            }
        } else {
            d = Double.MAX_VALUE;
        }
        if (!(adyn == null || d == Double.MAX_VALUE || this.f144056b == null)) {
            double a = adyn.mo33930a(0, 0);
            double a2 = adyn.mo33930a(1, 0);
            bsbk bsbk = this.f144056b.f143965a;
            int a3 = this.f144062i.mo70228a(a2);
            int b = this.f144062i.mo70230b(a);
            bsbj = bsbl.m115064o();
            bsbj.mo70178a(a3, b, (int) (d * 1000.0d));
            bsbj.mo70179a(bsbk);
            if (this.f144056b.mo70197j()) {
                bsbj.mo70175a(this.f144056b.f143971g);
            }
            if (this.f144056b.mo70194h()) {
                bsbj.mo70184d(this.f144056b.f143969e);
            }
            if (this.f144056b.mo70198k()) {
                bsbj.mo70181b(this.f144056b.f143972h);
            }
            if (this.f144056b.mo70199l()) {
                bsbj.mo70182b(this.f144056b.f143976l);
            }
        }
        return bsbj.mo70174a();
    }

    /* renamed from: a */
    public final void mo70245a(double d) {
        if (this.f144062i != null) {
            this.f144060g.mo33932a(0, 0, d);
            this.f144060g.mo33932a(1, 1, d);
            this.f144055a.mo70243a(f144054d, this.f144060g, null);
        }
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
        if (this.f144062i != null) {
            this.f144055a.mo70243a(f144054d, this.f144060g, null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        boolean z;
        bsbl bsbl2 = bsbl;
        bsbl bsbl3 = this.f144056b;
        double d = 0.0d;
        if (!(bsbl3 == null || bsbl2 == null)) {
            if (bsbl.mo70192f() && bsbl3.mo70192f()) {
                double min = (double) Math.min((float) ayuo.m84843a(bsbl2.f143966b, bsbl2.f143967c, bsbl3.f143966b, bsbl3.f143967c), 165.0f);
                Double.isNaN(min);
                d = 1.0d - (min / 165.0d);
            } else if (bsbl.mo70190e() && bsbl3.mo70190e()) {
                d = 0.8999999761581421d;
            }
        }
        this.f144056b = bsbl2;
        this.f144057c = j;
        if (this.f144062i != null) {
            adyn adyn = this.f144055a.f144049a;
            double a = adyn.mo33930a(0, 0);
            double a2 = adyn.mo33930a(1, 0);
            if (this.f144062i.mo70226a(a, a2) > 0.1d) {
                bsbs bsbs = this.f144062i;
                bsbs bsbs2 = new bsbs(bsbl2.f143966b, bsbl2.f143967c);
                this.f144062i = bsbs2;
                adyn.mo33932a(0, 0, bsbs2.mo70229b(bsbs.mo70230b(a)));
                adyn.mo33932a(1, 0, this.f144062i.mo70227a(bsbs.mo70228a(a2)));
                bscg bscg = this.f144055a;
                bscg.mo70242a(adyn, bscg.f144050b);
                z = false;
            } else {
                z = false;
            }
        } else {
            this.f144062i = new bsbs(bsbl2.f143966b, bsbl2.f143967c);
            z = true;
        }
        double a3 = this.f144062i.mo70227a(bsbl2.f143966b);
        this.f144058e.mo33932a(0, 0, this.f144062i.mo70229b(bsbl2.f143967c));
        this.f144058e.mo33932a(1, 0, a3);
        int i = bsbl2.f143968d;
        if (bsbl.mo70192f() && i < 10000) {
            i = 10000;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = d2 / 1000.0d;
        double sqrt = Math.sqrt(d + 1.0d);
        this.f144059f.mo33931a();
        double d4 = d3 * d3 * sqrt;
        this.f144059f.mo33932a(0, 0, d4);
        this.f144059f.mo33932a(1, 1, d4);
        if (z) {
            this.f144055a.mo70242a(this.f144058e, this.f144059f);
            return;
        }
        adyn adyn2 = this.f144055a.f144050b;
        bsdg.m115312g(adyn2, adyn2, adyn2);
        for (int i2 = 0; i2 < adyn2.f62914c; i2++) {
            double[] dArr = adyn2.f62915d;
            dArr[i2] = dArr[i2] * sqrt;
        }
        this.f144055a.mo70244b(this.f144058e, f144054d, this.f144059f);
    }
}
