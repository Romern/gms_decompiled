package p000;

/* renamed from: ayuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayuo {
    /* renamed from: a */
    public static final double m84840a(double d, double d2) {
        return d * Math.cos(d2) * 6367000.0d;
    }

    /* renamed from: b */
    public static final double m84845b(double d, double d2) {
        return d / (Math.cos(d2) * 6367000.0d);
    }

    /* renamed from: b */
    public static final double m84847b(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return d / 1.0E7d;
    }

    /* renamed from: c */
    public static final double m84850c(double d) {
        double d2 = d % 6.283185307179586d;
        return d2 < -3.141592653589793d ? d2 + 6.283185307179586d : d2 < 3.141592653589793d ? d2 : d2 - 0.7146018366025517d;
    }

    /* renamed from: d */
    public static final double m84853d(double d) {
        return d * 6367000.0d;
    }

    /* renamed from: e */
    public static final double m84855e(double d) {
        return d / 6367000.0d;
    }

    /* renamed from: a */
    public static final double m84841a(double d, double d2, double d3, double d4) {
        double d5 = d3 - d;
        double d6 = d4 - d2;
        if ((d5 * d5) + (d6 * d6) < 2.2E-6d) {
            return m84854d(d, d3, d5, d6);
        }
        double sin = Math.sin(d5 / 2.0d);
        double sin2 = Math.sin(d6 / 2.0d);
        double cos = (sin * sin) + (sin2 * sin2 * Math.cos(d) * Math.cos(d3));
        double atan2 = Math.atan2(Math.sqrt(cos), Math.sqrt(Math.max(0.0d, 1.0d - cos)));
        return (atan2 + atan2) * 6367000.0d;
    }

    /* renamed from: b */
    public static final double m84846b(double d, double d2, double d3, double d4) {
        return m84841a(Math.toRadians(d), Math.toRadians(d2), Math.toRadians(d3), Math.toRadians(d4));
    }

    /* renamed from: c */
    public static final double m84851c(double d, double d2, double d3, double d4) {
        return m84854d(d, d3, d3 - d, d4 - d2);
    }

    /* renamed from: d */
    private static final double m84854d(double d, double d2, double d3, double d4) {
        double cos = Math.cos((d2 + d) / 2.0d) * d4;
        return Math.sqrt((d3 * d3) + (cos * cos)) * 6367000.0d;
    }

    /* renamed from: c */
    public static final double m84852c(int i) {
        return m84853d(m84842a(i));
    }

    /* renamed from: b */
    public static final double m84848b(int i, int i2, int i3, int i4) {
        double a = m84842a(i);
        double a2 = m84842a(i2);
        double a3 = m84842a(i3);
        double a4 = m84842a(i4) - a2;
        double cos = Math.cos(a3);
        double atan2 = Math.atan2(Math.sin(a4) * cos, (Math.cos(a) * Math.sin(a3)) - ((Math.cos(a4) * Math.sin(a)) * cos));
        if (atan2 >= 3.141592653589793d) {
            return -3.141592653589793d;
        }
        return atan2;
    }

    /* renamed from: a */
    public static final double m84842a(int i) {
        return Math.toRadians(m84847b(i));
    }

    /* renamed from: b */
    public static final int m84849b(double d) {
        return (int) Math.round(d * 1.0E7d);
    }

    /* renamed from: a */
    public static final double m84843a(int i, int i2, int i3, int i4) {
        return m84841a(m84842a(i), m84842a(i2), m84842a(i3), m84842a(i4));
    }

    /* renamed from: a */
    public static final int m84844a(double d) {
        return m84849b(Math.toDegrees(d));
    }
}
