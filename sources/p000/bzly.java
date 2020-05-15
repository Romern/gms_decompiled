package p000;

/* renamed from: bzly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzly extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzly f170589d;

    /* renamed from: e */
    private static volatile bxxk f170590e;

    /* renamed from: a */
    public int f170591a;

    /* renamed from: b */
    public bzlr f170592b;

    /* renamed from: c */
    public int f170593c;

    static {
        bzly bzly = new bzly();
        f170589d = bzly;
        GeneratedMessageLite.m124024a(bzly.class, bzly);
    }

    private bzly() {
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
            return GeneratedMessageLite.m124022a(f170589d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bzlu.f170578a});
        } else if (i2 == 3) {
            return new bzly();
        } else {
            if (i2 == 4) {
                return new bxvd(f170589d);
            }
            if (i2 == 5) {
                return f170589d;
            }
            bxxk bxxk = f170590e;
            if (bxxk == null) {
                synchronized (bzly.class) {
                    bxxk = f170590e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170589d);
                        f170590e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
