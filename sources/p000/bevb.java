package p000;

import java.lang.reflect.Array;

/* renamed from: bevb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevb {
    /* renamed from: a */
    public static double m95934a(double d, double[] dArr) {
        double length = (double) (dArr.length - 1);
        Double.isNaN(length);
        return dArr[(int) ((d * length) + 0.5d)];
    }

    /* renamed from: b */
    public static double m95939b(double[] dArr) {
        double a = m95935a(dArr);
        return m95940c(dArr) - (a * a);
    }

    /* renamed from: c */
    public static double m95940c(double[] dArr) {
        double d = m95941d(dArr);
        double length = (double) dArr.length;
        Double.isNaN(length);
        return d / length;
    }

    /* renamed from: d */
    public static double m95941d(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2 * d2;
        }
        return d;
    }

    /* renamed from: e */
    public static double m95942e(double[] dArr) {
        int i = 4;
        double d = 0.0d;
        while (i < dArr.length) {
            double d2 = dArr[i] - dArr[i - 4];
            d += d2 * d2;
            i += 4;
        }
        double d3 = (double) ((i >> 2) - 1);
        Double.isNaN(d3);
        return d / d3;
    }

    /* renamed from: a */
    public static double m95935a(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        double length = (double) dArr.length;
        Double.isNaN(length);
        return d / length;
    }

    @Deprecated
    /* renamed from: a */
    public static void m95936a(double[] dArr, double d, double[] dArr2) {
        boolean z;
        int round = (int) Math.round(d * 128.0d);
        for (int i = 0; i < 3; i++) {
            int length = dArr.length;
            if (dArr2.length >= length + 1) {
                z = true;
            } else {
                z = false;
            }
            bxbm.m122544b(z);
            double d2 = 0.0d;
            for (int i2 = 0; i2 < length; i2++) {
                dArr2[i2] = d2;
                d2 += dArr[i2];
            }
            dArr2[length] = d2;
            for (int i3 = 0; i3 < length; i3++) {
                int max = Math.max(i3 - round, 0);
                int min = Math.min(i3 + round, length - 1);
                double d3 = dArr2[min + 1] - dArr2[max];
                double d4 = (double) ((min - max) + 1);
                Double.isNaN(d4);
                dArr[i3] = d3 / d4;
            }
        }
    }

    /* renamed from: a */
    public static double[][] m95937a(bfku bfku, double d) {
        double d2 = d * 1.0E-9d;
        double a = (double) (bfku.mo61857a(bfku.f114316b - 1) - bfku.mo61857a(0));
        Double.isNaN(a);
        int i = (int) (a * d2);
        if (i == 0) {
            i = 1;
        }
        return m95938a(bfku, d2, i);
    }

    /* renamed from: a */
    public static double[][] m95938a(bfku bfku, double d, int i) {
        int i2;
        bfku bfku2 = bfku;
        int i3 = i;
        int[] iArr = new int[2];
        iArr[1] = i3;
        int i4 = 0;
        iArr[0] = 3;
        double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
        long a = bfku2.mo61857a(0);
        int i5 = 0;
        for (int i6 = 3; i5 < i6; i6 = 3) {
            dArr[i5][i4] = (double) bfku2.mo61854a(i4, i5);
            int i7 = 1;
            int i8 = 0;
            while (i7 < i3) {
                double d2 = (double) a;
                double d3 = (double) i7;
                Double.isNaN(d3);
                Double.isNaN(d2);
                double d4 = d2 + (d3 / d);
                while (true) {
                    i2 = i8 + 1;
                    if (d4 <= ((double) bfku2.mo61857a(i2))) {
                        break;
                    }
                    i8 = i2;
                }
                long a2 = bfku2.mo61857a(i8);
                long a3 = bfku2.mo61857a(i2);
                double[] dArr2 = dArr[i5];
                double a4 = (double) bfku2.mo61854a(i8, i5);
                double d5 = (double) a3;
                Double.isNaN(d5);
                Double.isNaN(a4);
                double d6 = a4 * (d5 - d4);
                double a5 = (double) bfku2.mo61854a(i2, i5);
                double d7 = (double) a2;
                Double.isNaN(d7);
                Double.isNaN(a5);
                double d8 = d6 + (a5 * (d4 - d7));
                double d9 = (double) (a3 - a2);
                Double.isNaN(d9);
                dArr2[i7] = d8 / d9;
                i7++;
                i3 = i;
                a = a;
                i5 = i5;
                dArr = dArr;
            }
            i5++;
            i3 = i;
            i4 = 0;
        }
        return dArr;
    }
}
