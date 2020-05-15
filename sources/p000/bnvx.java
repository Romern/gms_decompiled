package p000;

/* renamed from: bnvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvx {

    /* renamed from: a */
    public static final double f132266a = ((bnvr.f132238a * 9.0d) * bnvr.f132240c);

    /* renamed from: b */
    public static final double f132267b = (bnvr.f132240c * 2.25d);

    static {
        bnvn.m110521a(1.5E-15d);
        double d = bnvr.f132238a;
    }

    /* renamed from: a */
    static double m110597a(double d, double d2, double d3, double d4, double d5) {
        return Math.abs(d2 - d) > Math.abs(d3 - d) ? d5 + (((d4 - d5) * (d - d3)) / (d2 - d3)) : d4 + (((d5 - d4) * (d - d2)) / (d3 - d2));
    }

    /* renamed from: a */
    private static final double m110598a(bnwk bnwk, bnwk bnwk2) {
        double d = bnwk.f132306h - bnwk2.f132306h;
        double d2 = bnwk.f132307i - bnwk2.f132307i;
        double d3 = bnwk.f132308j - bnwk2.f132308j;
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    @Deprecated
    /* renamed from: b */
    private static boolean m110604b(bnwk bnwk, bnwk bnwk2, bnwk bnwk3) {
        return bnwk.m110661a(bnwk2, bnwk3, bnwk) > 0.0d;
    }

    /* renamed from: a */
    public static int m110599a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3, bnwk bnwk4, bnwk bnwk5) {
        if (bnwk.mo68662c(bnwk4) && bnwk3.mo68662c(bnwk5)) {
            return 1;
        }
        if (bnwt.m110687a(bnwk, bnwk3, bnwk5, bnwk2)) {
            if (!bnwt.m110687a(bnwk5, bnwk4, bnwk, bnwk2)) {
                return !bnwk3.mo68662c(bnwk5) ? 4 : 3;
            }
            return 2;
        } else if (bnwt.m110687a(bnwk, bnwk4, bnwk5, bnwk2)) {
            return 3;
        } else {
            if (bnwt.m110687a(bnwk, bnwk4, bnwk3, bnwk2)) {
                return 5;
            }
            return 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (java.lang.Math.abs(r1.f132306h) >= java.lang.Math.abs(r1.f132307i)) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if ((((r1.f132306h < 0.0d) ^ (r1.f132307i < 0.0d)) ^ (r1.f132308j < 0.0d)) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        r3 = r1.f132306h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r3 >= 0.0d) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        r5 = -1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r2.f132225b = r5;
        r7 = r5;
        r5 = (((-r5) * r1.f132307i) - r1.f132308j) / r3;
     */
    /* renamed from: a */
    static int m110600a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3, bnwk bnwk4, bnwk bnwk5, double d, bnvl bnvl) {
        bnwk bnwk6 = bnwk2;
        bnwk bnwk7 = bnwk3;
        bnvl bnvl2 = bnvl;
        double d2 = 1.0d;
        double d3 = 1.0d - f132266a;
        double d4 = bnwk6.f132308j;
        int i = 0;
        if (d4 > 0.0d) {
            bnvl2.mo68533a(bnwk6.f132306h / d4, bnwk6.f132307i / d4);
            if (Math.max(Math.abs(bnvl2.f132224a), Math.abs(bnvl2.f132225b)) <= d3) {
                return 0;
            }
        }
        double abs = Math.abs(bnwk7.f132306h);
        double abs2 = Math.abs(bnwk7.f132307i);
        double abs3 = Math.abs(bnwk7.f132308j);
        double d5 = abs - abs2;
        if (Math.abs(d5) == abs3 ? abs >= abs2 ? abs - abs3 < abs2 : abs2 - abs3 < abs : Math.abs(d5) < abs3) {
        }
        double d6 = bnwk7.f132307i;
        if (d6 <= 0.0d) {
            d2 = -1.0d;
        }
        bnvl2.f132224a = d2;
        double d7 = (((-d2) * bnwk7.f132306h) - bnwk7.f132308j) / d6;
        double d8 = d2 * d;
        bnvl2.f132224a = d8;
        double d9 = d7 * d;
        bnvl2.f132225b = d9;
        bnwk bnwk8 = new bnwk(d8, d9, 1.0d);
        if (bnwk.m110666b(bnwk8, bnwk).mo68659a(bnwk4) < 0.0d) {
            i = 2;
        } else if (bnwk.m110666b(bnwk8, bnwk6).mo68659a(bnwk5) < 0.0d) {
            i = 1;
        }
        if (i <= 0) {
            return i;
        }
        double d10 = bnwk6.f132308j;
        if (d10 <= 0.0d) {
            return 3;
        }
        bnvl2.mo68533a(bnwk6.f132306h / d10, bnwk6.f132307i / d10);
        return i;
    }

    /* renamed from: a */
    public static bnvn m110601a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3) {
        double d;
        bmxy.m108596a(bnvr.m110551a(bnwk), "S2Point not normalized: %s", bnwk);
        bmxy.m108596a(bnvr.m110551a(bnwk2), "S2Point not normalized: %s", bnwk2);
        bmxy.m108596a(bnvr.m110551a(bnwk3), "S2Point not normalized: %s", bnwk3);
        bnwk a = bnvr.m110550a(bnwk2, bnwk3);
        if (!m110604b(a, bnwk2, bnwk) || !m110604b(bnwk, bnwk3, a)) {
            double asin = Math.asin(Math.min(1.0d, Math.sqrt(Math.min(m110598a(bnwk, bnwk2), m110598a(bnwk, bnwk3))) * 0.5d));
            d = asin + asin;
        } else {
            d = Math.asin(Math.min(1.0d, Math.abs(bnwk.mo68659a(a)) / a.mo68658a()));
        }
        return bnvn.m110521a(d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.scalb(double, int):double}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.Math.scalb(float, int):float}
      ClspMth{java.lang.Math.scalb(double, int):double} */
    /* renamed from: a */
    public static boolean m110602a(bnwk bnwk, bnwk bnwk2, int i, double d, bnvl bnvl, bnvl bnvl2) {
        bnwk bnwk3 = bnwk;
        bnwk bnwk4 = bnwk2;
        int i2 = i;
        if (bnxi.m110724a(bnwk) == i2) {
            if (bnxi.m110724a(bnwk2) == i2) {
                bnxi.m110728a(i2, bnwk3, bnvl);
                bnxi.m110728a(i2, bnwk4, bnvl2);
                return true;
            }
        }
        bnwk a = bnxi.m110726a(i2, bnvr.m110550a(bnwk, bnwk2));
        bnwk a2 = bnxi.m110726a(i2, bnwk3);
        bnwk a3 = bnxi.m110726a(i2, bnwk4);
        double d2 = d + 1.0d;
        bnwk bnwk5 = new bnwk(d2 * a.f132306h, d2 * a.f132307i, a.f132308j);
        double abs = Math.abs(bnwk5.f132306h);
        double abs2 = Math.abs(bnwk5.f132307i);
        double abs3 = Math.abs(bnwk5.f132308j);
        if (abs2 >= abs3 - abs && abs >= abs3 - abs2) {
            if (Math.max(Math.abs(a.f132306h), Math.max(Math.abs(a.f132307i), Math.abs(a.f132308j))) < Math.scalb(1.0d, -511)) {
                a = bnwk.m110663a(a, Math.scalb(1.0d, 563));
            }
            bnwk b = bnwk.m110665b(a);
            bnwk c = bnwk.m110667c(b, a2);
            bnwk c2 = bnwk.m110667c(a3, b);
            if (m110600a(a3, a2, new bnwk(-bnwk5.f132306h, -bnwk5.f132307i, -bnwk5.f132308j), c2, c, d2, bnvl) + m110600a(a2, a3, bnwk5, c, c2, d2, bnvl2) < 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m110603a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3, bnwk bnwk4) {
        if (!bnwk.mo68662c(bnwk2) && !bnwk3.mo68662c(bnwk4)) {
            if (bnwk.mo68662c(bnwk4)) {
                return bnwt.m110687a(bnvr.m110552b(bnwk), bnwk3, bnwk2, bnwk);
            }
            if (bnwk2.mo68662c(bnwk3)) {
                return bnwt.m110687a(bnvr.m110552b(bnwk2), bnwk4, bnwk, bnwk2);
            }
            if (bnwk.mo68662c(bnwk3)) {
                return bnwt.m110687a(bnvr.m110552b(bnwk), bnwk4, bnwk2, bnwk);
            }
            if (bnwk2.mo68662c(bnwk4)) {
                return bnwt.m110687a(bnvr.m110552b(bnwk2), bnwk3, bnwk, bnwk2);
            }
        }
        return false;
    }
}
