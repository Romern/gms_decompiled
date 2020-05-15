package p000;

/* renamed from: aqad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqad extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aqad f85354d;

    /* renamed from: e */
    private static volatile bxxk f85355e;

    /* renamed from: a */
    public int f85356a;

    /* renamed from: b */
    public int f85357b;

    /* renamed from: c */
    public ByteString f85358c = ByteString.f164797b;

    static {
        aqad aqad = new aqad();
        f85354d = aqad;
        GeneratedMessageLite.m124024a(aqad.class, aqad);
    }

    private aqad() {
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
            return GeneratedMessageLite.m124022a(f85354d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqad();
        } else {
            if (i2 == 4) {
                return new bxvd(f85354d);
            }
            if (i2 == 5) {
                return f85354d;
            }
            bxxk bxxk = f85355e;
            if (bxxk == null) {
                synchronized (aqad.class) {
                    bxxk = f85355e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85354d);
                        f85355e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
