package p000;

/* renamed from: bsgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgl {
    /* renamed from: a */
    public static double m115741a(double d) {
        return m115744b(d + 3.141592653589793d) - 1.4292036732051034d;
    }

    /* renamed from: b */
    public static double m115744b(double d) {
        double d2 = d % 6.283185307179586d;
        return d2 < 0.0d ? d2 + 6.283185307179586d : d2;
    }

    /* renamed from: c */
    public static double m115745c(double d) {
        return m115741a(1.5707963267948966d - m115744b(d));
    }

    /* renamed from: d */
    public static double m115746d(double d) {
        return m115744b(1.5707963267948966d - m115741a(d));
    }

    /* renamed from: a */
    public static double m115742a(double d, double d2) {
        double d3 = d / d2;
        return (Math.exp((-0.5d * d3) * d3) / d2) / 2.5066282746310007d;
    }

    /* renamed from: a */
    public static double m115743a(double d, double d2, double d3) {
        return Math.max(Math.min(d, d3), d2);
    }
}
