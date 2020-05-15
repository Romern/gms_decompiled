package p000;

/* renamed from: bzyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzyw f171931d;

    /* renamed from: e */
    private static volatile bxxk f171932e;

    /* renamed from: a */
    public int f171933a;

    /* renamed from: b */
    public String f171934b = "";

    /* renamed from: c */
    public String f171935c = "";

    static {
        bzyw bzyw = new bzyw();
        f171931d = bzyw;
        GeneratedMessageLite.m124024a(bzyw.class, bzyw);
    }

    private bzyw() {
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
            return GeneratedMessageLite.m124022a(f171931d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f171931d);
            }
            if (i2 == 5) {
                return f171931d;
            }
            bxxk bxxk = f171932e;
            if (bxxk == null) {
                synchronized (bzyw.class) {
                    bxxk = f171932e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171931d);
                        f171932e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
