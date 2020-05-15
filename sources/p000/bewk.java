package p000;

/* renamed from: bewk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bewk {
    /* renamed from: a */
    public static double m95991a(double d, double d2) {
        double max = Math.max(d, d2);
        if (max > -1.0E20d) {
            return max + Math.log(Math.exp(d - max) + Math.exp(d2 - max));
        }
        return -1.0E20d;
    }

    /* renamed from: b */
    public static double m95992b(double d, double d2) {
        if (d < d2) {
            return Double.NaN;
        }
        if (d2 <= -1.0E20d) {
            return d;
        }
        if (d != d2) {
            return d + Math.log(1.0d - Math.exp(d2 - d));
        }
        return -1.0E20d;
    }
}
