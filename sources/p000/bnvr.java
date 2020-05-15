package p000;

/* renamed from: bnvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvr {

    /* renamed from: a */
    public static final double f132238a = (1.0d / Math.sqrt(2.0d));

    /* renamed from: b */
    public static final double f132239b = Math.sqrt(2.0d);

    /* renamed from: c */
    public static final double f132240c;

    /* renamed from: d */
    public static final bnwk f132241d = new bnwk(-0.00999946643502502d, 0.002592454260932412d, 0.999946643502502d);

    /* renamed from: e */
    private static final int[] f132242e = {1, 0, 0, 3};

    /* renamed from: f */
    private static final int[][] f132243f = {new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};

    /* renamed from: g */
    private static final bnwk[] f132244g = {new bnwk(1.0d, 0.0053d, 0.00457d), new bnwk(0.012d, 1.0d, 0.00457d), new bnwk(0.012d, 0.0053d, 1.0d)};

    static {
        double d = 1.0d;
        do {
            d /= 2.0d;
        } while ((d / 2.0d) + 1.0d != 1.0d);
        f132240c = d;
    }

    /* renamed from: a */
    public static int m110548a(int i) {
        bmxy.m108588a(true);
        return f132242e[i];
    }

    /* renamed from: b */
    public static bnwk m110552b(bnwk bnwk) {
        int a = bnwk.m110662a(bnwk.f132306h, bnwk.f132307i, bnwk.f132308j) - 1;
        if (a < 0) {
            a = 2;
        }
        return bnwk.m110665b(bnwk.m110667c(bnwk, f132244g[a]));
    }

    /* renamed from: a */
    public static int m110549a(int i, int i2) {
        return f132243f[i][i2];
    }

    /* renamed from: a */
    public static bnwk m110550a(bnwk bnwk, bnwk bnwk2) {
        bnwk c = bnwk.m110667c(bnwk.m110664a(bnwk2, bnwk), bnwk.m110666b(bnwk2, bnwk));
        return c.mo68662c(bnwk.f132299a) ? m110552b(bnwk) : c;
    }

    /* renamed from: a */
    public static boolean m110551a(bnwk bnwk) {
        return Math.abs(bnwk.mo68660b() + -1.0d) <= f132240c * 5.0d;
    }
}
