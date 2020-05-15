package p000;

/* renamed from: cbfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbfv f176976b;

    /* renamed from: c */
    private static volatile bxxk f176977c;

    /* renamed from: a */
    public bxwc f176978a = bxxn.f165040b;

    static {
        cbfv cbfv = new cbfv();
        f176976b = cbfv;
        GeneratedMessageLite.m124024a(cbfv.class, cbfv);
    }

    private cbfv() {
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
            return GeneratedMessageLite.m124022a(f176976b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbfz.class});
        } else if (i2 == 3) {
            return new cbfv();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176976b;
            }
            bxxk bxxk = f176977c;
            if (bxxk == null) {
                synchronized (cbfv.class) {
                    bxxk = f176977c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176976b);
                        f176977c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
