package p000;

/* renamed from: bezi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bezi {
    /* renamed from: a */
    protected static float m96134a(short s) {
        return (((float) s) / 5.0f) + 4715.0f;
    }

    /* renamed from: a */
    public abstract float mo61273a();

    /* renamed from: a */
    public abstract bznr mo61274a(int i);

    /* renamed from: b */
    public abstract double mo61275b();

    /* renamed from: b */
    public final double mo61286b(bnwc bnwc) {
        return (mo61281g().mo61292a(bnwc).f132225b - mo61277c()) / mo61280f();
    }

    /* renamed from: b */
    public abstract float mo61276b(int i);

    /* renamed from: c */
    public abstract double mo61277c();

    /* renamed from: c */
    public final int mo61288c(int i) {
        return i % mo61278d();
    }

    /* renamed from: d */
    public abstract int mo61278d();

    /* renamed from: d */
    public final int mo61289d(int i) {
        return i / mo61278d();
    }

    /* renamed from: e */
    public abstract int mo61279e();

    /* renamed from: f */
    public abstract double mo61280f();

    /* renamed from: g */
    public abstract bezk mo61281g();

    /* renamed from: h */
    public final int mo61290h() {
        return mo61278d() * mo61279e();
    }

    /* renamed from: i */
    public final boolean mo61291i() {
        return mo61281g() != null;
    }

    /* renamed from: a */
    public static short m96135a(float f) {
        long round = (long) Math.round((f - 9.0277195E-4f) * 5.0f);
        if (round > 32767) {
            return Short.MAX_VALUE;
        }
        if (round < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) ((int) round);
    }

    /* renamed from: b */
    public final boolean mo61287b(int i, int i2) {
        return i >= 0 && i < mo61278d() && i2 >= 0 && i2 < mo61279e();
    }

    /* renamed from: a */
    public static boolean m96136a(bznr bznr) {
        return bznr == bznr.CLUTTER_BUILDING || bznr == bznr.CLUTTER_EDGE || bznr == bznr.CLUTTER_CORNER;
    }

    /* renamed from: a */
    public final double mo61282a(bnwc bnwc) {
        return (mo61281g().mo61292a(bnwc).f132224a - mo61275b()) / mo61280f();
    }

    /* renamed from: a */
    public final int mo61283a(int i, int i2) {
        bmxy.m108584a(i, mo61278d());
        bmxy.m108584a(i2, mo61279e());
        return (i2 * mo61278d()) + i;
    }

    /* renamed from: a */
    public final bnwc mo61284a(double d, double d2) {
        return mo61281g().mo61293a(new bnvl((d * mo61280f()) + mo61275b(), (d2 * mo61280f()) + mo61277c()));
    }

    /* renamed from: a */
    public final boolean mo61285a(bnwc bnwc, int i) {
        if (mo61291i()) {
            bnvl a = mo61281g().mo61292a(bnwc);
            double b = (a.f132224a - mo61275b()) / mo61280f();
            double c = (a.f132225b - mo61277c()) / mo61280f();
            if (mo61287b((int) b, (int) c)) {
                double d = (double) mo61278d();
                Double.isNaN(d);
                double min = Math.min(d - b, b) * mo61280f();
                double e = (double) mo61279e();
                Double.isNaN(e);
                if (Math.min(min, Math.min(e - c, c) * mo61280f()) >= ((double) i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
