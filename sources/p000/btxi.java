package p000;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

/* renamed from: btxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxi {

    /* renamed from: a */
    private static final double f152802a = (-Math.log10(1.0E-11d));

    /* renamed from: b */
    private static final double[][] f152803b;

    /* renamed from: c */
    private static final double[][] f152804c;

    /* renamed from: d */
    private static final long f152805d = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: e */
    private static final long f152806e = TimeUnit.MINUTES.toMillis(5);

    static {
        int length = btxf.f152796b.length;
        int[] iArr = new int[2];
        iArr[1] = btxf.f152796b.length;
        iArr[0] = length;
        f152803b = (double[][]) Array.newInstance(double.class, iArr);
        int length2 = btxf.f152796b.length;
        int[] iArr2 = new int[2];
        iArr2[1] = btxf.f152796b.length;
        iArr2[0] = length2;
        f152804c = (double[][]) Array.newInstance(double.class, iArr2);
        int[] iArr3 = btxf.f152796b;
        for (int i : iArr3) {
            int[] iArr4 = btxf.f152796b;
            for (int i2 : iArr4) {
                f152803b[i][i2] = 1.0E-4d;
                f152804c[i][i2] = 1.0E-4d;
            }
        }
        m118981a(0, 1);
        m118981a(2, 3);
        m118983b(0, 1);
        m118983b(1, 0);
        m118983b(2, 3);
        m118983b(3, 2);
        double[][] dArr = f152803b;
        dArr[4][0] = 0.05d;
        dArr[4][3] = 0.001d;
        dArr[4][2] = 0.01d;
        dArr[4][4] = 0.7d;
        dArr[4][5] = 0.15d;
        dArr[4][6] = 0.15d;
        dArr[4][7] = 0.1d;
        dArr[5][0] = 0.05d;
        dArr[5][3] = 0.001d;
        dArr[5][2] = 0.01d;
        dArr[5][4] = 0.2d;
        dArr[5][5] = 0.6d;
        dArr[5][6] = 0.2d;
        dArr[5][7] = 0.1d;
        dArr[6][0] = 0.02d;
        dArr[6][3] = 0.001d;
        dArr[6][2] = 0.01d;
        dArr[6][4] = 0.15d;
        dArr[6][5] = 0.1d;
        dArr[6][6] = 0.7d;
        dArr[6][7] = 0.05d;
        dArr[7][0] = 0.005d;
        dArr[7][3] = 0.001d;
        dArr[7][2] = 0.003d;
        dArr[7][4] = 0.15d;
        dArr[7][5] = 0.1d;
        dArr[7][6] = 0.25d;
        dArr[7][7] = 0.5d;
        int[] iArr5 = btxf.f152796b;
        for (int i3 : iArr5) {
            if (!btxf.m118978a(i3)) {
                int[] iArr6 = btxf.f152796b;
                for (int i4 : iArr6) {
                    if (i3 != i4) {
                        f152804c[i3][i4] = f152803b[i3][i4] + 0.1d;
                    } else {
                        f152804c[i3][i4] = f152803b[i3][i4];
                    }
                }
            }
        }
        m118982a(f152803b);
        m118982a(f152804c);
    }

    /* renamed from: a */
    public static double m118980a(int i, int i2, boolean z, long j) {
        if (z) {
            return f152804c[i][i2];
        }
        return (i2 == i && ((i == 1 && j > f152805d) || (i == 3 && j > f152806e))) ? f152802a : f152803b[i][i2];
    }

    /* renamed from: b */
    private static void m118983b(int i, int i2) {
        double[][] dArr = f152804c;
        dArr[i][i] = 0.8d;
        int i3 = 3;
        if (i == 1 || i == 3) {
            f152804c[i][i2] = 0.8d;
        } else {
            dArr[i][i2] = 0.2d;
        }
        if (i == 0 || i == 1) {
            double[][] dArr2 = f152804c;
            dArr2[i][2] = 0.002d;
            dArr2[i][3] = 0.002d;
        } else {
            if (i == 2) {
                i3 = i;
            }
            double[][] dArr3 = f152804c;
            dArr3[i3][0] = 0.002d;
            dArr3[i3][1] = 0.002d;
        }
        double[][] dArr4 = f152804c;
        dArr4[i][4] = 0.25d;
        dArr4[i][5] = 0.04d;
        dArr4[i][6] = 0.2d;
        dArr4[i][7] = 0.02d;
    }

    /* renamed from: a */
    private static void m118981a(int i, int i2) {
        double[][] dArr = f152803b;
        dArr[i][i] = 0.8d;
        dArr[i][i2] = 0.2d;
        dArr[i][4] = 0.001d;
        dArr[i][5] = 0.001d;
        dArr[i2][i2] = 0.8d;
        dArr[i2][i] = 0.8d;
        dArr[i2][4] = 0.001d;
        dArr[i2][5] = 0.001d;
    }

    /* renamed from: a */
    private static void m118982a(double[][] dArr) {
        int[] iArr = btxf.f152796b;
        for (int i : iArr) {
            double d = 0.0d;
            for (double d2 : dArr[i]) {
                d += d2;
            }
            int[] iArr2 = btxf.f152796b;
            for (int i2 : iArr2) {
                double[] dArr2 = dArr[i];
                dArr2[i2] = -Math.log10(dArr2[i2] / d);
            }
        }
    }
}
