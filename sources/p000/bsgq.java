package p000;

/* renamed from: bsgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgq {

    /* renamed from: a */
    public final double f144534a;

    /* renamed from: b */
    public final int f144535b;

    /* renamed from: c */
    public final int f144536c;

    /* renamed from: d */
    public final double f144537d;

    /* renamed from: e */
    public final double f144538e;

    /* renamed from: f */
    public final bsbs f144539f;

    /* renamed from: g */
    private final double[] f144540g;

    public bsgq(double[] dArr, double d, double d2, double d3, int i, bsbs bsbs) {
        this.f144540g = dArr;
        this.f144537d = d;
        this.f144538e = d2;
        this.f144534a = d3;
        this.f144535b = i;
        int length = dArr.length;
        this.f144536c = length / i;
        bmxy.m108588a(length % i == 0);
        this.f144539f = bsbs;
    }

    /* renamed from: a */
    private final int m115755a(int i, int i2) {
        return m115756a(i, i2, this.f144535b);
    }

    /* renamed from: a */
    public static int m115756a(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i < i3) {
            z = true;
        }
        bmxy.m108592a(z, "Grid cell X coordinate out of bounds: %s. Must be between [0, %s)", i, i3);
        return i + (i3 * i2);
    }

    /* renamed from: a */
    public final double mo70534a(double d, int i, int i2) {
        int i3 = i + 1;
        boolean z = true;
        if (i3 >= this.f144535b && d != 0.0d) {
            z = false;
        }
        bmxy.m108589a(z, "Unable to sample out of grid bounds.");
        double d2 = (1.0d - d) * this.f144540g[m115755a(i, i2)];
        return d > 0.0d ? d2 + (d * this.f144540g[m115755a(i3, i2)]) : d2;
    }
}
