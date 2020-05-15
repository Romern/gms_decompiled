package p000;

/* renamed from: bscj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscj implements bsci {

    /* renamed from: g */
    private static final double f144063g = Math.toRadians(45.0d);

    /* renamed from: a */
    final bset f144064a;

    /* renamed from: b */
    public double f144065b;

    /* renamed from: c */
    public double f144066c;

    /* renamed from: d */
    private bscg f144067d = null;

    /* renamed from: e */
    private bsbs f144068e = null;

    /* renamed from: f */
    private long f144069f = 0;

    public bscj(bset bset) {
        this.f144064a = bset;
        this.f144065b = bset.mo70354a();
        this.f144066c = bset.mo70355b();
    }

    /* renamed from: b */
    private final void m115207b(bsbl bsbl, long j) {
        this.f144068e = new bsbs(bsbl.f143966b, bsbl.f143967c);
        adyn adyn = new adyn(4, 1);
        adyn.mo33932a(0, 0, this.f144068e.mo70229b(bsbl.f143967c));
        adyn.mo33932a(1, 0, this.f144068e.mo70227a(bsbl.f143966b));
        adyn.mo33932a(2, 0, 0.0d);
        adyn.mo33932a(3, 0, 0.0d);
        double d = (double) bsbl.f143968d;
        Double.isNaN(d);
        double d2 = d * 0.001d * 10.0d;
        adyn a = adyn.m51430a(4);
        double d3 = d2 * d2;
        a.mo33932a(0, 0, d3);
        a.mo33932a(1, 1, d3);
        a.mo33932a(2, 2, 25.0d);
        a.mo33932a(3, 3, 25.0d);
        this.f144067d = new bscg(adyn, a);
        this.f144069f = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x023e  */
    /* renamed from: a */
    public final bsbl mo61305a(bsbl bsbl, long j) {
        adyn adyn;
        adyn adyn2;
        adyn adyn3;
        double a;
        double a2;
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        double d2;
        bsbl bsbl2 = bsbl;
        long j2 = j;
        if (bsbl2 == null) {
            return null;
        }
        if (this.f144067d != null) {
            double d3 = (double) (j2 - this.f144069f);
            Double.isNaN(d3);
            double d4 = d3 / 1.0E9d;
            if (d4 > 15.0d || d4 < -2.0d) {
                m115207b(bsbl, j);
                return bsbl2;
            }
            double max = Math.max(0.0d, d4);
            double a3 = ayuo.m84842a(this.f144068e.mo70228a(this.f144067d.f144049a.mo33930a(1, 0)));
            double a4 = ayuo.m84842a(this.f144068e.mo70230b(this.f144067d.f144049a.mo33930a(0, 0)));
            if (!this.f144064a.mo70361g() || ayuo.m84851c(bsbl.mo70185a(), bsbl.mo70187b(), a3, a4) <= this.f144064a.mo70362h()) {
                adyn a5 = adyn.m51430a(4);
                a5.mo33932a(0, 2, max);
                a5.mo33932a(1, 3, max);
                double min = Math.min(3.0d, Math.max(1.0E-4d, this.f144065b * max));
                double min2 = Math.min(5.0d, Math.max(0.1d, max * this.f144066c));
                adyn a6 = adyn.m51430a(4);
                double d5 = min * min;
                a6.mo33932a(0, 0, d5);
                a6.mo33932a(1, 1, d5);
                double d6 = min2 * min2;
                a6.mo33932a(2, 2, d6);
                a6.mo33932a(3, 3, d6);
                this.f144067d.mo70243a(a5, a6, null);
                double d7 = (double) bsbl2.f143968d;
                Double.isNaN(d7);
                double max2 = Math.max(5.0d, d7 * 0.001d);
                if (!bsbl.mo70199l()) {
                    i4 = 1;
                    i3 = 2;
                } else if (!bsbl.mo70194h()) {
                    i4 = 1;
                    i3 = 2;
                } else {
                    double c = bsgl.m115745c(Math.toRadians((double) bsbl2.f143976l));
                    double cos = Math.cos(c);
                    float f = bsbl2.f143969e;
                    double sin = Math.sin(c);
                    float f2 = bsbl2.f143969e;
                    adyn adyn4 = new adyn(4, 1);
                    adyn4.mo33932a(0, 0, this.f144068e.mo70229b(bsbl2.f143967c));
                    adyn4.mo33932a(1, 0, this.f144068e.mo70227a(bsbl2.f143966b));
                    double d8 = (double) f;
                    Double.isNaN(d8);
                    adyn4.mo33932a(2, 0, cos * d8);
                    double d9 = (double) f2;
                    Double.isNaN(d9);
                    adyn4.mo33932a(3, 0, d9 * sin);
                    if (bsbl.mo70200m()) {
                        d = Math.toRadians((double) bsbl2.f143977m);
                    } else {
                        d = f144063g;
                    }
                    if (bsbl.mo70196i()) {
                        d2 = (double) bsbl2.f143970f;
                    } else {
                        d2 = 1.5d;
                    }
                    double pow = Math.pow(Math.cos(c) * d2, 2.0d);
                    float f3 = bsbl2.f143969e;
                    double sin2 = Math.sin(c);
                    double d10 = (double) f3;
                    Double.isNaN(d10);
                    double pow2 = Math.pow(d10 * sin2 * d, 2.0d);
                    double pow3 = Math.pow(d2 * Math.sin(c), 2.0d);
                    float f4 = bsbl2.f143969e;
                    double cos2 = Math.cos(c);
                    double d11 = (double) f4;
                    Double.isNaN(d11);
                    double pow4 = Math.pow(d11 * cos2 * d, 2.0d);
                    adyn2 = new adyn(4, 4);
                    double d12 = max2 * max2;
                    adyn2.mo33932a(0, 0, d12);
                    adyn2.mo33932a(1, 1, d12);
                    adyn2.mo33932a(2, 2, pow + pow2);
                    adyn2.mo33932a(3, 3, pow3 + pow4);
                    adyn3 = new adyn(4, 4);
                    adyn3.mo33932a(0, 0, 1.0d);
                    adyn3.mo33932a(1, 1, 1.0d);
                    adyn3.mo33932a(2, 2, 1.0d);
                    adyn3.mo33932a(3, 3, 1.0d);
                    adyn = adyn4;
                    this.f144067d.mo70244b(adyn, adyn3, adyn2);
                    this.f144069f = j;
                    bscg bscg = this.f144067d;
                    adyn adyn5 = bscg.f144049a;
                    adyn adyn6 = bscg.f144050b;
                    a = adyn5.mo33930a(0, 0);
                    a2 = adyn5.mo33930a(1, 0);
                    if (this.f144068e.mo70226a(a, a2) <= 0.1d) {
                        this.f144068e = bsbs.m115125a(this.f144068e, a, a2);
                        i2 = 0;
                        adyn5.mo33932a(0, 0, 0.0d);
                        i = 1;
                        adyn5.mo33932a(1, 0, 0.0d);
                        bscg bscg2 = this.f144067d;
                        bscg2.mo70242a(adyn5, bscg2.f144050b);
                    } else {
                        i2 = 0;
                        i = 1;
                    }
                    double sqrt = Math.sqrt(adyn6.mo33930a(i2, i2) + adyn6.mo33930a(i, i));
                    double hypot = Math.hypot(adyn5.mo33930a(2, i2), adyn5.mo33930a(3, i2));
                    double atan2 = Math.atan2(adyn5.mo33930a(3, i2), adyn5.mo33930a(2, i2));
                    bsbj n = bsbl.mo70201n();
                    n.mo70178a(this.f144068e.mo70228a(adyn5.mo33930a(1, i2)), this.f144068e.mo70230b(adyn5.mo33930a(i2, i2)), (int) (sqrt * 1000.0d));
                    n.mo70184d((float) hypot);
                    n.mo70182b((float) Math.toDegrees(bsgl.m115746d(atan2)));
                    return n.mo70174a();
                }
                adyn adyn7 = new adyn(i3, i4);
                adyn7.mo33932a(0, 0, this.f144068e.mo70229b(bsbl2.f143967c));
                adyn7.mo33932a(i4, 0, this.f144068e.mo70227a(bsbl2.f143966b));
                adyn2 = new adyn(2, 2);
                double d13 = max2 * max2;
                adyn2.mo33932a(0, 0, d13);
                adyn2.mo33932a(i4, i4, d13);
                adyn adyn8 = new adyn(2, 4);
                adyn8.mo33932a(0, 0, 1.0d);
                adyn8.mo33932a(i4, i4, 1.0d);
                adyn = adyn7;
                adyn3 = adyn8;
                this.f144067d.mo70244b(adyn, adyn3, adyn2);
                this.f144069f = j;
                bscg bscg3 = this.f144067d;
                adyn adyn52 = bscg3.f144049a;
                adyn adyn62 = bscg3.f144050b;
                a = adyn52.mo33930a(0, 0);
                a2 = adyn52.mo33930a(1, 0);
                if (this.f144068e.mo70226a(a, a2) <= 0.1d) {
                }
                double sqrt2 = Math.sqrt(adyn62.mo33930a(i2, i2) + adyn62.mo33930a(i, i));
                double hypot2 = Math.hypot(adyn52.mo33930a(2, i2), adyn52.mo33930a(3, i2));
                double atan22 = Math.atan2(adyn52.mo33930a(3, i2), adyn52.mo33930a(2, i2));
                bsbj n2 = bsbl.mo70201n();
                n2.mo70178a(this.f144068e.mo70228a(adyn52.mo33930a(1, i2)), this.f144068e.mo70230b(adyn52.mo33930a(i2, i2)), (int) (sqrt2 * 1000.0d));
                n2.mo70184d((float) hypot2);
                n2.mo70182b((float) Math.toDegrees(bsgl.m115746d(atan22)));
                return n2.mo70174a();
            }
            m115207b(bsbl, j);
            return bsbl2;
        }
        m115207b(bsbl, j);
        return bsbl2;
    }

    /* renamed from: b */
    public final void mo70246b() {
        this.f144065b = this.f144064a.mo70358e();
        this.f144066c = this.f144064a.mo70360f();
    }

    /* renamed from: a */
    public final void mo61306a() {
        this.f144067d = null;
        this.f144069f = 0;
        this.f144068e = null;
        this.f144065b = this.f144064a.mo70354a();
        this.f144066c = this.f144064a.mo70355b();
    }
}
