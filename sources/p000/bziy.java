package p000;

/* renamed from: bziy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bziy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bziy f170256b;

    /* renamed from: d */
    private static volatile bxxk f170257d;

    /* renamed from: a */
    public ByteString f170258a = ByteString.f164797b;

    /* renamed from: c */
    private int f170259c;

    static {
        bziy bziy = new bziy();
        f170256b = bziy;
        GeneratedMessageLite.m124024a(bziy.class, bziy);
    }

    private bziy() {
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
            return GeneratedMessageLite.m124022a(f170256b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bziy();
        } else {
            if (i2 == 4) {
                return new bxvd(f170256b);
            }
            if (i2 == 5) {
                return f170256b;
            }
            bxxk bxxk = f170257d;
            if (bxxk == null) {
                synchronized (bziy.class) {
                    bxxk = f170257d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170256b);
                        f170257d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
