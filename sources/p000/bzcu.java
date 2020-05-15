package p000;

/* renamed from: bzcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcu extends bxvk implements bxxd {

    /* renamed from: q */
    public static final bzcu f169408q;

    /* renamed from: t */
    private static volatile bxxk f169409t;

    /* renamed from: a */
    public int f169410a;

    /* renamed from: b */
    public long f169411b;

    /* renamed from: c */
    public String f169412c = "";

    /* renamed from: d */
    public bxwc f169413d = bxxn.f165040b;

    /* renamed from: e */
    public double f169414e;

    /* renamed from: f */
    public bxwc f169415f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f169416g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f169417h = bxxn.f165040b;

    /* renamed from: i */
    public long f169418i;

    /* renamed from: j */
    public long f169419j;

    /* renamed from: k */
    public bxwc f169420k = bxxn.f165040b;

    /* renamed from: l */
    public String f169421l = "";

    /* renamed from: m */
    public int f169422m;

    /* renamed from: n */
    public int f169423n;

    /* renamed from: o */
    public long f169424o;

    /* renamed from: p */
    public int f169425p;

    /* renamed from: r */
    private boolean f169426r;

    /* renamed from: s */
    private boolean f169427s;

    static {
        bzcu bzcu = new bzcu();
        f169408q = bzcu;
        bxvk.m124024a(bzcu.class, bzcu);
    }

    private bzcu() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125662a(bzcu bzcu) {
        bzcu.f169410a |= 512;
        bzcu.f169426r = true;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125663b(bzcu bzcu) {
        bzcu.f169410a |= 1024;
        bzcu.f169427s = true;
    }

    /* renamed from: c */
    public final void mo74530c() {
        if (!this.f169415f.mo73666a()) {
            this.f169415f = bxvk.m124021a(this.f169415f);
        }
    }

    /* renamed from: e */
    public final void mo74531e() {
        if (!this.f169416g.mo73666a()) {
            this.f169416g = bxvk.m124021a(this.f169416g);
        }
    }

    /* renamed from: f */
    public final void mo74532f() {
        if (!this.f169417h.mo73666a()) {
            this.f169417h = bxvk.m124021a(this.f169417h);
        }
    }

    /* renamed from: g */
    public final void mo74533g() {
        if (!this.f169420k.mo73666a()) {
            this.f169420k = bxvk.m124021a(this.f169420k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f169408q, "\u0001\u0011\u0000\u0001\u0001\u0017\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0002\u0003\u001a\u0005\u001b\u0006\u001b\u0007\u001b\bက\u0004\tဃ\u0005\nဃ\u0006\f\u001b\u000eဇ\t\u000fဇ\n\u0012ဈ\f\u0014င\u000e\u0015င\u000f\u0016ဂ\u0010\u0017ဌ\u0011", new Object[]{"a", "b", "c", "d", "f", bzdm.class, "g", bzdj.class, "h", bzdo.class, "e", "i", "j", "k", bzdq.class, "r", "s", "l", "m", "n", "o", "p", bzct.f169407a});
        } else if (i2 == 3) {
            return new bzcu();
        } else {
            if (i2 == 4) {
                return new bzcs();
            }
            if (i2 == 5) {
                return f169408q;
            }
            bxxk bxxk = f169409t;
            if (bxxk == null) {
                synchronized (bzcu.class) {
                    bxxk = f169409t;
                    if (bxxk == null) {
                        bxxk = new bxve(f169408q);
                        f169409t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
