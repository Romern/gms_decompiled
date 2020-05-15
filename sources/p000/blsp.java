package p000;

/* renamed from: blsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blsp f127605e;

    /* renamed from: f */
    private static volatile bxxk f127606f;

    /* renamed from: a */
    public int f127607a;

    /* renamed from: b */
    public ByteString f127608b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f127609c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f127610d = ByteString.f164797b;

    static {
        blsp blsp = new blsp();
        f127605e = blsp;
        GeneratedMessageLite.m124024a(blsp.class, blsp);
    }

    private blsp() {
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
            return GeneratedMessageLite.m124022a(f127605e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new blsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f127605e);
            }
            if (i2 == 5) {
                return f127605e;
            }
            bxxk bxxk = f127606f;
            if (bxxk == null) {
                synchronized (blsp.class) {
                    bxxk = f127606f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127605e);
                        f127606f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
