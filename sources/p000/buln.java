package p000;

/* renamed from: buln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buln implements buko {
    /* renamed from: a */
    public static double m119886a(double d, double d2, double d3) {
        return d - ((d2 * 8.686d) * Math.log(d3 + 1.0d));
    }

    /* renamed from: a */
    static double m119887a(double d, double d2, double d3, double d4) {
        double max = Math.max(d2, 0.1d);
        double a = m119886a(d, d2, d3);
        double a2 = m119886a(d - (((d + 75.0d) * (d2 - 2.4d)) / max), 1.8d, d3);
        double exp = 1.0d / (Math.exp((-(d4 + 75.0d)) / 5.0d) + 1.0d);
        double exp2 = (Math.exp((d4 + 54.0d) * 0.067d) * (((a * exp) + ((1.0d - exp) * a2)) - d4)) / 8.5d;
        return -(Math.log((((exp2 * exp2) / 2.0d) / 0.81d) + 1.0d) * 0.81d);
    }

    /* renamed from: a */
    public final double mo72791a(double d, double d2, buje buje) {
        double a = m119887a((double) buje.f154010c, (double) buje.f154011d, ayuo.m84841a(d, d2, buje.f154017j, buje.f154018k), (double) buje.f154013f);
        double a2 = (double) ((float) m119887a((double) buje.f154010c, (double) buje.f154011d, 100.0d, (double) buje.f154013f));
        Double.isNaN(a2);
        return a - a2;
    }
}
