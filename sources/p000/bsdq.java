package p000;

/* renamed from: bsdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdq implements bsdp {

    /* renamed from: a */
    public final bsdo f144202a;

    /* renamed from: b */
    double f144203b;

    /* renamed from: c */
    final bsdr[] f144204c = new bsdr[4];

    /* renamed from: d */
    bsdv f144205d;

    /* renamed from: e */
    public final bsdv f144206e = new bsdv();

    /* renamed from: f */
    public final bsdv f144207f = new bsdv();

    /* renamed from: g */
    public final bsdv f144208g = new bsdv();

    /* renamed from: h */
    public final bsdv f144209h = new bsdv();

    /* renamed from: i */
    public final bsds f144210i = new bsds();

    /* renamed from: j */
    public final bsdw f144211j = new bsdw();

    /* renamed from: k */
    public final bsdx f144212k = new bsdx();

    /* renamed from: l */
    public double f144213l;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(double, double):double}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(double, double):double} */
    public bsdq() {
        bxbm.m122545b(true, "expectedSampleFrequencyHz must be greater than zero.");
        this.f144203b = Math.min(50.0d, 1000.0d);
        bsdo bsdo = new bsdo();
        this.f144202a = bsdo;
        bsdo.mo70276a(this);
        mo70278a();
    }

    /* renamed from: a */
    public final void mo70278a() {
        mo70279b();
        this.f144202a.mo70274a();
        this.f144205d = null;
        this.f144213l = 0.0d;
    }

    /* renamed from: a */
    public final void mo70273a(double d, double d2) {
        this.f144213l -= d2;
    }

    /* renamed from: b */
    public final void mo70279b() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        double d = this.f144203b;
        boolean z5 = true;
        int max = Math.max(1, (int) (d + d));
        double d2 = this.f144203b;
        if (max > 0) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122543a(z, "Order must be greater than zero, but is %d.", Integer.valueOf(max));
        if (d2 > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        bxbm.m122545b(z2, "Filter sample frequency must be greater than zero.");
        bxbm.m122545b(true, "Filter cutoff frequency must be greater than zero.");
        int i2 = max + 1;
        double d3 = 0.1d / (d2 / 2.0d);
        double[] dArr = new double[i2];
        int i3 = 0;
        while (true) {
            i = i2 / 2;
            if (i3 > i) {
                break;
            }
            int i4 = i2 - 1;
            double d4 = (double) i3;
            double d5 = (double) i4;
            Double.isNaN(d5);
            Double.isNaN(d4);
            double d6 = (d4 - (d5 / 2.0d)) * d3;
            if (Math.abs(d6) < 1.0E-6d) {
                double d7 = 0.25d * d3;
                dArr[i3] = d7;
                dArr[i4 - i3] = d7;
            } else {
                double d8 = d6 * 3.141592653589793d;
                double sin = ((0.25d * d3) * Math.sin(d8)) / d8;
                dArr[i3] = sin;
                dArr[i4 - i3] = sin;
            }
            i3++;
        }
        if (max % 2 == 0) {
            dArr[i + 1] = dArr[i - 1];
        }
        if (i2 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        bxbm.m122545b(z3, "Window length must be greater than zero.");
        double[] dArr2 = new double[i2];
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i2 - 1;
            double d9 = (double) i5;
            Double.isNaN(d9);
            double d10 = (double) i6;
            Double.isNaN(d10);
            double cos = 0.54d - (Math.cos((d9 * 6.283185307179586d) / d10) * 0.45999999999999996d);
            dArr2[i5] = cos;
            dArr2[i6 - i5] = cos;
        }
        if (i2 % 2 != 0) {
            dArr2[i] = 1.0d;
        }
        if (i2 == i2) {
            z4 = true;
        } else {
            z4 = false;
        }
        bxbm.m122545b(z4, "The dot product requires equal length arrays");
        bxbm.m122545b(z4, "The dot product requires output array of equal length to input arrays");
        for (int i7 = 0; i7 < i2; i7++) {
            dArr[i7] = dArr[i7] * dArr2[i7];
        }
        double d11 = 0.0d;
        for (int i8 = 0; i8 < i2; i8++) {
            d11 += dArr[i8];
        }
        if (d11 <= 1.0E-100d) {
            z5 = false;
        }
        bxbm.m122542a(z5, "Sum of filter coefficients is near or below zero.");
        for (int i9 = 0; i9 < i2; i9++) {
            dArr[i9] = dArr[i9] / d11;
        }
        int i10 = 0;
        while (true) {
            bsdr[] bsdrArr = this.f144204c;
            int length = bsdrArr.length;
            if (i10 < 4) {
                bsdrArr[i10] = new bsdr(dArr);
                i10++;
            } else {
                return;
            }
        }
    }
}
