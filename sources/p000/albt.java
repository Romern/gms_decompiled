package p000;

/* renamed from: albt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albt {

    /* renamed from: a */
    private static final alba f73365a = new alba();

    /* renamed from: b */
    private static final alba f73366b = new alba();

    /* renamed from: c */
    private static final alba f73367c = new alba();

    /* renamed from: d */
    private static final alba f73368d = new alba();

    /* renamed from: e */
    private static final alax f73369e = new alax();

    /* renamed from: f */
    private static final alax f73370f = new alax();

    /* renamed from: g */
    private static final alba f73371g = new alba();

    /* renamed from: a */
    public static void m60824a(alax alax, alba alba) {
        alax alax2 = alax;
        alba alba2 = alba;
        double a = (((alax2.mo40058a(0, 0) + alax2.mo40058a(1, 1)) + alax2.mo40058a(2, 2)) - 4.0d) * 0.5d;
        alba.mo40072a((alax2.mo40058a(2, 1) - alax2.mo40058a(1, 2)) / 2.0d, (alax2.mo40058a(0, 2) - alax2.mo40058a(2, 0)) / 2.0d, (alax2.mo40058a(1, 0) - alax2.mo40058a(0, 1)) / 2.0d);
        double c = alba.mo40075c();
        if (a <= 0.7071067811865476d) {
            if (a <= -0.7071067811865476d) {
                double asin = 3.141592653589793d - Math.asin(c);
                double a2 = alax2.mo40058a(0, 0) - a;
                double a3 = alax2.mo40058a(1, 1) - a;
                double a4 = alax2.mo40058a(2, 2) - a;
                double d = a2 * a2;
                double d2 = a3 * a3;
                alba alba3 = f73371g;
                if (d > d2 && d > a4 * a4) {
                    alba3.mo40072a(a2, (alax2.mo40058a(1, 0) + alax2.mo40058a(0, 1)) / 2.0d, (alax2.mo40058a(0, 2) + alax2.mo40058a(2, 0)) / 2.0d);
                } else if (d2 <= a4 * a4) {
                    alba3.mo40072a((alax2.mo40058a(0, 2) + alax2.mo40058a(2, 0)) / 2.0d, (alax2.mo40058a(2, 1) + alax2.mo40058a(1, 2)) / 2.0d, a4);
                } else {
                    alba3.mo40072a((alax2.mo40058a(1, 0) + alax2.mo40058a(0, 1)) / 2.0d, a3, (alax2.mo40058a(2, 1) + alax2.mo40058a(1, 2)) / 2.0d);
                }
                if (alba.m60776a(alba3, alba2) < 0.0d) {
                    alba3.mo40071a(-1.0d);
                }
                alba3.mo40074b();
                alba3.mo40071a(asin);
                alba2.mo40073a(alba3);
                return;
            }
            alba2.mo40071a(Math.acos(a) / c);
        } else if (c > 0.0d) {
            alba2.mo40071a(Math.asin(c) / c);
        }
    }

    /* renamed from: a */
    public static void m60825a(alba alba, alax alax) {
        double d;
        alba alba2 = alba;
        alax alax2 = alax;
        double a = alba.m60776a(alba2, alba2);
        double sqrt = Math.sqrt(a);
        double d2 = 0.5d;
        if (a < 1.0E-8d) {
            d = 1.0d - (a * 0.1666666716337204d);
        } else if (a >= 1.0E-6d) {
            double d3 = 1.0d / sqrt;
            double sin = Math.sin(sqrt) * d3;
            double cos = d3 * d3 * (1.0d - Math.cos(sqrt));
            d = sin;
            d2 = cos;
        } else {
            d2 = 0.5d - (0.0416666679084301d * a);
            double d4 = a * 0.1666666716337204d;
            d = 1.0d - (d4 * (1.0d - d4));
        }
        double d5 = alba2.f73242a;
        double d6 = d5 * d5;
        double d7 = alba2.f73243b;
        double d8 = d7 * d7;
        double d9 = alba2.f73244c;
        double d10 = d9 * d9;
        alax2.mo40062a(0, 0, 1.0d - ((d8 + d10) * d2));
        alax2.mo40062a(1, 1, 1.0d - ((d10 + d6) * d2));
        alax2.mo40062a(2, 2, 1.0d - ((d6 + d8) * d2));
        double d11 = alba2.f73244c * d;
        double d12 = alba2.f73242a * alba2.f73243b * d2;
        alax2.mo40062a(0, 1, d12 - d11);
        alax2.mo40062a(1, 0, d12 + d11);
        double d13 = alba2.f73243b * d;
        double d14 = alba2.f73242a * alba2.f73244c * d2;
        alax2.mo40062a(0, 2, d14 + d13);
        alax2.mo40062a(2, 0, d14 - d13);
        double d15 = d * alba2.f73242a;
        double d16 = d2 * alba2.f73243b * alba2.f73244c;
        alax2.mo40062a(1, 2, d16 - d15);
        alax2.mo40062a(2, 1, d16 + d15);
    }

    /* renamed from: a */
    public static void m60826a(alba alba, alba alba2, alax alax) {
        alax.mo40065b();
        alba.m60777a(alba, alba2, f73366b);
        if (f73366b.mo40075c() != 0.0d) {
            f73367c.mo40073a(alba);
            f73368d.mo40073a(alba2);
            f73366b.mo40074b();
            f73367c.mo40074b();
            f73368d.mo40074b();
            alax alax2 = f73369e;
            alax2.mo40063a(0, f73367c);
            alax2.mo40063a(1, f73366b);
            alba.m60777a(f73366b, f73367c, f73365a);
            alax2.mo40063a(2, f73365a);
            alax alax3 = f73370f;
            alax3.mo40063a(0, f73368d);
            alax3.mo40063a(1, f73366b);
            alba.m60777a(f73366b, f73368d, f73365a);
            alax3.mo40063a(2, f73365a);
            double[] dArr = alax2.f73236a;
            double d = dArr[1];
            dArr[1] = dArr[3];
            dArr[3] = d;
            double d2 = dArr[2];
            dArr[2] = dArr[6];
            dArr[6] = d2;
            double d3 = dArr[5];
            dArr[5] = dArr[7];
            dArr[7] = d3;
            alax.m60763a(alax3, alax2, alax);
        }
    }
}
