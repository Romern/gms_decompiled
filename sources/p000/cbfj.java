package p000;

/* renamed from: cbfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbfj f176924c;

    /* renamed from: d */
    private static volatile bxxk f176925d;

    /* renamed from: a */
    public bxwc f176926a = bxxn.f165040b;

    /* renamed from: b */
    public int f176927b;

    static {
        cbfj cbfj = new cbfj();
        f176924c = cbfj;
        GeneratedMessageLite.m124024a(cbfj.class, cbfj);
    }

    private cbfj() {
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
            return GeneratedMessageLite.m124022a(f176924c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"a", cbfi.class, "b"});
        } else if (i2 == 3) {
            return new cbfj();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176924c;
            }
            bxxk bxxk = f176925d;
            if (bxxk == null) {
                synchronized (cbfj.class) {
                    bxxk = f176925d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176924c);
                        f176925d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
