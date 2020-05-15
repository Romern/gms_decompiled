package p000;

/* renamed from: cbfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbfb f176880d;

    /* renamed from: e */
    private static volatile bxxk f176881e;

    /* renamed from: a */
    public ByteString f176882a = ByteString.f164797b;

    /* renamed from: b */
    public boolean f176883b;

    /* renamed from: c */
    public boolean f176884c;

    static {
        cbfb cbfb = new cbfb();
        f176880d = cbfb;
        GeneratedMessageLite.m124024a(cbfb.class, cbfb);
    }

    private cbfb() {
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
            return GeneratedMessageLite.m124022a(f176880d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0007\u0003\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbfb();
        } else {
            if (i2 == 4) {
                return new bxvd(f176880d);
            }
            if (i2 == 5) {
                return f176880d;
            }
            bxxk bxxk = f176881e;
            if (bxxk == null) {
                synchronized (cbfb.class) {
                    bxxk = f176881e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176880d);
                        f176881e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
