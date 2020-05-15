package p000;

/* renamed from: bmst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmst extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmst f130745c;

    /* renamed from: d */
    private static volatile bxxk f130746d;

    /* renamed from: a */
    public ByteString f130747a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f130748b = ByteString.f164797b;

    static {
        bmst bmst = new bmst();
        f130745c = bmst;
        GeneratedMessageLite.m124024a(bmst.class, bmst);
    }

    private bmst() {
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
            return GeneratedMessageLite.m124022a(f130745c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmst();
        } else {
            if (i2 == 4) {
                return new bxvd(f130745c);
            }
            if (i2 == 5) {
                return f130745c;
            }
            bxxk bxxk = f130746d;
            if (bxxk == null) {
                synchronized (bmst.class) {
                    bxxk = f130746d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130745c);
                        f130746d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
