package p000;

/* renamed from: amqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final amqr f75772d;

    /* renamed from: e */
    private static volatile bxxk f75773e;

    /* renamed from: a */
    public int f75774a;

    /* renamed from: b */
    public ByteString f75775b = ByteString.f164797b;

    /* renamed from: c */
    public long f75776c;

    static {
        amqr amqr = new amqr();
        f75772d = amqr;
        GeneratedMessageLite.m124024a(amqr.class, amqr);
    }

    private amqr() {
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
            return GeneratedMessageLite.m124022a(f75772d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new amqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f75772d);
            }
            if (i2 == 5) {
                return f75772d;
            }
            bxxk bxxk = f75773e;
            if (bxxk == null) {
                synchronized (amqr.class) {
                    bxxk = f75773e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75772d);
                        f75773e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
