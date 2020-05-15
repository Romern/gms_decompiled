package p000;

/* renamed from: bzed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzed extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzed f169634d;

    /* renamed from: e */
    private static volatile bxxk f169635e;

    /* renamed from: a */
    public int f169636a;

    /* renamed from: b */
    public int f169637b;

    /* renamed from: c */
    public int f169638c;

    static {
        bzed bzed = new bzed();
        f169634d = bzed;
        GeneratedMessageLite.m124024a(bzed.class, bzed);
    }

    private bzed() {
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
            return GeneratedMessageLite.m124022a(f169634d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzed();
        } else {
            if (i2 == 4) {
                return new bxvd(f169634d);
            }
            if (i2 == 5) {
                return f169634d;
            }
            bxxk bxxk = f169635e;
            if (bxxk == null) {
                synchronized (bzed.class) {
                    bxxk = f169635e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169634d);
                        f169635e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
