package p000;

/* renamed from: bhcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcu {

    /* renamed from: a */
    public final double f118309a;

    /* renamed from: b */
    public final double f118310b;

    /* renamed from: c */
    public final double f118311c;

    /* renamed from: d */
    private double f118312d = -1.0d;

    public bhcu(double[] dArr) {
        bmxy.m108588a(dArr.length == 3);
        this.f118309a = dArr[0];
        this.f118310b = dArr[1];
        this.f118311c = dArr[2];
    }

    /* renamed from: a */
    public final double mo63557a() {
        double d = this.f118312d;
        if (d >= 0.0d) {
            return d;
        }
        double sqrt = Math.sqrt(Math.pow(this.f118309a, 2.0d) + Math.pow(this.f118310b, 2.0d) + Math.pow(this.f118311c, 2.0d));
        this.f118312d = sqrt;
        return sqrt;
    }
}
