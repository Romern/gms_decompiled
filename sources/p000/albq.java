package p000;

/* renamed from: albq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albq {

    /* renamed from: A */
    private final alax f73310A;

    /* renamed from: B */
    private final alax f73311B;

    /* renamed from: C */
    private final alax f73312C;

    /* renamed from: D */
    private final alax f73313D;

    /* renamed from: E */
    private final alba f73314E;

    /* renamed from: F */
    private final alba f73315F;

    /* renamed from: G */
    private final alba f73316G;

    /* renamed from: H */
    private final alax f73317H;

    /* renamed from: I */
    private final alax f73318I;

    /* renamed from: J */
    private final alax f73319J;

    /* renamed from: a */
    public final double[] f73320a = new double[16];

    /* renamed from: b */
    public final alax f73321b = new alax();

    /* renamed from: c */
    public long f73322c;

    /* renamed from: d */
    private final alax f73323d = new alax();

    /* renamed from: e */
    private final alax f73324e = new alax();

    /* renamed from: f */
    private final alax f73325f = new alax();

    /* renamed from: g */
    private final alax f73326g = new alax();

    /* renamed from: h */
    private final alax f73327h = new alax();

    /* renamed from: i */
    private final alax f73328i = new alax();

    /* renamed from: j */
    private final alax f73329j = new alax();

    /* renamed from: k */
    private final alax f73330k = new alax();

    /* renamed from: l */
    private final alba f73331l = new alba();

    /* renamed from: m */
    private final alba f73332m = new alba();

    /* renamed from: n */
    private final alba f73333n = new alba();

    /* renamed from: o */
    private final alba f73334o = new alba();

    /* renamed from: p */
    private final alba f73335p = new alba();

    /* renamed from: q */
    private final alba f73336q = new alba();

    /* renamed from: r */
    private final alba f73337r = new alba();

    /* renamed from: s */
    private long f73338s;

    /* renamed from: t */
    private float f73339t;

    /* renamed from: u */
    private boolean f73340u = false;

    /* renamed from: v */
    private int f73341v;

    /* renamed from: w */
    private boolean f73342w = true;

    /* renamed from: x */
    private final alax f73343x;

    /* renamed from: y */
    private final alax f73344y;

    /* renamed from: z */
    private final alax f73345z;

    public albq() {
        new alax();
        this.f73343x = new alax();
        this.f73344y = new alax();
        this.f73345z = new alax();
        this.f73310A = new alax();
        this.f73311B = new alax();
        this.f73312C = new alax();
        this.f73313D = new alax();
        this.f73314E = new alba();
        this.f73315F = new alba();
        this.f73316G = new alba();
        new alax();
        new alax();
        new alax();
        new alax();
        new alax();
        this.f73317H = new alax();
        this.f73318I = new alax();
        this.f73319J = new alax();
        new alax();
        mo40097a();
    }

    /* renamed from: a */
    private final void m60817a(alax alax, alba alba) {
        alax.m60764a(alax, this.f73336q, this.f73333n);
        albt.m60826a(this.f73333n, this.f73332m, this.f73319J);
        albt.m60824a(this.f73319J, alba);
    }

    /* renamed from: b */
    private final void m60818b() {
        this.f73323d.mo40066b(this.f73317H);
        alax.m60763a(this.f73324e, this.f73317H, this.f73318I);
        alax.m60763a(this.f73323d, this.f73318I, this.f73324e);
        this.f73323d.mo40065b();
    }

    /* renamed from: b */
    public final synchronized void mo40099b(float[] fArr, long j) {
        synchronized (this) {
            this.f73332m.mo40072a((double) fArr[0], (double) fArr[1], (double) fArr[2]);
            if (this.f73322c != 0) {
                m60817a(this.f73321b, this.f73331l);
                for (int i = 0; i < 3; i++) {
                    alba alba = this.f73316G;
                    alba.mo40070a();
                    if (i == 0) {
                        alba.f73242a = 1.0E-7d;
                    } else if (i != 1) {
                        alba.f73244c = 1.0E-7d;
                    } else {
                        alba.f73243b = 1.0E-7d;
                    }
                    albt.m60825a(alba, this.f73345z);
                    alax.m60763a(this.f73345z, this.f73321b, this.f73310A);
                    m60817a(this.f73310A, this.f73314E);
                    alba alba2 = this.f73314E;
                    alba alba3 = this.f73331l;
                    this.f73315F.mo40072a(alba3.f73242a - alba2.f73242a, alba3.f73243b - alba2.f73243b, alba3.f73244c - alba2.f73244c);
                    this.f73315F.mo40071a(1.0E7d);
                    this.f73329j.mo40063a(i, this.f73315F);
                }
                this.f73329j.mo40066b(this.f73311B);
                alax.m60763a(this.f73324e, this.f73311B, this.f73312C);
                alax.m60763a(this.f73329j, this.f73312C, this.f73313D);
                alax alax = this.f73313D;
                alax alax2 = this.f73327h;
                alax alax3 = this.f73328i;
                double[] dArr = alax3.f73236a;
                double[] dArr2 = alax.f73236a;
                double d = dArr2[0];
                double[] dArr3 = alax2.f73236a;
                dArr[0] = d + dArr3[0];
                dArr[1] = dArr2[1] + dArr3[1];
                dArr[2] = dArr2[2] + dArr3[2];
                dArr[3] = dArr2[3] + dArr3[3];
                dArr[4] = dArr2[4] + dArr3[4];
                dArr[5] = dArr2[5] + dArr3[5];
                dArr[6] = dArr2[6] + dArr3[6];
                dArr[7] = dArr2[7] + dArr3[7];
                dArr[8] = dArr2[8] + dArr3[8];
                alax alax4 = this.f73311B;
                double a = ((alax3.mo40058a(0, 0) * ((alax3.mo40058a(1, 1) * alax3.mo40058a(2, 2)) - (alax3.mo40058a(2, 1) * alax3.mo40058a(1, 2)))) - (alax3.mo40058a(0, 1) * ((alax3.mo40058a(1, 0) * alax3.mo40058a(2, 2)) - (alax3.mo40058a(1, 2) * alax3.mo40058a(2, 0))))) + (alax3.mo40058a(0, 2) * ((alax3.mo40058a(1, 0) * alax3.mo40058a(2, 1)) - (alax3.mo40058a(1, 1) * alax3.mo40058a(2, 0))));
                if (a != 0.0d) {
                    double d2 = 1.0d / a;
                    double[] dArr4 = alax3.f73236a;
                    double d3 = dArr4[4];
                    double d4 = dArr4[8];
                    double d5 = dArr4[7];
                    double d6 = dArr4[5];
                    double d7 = dArr4[1];
                    double d8 = dArr4[2];
                    double d9 = dArr4[3];
                    double d10 = dArr4[6];
                    double d11 = dArr4[0];
                    alax4.mo40061a(((d3 * d4) - (d5 * d6)) * d2, (-((d7 * d4) - (d8 * d5))) * d2, ((d7 * d6) - (d8 * d3)) * d2, (-((d9 * d4) - (d6 * d10))) * d2, ((d4 * d11) - (d8 * d10)) * d2, (-((d6 * d11) - (d8 * d9))) * d2, ((d9 * d5) - (d10 * d3)) * d2, (-((d5 * d11) - (d10 * d7))) * d2, ((d11 * d3) - (d9 * d7)) * d2);
                }
                this.f73329j.mo40066b(this.f73312C);
                alax.m60763a(this.f73312C, this.f73311B, this.f73313D);
                alax.m60763a(this.f73324e, this.f73313D, this.f73330k);
                alax.m60764a(this.f73330k, this.f73331l, this.f73335p);
                alax.m60763a(this.f73330k, this.f73329j, this.f73311B);
                this.f73312C.mo40065b();
                alax alax5 = this.f73312C;
                alax alax6 = this.f73311B;
                double[] dArr5 = alax5.f73236a;
                double d12 = dArr5[0];
                double[] dArr6 = alax6.f73236a;
                dArr5[0] = d12 - dArr6[0];
                dArr5[1] = dArr5[1] - dArr6[1];
                dArr5[2] = dArr5[2] - dArr6[2];
                dArr5[3] = dArr5[3] - dArr6[3];
                dArr5[4] = dArr5[4] - dArr6[4];
                dArr5[5] = dArr5[5] - dArr6[5];
                dArr5[6] = dArr5[6] - dArr6[6];
                dArr5[7] = dArr5[7] - dArr6[7];
                dArr5[8] = dArr5[8] - dArr6[8];
                alax.m60763a(alax5, this.f73324e, alax6);
                this.f73324e.mo40064a(this.f73311B);
                albt.m60825a(this.f73335p, this.f73323d);
                alax alax7 = this.f73323d;
                alax alax8 = this.f73321b;
                alax.m60763a(alax7, alax8, alax8);
                m60818b();
            } else {
                albt.m60826a(this.f73336q, this.f73332m, this.f73321b);
            }
            this.f73322c = j;
        }
    }

    /* renamed from: a */
    public final void mo40097a() {
        this.f73338s = 0;
        this.f73322c = 0;
        this.f73321b.mo40065b();
        this.f73323d.mo40065b();
        this.f73324e.mo40059a();
        this.f73324e.mo40060a(25.0d);
        this.f73325f.mo40059a();
        this.f73325f.mo40060a(1.0d);
        this.f73326g.mo40059a();
        this.f73326g.mo40060a(0.0625d);
        this.f73327h.mo40059a();
        this.f73327h.mo40060a(0.5625d);
        this.f73328i.mo40059a();
        this.f73329j.mo40059a();
        this.f73330k.mo40059a();
        this.f73331l.mo40070a();
        this.f73332m.mo40070a();
        this.f73333n.mo40070a();
        this.f73334o.mo40070a();
        this.f73335p.mo40070a();
        this.f73336q.mo40072a(0.0d, 0.0d, 9.81d);
        this.f73337r.mo40072a(0.0d, 1.0d, 0.0d);
    }

    /* renamed from: a */
    public final synchronized void mo40098a(float[] fArr, long j) {
        long j2 = j;
        synchronized (this) {
            long j3 = this.f73338s;
            if (j3 != 0) {
                float f = ((float) (j2 - j3)) * 1.0E-9f;
                if (f > 0.04f) {
                    f = this.f73342w ? this.f73339t : 0.01f;
                } else if (this.f73340u) {
                    this.f73339t = (this.f73339t * 0.95f) + (0.050000012f * f);
                    int i = this.f73341v + 1;
                    this.f73341v = i;
                    if (((float) i) > 10.0f) {
                        this.f73342w = true;
                    }
                } else {
                    this.f73339t = f;
                    this.f73341v = 1;
                    this.f73340u = true;
                }
                float f2 = -f;
                this.f73334o.mo40072a((double) (fArr[0] * f2), (double) (fArr[1] * f2), (double) (fArr[2] * f2));
                albt.m60825a(this.f73334o, this.f73323d);
                this.f73343x.mo40064a(this.f73321b);
                alax.m60763a(this.f73323d, this.f73321b, this.f73343x);
                this.f73321b.mo40064a(this.f73343x);
                m60818b();
                this.f73344y.mo40064a(this.f73325f);
                double d = (double) (f * f);
                double[] dArr = this.f73344y.f73236a;
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
                double[] dArr2 = this.f73324e.f73236a;
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
            this.f73338s = j2;
        }
    }
}
