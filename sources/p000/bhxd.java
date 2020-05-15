package p000;

/* renamed from: bhxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxd {
    /* renamed from: a */
    static double m101689a(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        return d;
    }

    /* renamed from: a */
    static float m101691a(int i) {
        return i != 2 ? 1.0f : 0.1f;
    }

    /* renamed from: a */
    public static double m101690a(bhxf bhxf, bhuh bhuh, int i) {
        float f;
        float a = m101691a(i);
        float f2 = bhxf.f119798a;
        float f3 = a + f2;
        if (f3 > 15.0f) {
            f = (15.0f - a) / f2;
            f3 = 15.0f;
        } else {
            f = 1.0f;
        }
        bhuh a2 = bhuh.m101544a(bhuh.m101547b(bhuh, bhxf.f119800c), (double) a);
        double d = (double) f3;
        bhuh b = bhuh.m101546b(bhuh.m101545a(bhuh.m101544a(bhxf.f119802e, (double) f), bhuh.m101548c(a2, bhuh.m101547b(bhuh, bhuh.m101545a(bhxf.f119800c, bhuh.m101546b(a2, d))))), d);
        return Math.sqrt(m101689a(b.f119637a) + m101689a(b.f119638b) + m101689a(b.f119639c));
    }
}
