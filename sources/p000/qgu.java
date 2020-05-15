package p000;

/* renamed from: qgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgu extends bxvk implements bxxd {

    /* renamed from: A */
    public static final qgu f41220A;

    /* renamed from: D */
    private static volatile bxxk f41221D;

    /* renamed from: B */
    private int f41222B;

    /* renamed from: C */
    private byte f41223C = 2;

    /* renamed from: a */
    public int f41224a;

    /* renamed from: b */
    public String f41225b = "";

    /* renamed from: c */
    public String f41226c = "";

    /* renamed from: d */
    public bxwc f41227d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f41228e = bxxn.f165040b;

    /* renamed from: f */
    public String f41229f = "";

    /* renamed from: g */
    public String f41230g = "";

    /* renamed from: h */
    public long f41231h;

    /* renamed from: i */
    public long f41232i;

    /* renamed from: j */
    public String f41233j = "";

    /* renamed from: k */
    public String f41234k = "";

    /* renamed from: l */
    public qhg f41235l;

    /* renamed from: m */
    public bxwc f41236m = bxxn.f165040b;

    /* renamed from: n */
    public String f41237n = "";

    /* renamed from: o */
    public long f41238o;

    /* renamed from: p */
    public bxwc f41239p = bxxn.f165040b;

    /* renamed from: q */
    public qhd f41240q;

    /* renamed from: r */
    public int f41241r;

    /* renamed from: s */
    public int f41242s;

    /* renamed from: t */
    public qgy f41243t;

    /* renamed from: u */
    public String f41244u = "";

    /* renamed from: v */
    public String f41245v = "";

    /* renamed from: w */
    public int f41246w;

    /* renamed from: x */
    public qgw f41247x;

    /* renamed from: y */
    public boolean f41248y;

    /* renamed from: z */
    public boolean f41249z;

    static {
        qgu qgu = new qgu();
        f41220A = qgu;
        bxvk.m124024a(qgu.class, qgu);
    }

    private qgu() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m32152a(qgu qgu) {
        qgu.f41224a |= 8192;
        qgu.f41222B = 3;
    }

    /* renamed from: b */
    public final void mo24047b() {
        if (!this.f41228e.mo73666a()) {
            this.f41228e = bxvk.m124021a(this.f41228e);
        }
    }

    /* renamed from: c */
    public final void mo24048c() {
        if (!this.f41236m.mo73666a()) {
            this.f41236m = bxvk.m124021a(this.f41236m);
        }
    }

    /* renamed from: d */
    public final void mo24049d() {
        if (!this.f41239p.mo73666a()) {
            this.f41239p = bxvk.m124021a(this.f41239p);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41223C);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41223C = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f41220A, "\u0001\u001a\u0000\u0001\u0001\u001e\u001a\u0000\u0004\u0002\u0001ဈ\u0000\u0002ဂ\u0004\u0003ဈ\u0006\u0004ᔉ\b\u0006ဈ\u0007\u0007ဂ\u0005\t\u001a\nဈ\u0001\u000b\u001a\fဈ\u000b\rစ\f\u000eင\r\u000f\u001a\u0010ဈ\u0002\u0011ဈ\u0003\u0012ᐉ\u000e\u0013\u001a\u0014င\u000f\u0016င\u0011\u0017ဉ\u0012\u0018ဈ\u0013\u0019ဈ\u0014\u001aဌ\u0015\u001bဉ\u0016\u001dဇ\u0017\u001eဇ\u0018", new Object[]{"a", "b", "h", "j", "l", "k", "i", "d", "c", "m", "n", "o", "B", "p", "f", "g", "q", "e", "r", "s", "t", "u", "v", "w", qgt.m32150b(), "x", "y", "z"});
        } else if (i2 == 3) {
            return new qgu();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f41220A;
            }
            bxxk bxxk = f41221D;
            if (bxxk == null) {
                synchronized (qgu.class) {
                    bxxk = f41221D;
                    if (bxxk == null) {
                        bxxk = new bxve(f41220A);
                        f41221D = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo24046a() {
        if (!this.f41227d.mo73666a()) {
            this.f41227d = bxvk.m124021a(this.f41227d);
        }
    }
}
