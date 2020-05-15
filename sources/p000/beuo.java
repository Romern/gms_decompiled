package p000;

import java.lang.reflect.Array;

/* renamed from: beuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beuo {

    /* renamed from: a */
    static final int f112497a = Math.round(128.0f);

    /* renamed from: a */
    private static double m95914a(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2 * d2;
        }
        return Math.sqrt(d);
    }

    /* renamed from: b */
    private static void m95916b(double[] dArr) {
        double a = m95914a(dArr);
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = dArr[i] / a;
        }
    }

    /* renamed from: a */
    public static float[] m95915a(bfku bfku) {
        char c;
        double[] dArr;
        double[][] a = bevb.m95937a(bfku, 40.0d);
        int length = a[0].length;
        int i = f112497a;
        if (length != i) {
            int[] iArr = new int[2];
            iArr[1] = i;
            iArr[0] = 3;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            int min = Math.min(a[0].length, f112497a);
            for (int i2 = 0; i2 < min; i2++) {
                System.arraycopy(a[0], 0, dArr2[0], 0, min);
                System.arraycopy(a[1], 0, dArr2[1], 0, min);
                System.arraycopy(a[2], 0, dArr2[2], 0, min);
            }
            for (int i3 = min; i3 < f112497a; i3++) {
                double[] dArr3 = dArr2[0];
                int i4 = min - 1;
                dArr3[i3] = dArr3[i4];
                double[] dArr4 = dArr2[1];
                dArr4[i3] = dArr4[i4];
                double[] dArr5 = dArr2[2];
                dArr5[i3] = dArr5[i4];
            }
            a = dArr2;
        }
        int i5 = 7;
        float[] fArr = new float[((f112497a + 2) * 7)];
        int i6 = 0;
        int i7 = 7;
        while (true) {
            double d = 0.0d;
            if (i6 >= f112497a) {
                break;
            }
            int i8 = i7 + 3;
            int i9 = i8 + 1;
            fArr[i8] = (float) a[0][i6];
            int i10 = i9 + 1;
            fArr[i9] = (float) a[1][i6];
            int i11 = i10 + 1;
            fArr[i10] = (float) a[2][i6];
            i7 = i11 + 1;
            for (double[] dArr6 : a) {
                double d2 = dArr6[i6];
                d += d2 * d2;
            }
            fArr[i11] = (float) Math.abs(Math.sqrt(d) - 0.4435453125d);
            i6++;
        }
        int length2 = a[0].length;
        double[] dArr7 = new double[3];
        for (int i12 = 0; i12 < 3; i12++) {
            dArr7[i12] = bevb.m95935a(a[i12]);
            for (int i13 = 0; i13 < length2; i13++) {
                double[] dArr8 = a[i12];
                dArr8[i13] = dArr8[i13] - dArr7[i12];
            }
        }
        if (Double.compare(m95914a(dArr7), 0.0d) == 0) {
            dArr7[2] = 1.0d;
        }
        m95916b(dArr7);
        if (Math.abs(dArr7[0]) > Math.abs(dArr7[1]) || Math.abs(dArr7[0]) > Math.abs(dArr7[2])) {
            c = Math.abs(dArr7[1]) < Math.abs(dArr7[2]) ? (char) 1 : 2;
        } else {
            c = 0;
        }
        double[] dArr9 = new double[3];
        if (c == 0) {
            dArr9[1] = dArr7[2];
            dArr9[2] = -dArr7[1];
        } else if (c != 1) {
            dArr9[0] = dArr7[1];
            dArr9[1] = -dArr7[0];
        } else {
            dArr9[0] = dArr7[2];
            dArr9[2] = -dArr7[0];
        }
        m95916b(dArr9);
        double d3 = dArr7[1];
        double d4 = dArr9[2];
        double d5 = dArr7[2];
        double d6 = dArr9[1];
        double d7 = dArr9[0];
        double d8 = dArr7[0];
        double[] dArr10 = {(d3 * d4) - (d5 * d6), (d5 * d7) - (d4 * d8), (d8 * d6) - (d3 * d7)};
        m95916b(dArr10);
        double d9 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (int i14 = 0; i14 < length2; i14++) {
            double d12 = dArr9[0];
            double[] dArr11 = a[0];
            double d13 = dArr11[i14];
            double d14 = dArr9[1];
            double[] dArr12 = a[1];
            double d15 = dArr12[i14];
            double d16 = dArr9[2];
            double[] dArr13 = a[2];
            double d17 = dArr13[i14];
            double d18 = (d12 * d13) + (d14 * d15) + (d16 * d17);
            double d19 = (dArr10[0] * d13) + (dArr10[1] * d15) + (dArr10[2] * d17);
            double d20 = dArr7[0];
            double d21 = dArr7[1];
            double d22 = dArr7[2];
            dArr11[i14] = d18;
            dArr12[i14] = d19;
            dArr13[i14] = (d20 * d13) + (d21 * d15) + (d22 * d17);
            d10 += d18 * d18;
            d9 += d18 * d19;
            d11 += d19 * d19;
        }
        if (Double.compare(d9, 0.0d) == 0) {
            dArr = new double[]{1.0d, 0.0d};
        } else {
            double d23 = (d10 + d11) * 0.5d;
            dArr = new double[]{(d23 + Math.sqrt((d23 * d23) - ((d10 * d11) - (d9 * d9)))) - d11, d9};
            m95916b(dArr);
        }
        for (int i15 = 0; i15 < length2; i15++) {
            double d24 = dArr[0];
            double[] dArr14 = a[0];
            double d25 = dArr14[i15];
            double d26 = dArr[1];
            double[] dArr15 = a[1];
            double d27 = dArr15[i15];
            dArr14[i15] = (d24 * d25) + (d26 * d27);
            dArr15[i15] = ((-d26) * d25) + (d24 * d27);
        }
        for (int i16 = 0; i16 < f112497a; i16++) {
            int i17 = i5 + 1;
            fArr[i5] = (float) a[0][i16];
            int i18 = i17 + 1;
            fArr[i17] = (float) a[1][i16];
            fArr[i18] = (float) a[2][i16];
            i5 = i18 + 5;
        }
        return fArr;
    }
}
