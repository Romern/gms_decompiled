package p000;

/* renamed from: bzjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzjr f170330c;

    /* renamed from: d */
    private static volatile bxxk f170331d;

    /* renamed from: a */
    public int f170332a;

    /* renamed from: b */
    public boolean f170333b;

    static {
        bzjr bzjr = new bzjr();
        f170330c = bzjr;
        GeneratedMessageLite.m124024a(bzjr.class, bzjr);
    }

    private bzjr() {
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
            return GeneratedMessageLite.m124022a(f170330c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f170330c);
            }
            if (i2 == 5) {
                return f170330c;
            }
            bxxk bxxk = f170331d;
            if (bxxk == null) {
                synchronized (bzjr.class) {
                    bxxk = f170331d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170330c);
                        f170331d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
