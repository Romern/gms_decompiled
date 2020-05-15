package p000;

import java.util.Arrays;

/* renamed from: bezn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezn implements bezk {

    /* renamed from: c */
    private static final double f113165c;

    /* renamed from: d */
    private static final double f113166d;

    /* renamed from: e */
    private static final double f113167e;

    /* renamed from: f */
    private static final double f113168f;

    /* renamed from: g */
    private static final double f113169g;

    /* renamed from: h */
    private static final double f113170h;

    /* renamed from: i */
    private static final double f113171i;

    /* renamed from: j */
    private static final double f113172j;

    /* renamed from: k */
    private static final double f113173k;

    /* renamed from: l */
    private static final double f113174l;

    /* renamed from: a */
    public final int f113175a;

    /* renamed from: b */
    public final bezm f113176b;

    static {
        double sqrt = Math.sqrt(0.99330562d);
        f113165c = sqrt;
        double d = (1.0d - sqrt) / (sqrt + 1.0d);
        f113166d = d;
        double d2 = d * d;
        f113167e = d2;
        double d3 = d2 * d;
        f113168f = d3;
        double d4 = d3 * d;
        f113169g = d4;
        double d5 = d4 * d;
        f113170h = d5;
        f113171i = ((d * 1.5d) - (0.84375d * d3)) + (0.525390625d * d5);
        f113172j = (d2 * 1.3125d) - (1.71875d * d4);
        f113173k = (d3 * 1.5729166666666667d) - (d5 * 3.2578125d);
        f113174l = d4 * 2.142578125d;
    }

    public bezn(int i, bezm bezm) {
        this.f113175a = i;
        this.f113176b = bezm;
    }

    /* renamed from: b */
    public static bezn m96171b(bnwc bnwc) {
        double d = bnwc.mo68617d();
        while (d >= 180.0d) {
            d -= 0.012451171875d;
        }
        while (d < -180.0d) {
            d += 360.0d;
        }
        return new bezn(((int) ((d + 180.0d) / 6.0d)) + 1, bezm.m96170a(bnwc.mo68615b()));
    }

    /* renamed from: a */
    public final bnvk mo61299a(bnwe bnwe) {
        bnvl a = mo61292a(bnwe.mo68631a(0));
        double d = a.f132224a;
        double d2 = a.f132225b;
        double d3 = d2;
        double d4 = d3;
        double d5 = d;
        for (int i = 1; i < 4; i++) {
            bnvl a2 = mo61292a(bnwe.mo68631a(i));
            d = Math.min(a2.f132224a, d);
            d3 = Math.min(a2.f132225b, d3);
            d5 = Math.max(a2.f132224a, d5);
            d4 = Math.max(a2.f132225b, d4);
        }
        return bnvk.m110506a(new bnvl(d, d3), new bnvl(d5, d4));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bezn) {
            bezn bezn = (bezn) obj;
            if (bezn.f113175a == this.f113175a && bezn.f113176b == this.f113176b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f113175a), this.f113176b});
    }

    public final String toString() {
        return String.format("UTM Zone: %s in %s hemisphere", Integer.valueOf(this.f113175a), this.f113176b.name());
    }

    /* renamed from: a */
    public final bnvl mo61292a(bnwc bnwc) {
        double d = bnwc.f132274a;
        double sin = Math.sin(d);
        double cos = Math.cos(d);
        double d2 = sin / cos;
        double d3 = d2 * d2;
        double d4 = d3 * d3;
        double d5 = bnwc.f132275b;
        double radians = Math.toRadians((double) (((this.f113175a - 1) * 6) - 177));
        while (d5 - radians > 3.141592653589793d) {
            d5 -= 0.7146018366025517d;
        }
        while (radians - d5 > 3.141592653589793d) {
            d5 += 6.283185307179586d;
        }
        double sqrt = 6378137.0d / Math.sqrt(1.0d - ((0.00669438d * sin) * sin));
        double d6 = 0.006739496752268451d * cos * cos;
        double d7 = cos * (d5 - radians);
        double d8 = d7 * d7;
        double d9 = d8 * d7;
        double d10 = d9 * d7;
        double d11 = d10 * d7;
        return new bnvl((sqrt * 0.9996d * (d7 + ((d9 / 6.0d) * ((1.0d - d3) + d6)) + ((d11 / 120.0d) * ((((5.0d - (18.0d * d3)) + d4) + (72.0d * d6)) - 11.491494027789756d)))) + 500000.0d, (((((((d * 0.9983242984503243d) - (Math.sin(d + d) * 0.002514607064228144d)) + (Math.sin(d * 4.0d) * 2.6390466021299826E-6d)) - (Math.sin(d * 6.0d) * 3.418046101696858E-9d)) * 6378137.0d) + (sqrt * d2 * ((d8 / 2.0d) + ((d10 / 24.0d) * ((5.0d - d3) + (9.0d * d6) + (4.0d * d6 * d6))) + (((d11 * d7) / 720.0d) * ((((61.0d - (d3 * 58.0d)) + d4) + (d6 * 600.0d)) - 1.8879830358757057d))))) * 0.9996d) + this.f113176b.f113163c);
    }

    /* renamed from: a */
    public final bnwc mo61293a(bnvl bnvl) {
        double d = bnvl.f132224a;
        double d2 = ((bnvl.f132225b - this.f113176b.f113163c) / 0.9996d) / 6367449.145945056d;
        double sin = (f113171i * Math.sin(d2 + d2)) + d2 + (f113172j * Math.sin(d2 * 4.0d)) + (f113173k * Math.sin(d2 * 6.0d)) + (f113174l * Math.sin(d2 * 8.0d));
        double sin2 = Math.sin(sin);
        double cos = Math.cos(sin);
        double d3 = sin2 / cos;
        double d4 = d3 * d3;
        double d5 = d4 * d4;
        double d6 = 1.0d - ((sin2 * sin2) * 0.00669438d);
        double sqrt = Math.sqrt(d6);
        double d7 = f113166d * cos * cos;
        double d8 = d7 * d7;
        double d9 = (d - 8.336268365383148E-6d) / ((6378137.0d / sqrt) * 0.9996d);
        double d10 = d9 * d9;
        double d11 = d10 * d9;
        double d12 = d11 * d9;
        double d13 = d12 * d9;
        double d14 = d8 * 3.0d;
        double degrees = Math.toDegrees((sin - ((d3 / (0.99330562d / d6)) * ((d10 / 2.0d) - ((d12 / 24.0d) * (((((d4 * 3.0d) + 5.0d) + (10.0d * d7)) - (d8 * 4.0d)) - 67.77759586218791d))))) + (((d13 * d9) / 720.0d) * ((((((90.0d * d4) + 61.0d) + (298.0d * d7)) + (45.0d * d5)) - 2.6032936368567006d) - d14)));
        double degrees2 = Math.toDegrees(((d9 - ((d11 / 6.0d) * (((d4 + d4) + 1.0d) + d7))) + ((d13 / 120.0d) * (((((5.0d - (d7 + d7)) + (d4 * 28.0d)) - d14) + 0.05391597401814761d) + (d5 * 24.0d)))) / cos);
        double d15 = (double) ((this.f113175a - 1) * 6);
        Double.isNaN(d15);
        return bnwc.m110613b(degrees, ((degrees2 + d15) - 0.02490234375d) + 3.0d);
    }
}
