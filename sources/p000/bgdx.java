package p000;

/* renamed from: bgdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdx {

    /* renamed from: a */
    public double f116192a = 0.0d;

    /* renamed from: b */
    public double f116193b = 0.0d;

    /* renamed from: c */
    public int f116194c = 0;

    /* renamed from: d */
    public final double[] f116195d;

    /* renamed from: e */
    public final double[] f116196e;

    /* renamed from: f */
    public final int[] f116197f;

    /* renamed from: g */
    private double f116198g = 0.0d;

    /* renamed from: h */
    private double f116199h = 0.0d;

    public bgdx(int i) {
        this.f116195d = new double[i];
        this.f116196e = new double[i];
        this.f116197f = new int[i];
    }

    /* renamed from: a */
    public final double mo62694a() {
        int i;
        double d = this.f116198g;
        if (d != 0.0d || (i = this.f116194c) == 0) {
            return d;
        }
        double d2 = this.f116192a;
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = d2 / d3;
        this.f116198g = d4;
        return d4;
    }

    /* renamed from: b */
    public final double mo62695b() {
        int i;
        double d = this.f116199h;
        if (d != 0.0d || (i = this.f116194c) == 0) {
            return d;
        }
        double d2 = this.f116193b;
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = d2 / d3;
        this.f116199h = d4;
        return d4;
    }
}
