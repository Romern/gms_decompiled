package p000;

/* renamed from: buns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buns {

    /* renamed from: a */
    public final bunu f154398a = new bunu();

    /* renamed from: b */
    private final bunu f154399b = new bunu();

    /* renamed from: c */
    private final bunu f154400c = new bunu();

    /* renamed from: d */
    private final bunu f154401d = new bunu();

    /* renamed from: e */
    private final bunu f154402e = new bunu();

    /* renamed from: f */
    private final bunu f154403f = new bunu();

    /* renamed from: g */
    private final bunq f154404g = new bunq();

    /* renamed from: h */
    private final bunq f154405h = new bunq();

    /* renamed from: i */
    private final bunu f154406i = new bunu();

    /* renamed from: a */
    private static final void m120089a(bunu bunu, double d, double d2, bunq bunq) {
        double d3 = bunu.f154410a;
        double d4 = d3 * d3;
        double d5 = bunu.f154411b;
        double d6 = d5 * d5;
        double d7 = bunu.f154412c;
        double d8 = d7 * d7;
        bunq.mo72906a(0, 0, 1.0d - ((d6 + d8) * d2));
        bunq.mo72906a(1, 1, 1.0d - ((d8 + d4) * d2));
        bunq.mo72906a(2, 2, 1.0d - ((d4 + d6) * d2));
        double d9 = bunu.f154412c * d;
        double d10 = bunu.f154410a * bunu.f154411b * d2;
        bunq.mo72906a(0, 1, d10 - d9);
        bunq.mo72906a(1, 0, d10 + d9);
        double d11 = bunu.f154411b * d;
        double d12 = bunu.f154410a * bunu.f154412c * d2;
        bunq.mo72906a(0, 2, d12 + d11);
        bunq.mo72906a(2, 0, d12 - d11);
        double d13 = bunu.f154410a * d;
        double d14 = bunu.f154411b * bunu.f154412c * d2;
        bunq.mo72906a(1, 2, d14 - d13);
        bunq.mo72906a(2, 1, d14 + d13);
    }

    /* renamed from: a */
    public static final void m120090a(bunu bunu, bunq bunq) {
        double d;
        double d2;
        double a = bunu.m120095a(bunu, bunu);
        double sqrt = Math.sqrt(a);
        if (a < 1.0E-8d) {
            d = 0.5d;
            d2 = 1.0d - (a * 0.1666666716337204d);
        } else if (a >= 1.0E-6d) {
            double d3 = 1.0d / sqrt;
            double sin = Math.sin(sqrt) * d3;
            double cos = (1.0d - Math.cos(sqrt)) * d3 * d3;
            d2 = sin;
            d = cos;
        } else {
            double d4 = 0.5d - (0.0416666679084301d * a);
            double d5 = a * 0.1666666716337204d;
            d = d4;
            d2 = 1.0d - (d5 * (1.0d - d5));
        }
        m120089a(bunu, d2, d, bunq);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r1 > r8) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* renamed from: a */
    public final void mo72912a(bunu bunu, bunu bunu2, bunq bunq) {
        int i;
        if (bunu.mo72922c() == 0.0d || bunu2.mo72922c() == 0.0d) {
            bunq.mo72909b();
            return;
        }
        this.f154401d.mo72920a(bunu);
        this.f154402e.mo72920a(bunu2);
        this.f154401d.mo72921b();
        this.f154402e.mo72921b();
        bunu.m120096a(this.f154401d, this.f154402e, this.f154400c);
        int i2 = 0;
        int i3 = 2;
        if (this.f154400c.mo72922c() >= 1.0E-10d) {
            this.f154400c.mo72921b();
            bunq bunq2 = this.f154404g;
            bunq2.mo72907a(0, this.f154401d);
            bunq2.mo72907a(1, this.f154400c);
            bunu.m120096a(this.f154400c, this.f154401d, this.f154399b);
            bunq2.mo72907a(2, this.f154399b);
            bunq bunq3 = this.f154405h;
            bunq3.mo72907a(0, this.f154402e);
            bunq3.mo72907a(1, this.f154400c);
            bunu.m120096a(this.f154400c, this.f154402e, this.f154399b);
            bunq3.mo72907a(2, this.f154399b);
            double[] dArr = bunq2.f154393a;
            double d = dArr[1];
            dArr[1] = dArr[3];
            dArr[3] = d;
            double d2 = dArr[2];
            dArr[2] = dArr[6];
            dArr[6] = d2;
            double d3 = dArr[5];
            dArr[5] = dArr[7];
            dArr[7] = d3;
            bunq.m120077b(bunq3, bunq2, bunq);
        } else if (bunu.m120095a(this.f154401d, this.f154402e) >= 0.0d) {
            bunq.mo72909b();
        } else {
            bunu bunu3 = this.f154403f;
            double abs = Math.abs(bunu.f154410a);
            double abs2 = Math.abs(bunu.f154411b);
            double abs3 = Math.abs(bunu.f154412c);
            if (abs <= abs2) {
                if (abs2 > abs3) {
                    i2 = 1;
                    i = i2 - 1;
                    if (i >= 0) {
                        i3 = i;
                    }
                    bunu3.mo72916a();
                    bunu3.mo72919a(i3, 1.0d);
                    bunu.m120096a(bunu, bunu3, bunu3);
                    bunu3.mo72921b();
                    this.f154406i.mo72920a(this.f154403f);
                    bunu bunu4 = this.f154406i;
                    bunu4.mo72917a(3.141592653589793d / bunu4.mo72922c());
                    m120089a(this.f154406i, 0.0d, 0.20264236728467558d, bunq);
                }
            }
            i2 = 2;
            i = i2 - 1;
            if (i >= 0) {
            }
            bunu3.mo72916a();
            bunu3.mo72919a(i3, 1.0d);
            bunu.m120096a(bunu, bunu3, bunu3);
            bunu3.mo72921b();
            this.f154406i.mo72920a(this.f154403f);
            bunu bunu42 = this.f154406i;
            bunu42.mo72917a(3.141592653589793d / bunu42.mo72922c());
            m120089a(this.f154406i, 0.0d, 0.20264236728467558d, bunq);
        }
    }
}
