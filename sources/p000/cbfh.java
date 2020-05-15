package p000;

/* renamed from: cbfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbfh f176916d;

    /* renamed from: e */
    private static volatile bxxk f176917e;

    /* renamed from: a */
    public cbey f176918a;

    /* renamed from: b */
    public int f176919b;

    /* renamed from: c */
    public int f176920c;

    static {
        cbfh cbfh = new cbfh();
        f176916d = cbfh;
        bxvk.m124024a(cbfh.class, cbfh);
    }

    private cbfh() {
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
            return bxvk.m124022a(f176916d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbfh();
        } else {
            if (i2 == 4) {
                return new bxvd(f176916d);
            }
            if (i2 == 5) {
                return f176916d;
            }
            bxxk bxxk = f176917e;
            if (bxxk == null) {
                synchronized (cbfh.class) {
                    bxxk = f176917e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176916d);
                        f176917e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
