package p000;

/* renamed from: cabx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cabx f172486c;

    /* renamed from: e */
    private static volatile bxxk f172487e;

    /* renamed from: a */
    public int f172488a;

    /* renamed from: b */
    public String f172489b = "";

    /* renamed from: d */
    private byte f172490d = 2;

    static {
        cabx cabx = new cabx();
        f172486c = cabx;
        GeneratedMessageLite.m124024a(cabx.class, cabx);
    }

    private cabx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172490d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172490d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f172486c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cabx();
        } else {
            if (i2 == 4) {
                return new bxvd(f172486c);
            }
            if (i2 == 5) {
                return f172486c;
            }
            bxxk bxxk = f172487e;
            if (bxxk == null) {
                synchronized (cabx.class) {
                    bxxk = f172487e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172486c);
                        f172487e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
