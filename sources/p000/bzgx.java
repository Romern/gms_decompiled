package p000;

/* renamed from: bzgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzgx f169998c;

    /* renamed from: e */
    private static volatile bxxk f169999e;

    /* renamed from: a */
    public String f170000a = "";

    /* renamed from: b */
    public String f170001b = "";

    /* renamed from: d */
    private int f170002d;

    static {
        bzgx bzgx = new bzgx();
        f169998c = bzgx;
        GeneratedMessageLite.m124024a(bzgx.class, bzgx);
    }

    private bzgx() {
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
            return GeneratedMessageLite.m124022a(f169998c, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzgx();
        } else {
            if (i2 == 4) {
                return new bxvd(f169998c);
            }
            if (i2 == 5) {
                return f169998c;
            }
            bxxk bxxk = f169999e;
            if (bxxk == null) {
                synchronized (bzgx.class) {
                    bxxk = f169999e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169998c);
                        f169999e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
