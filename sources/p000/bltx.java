package p000;

/* renamed from: bltx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bltx f127757c;

    /* renamed from: d */
    private static volatile bxxk f127758d;

    /* renamed from: a */
    public int f127759a;

    /* renamed from: b */
    public String f127760b = "";

    static {
        bltx bltx = new bltx();
        f127757c = bltx;
        GeneratedMessageLite.m124024a(bltx.class, bltx);
    }

    private bltx() {
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
            return GeneratedMessageLite.m124022a(f127757c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bltx();
        } else {
            if (i2 == 4) {
                return new bxvd(f127757c);
            }
            if (i2 == 5) {
                return f127757c;
            }
            bxxk bxxk = f127758d;
            if (bxxk == null) {
                synchronized (bltx.class) {
                    bxxk = f127758d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127757c);
                        f127758d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
