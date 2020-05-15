package p000;

/* renamed from: cbfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbfr f176955d;

    /* renamed from: e */
    private static volatile bxxk f176956e;

    /* renamed from: a */
    public int f176957a = 0;

    /* renamed from: b */
    public Object f176958b;

    /* renamed from: c */
    public int f176959c;

    static {
        cbfr cbfr = new cbfr();
        f176955d = cbfr;
        GeneratedMessageLite.m124024a(cbfr.class, cbfr);
    }

    private cbfr() {
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
            return GeneratedMessageLite.m124022a(f176955d, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000g<\u0000", new Object[]{"b", "a", "c", cbfu.class, cbfw.class, cbfm.class});
        } else if (i2 == 3) {
            return new cbfr();
        } else {
            if (i2 == 4) {
                return new bxvd(f176955d);
            }
            if (i2 == 5) {
                return f176955d;
            }
            bxxk bxxk = f176956e;
            if (bxxk == null) {
                synchronized (cbfr.class) {
                    bxxk = f176956e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176955d);
                        f176956e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
