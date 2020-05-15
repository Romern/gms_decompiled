package p000;

/* renamed from: bsqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsqx f146703c;

    /* renamed from: d */
    private static volatile bxxk f146704d;

    /* renamed from: a */
    public int f146705a;

    /* renamed from: b */
    public ByteString f146706b = ByteString.f164797b;

    static {
        bsqx bsqx = new bsqx();
        f146703c = bsqx;
        GeneratedMessageLite.m124024a(bsqx.class, bsqx);
    }

    private bsqx() {
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
            return GeneratedMessageLite.m124022a(f146703c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f146703c);
            }
            if (i2 == 5) {
                return f146703c;
            }
            bxxk bxxk = f146704d;
            if (bxxk == null) {
                synchronized (bsqx.class) {
                    bxxk = f146704d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146703c);
                        f146704d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
