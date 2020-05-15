package p000;

/* renamed from: bezc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezc {

    /* renamed from: a */
    private static final double f113113a = Math.log(12.533141373154999d);

    /* renamed from: b */
    private static final double f113114b = Math.log(12.533141373154999d);

    /* renamed from: a */
    public static double m96112a(double d, double d2) {
        boolean z;
        boolean z2 = true;
        if (d < 0.0d || d > 1.0d) {
            z = false;
        } else {
            z = true;
        }
        bmxy.m108588a(z);
        if (d2 < 0.0d || !bqci.m112571b(d2)) {
            z2 = false;
        }
        bmxy.m108588a(z2);
        if (m96113a(-1.0d + d)) {
            return m96114b(d2, 38.0d) - f113113a;
        }
        if (m96113a(d)) {
            return m96114b(d2, 26.0d) - f113114b;
        }
        return Math.log(((Math.exp(m96114b(d2, 38.0d)) / 12.533141373154999d) * d) + ((Math.exp(m96114b(d2, 26.0d)) / 12.533141373154999d) * (1.0d - d)));
    }

    /* renamed from: b */
    private static double m96114b(double d, double d2) {
        double d3 = d - d2;
        return (-(d3 * d3)) / 50.0d;
    }

    /* renamed from: a */
    private static boolean m96113a(double d) {
        return Math.abs(d) < 9.999999747378752E-6d;
    }
}
