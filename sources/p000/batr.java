package p000;

/* renamed from: batr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class batr extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final batr f101718h;

    /* renamed from: i */
    private static volatile bxxk f101719i;

    /* renamed from: a */
    public int f101720a;

    /* renamed from: b */
    public String f101721b = "";

    /* renamed from: c */
    public String f101722c = "";

    /* renamed from: d */
    public String f101723d = "";

    /* renamed from: e */
    public int f101724e;

    /* renamed from: f */
    public int f101725f;

    /* renamed from: g */
    public bxwc f101726g = bxxn.f165040b;

    static {
        batr batr = new batr();
        f101718h = batr;
        GeneratedMessageLite.m124024a(batr.class, batr);
    }

    private batr() {
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
            return GeneratedMessageLite.m124022a(f101718h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004င\u0003\u0005ဌ\u0004\u0006ဈ\u0002", new Object[]{"a", "b", "g", bato.class, "c", "e", "f", batq.f101717a, "d"});
        } else if (i2 == 3) {
            return new batr();
        } else {
            if (i2 == 4) {
                return new batp();
            }
            if (i2 == 5) {
                return f101718h;
            }
            bxxk bxxk = f101719i;
            if (bxxk == null) {
                synchronized (batr.class) {
                    bxxk = f101719i;
                    if (bxxk == null) {
                        bxxk = new bxve(f101718h);
                        f101719i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo55953a() {
        if (!this.f101726g.mo73666a()) {
            this.f101726g = GeneratedMessageLite.m124021a(this.f101726g);
        }
    }
}
