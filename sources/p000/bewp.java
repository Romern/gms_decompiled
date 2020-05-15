package p000;

/* renamed from: bewp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewp {

    /* renamed from: a */
    public final int f112841a;

    /* renamed from: b */
    public final int f112842b;

    /* renamed from: c */
    public double[] f112843c;

    /* renamed from: d */
    public double[] f112844d;

    /* renamed from: e */
    private final int f112845e;

    /* renamed from: f */
    private final double f112846f;

    public bewp(int i, double d, int i2, int i3) {
        this.f112845e = i;
        this.f112846f = d;
        this.f112841a = i2;
        this.f112842b = i3;
    }

    /* renamed from: a */
    public final void mo61202a() {
        double d;
        if (this.f112843c == null) {
            double[] dArr = new double[(this.f112842b + 1)];
            double log = Math.log(this.f112846f);
            double log2 = Math.log(1.0d - this.f112846f);
            double d2 = (double) this.f112845e;
            Double.isNaN(d2);
            double d3 = log2 * d2;
            double[] dArr2 = new double[(this.f112842b + 1)];
            double d4 = 0.0d;
            int i = 0;
            double d5 = -1.0E20d;
            while (i <= this.f112842b) {
                double d6 = (double) i;
                Double.isNaN(d6);
                dArr[i] = (d6 * log) + d4 + d3;
                int i2 = i + 1;
                double d7 = (double) (this.f112845e + i);
                double d8 = (double) i2;
                Double.isNaN(d7);
                Double.isNaN(d8);
                d4 += Math.log(d7 / d8);
                d5 = bewk.m95991a(d5, dArr[i]);
                dArr2[i] = d5;
                i = i2;
                log = log;
            }
            int i3 = this.f112841a;
            if (i3 > 0) {
                d = dArr2[i3 - 1];
            } else {
                d = -1.0E20d;
            }
            double b = bewk.m95992b(d5, d);
            int i4 = this.f112842b + 1;
            this.f112843c = new double[i4];
            this.f112844d = new double[i4];
            for (int i5 = this.f112841a; i5 <= this.f112842b; i5++) {
                this.f112843c[i5] = dArr[i5] - b;
                this.f112844d[i5] = bewk.m95992b(d5, d) - b;
                d = dArr2[i5];
            }
        }
    }
}
