package p000;

/* renamed from: byfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byfl f166038d;

    /* renamed from: e */
    private static volatile bxxk f166039e;

    /* renamed from: a */
    public int f166040a;

    /* renamed from: b */
    public String f166041b = "";

    /* renamed from: c */
    public int f166042c;

    static {
        byfl byfl = new byfl();
        f166038d = byfl;
        GeneratedMessageLite.m124024a(byfl.class, byfl);
    }

    private byfl() {
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
            return GeneratedMessageLite.m124022a(f166038d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byfl();
        } else {
            if (i2 == 4) {
                return new bxvd(f166038d);
            }
            if (i2 == 5) {
                return f166038d;
            }
            bxxk bxxk = f166039e;
            if (bxxk == null) {
                synchronized (byfl.class) {
                    bxxk = f166039e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166038d);
                        f166039e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
