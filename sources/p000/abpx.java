package p000;

/* renamed from: abpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final abpx f57916e;

    /* renamed from: f */
    private static volatile bxxk f57917f;

    /* renamed from: a */
    public bxwc f57918a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f57919b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f57920c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f57921d = bxvm.f164965b;

    static {
        abpx abpx = new abpx();
        f57916e = abpx;
        GeneratedMessageLite.m124024a(abpx.class, abpx);
    }

    private abpx() {
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
            return GeneratedMessageLite.m124022a(f57916e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001e\u0004\u001b", new Object[]{"a", abpu.class, "b", abpy.class, "d", abpw.m48056b(), "c", abpy.class});
        } else if (i2 == 3) {
            return new abpx();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57916e;
            }
            bxxk bxxk = f57917f;
            if (bxxk == null) {
                synchronized (abpx.class) {
                    bxxk = f57917f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57916e);
                        f57917f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo32281b() {
        if (!this.f57919b.mo73666a()) {
            this.f57919b = GeneratedMessageLite.m124021a(this.f57919b);
        }
    }

    /* renamed from: a */
    public final void mo32280a() {
        if (!this.f57918a.mo73666a()) {
            this.f57918a = GeneratedMessageLite.m124021a(this.f57918a);
        }
    }
}
