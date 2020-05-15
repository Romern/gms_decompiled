package p000;

/* renamed from: cbav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbav extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbav f176502d;

    /* renamed from: e */
    private static volatile bxxk f176503e;

    /* renamed from: a */
    public int f176504a = 0;

    /* renamed from: b */
    public Object f176505b;

    /* renamed from: c */
    public bxte f176506c;

    static {
        cbav cbav = new cbav();
        f176502d = cbav;
        GeneratedMessageLite.m124024a(cbav.class, cbav);
    }

    private cbav() {
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
            return GeneratedMessageLite.m124022a(f176502d, "\u0000\u0007\u0001\u0000\u0001\f\u0007\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t\t\f<\u0000", new Object[]{"b", "a", cbbb.class, cbat.class, cbau.class, cbaz.class, cbax.class, "c", cbbc.class});
        } else if (i2 == 3) {
            return new cbav();
        } else {
            if (i2 == 4) {
                return new bxvd(f176502d);
            }
            if (i2 == 5) {
                return f176502d;
            }
            bxxk bxxk = f176503e;
            if (bxxk == null) {
                synchronized (cbav.class) {
                    bxxk = f176503e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176502d);
                        f176503e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
