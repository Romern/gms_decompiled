package p000;

/* renamed from: bmqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmqi f130396c;

    /* renamed from: d */
    private static volatile bxxk f130397d;

    /* renamed from: a */
    public int f130398a;

    /* renamed from: b */
    public String f130399b = "";

    static {
        bmqi bmqi = new bmqi();
        f130396c = bmqi;
        GeneratedMessageLite.m124024a(bmqi.class, bmqi);
    }

    private bmqi() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f130396c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmqi();
        } else {
            if (i2 == 4) {
                return new bxvd(f130396c);
            }
            if (i2 == 5) {
                return f130396c;
            }
            bxxk bxxk = f130397d;
            if (bxxk == null) {
                synchronized (bmqi.class) {
                    bxxk = f130397d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130396c);
                        f130397d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
