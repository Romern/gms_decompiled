package p000;

/* renamed from: byaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byaa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byaa f165217d;

    /* renamed from: e */
    private static volatile bxxk f165218e;

    /* renamed from: a */
    public int f165219a;

    /* renamed from: b */
    public ByteString f165220b = ByteString.f164797b;

    /* renamed from: c */
    public boolean f165221c;

    static {
        byaa byaa = new byaa();
        f165217d = byaa;
        GeneratedMessageLite.m124024a(byaa.class, byaa);
    }

    private byaa() {
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
            return GeneratedMessageLite.m124022a(f165217d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byaa();
        } else {
            if (i2 == 4) {
                return new bxvd(f165217d);
            }
            if (i2 == 5) {
                return f165217d;
            }
            bxxk bxxk = f165218e;
            if (bxxk == null) {
                synchronized (byaa.class) {
                    bxxk = f165218e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165217d);
                        f165218e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
