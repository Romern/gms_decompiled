package p000;

/* renamed from: cbfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbfn f176940b;

    /* renamed from: c */
    private static volatile bxxk f176941c;

    /* renamed from: a */
    public bxwc f176942a = bxxn.f165040b;

    static {
        cbfn cbfn = new cbfn();
        f176940b = cbfn;
        GeneratedMessageLite.m124024a(cbfn.class, cbfn);
    }

    private cbfn() {
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
            return GeneratedMessageLite.m124022a(f176940b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbga.class});
        } else if (i2 == 3) {
            return new cbfn();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f176940b;
            }
            bxxk bxxk = f176941c;
            if (bxxk == null) {
                synchronized (cbfn.class) {
                    bxxk = f176941c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176940b);
                        f176941c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
