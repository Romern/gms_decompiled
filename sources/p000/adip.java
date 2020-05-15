package p000;

/* renamed from: adip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adip extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final adip f61826d;

    /* renamed from: e */
    private static volatile bxxk f61827e;

    /* renamed from: a */
    public bxwc f61828a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f61829b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f61830c = bxxn.f165040b;

    static {
        adip adip = new adip();
        f61826d = adip;
        GeneratedMessageLite.m124024a(adip.class, adip);
    }

    private adip() {
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
            return GeneratedMessageLite.m124022a(f61826d, "\u0000\u0003\u0000\u0000\u0002\u0006\u0003\u0000\u0003\u0000\u0002\u001b\u0005\u001b\u0006\u001b", new Object[]{"a", adis.class, "b", adiy.class, "c", adiv.class});
        } else if (i2 == 3) {
            return new adip();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f61826d;
            }
            bxxk bxxk = f61827e;
            if (bxxk == null) {
                synchronized (adip.class) {
                    bxxk = f61827e;
                    if (bxxk == null) {
                        bxxk = new bxve(f61826d);
                        f61827e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo33555b() {
        if (!this.f61829b.mo73666a()) {
            this.f61829b = GeneratedMessageLite.m124021a(this.f61829b);
        }
    }

    /* renamed from: a */
    public final void mo33554a() {
        if (!this.f61828a.mo73666a()) {
            this.f61828a = GeneratedMessageLite.m124021a(this.f61828a);
        }
    }
}
