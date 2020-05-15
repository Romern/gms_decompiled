package p000;

/* renamed from: bsfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfo extends bsgc {

    /* renamed from: a */
    public double f144486a = Double.NaN;

    /* renamed from: b */
    public int f144487b = 0;

    /* renamed from: e */
    private final double f144488e;

    /* renamed from: f */
    private final int f144489f;

    /* renamed from: g */
    private final double f144490g;

    /* renamed from: h */
    private final double f144491h;

    public bsfo(bsgh bsgh, double d, double d2) {
        super(bsgh);
        double a = bsgl.m115743a(2.0d, 0.0d, 10.0d);
        this.f144488e = a;
        this.f144489f = (int) Math.max(a, 1.0d);
        this.f144490g = bsgl.m115743a(d, 0.0d, 2.0d);
        this.f144491h = bsgl.m115743a(d2, 0.0d, 2.0d);
    }

    /* renamed from: a */
    public final void mo70511a() {
        bxbm.m122540a(this.f144523d, "Evidence needs to be set.");
        double d = this.f144523d.f144498d;
        if (!Double.isNaN(this.f144486a)) {
            double d2 = this.f144486a;
            if (d > d2) {
                int i = (int) ((d - d2) * this.f144488e);
                this.f144487b = i;
                if (i > 0) {
                    this.f144486a = d;
                }
                int i2 = this.f144489f;
                if (i > i2) {
                    this.f144487b = i2;
                    return;
                }
                return;
            }
            return;
        }
        this.f144486a = d;
    }

    /* renamed from: b */
    public final void mo70513b() {
        this.f144487b = 0;
    }

    /* renamed from: a */
    public final void mo70512a(bsft bsft) {
        double[] dArr = bsft.f144501b;
        int i = this.f144487b;
        if (i > 0) {
            bsft.f144500a = this.f144486a;
            double sqrt = Math.sqrt((double) i);
            double d = this.f144490g;
            double d2 = this.f144491h * sqrt;
            dArr[2] = dArr[2] + (sqrt * d * this.f144522c.mo70526a());
            dArr[0] = dArr[0] + (this.f144522c.mo70526a() * d2);
            dArr[1] = dArr[1] + (d2 * this.f144522c.mo70526a());
        }
    }
}
