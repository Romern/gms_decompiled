package p000;

/* renamed from: bplb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplb extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bplb f138053h;

    /* renamed from: i */
    private static volatile bxxk f138054i;

    /* renamed from: a */
    public int f138055a;

    /* renamed from: b */
    public bxvt f138056b = bxvm.f164965b;

    /* renamed from: c */
    public bxvt f138057c = bxvm.f164965b;

    /* renamed from: d */
    public int f138058d;

    /* renamed from: e */
    public int f138059e;

    /* renamed from: f */
    public long f138060f;

    /* renamed from: g */
    public int f138061g;

    static {
        bplb bplb = new bplb();
        f138053h = bplb;
        GeneratedMessageLite.m124024a(bplb.class, bplb);
    }

    private bplb() {
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
            return GeneratedMessageLite.m124022a(f138053h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002\u0016\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006င\u0003", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bplb();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138053h;
            }
            bxxk bxxk = f138054i;
            if (bxxk == null) {
                synchronized (bplb.class) {
                    bxxk = f138054i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138053h);
                        f138054i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo68964b() {
        if (!this.f138057c.mo73666a()) {
            this.f138057c = GeneratedMessageLite.m124019a(this.f138057c);
        }
    }

    /* renamed from: a */
    public final void mo68963a() {
        if (!this.f138056b.mo73666a()) {
            this.f138056b = GeneratedMessageLite.m124019a(this.f138056b);
        }
    }
}
