package p000;

/* renamed from: bezw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezw {

    /* renamed from: a */
    public final bfbk f113205a;

    /* renamed from: b */
    public final double f113206b;

    /* renamed from: c */
    public final double f113207c;

    /* renamed from: d */
    public final double f113208d;

    /* renamed from: e */
    public final double f113209e;

    public bezw(bfbk bfbk, bnwc bnwc, double d) {
        this.f113205a = bfbk;
        bfbh bfbh = (bfbh) bfbk;
        this.f113206b = bfbh.f113297b.mo61282a(bnwc);
        this.f113207c = bfbh.f113297b.mo61286b(bnwc);
        this.f113208d = d;
        double a = bezd.m96115a(0.0d, d);
        double a2 = bezc.m96112a(1.0d, 38.0d);
        double size = (double) bfbk.mo61359a().size();
        Double.isNaN(size);
        this.f113209e = a + (a2 * size);
    }
}
