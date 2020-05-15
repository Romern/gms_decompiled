package p000;

/* renamed from: bezx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezx implements bsci {

    /* renamed from: a */
    public static final double f113210a = Math.toRadians(15.0d);

    /* renamed from: b */
    public final double f113211b;

    /* renamed from: c */
    public final double f113212c;

    /* renamed from: d */
    public final double f113213d;

    /* renamed from: e */
    public final double f113214e;

    /* renamed from: f */
    public final double f113215f;

    /* renamed from: g */
    public final double f113216g;

    /* renamed from: h */
    public final double f113217h;

    /* renamed from: i */
    public bscg f113218i;

    /* renamed from: j */
    public bsbs f113219j;

    /* renamed from: k */
    public long f113220k = 0;

    /* renamed from: l */
    private final double f113221l;

    public bezx(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f113212c = d;
        this.f113211b = d2;
        this.f113213d = d3;
        this.f113214e = d4;
        this.f113215f = d5;
        this.f113221l = d6;
        this.f113216g = d7;
        this.f113217h = d8;
    }

    /* renamed from: a */
    public final bsbl mo61305a(bsbl bsbl, long j) {
        throw null;
    }

    /* renamed from: a */
    public final void mo61306a() {
        throw null;
    }

    /* renamed from: b */
    public final void mo61307b(bsbl bsbl, long j) {
        double d;
        double d2;
        this.f113219j = new bsbs(bsbl.f143966b, bsbl.f143967c);
        adyn adyn = new adyn(5, 1);
        adyn.mo33932a(0, 0, this.f113219j.mo70229b(bsbl.f143967c));
        adyn.mo33932a(1, 0, this.f113219j.mo70227a(bsbl.f143966b));
        double d3 = (double) bsbl.f143969e;
        if (d3 != 0.0d) {
            double c = bsgl.m115745c(Math.toRadians((double) bsbl.f143976l));
            double cos = Math.cos(c);
            Double.isNaN(d3);
            d = cos * d3;
            double sin = Math.sin(c);
            Double.isNaN(d3);
            d2 = sin * d3;
        } else {
            d2 = 0.0d;
            d = 0.0d;
        }
        adyn.mo33932a(2, 0, d);
        adyn.mo33932a(3, 0, d2);
        adyn.mo33932a(4, 0, 0.0d);
        double d4 = (double) bsbl.f143968d;
        Double.isNaN(d4);
        double d5 = d4 * 0.001d;
        double d6 = d5 + d5;
        double d7 = this.f113221l;
        double d8 = d7 + d7;
        adyn a = adyn.m51430a(5);
        double d9 = d6 * d6;
        a.mo33932a(0, 0, d9);
        a.mo33932a(1, 1, d9);
        double d10 = d8 * d8;
        a.mo33932a(2, 2, d10);
        a.mo33932a(3, 3, d10);
        a.mo33932a(4, 4, 1.0d);
        this.f113218i = new bscg(adyn, a);
        this.f113220k = j;
    }
}
