package p000;

/* renamed from: cbgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbgr f177076b;

    /* renamed from: c */
    private static volatile bxxk f177077c;

    /* renamed from: a */
    public cbgn f177078a;

    static {
        cbgr cbgr = new cbgr();
        f177076b = cbgr;
        GeneratedMessageLite.m124024a(cbgr.class, cbgr);
    }

    private cbgr() {
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
            return GeneratedMessageLite.m124022a(f177076b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbgr();
        } else {
            if (i2 == 4) {
                return new bxvd(f177076b);
            }
            if (i2 == 5) {
                return f177076b;
            }
            bxxk bxxk = f177077c;
            if (bxxk == null) {
                synchronized (cbgr.class) {
                    bxxk = f177077c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177076b);
                        f177077c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
