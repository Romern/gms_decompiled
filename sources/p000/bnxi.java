package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* renamed from: bnxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bnxi {
    S2_LINEAR_PROJECTION(4.0d / (r1 * 3.0d), 4.0d, 1.0d, 2.0d, r11, 1.4114593458444569d, (r5 + r5) / 3.0d, 1.4400341929556038d, (r7 + r7) / 3.0d, r9 + r9, 2.0318178664188125d),
    S2_TAN_PROJECTION(9.869604401089358d / (r1 * 4.0d), 2.4674011002723395d, 1.5707963267948966d, 1.5707963267948966d, 3.141592653589793d / (r3 + r3), 1.4373186389251609d, 3.141592653589793d / (r5 + r5), 1.4616670325467394d, (r7 * 3.141592653589793d) / 3.0d, r9 * 3.141592653589793d, 2.0636231971956356d),
    S2_QUADRATIC_PROJECTION((r2 * 8.0d) / 9.0d, 2.6357992569631614d, 1.3333333333333333d, 1.7048971791992185d, (r6 + r6) / 3.0d, 1.4345236728860995d, (r8 + r8) / 3.0d, 1.4592137463861061d, (Math.sqrt(2.0d) * 8.0d) / 9.0d, 2.438654594434021d, 2.0604227389984717d);
    

    /* renamed from: e */
    public static final bnxi f132328e = S2_QUADRATIC_PROJECTION;

    /* renamed from: f */
    private static final bnxg[] f132329f = {new bnxa(), new bnxb(), new bnxc(), new bnxd(), new bnxe(), new bnxf()};

    /* renamed from: g */
    private static final bnxh[] f132330g = {new bnwu(), new bnwv(), new bnww(), new bnwx(), new bnwy(), new bnwz()};

    /* renamed from: d */
    public final bnvq f132332d;

    static {
        Math.sqrt(3.0d);
        Math.sqrt(0.6666666666666666d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(0.6666666666666666d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        bnwk[][] bnwkArr = {new bnwk[]{bnwk.f132302d, bnwk.f132304f, bnwk.f132300b}, new bnwk[]{bnwk.f132301c, bnwk.f132304f, bnwk.f132302d}, new bnwk[]{bnwk.f132301c, bnwk.f132303e, bnwk.f132304f}, new bnwk[]{bnwk.f132305g, bnwk.f132303e, bnwk.f132301c}, new bnwk[]{bnwk.f132305g, bnwk.f132300b, bnwk.f132303e}, new bnwk[]{bnwk.f132302d, bnwk.f132300b, bnwk.f132305g}};
    }

    private bnxi(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        Math.sqrt(3.0d);
        new bnvq(2, d);
        new bnvq(2, d2);
        new bnvq(2, 2.0943951023931953d);
        new bnvq(1, d3);
        new bnvq(1, d4);
        new bnvq(1, 1.5707963267948966d);
        new bnvq(1, d5);
        new bnvq(1, d4);
        new bnvq(1, d6);
        new bnvq(1, d7);
        new bnvq(1, d4);
        this.f132332d = new bnvq(1, d8);
        new bnvq(1, d9);
        new bnvq(1, d10);
        new bnvq(1, d11);
    }

    /* renamed from: a */
    public static double m110723a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d * 4.6566128730773926E-10d;
    }

    /* renamed from: b */
    public static int m110729b(double d) {
        return Math.max(0, Math.min(1073741823, (int) Math.round((d * 1.073741824E9d) - 8.0d)));
    }

    /* renamed from: c */
    public final double mo68689c(double d) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            throw null;
        } else if (ordinal == 1) {
            throw null;
        } else if (ordinal != 2) {
            throw null;
        } else if (d < 0.0d) {
            return 1.0d - (Math.sqrt(1.0d - (d * 3.0d)) * 0.5d);
        } else {
            return Math.sqrt((d * 3.0d) + 1.0d) * 0.5d;
        }
    }

    /* renamed from: a */
    public static int m110724a(bnwk bnwk) {
        double d = bnwk.f132306h;
        double d2 = bnwk.f132307i;
        double d3 = bnwk.f132308j;
        int a = bnwk.m110662a(d, d2, d3);
        return a != 0 ? a != 1 ? d3 >= 0.0d ? 2 : 5 : d2 >= 0.0d ? 1 : 4 : d >= 0.0d ? 0 : 3;
    }

    /* renamed from: a */
    public static bnwk m110725a(int i, double d, double d2) {
        bnxh bnxh = f132330g[Math.min(5, i)];
        return new bnwk(bnxh.mo68681a(d, d2), bnxh.mo68682b(d, d2), bnxh.mo68683c(d, d2));
    }

    /* renamed from: a */
    public static bnwk m110726a(int i, bnwk bnwk) {
        int i2 = i;
        bnwk bnwk2 = bnwk;
        if (i2 == 0) {
            return new bnwk(bnwk2.f132307i, bnwk2.f132308j, bnwk2.f132306h);
        }
        if (i2 == 1) {
            return new bnwk(-bnwk2.f132306h, bnwk2.f132308j, bnwk2.f132307i);
        }
        if (i2 == 2) {
            return new bnwk(-bnwk2.f132306h, -bnwk2.f132307i, bnwk2.f132308j);
        }
        if (i2 != 3) {
            return i2 != 4 ? new bnwk(bnwk2.f132307i, bnwk2.f132306h, -bnwk2.f132308j) : new bnwk(-bnwk2.f132308j, bnwk2.f132306h, -bnwk2.f132307i);
        }
        return new bnwk(-bnwk2.f132308j, -bnwk2.f132307i, -bnwk2.f132306h);
    }

    /* renamed from: a */
    public static bnxg m110727a(int i) {
        return f132329f[i];
    }

    /* renamed from: a */
    static void m110728a(int i, bnwk bnwk, bnvl bnvl) {
        bnxg a = m110727a(i);
        bnvl.mo68533a(a.mo68684a(bnwk.f132306h, bnwk.f132307i, bnwk.f132308j), a.mo68685b(bnwk.f132306h, bnwk.f132307i, bnwk.f132308j));
    }

    /* renamed from: a */
    public final double mo68686a(double d) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return (d + d) - 4.0d;
        }
        if (ordinal == 1) {
            double tan = Math.tan((d * 1.5707963267948966d) - 5.716814692820414d);
            return tan + (1.1102230246251565E-16d * tan);
        } else if (ordinal != 2) {
            throw null;
        } else if (d >= 0.5d) {
            return (((4.0d * d) * d) - 4.0d) * 0.3333333333333333d;
        } else {
            double d2 = 1.0d - d;
            return (1.0d - ((4.0d * d2) * d2)) * 0.3333333333333333d;
        }
    }

    /* renamed from: a */
    public final double mo68687a(int i, int i2) {
        double d = (double) (i & (-i2));
        Double.isNaN(d);
        return mo68686a(d * 9.313225746154785E-10d);
    }

    /* renamed from: a */
    public final bnwk mo68688a(int i, long j, long j2) {
        return m110725a(i, mo68686a(m110723a(j)), mo68686a(m110723a(j2)));
    }
}
