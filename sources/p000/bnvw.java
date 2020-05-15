package p000;

/* renamed from: bnvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvw {

    /* renamed from: a */
    public final bnwd f132261a = bnwd.m110619d();

    /* renamed from: b */
    public bnwk f132262b;

    /* renamed from: c */
    public bnwc f132263c;

    /* renamed from: d */
    public final bnvp f132264d = new bnvp();

    /* renamed from: e */
    public final bnvj f132265e = new bnvj();

    /* renamed from: a */
    static bnwe m110596a(bnwe bnwe) {
        if (bnwe.mo68637i()) {
            return bnwe;
        }
        double d = 3.141592653589793d;
        double max = Math.max(0.0d, (3.141592653589793d - bnwe.f132277b.mo68570h()) - (bnvr.f132240c * 2.5d));
        bnvj bnvj = bnwe.f132276a;
        double max2 = Math.max(bnvj.f132220a, -bnvj.f132221b);
        bnvj bnvj2 = bnwe.f132276a;
        double d2 = bnvj2.f132220a + 1.5707963267948966d;
        double d3 = 1.5707963267948966d - bnvj2.f132221b;
        if (max2 >= 0.0d) {
            if (max2 + max2 + max < 1.354E-15d) {
                return bnwe.m110627d();
            }
        } else if (max < 1.5707963267948966d) {
            if (Math.max(d2, d3) * max < 1.765E-15d) {
                return bnwe.m110627d();
            }
        } else if (d2 + d3 < 1.687E-15d) {
            return bnwe.m110627d();
        }
        double d4 = bnvr.f132240c * 9.0d;
        if (max > 0.0d) {
            d = 0.0d;
        }
        return bnwe.mo68628a(bnwc.m110612a(d4, d)).mo68630f();
    }
}
