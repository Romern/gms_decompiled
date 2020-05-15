package p000;

/* renamed from: buni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buni {

    /* renamed from: d */
    private static final bunu f154306d = new bunu(1.0d, 0.0d);

    /* renamed from: e */
    private static final bunu f154307e = new bunu(0.0d, 9.80665d);

    /* renamed from: A */
    private bunq f154308A;

    /* renamed from: B */
    private bunq f154309B;

    /* renamed from: C */
    private bunq f154310C;

    /* renamed from: D */
    private bunq f154311D;

    /* renamed from: E */
    private bunq f154312E;

    /* renamed from: F */
    private bunu f154313F;

    /* renamed from: G */
    private bunu f154314G;

    /* renamed from: H */
    private bunu f154315H;

    /* renamed from: I */
    private bunq f154316I;

    /* renamed from: J */
    private bunq f154317J;

    /* renamed from: K */
    private bunq f154318K;

    /* renamed from: L */
    private bunu f154319L;

    /* renamed from: M */
    private bunu f154320M;

    /* renamed from: N */
    private bunu f154321N;

    /* renamed from: O */
    private bunu f154322O;

    /* renamed from: a */
    public final float[] f154323a;

    /* renamed from: b */
    bunq f154324b;

    /* renamed from: c */
    public boolean f154325c;

    /* renamed from: f */
    private final boolean f154326f;

    /* renamed from: g */
    private bunq f154327g;

    /* renamed from: h */
    private boolean f154328h;

    /* renamed from: i */
    private bunq f154329i;

    /* renamed from: j */
    private bunq f154330j;

    /* renamed from: k */
    private bunq f154331k;

    /* renamed from: l */
    private bunq f154332l;

    /* renamed from: m */
    private bunq f154333m;

    /* renamed from: n */
    private bunq f154334n;

    /* renamed from: o */
    private bunq f154335o;

    /* renamed from: p */
    private bunu f154336p;

    /* renamed from: q */
    private final buns f154337q;

    /* renamed from: r */
    private bunu f154338r;

    /* renamed from: s */
    private bunu f154339s;

    /* renamed from: t */
    private bunq f154340t;

    /* renamed from: u */
    private long f154341u;

    /* renamed from: v */
    private float f154342v;

    /* renamed from: w */
    private boolean f154343w;

    /* renamed from: x */
    private int f154344x;

    /* renamed from: y */
    private boolean f154345y;

    /* renamed from: z */
    private bunq f154346z;

    public buni() {
        this(null);
    }

    /* renamed from: a */
    private final void m120060a(int i) {
        char c;
        int i2 = i;
        m120061a(this.f154324b, this.f154336p, i2, this.f154320M);
        for (int i3 = 0; i3 < 3; i3++) {
            this.f154315H.mo72916a();
            this.f154315H.mo72919a(i3, 1.0E-7d);
            buns.m120090a(this.f154315H, this.f154308A);
            bunq.m120077b(this.f154308A, this.f154324b, this.f154309B);
            m120061a(this.f154309B, this.f154336p, i2, this.f154321N);
            bunu bunu = this.f154320M;
            bunu bunu2 = this.f154321N;
            this.f154314G.mo72918a(bunu.f154410a - bunu2.f154410a, bunu.f154411b - bunu2.f154411b, bunu.f154412c - bunu2.f154412c);
            this.f154314G.mo72917a(1.0E7d);
            this.f154334n.mo72907a(i3, this.f154314G);
        }
        this.f154334n.mo72910b(this.f154310C);
        bunq.m120077b(this.f154329i, this.f154310C, this.f154311D);
        bunq.m120077b(this.f154334n, this.f154311D, this.f154312E);
        if (i2 == 0) {
            bunq.m120075a(this.f154312E, this.f154332l, this.f154333m);
        } else {
            bunq.m120075a(this.f154312E, this.f154331k, this.f154333m);
        }
        bunq bunq = this.f154333m;
        bunq bunq2 = this.f154310C;
        double a = ((bunq.mo72902a(0, 0) * ((bunq.mo72902a(1, 1) * bunq.mo72902a(2, 2)) - (bunq.mo72902a(2, 1) * bunq.mo72902a(1, 2)))) - (bunq.mo72902a(0, 1) * ((bunq.mo72902a(1, 0) * bunq.mo72902a(2, 2)) - (bunq.mo72902a(1, 2) * bunq.mo72902a(2, 0))))) + (bunq.mo72902a(0, 2) * ((bunq.mo72902a(1, 0) * bunq.mo72902a(2, 1)) - (bunq.mo72902a(1, 1) * bunq.mo72902a(2, 0))));
        if (a != 0.0d) {
            double d = 1.0d / a;
            double[] dArr = bunq.f154393a;
            double d2 = dArr[4];
            double d3 = dArr[8];
            double d4 = dArr[7];
            double d5 = dArr[5];
            double d6 = dArr[1];
            double d7 = dArr[2];
            double d8 = dArr[3];
            double d9 = dArr[6];
            double d10 = dArr[0];
            c = 2;
            bunq2.mo72905a(((d2 * d3) - (d4 * d5)) * d, (-((d6 * d3) - (d7 * d4))) * d, ((d6 * d5) - (d7 * d2)) * d, (-((d8 * d3) - (d5 * d9))) * d, ((d3 * d10) - (d7 * d9)) * d, (-((d5 * d10) - (d7 * d8))) * d, ((d8 * d4) - (d9 * d2)) * d, (-((d4 * d10) - (d9 * d6))) * d, d * ((d10 * d2) - (d8 * d6)));
        } else {
            c = 2;
        }
        this.f154334n.mo72910b(this.f154311D);
        bunq.m120077b(this.f154311D, this.f154310C, this.f154312E);
        bunq.m120077b(this.f154329i, this.f154312E, this.f154335o);
        bunq.m120076a(this.f154335o, this.f154320M, this.f154339s);
        bunq.m120077b(this.f154335o, this.f154334n, this.f154310C);
        this.f154311D.mo72909b();
        bunq bunq3 = this.f154311D;
        bunq bunq4 = this.f154310C;
        double[] dArr2 = bunq3.f154393a;
        double d11 = dArr2[0];
        double[] dArr3 = bunq4.f154393a;
        dArr2[0] = d11 - dArr3[0];
        dArr2[1] = dArr2[1] - dArr3[1];
        dArr2[c] = dArr2[c] - dArr3[c];
        dArr2[3] = dArr2[3] - dArr3[3];
        dArr2[4] = dArr2[4] - dArr3[4];
        dArr2[5] = dArr2[5] - dArr3[5];
        dArr2[6] = dArr2[6] - dArr3[6];
        dArr2[7] = dArr2[7] - dArr3[7];
        dArr2[8] = dArr2[8] - dArr3[8];
        bunq.m120077b(bunq3, this.f154329i, bunq4);
        this.f154329i.mo72908a(this.f154310C);
        buns.m120090a(this.f154339s, this.f154327g);
        bunq bunq5 = this.f154327g;
        bunq bunq6 = this.f154324b;
        bunq.m120077b(bunq5, bunq6, bunq6);
        m120062c();
    }

    /* renamed from: c */
    private final void m120062c() {
        this.f154327g.mo72910b(this.f154316I);
        bunq.m120077b(this.f154329i, this.f154316I, this.f154317J);
        bunq.m120077b(this.f154327g, this.f154317J, this.f154329i);
        this.f154327g.mo72909b();
    }

    /* renamed from: b */
    public final void mo72896b() {
        this.f154341u = 0;
        this.f154324b.mo72909b();
        this.f154327g.mo72909b();
        this.f154340t.mo72909b();
        this.f154329i.mo72903a();
        this.f154329i.mo72904a(1.0d);
        this.f154330j.mo72903a();
        this.f154330j.mo72904a(1.0d);
        this.f154331k.mo72903a();
        this.f154331k.mo72904a(14400.0d);
        this.f154332l.mo72903a();
        this.f154332l.mo72904a(9.0d);
        this.f154333m.mo72903a();
        this.f154334n.mo72903a();
        this.f154335o.mo72903a();
        this.f154320M.mo72916a();
        this.f154336p.mo72916a();
        this.f154338r.mo72916a();
        this.f154339s.mo72916a();
        this.f154319L.mo72916a();
        this.f154328h = false;
        this.f154325c = false;
    }

    public buni(byte[] bArr) {
        this.f154323a = new float[9];
        this.f154324b = new bunq();
        this.f154327g = new bunq();
        this.f154329i = new bunq();
        this.f154330j = new bunq();
        this.f154331k = new bunq();
        this.f154332l = new bunq();
        this.f154333m = new bunq();
        this.f154334n = new bunq();
        this.f154335o = new bunq();
        this.f154336p = new bunu();
        this.f154337q = new buns();
        this.f154338r = new bunu();
        this.f154339s = new bunu();
        this.f154340t = new bunq();
        this.f154343w = false;
        this.f154345y = true;
        this.f154346z = new bunq();
        this.f154308A = new bunq();
        this.f154309B = new bunq();
        this.f154310C = new bunq();
        this.f154311D = new bunq();
        this.f154312E = new bunq();
        this.f154313F = new bunu();
        this.f154314G = new bunu();
        this.f154315H = new bunu();
        this.f154316I = new bunq();
        this.f154317J = new bunq();
        this.f154318K = new bunq();
        this.f154319L = new bunu();
        this.f154320M = new bunu();
        this.f154321N = new bunu();
        this.f154322O = new bunu();
        this.f154326f = true;
        mo72896b();
    }

    /* renamed from: a */
    private final void m120061a(bunq bunq, bunu bunu, int i, bunu bunu2) {
        bunq bunq2 = bunq;
        bunu bunu3 = bunu;
        bunu bunu4 = bunu2;
        if (i == 0) {
            bunq.m120076a(bunq2, f154307e, this.f154319L);
            this.f154337q.mo72912a(this.f154319L, bunu3, this.f154318K);
        } else {
            bunq.m120076a(bunq2, f154306d, this.f154319L);
            this.f154337q.mo72912a(this.f154319L, bunu3, this.f154318K);
        }
        buns buns = this.f154337q;
        bunq bunq3 = this.f154318K;
        double a = (((bunq3.mo72902a(0, 0) + bunq3.mo72902a(1, 1)) + bunq3.mo72902a(2, 2)) - 4.0d) * 0.5d;
        bunu2.mo72918a((bunq3.mo72902a(2, 1) - bunq3.mo72902a(1, 2)) / 2.0d, (bunq3.mo72902a(0, 2) - bunq3.mo72902a(2, 0)) / 2.0d, (bunq3.mo72902a(1, 0) - bunq3.mo72902a(0, 1)) / 2.0d);
        double c = bunu2.mo72922c();
        if (a <= 0.7071067094802856d) {
            if (a <= -0.7071067094802856d) {
                double asin = 3.141592653589793d - Math.asin(c);
                double a2 = bunq3.mo72902a(0, 0) - a;
                double a3 = bunq3.mo72902a(1, 1) - a;
                double a4 = bunq3.mo72902a(2, 2) - a;
                bunu bunu5 = buns.f154398a;
                double d = a2 * a2;
                double d2 = a3 * a3;
                if (d > d2 && d > a4 * a4) {
                    bunu5.mo72918a(a2, (bunq3.mo72902a(1, 0) + bunq3.mo72902a(0, 1)) / 2.0d, (bunq3.mo72902a(0, 2) + bunq3.mo72902a(2, 0)) / 2.0d);
                } else if (d2 <= a4 * a4) {
                    bunu5.mo72918a((bunq3.mo72902a(0, 2) + bunq3.mo72902a(2, 0)) / 2.0d, (bunq3.mo72902a(2, 1) + bunq3.mo72902a(1, 2)) / 2.0d, a4);
                } else {
                    bunu5.mo72918a((bunq3.mo72902a(1, 0) + bunq3.mo72902a(0, 1)) / 2.0d, a3, (bunq3.mo72902a(2, 1) + bunq3.mo72902a(1, 2)) / 2.0d);
                }
                if (bunu.m120095a(bunu5, bunu4) < 0.0d) {
                    bunu5.mo72917a(-1.0d);
                }
                bunu5.mo72921b();
                bunu5.mo72917a(asin);
                bunu4.mo72920a(bunu5);
                return;
            }
            bunu4.mo72917a(Math.acos(a) / c);
        } else if (c > 0.0d) {
            bunu4.mo72917a(Math.asin(c) / c);
        }
    }

    /* renamed from: a */
    public final synchronized float mo72892a() {
        return (float) Math.abs(Math.atan2(this.f154329i.mo72902a(2, 1), this.f154329i.mo72902a(2, 0)));
    }

    /* renamed from: a */
    public final synchronized void mo72893a(float f, float f2, float f3) {
        this.f154336p.mo72918a((double) f, (double) f2, (double) f3);
        if (this.f154328h) {
            m120060a(0);
            return;
        }
        bunu bunu = this.f154336p;
        bunu.mo72920a(bunu);
        m120061a(this.f154324b, this.f154336p, 0, this.f154320M);
        buns.m120090a(this.f154320M, this.f154327g);
        bunq bunq = this.f154327g;
        bunq bunq2 = this.f154324b;
        bunq.m120077b(bunq, bunq2, bunq2);
        m120062c();
        this.f154328h = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo72894a(float f, float f2, float f3, float f4) {
        double d;
        if (this.f154328h) {
            this.f154336p.mo72918a((double) f, (double) f2, (double) f3);
            bunu bunu = this.f154336p;
            bunq bunq = this.f154324b;
            bunu bunu2 = this.f154322O;
            double[] dArr = bunq.f154393a;
            bunu2.f154410a = dArr[2];
            bunu2.f154411b = dArr[5];
            bunu2.f154412c = dArr[8];
            bunu2.mo72921b();
            bunu.m120096a(bunu, this.f154322O, this.f154313F);
            bunu.m120096a(this.f154322O, this.f154313F, bunu);
            this.f154331k.mo72903a();
            if (f4 < 60.0f) {
                d = (double) (f4 * 0.6f);
            } else {
                d = 120.0d;
            }
            this.f154331k.mo72904a(d * d);
            if (this.f154326f) {
                if (this.f154325c || !this.f154328h) {
                    m120060a(1);
                } else {
                    m120061a(this.f154324b, this.f154336p, 1, this.f154320M);
                    buns.m120090a(this.f154320M, this.f154327g);
                    bunq bunq2 = this.f154327g;
                    bunq bunq3 = this.f154324b;
                    bunq.m120077b(bunq2, bunq3, bunq3);
                    m120062c();
                    this.f154325c = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo72895a(long j, float f, float f2, float f3) {
        long j2 = j;
        synchronized (this) {
            float abs = ((float) Math.abs(j2 - this.f154341u)) * 1.0E-9f;
            if (this.f154341u != 0 && abs > 0.0f) {
                if (abs > 0.04f) {
                    abs = this.f154345y ? this.f154342v : 0.01f;
                } else if (this.f154343w) {
                    this.f154342v = (this.f154342v * 0.95f) + (0.050000012f * abs);
                    int i = this.f154344x + 1;
                    this.f154344x = i;
                    if (((float) i) > 10.0f) {
                        this.f154345y = true;
                    }
                } else {
                    this.f154342v = abs;
                    this.f154344x = 1;
                    this.f154343w = true;
                }
                float f4 = -abs;
                this.f154338r.mo72918a((double) (f * f4), (double) (f2 * f4), (double) (f4 * f3));
                buns.m120090a(this.f154338r, this.f154327g);
                bunq bunq = this.f154327g;
                bunq bunq2 = this.f154324b;
                bunq.m120077b(bunq, bunq2, bunq2);
                m120062c();
                this.f154346z.mo72908a(this.f154330j);
                double d = (double) (abs * abs);
                double[] dArr = this.f154346z.f154393a;
                double d2 = dArr[0];
                Double.isNaN(d);
                dArr[0] = d2 * d;
                double d3 = dArr[1];
                Double.isNaN(d);
                dArr[1] = d3 * d;
                double d4 = dArr[2];
                Double.isNaN(d);
                dArr[2] = d4 * d;
                double d5 = dArr[3];
                Double.isNaN(d);
                dArr[3] = d5 * d;
                double d6 = dArr[4];
                Double.isNaN(d);
                dArr[4] = d6 * d;
                double d7 = dArr[5];
                Double.isNaN(d);
                dArr[5] = d7 * d;
                double d8 = dArr[6];
                Double.isNaN(d);
                dArr[6] = d8 * d;
                double d9 = dArr[7];
                Double.isNaN(d);
                dArr[7] = d9 * d;
                double d10 = dArr[8];
                Double.isNaN(d);
                dArr[8] = d10 * d;
                double[] dArr2 = this.f154329i.f154393a;
                dArr2[0] = dArr2[0] + dArr[0];
                dArr2[1] = dArr2[1] + dArr[1];
                dArr2[2] = dArr2[2] + dArr[2];
                dArr2[3] = dArr2[3] + dArr[3];
                dArr2[4] = dArr2[4] + dArr[4];
                dArr2[5] = dArr2[5] + dArr[5];
                dArr2[6] = dArr2[6] + dArr[6];
                dArr2[7] = dArr2[7] + dArr[7];
                dArr2[8] = dArr2[8] + dArr[8];
            }
            this.f154341u = j2;
        }
    }
}
