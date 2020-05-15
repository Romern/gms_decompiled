package p000;

/* renamed from: bsdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdw {

    /* renamed from: a */
    public static final bsdw f144226a = new bsdw(1.0d, 0.0d);

    /* renamed from: b */
    public static final bsdw f144227b = new bsdw(0.0d, 1.0d);

    /* renamed from: c */
    public double f144228c;

    /* renamed from: d */
    public double f144229d;

    /* renamed from: e */
    public double f144230e;

    public bsdw() {
    }

    /* renamed from: a */
    public final double mo70285a() {
        double d = this.f144228c;
        double d2 = this.f144229d;
        double d3 = this.f144230e;
        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
    }

    /* renamed from: a */
    public final void mo70286a(bsdw bsdw) {
        bsdw.f144228c = this.f144228c;
        bsdw.f144229d = this.f144229d;
        bsdw.f144230e = this.f144230e;
    }

    /* renamed from: b */
    public final bsdw mo70287b() {
        bsdw bsdw = new bsdw();
        mo70286a(bsdw);
        return bsdw;
    }

    /* renamed from: c */
    public final void mo70288c() {
        double d;
        double a = mo70285a();
        if (a >= 1.0E-99d) {
            double d2 = 1.0d / a;
            this.f144228c *= d2;
            this.f144229d *= d2;
            d = this.f144230e * d2;
        } else {
            bsdw bsdw = f144226a;
            this.f144228c = bsdw.f144228c;
            this.f144229d = bsdw.f144229d;
            d = bsdw.f144230e;
        }
        this.f144230e = d;
    }

    public bsdw(double d, double d2) {
        this.f144228c = d;
        this.f144229d = 0.0d;
        this.f144230e = d2;
    }
}
