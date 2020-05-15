package p000;

import java.util.Arrays;

/* renamed from: bsfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfw {
    /* renamed from: a */
    public static double m115712a(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        return d;
    }

    /* renamed from: b */
    public static void m115713b(double[] dArr) {
        double a = m115712a(dArr);
        if (a >= 1.0E-100d) {
            double d = 1.0d / a;
            for (int i = 0; i < dArr.length; i++) {
                dArr[i] = dArr[i] * d;
            }
            return;
        }
        m115714c(dArr);
    }

    /* renamed from: c */
    public static void m115714c(double[] dArr) {
        int length;
        if (dArr != null && (length = dArr.length) > 0) {
            double d = (double) length;
            Double.isNaN(d);
            Arrays.fill(dArr, 1.0d / d);
        }
    }
}
