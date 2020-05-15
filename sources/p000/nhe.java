package p000;

/* renamed from: nhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nhe {
    /* renamed from: a */
    public static int m26251a(double d) {
        if (d < 0.0d) {
            return -1;
        }
        if (d > 0.5d) {
            return d > 2.0d ? 2 : 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m26253a(int i, int i2) {
        return (i2 + 41) - i;
    }

    /* renamed from: b */
    public static double m26254b(int i, int i2) {
        double d = (double) (i2 - i);
        Double.isNaN(d);
        return Math.pow(10.0d, d / 20.0d);
    }

    /* renamed from: a */
    public static int m26252a(double d, int i) {
        if (d == 0.0d) {
            return i + 41;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return (int) (d2 - (Math.log10(d) * 20.0d));
    }
}
