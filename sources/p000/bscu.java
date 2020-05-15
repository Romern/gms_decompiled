package p000;

import java.io.PrintWriter;

/* renamed from: bscu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscu implements bsct {

    /* renamed from: a */
    private final bscg f144116a;

    /* renamed from: b */
    private final bsch f144117b;

    /* renamed from: c */
    private final adyn f144118c = new adyn(2, 1);

    /* renamed from: d */
    private final adyn f144119d = new adyn(2, 2);

    /* renamed from: e */
    private final adyn f144120e = adyn.m51430a(2);

    /* renamed from: f */
    private long f144121f;

    /* renamed from: g */
    private final bscw f144122g;

    /* renamed from: h */
    private long f144123h = Long.MAX_VALUE;

    public bscu(bscw bscw, int i) {
        bscg bscg = new bscg(new adyn(2, 1), new adyn(2, 2), new adyn(2, 2), new adyn(2, 2));
        this.f144116a = bscg;
        this.f144117b = new bsch(bscg, i);
        this.f144119d.mo33932a(0, 0, 0.16000000000000003d);
        this.f144119d.mo33932a(1, 1, 0.16000000000000003d);
        this.f144122g = bscw;
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        return 31;
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
        return this.f144121f;
    }

    /* renamed from: c */
    public final void mo70215c() {
        this.f144117b.mo70215c();
        this.f144123h = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public final void mo70216d() {
        mo70215c();
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return this.f144117b.mo70206a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(double, double):double}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(double, double):double} */
    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
        long j2 = j;
        float f3 = f;
        if (this.f144117b.mo70206a() != null && this.f144122g.mo70253a(j2) <= 4.0f) {
            if (f3 != Float.MAX_VALUE) {
                double d = (double) f3;
                this.f144118c.mo33932a(0, 0, Math.sin(d) * 0.8d);
                this.f144118c.mo33932a(1, 0, Math.cos(d) * 0.8d);
                this.f144119d.mo33931a();
                adyn adyn = this.f144119d;
                double min = Math.min(0.5235987901687622d, 0.17453292519943295d);
                Double.isNaN(d);
                double d2 = -1.5707963705062866d + d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                double d6 = 0.0d;
                double d7 = 0.0d;
                double d8 = 0.0d;
                while (true) {
                    Double.isNaN(d);
                    if (d2 < d + 1.5707963705062866d) {
                        double cos = Math.cos(d2);
                        double sin = Math.sin(d2);
                        Double.isNaN(d);
                        double d9 = d2 - d;
                        double exp = (Math.exp(((-d9) * d9) / 0.548311386132383d) / (Math.sqrt(6.283185307179586d) * 0.5235987901687622d)) * min;
                        d4 += exp;
                        d3 += cos * exp;
                        d5 += sin * exp;
                        d7 += cos * cos * exp;
                        d8 += sin * sin * exp;
                        d6 += cos * sin * exp;
                        d2 += min;
                    } else {
                        double d10 = d3 / d4;
                        double d11 = d5 / d4;
                        double d12 = d10 * 0.6400000000000001d;
                        double d13 = ((d6 / d4) * 0.8000000000000002d) - (d12 * d11);
                        adyn.mo33932a(0, 0, ((d7 / d4) * 0.8000000000000002d) - (d12 * d10));
                        adyn.mo33932a(1, 1, ((d8 / d4) * 0.8000000000000002d) - ((0.6400000000000001d * d11) * d11));
                        adyn.mo33932a(0, 1, d13);
                        adyn.mo33932a(1, 0, d13);
                        this.f144116a.mo70243a(this.f144120e, this.f144119d, this.f144118c);
                        this.f144121f = j2;
                        this.f144123h = j2;
                        return;
                    }
                }
            } else {
                long j3 = this.f144123h;
                if (j3 != Long.MAX_VALUE) {
                    double d14 = (double) (j2 - j3);
                    Double.isNaN(d14);
                    double d15 = d14 / 1.0E9d;
                    this.f144117b.mo70245a(d15 * d15 * 2.5d * 2.5d);
                }
                this.f144123h = j2;
            }
        }
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        if (bsbl.mo70190e() && bsbl.mo70194h() && bsbl.f143969e > 4.0f) {
            this.f144117b.mo70215c();
            this.f144117b.mo70209a(j, bsbl);
        } else {
            long j2 = this.f144123h;
            if (j2 != Long.MAX_VALUE) {
                bsch bsch = this.f144117b;
                double d = (double) (j - j2);
                Double.isNaN(d);
                double d2 = d / 1.0E9d;
                double a = (double) this.f144122g.mo70253a(j);
                Double.isNaN(a);
                Double.isNaN(a);
                bsch.mo70245a(d2 * d2 * a * a);
            }
            this.f144117b.mo70209a(j, bsbl);
        }
        this.f144123h = j;
        this.f144121f = j;
    }
}
