package p000;

/* renamed from: bzun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzun extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzun f171439c;

    /* renamed from: d */
    private static volatile bxxk f171440d;

    /* renamed from: a */
    public bzuk f171441a;

    /* renamed from: b */
    public ByteString f171442b = ByteString.f164797b;

    static {
        bzun bzun = new bzun();
        f171439c = bzun;
        GeneratedMessageLite.m124024a(bzun.class, bzun);
    }

    private bzun() {
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
            return GeneratedMessageLite.m124022a(f171439c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzun();
        } else {
            if (i2 == 4) {
                return new bxvd(f171439c);
            }
            if (i2 == 5) {
                return f171439c;
            }
            bxxk bxxk = f171440d;
            if (bxxk == null) {
                synchronized (bzun.class) {
                    bxxk = f171440d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171439c);
                        f171440d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
