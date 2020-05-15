package p000;

/* renamed from: bsdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdr {

    /* renamed from: a */
    final double[] f144214a;

    /* renamed from: b */
    private final double[] f144215b;

    /* renamed from: c */
    private int f144216c = 0;

    public bsdr(double[] dArr) {
        this.f144214a = dArr;
        this.f144215b = new double[dArr.length];
    }

    /* renamed from: a */
    public final double mo70280a(double d) {
        int length = this.f144214a.length;
        double[] dArr = this.f144215b;
        int i = this.f144216c;
        dArr[i] = d;
        double d2 = 0.0d;
        for (int i2 = 0; i2 < length; i2++) {
            d2 += this.f144214a[i2] * this.f144215b[i];
            i--;
            if (i < 0) {
                i = length - 1;
            }
        }
        int i3 = this.f144216c + 1;
        this.f144216c = i3;
        if (i3 >= length) {
            this.f144216c = 0;
        }
        return d2;
    }
}
