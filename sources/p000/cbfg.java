package p000;

/* renamed from: cbfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbfg f176913b;

    /* renamed from: c */
    private static volatile bxxk f176914c;

    /* renamed from: a */
    public int f176915a;

    static {
        cbfg cbfg = new cbfg();
        f176913b = cbfg;
        GeneratedMessageLite.m124024a(cbfg.class, cbfg);
    }

    private cbfg() {
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
            return GeneratedMessageLite.m124022a(f176913b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbfg();
        } else {
            if (i2 == 4) {
                return new bxvd(f176913b);
            }
            if (i2 == 5) {
                return f176913b;
            }
            bxxk bxxk = f176914c;
            if (bxxk == null) {
                synchronized (cbfg.class) {
                    bxxk = f176914c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176913b);
                        f176914c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
