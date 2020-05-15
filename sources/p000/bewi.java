package p000;

import java.lang.reflect.Array;

/* renamed from: bewi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bewi {

    /* renamed from: a */
    private final double[][] f112805a;

    /* renamed from: b */
    private final double[][][] f112806b;

    /* renamed from: c */
    private final int f112807c;

    /* renamed from: d */
    private final int f112808d;

    /* renamed from: e */
    private final double[] f112809e;

    /* renamed from: f */
    private double[] f112810f;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if (r9[r10][r10] <= 0.0d) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r9 = null;
     */
    public bewi(double[][] dArr, double[][][] dArr2) {
        boolean z;
        boolean z2;
        int i;
        double d;
        double d2;
        double d3;
        boolean z3;
        boolean z4;
        double[][] dArr3 = dArr;
        double[][][] dArr4 = dArr2;
        int length = dArr3.length;
        this.f112807c = length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122544b(z);
        if (dArr4.length == this.f112807c) {
            z2 = true;
        } else {
            z2 = false;
        }
        bxbm.m122544b(z2);
        this.f112808d = dArr3[0].length;
        int i2 = 0;
        while (true) {
            i = this.f112807c;
            if (i2 >= i) {
                break;
            }
            if (dArr3[i2].length == this.f112808d) {
                z3 = true;
            } else {
                z3 = false;
            }
            bxbm.m122544b(z3);
            if (dArr4[i2].length == this.f112808d) {
                z4 = true;
            } else {
                z4 = false;
            }
            bxbm.m122544b(z4);
            int i3 = 0;
            while (true) {
                int i4 = this.f112808d;
                if (i3 >= i4) {
                    break;
                }
                bxbm.m122544b(dArr4[i2][i3].length == i4);
                i3++;
            }
            i2++;
        }
        this.f112805a = dArr3;
        this.f112806b = dArr4;
        this.f112810f = new double[i];
        this.f112809e = new double[i];
        for (int i5 = 0; i5 < this.f112807c; i5++) {
            double[] dArr5 = this.f112809e;
            double[][] dArr6 = dArr4[i5];
            int length2 = dArr6.length;
            int[] iArr = new int[2];
            iArr[1] = length2;
            iArr[0] = length2;
            double[][] dArr7 = (double[][]) Array.newInstance(double.class, iArr);
            int i6 = 0;
            while (true) {
                d = 0.0d;
                if (i6 < length2) {
                    int i7 = 0;
                    while (true) {
                        if (i7 > i6) {
                            break;
                        }
                        double d4 = dArr6[i6][i7];
                        double d5 = 0.0d;
                        for (int i8 = 0; i8 < i7; i8++) {
                            d5 += dArr7[i6][i8] * dArr7[i7][i8];
                        }
                        if (i6 == i7) {
                            if (d4 < d5) {
                                dArr7 = null;
                                break;
                            }
                            d3 = Math.sqrt(d4 - d5);
                        } else {
                            d3 = (d4 - d5) / dArr7[i7][i7];
                        }
                        dArr7[i6][i7] = d3;
                        i7++;
                    }
                } else {
                    break;
                }
                i6++;
            }
            if (dArr7 != null) {
                for (int i9 = 0; i9 < dArr7.length; i9++) {
                    d += Math.log(dArr7[i9][i9]);
                }
                d2 = d + d;
            } else {
                d2 = Double.NaN;
            }
            double log = Math.log(6.283185307179586d);
            double length3 = (double) dArr3[i5].length;
            Double.isNaN(length3);
            dArr5[i5] = (d2 * 0.5d) - ((log * length3) * 0.5d);
        }
    }

    /* renamed from: a */
    public final double mo61190a(int i) {
        bxbm.m122544b(i < this.f112807c);
        return this.f112810f[i];
    }

    /* renamed from: a */
    public final void mo61191a() {
        for (int i = 0; i < this.f112807c; i++) {
            this.f112810f[i] = 0.0d;
        }
    }

    /* renamed from: a */
    public final void mo61192a(float[] fArr) {
        boolean z;
        float[] fArr2 = fArr;
        int length = fArr2.length;
        boolean z2 = true;
        if (length == this.f112808d) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122544b(z);
        if (length != this.f112808d) {
            z2 = false;
        }
        bxbm.m122544b(z2);
        double[] dArr = new double[this.f112807c];
        for (int i = 0; i < this.f112807c; i++) {
            double[][] dArr2 = this.f112806b[i];
            double[] dArr3 = this.f112805a[i];
            double d = 0.0d;
            for (int i2 = 0; i2 < dArr3.length; i2++) {
                for (int i3 = 0; i3 < dArr3.length; i3++) {
                    double d2 = (double) fArr2[i2];
                    double d3 = dArr3[i2];
                    Double.isNaN(d2);
                    double d4 = (double) fArr2[i3];
                    double d5 = dArr3[i3];
                    Double.isNaN(d4);
                    d += (d2 - d3) * dArr2[i2][i3] * (d4 - d5);
                }
            }
            dArr[i] = (d * -0.5d) + this.f112809e[i];
        }
        for (int i4 = 0; i4 < this.f112807c; i4++) {
            double[] dArr4 = this.f112810f;
            dArr4[i4] = dArr4[i4] + dArr[i4];
        }
    }
}
