package p000;

/* renamed from: cbdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbdd f176718d;

    /* renamed from: e */
    private static volatile bxxk f176719e;

    /* renamed from: a */
    public cbmo f176720a;

    /* renamed from: b */
    public bxwc f176721b = bxxn.f165040b;

    /* renamed from: c */
    public long f176722c;

    static {
        cbdd cbdd = new cbdd();
        f176718d = cbdd;
        GeneratedMessageLite.m124024a(cbdd.class, cbdd);
    }

    private cbdd() {
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
            return GeneratedMessageLite.m124022a(f176718d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\u0002", new Object[]{"a", "b", cbdl.class, "c"});
        } else if (i2 == 3) {
            return new cbdd();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176718d;
            }
            bxxk bxxk = f176719e;
            if (bxxk == null) {
                synchronized (cbdd.class) {
                    bxxk = f176719e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176718d);
                        f176719e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
