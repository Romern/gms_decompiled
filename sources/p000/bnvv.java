package p000;

/* renamed from: bnvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvv {

    /* renamed from: a */
    public bnwk f132252a;

    /* renamed from: b */
    int f132253b;

    /* renamed from: c */
    private bnwk f132254c;

    /* renamed from: d */
    private bnwk f132255d;

    /* renamed from: e */
    private bnwk f132256e;

    /* renamed from: f */
    private int f132257f;

    /* renamed from: g */
    private boolean f132258g;

    /* renamed from: h */
    private bnwk f132259h;

    /* renamed from: i */
    private bnwk f132260i;

    public bnvv() {
    }

    /* renamed from: a */
    static int m110591a(bnwk bnwk, bnwk bnwk2) {
        double d = bnvr.f132240c * 1.8274d;
        double a = bnwk.mo68659a(bnwk2);
        if (a < d) {
            return a > (-d) ? 0 : -1;
        }
        return 1;
    }

    /* renamed from: b */
    public final int mo68603b(bnwk bnwk) {
        int a = m110591a(this.f132256e, bnwk);
        int i = -a;
        int i2 = -1;
        if (this.f132257f == i && a != 0) {
            this.f132252a = bnwk;
            this.f132257f = i;
            return -1;
        }
        this.f132253b = a;
        if (!this.f132258g) {
            bnwk b = bnwk.m110665b(bnvr.m110550a(this.f132254c, this.f132255d));
            this.f132259h = bnwk.m110667c(this.f132254c, b);
            this.f132260i = bnwk.m110667c(b, this.f132255d);
            this.f132258g = true;
        }
        double sqrt = ((1.0d / Math.sqrt(3.0d)) + 1.5d) * bnvr.f132240c;
        if ((this.f132252a.mo68659a(this.f132259h) <= sqrt || bnwk.mo68659a(this.f132259h) <= sqrt) && (this.f132252a.mo68659a(this.f132260i) <= sqrt || bnwk.mo68659a(this.f132260i) <= sqrt)) {
            if (this.f132254c.mo68662c(this.f132252a) || this.f132254c.mo68662c(bnwk) || this.f132255d.mo68662c(this.f132252a) || this.f132255d.mo68662c(bnwk) || this.f132254c.mo68662c(this.f132255d) || this.f132252a.mo68662c(bnwk)) {
                i2 = 0;
            } else {
                if (this.f132257f == 0) {
                    this.f132257f = -bnws.m110684a(this.f132254c, this.f132255d, this.f132252a);
                }
                int i3 = this.f132253b;
                if (i3 == 0) {
                    i3 = bnws.m110684a(this.f132254c, this.f132255d, bnwk);
                    this.f132253b = i3;
                }
                if (i3 == this.f132257f) {
                    bnwk c = bnwk.m110667c(this.f132252a, bnwk);
                    if ((-m110592a(this.f132252a, bnwk, this.f132255d, c)) == this.f132257f && m110592a(this.f132252a, bnwk, this.f132254c, c) == this.f132257f) {
                        i2 = 1;
                    }
                }
            }
        }
        this.f132252a = bnwk;
        this.f132257f = -this.f132253b;
        return i2;
    }

    /* renamed from: c */
    public final boolean mo68604c(bnwk bnwk) {
        bnwk bnwk2 = this.f132252a;
        int b = mo68603b(bnwk);
        if (b < 0) {
            return false;
        }
        if (b <= 0) {
            return bnvx.m110603a(this.f132254c, this.f132255d, bnwk2, bnwk);
        }
        return true;
    }

    public bnvv(bnwk bnwk, bnwk bnwk2) {
        this.f132254c = bnwk;
        this.f132255d = bnwk2;
        this.f132252a = null;
        this.f132256e = bnwk.m110667c(bnwk, bnwk2);
        this.f132258g = false;
    }

    /* renamed from: a */
    private static int m110592a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3, bnwk bnwk4) {
        int a = m110591a(bnwk4, bnwk3);
        return a == 0 ? bnws.m110684a(bnwk, bnwk2, bnwk3) : a;
    }

    public bnvv(bnwk bnwk, bnwk bnwk2, bnwk bnwk3) {
        this(bnwk, bnwk2);
        mo68602a(bnwk3);
    }

    /* renamed from: a */
    public final void mo68602a(bnwk bnwk) {
        this.f132252a = bnwk;
        this.f132257f = -m110591a(this.f132256e, bnwk);
    }
}
