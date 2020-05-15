package p000;

/* renamed from: bevl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevl {
    /* renamed from: a */
    public static double m95958a(double d, double d2) {
        return Math.toDegrees(Math.atan2(d, d2));
    }

    /* renamed from: a */
    public static double m95959a(double d, double d2, double d3) {
        return Math.toDegrees(Math.atan2(-d2, Math.sqrt((d * d) + (d3 * d3))));
    }

    /* renamed from: a */
    public static double m95960a(double[] dArr, int i, int i2) {
        double d = 0.0d;
        for (int i3 = i; i3 < i2; i3++) {
            d += dArr[i3];
        }
        double d2 = (double) (i2 - i);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: a */
    public static float[] m95961a(double[] dArr) {
        double d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (double d4 : dArr) {
            d2 += d4;
            d3 += d4 * d4;
        }
        int length = dArr.length;
        double d5 = (double) length;
        Double.isNaN(d5);
        double d6 = d2 / d5;
        if (length != 0) {
            Double.isNaN(d5);
            d = (d3 - (d2 * d6)) / d5;
        } else {
            d = Double.NaN;
        }
        return new float[]{(float) d6, (float) d};
    }
}
