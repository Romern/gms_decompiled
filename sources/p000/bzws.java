package p000;

/* renamed from: bzws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzws extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzws f171671c;

    /* renamed from: d */
    private static volatile bxxk f171672d;

    /* renamed from: a */
    public int f171673a;

    /* renamed from: b */
    public bsad f171674b;

    static {
        bzws bzws = new bzws();
        f171671c = bzws;
        GeneratedMessageLite.m124024a(bzws.class, bzws);
    }

    private bzws() {
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
            return GeneratedMessageLite.m124022a(f171671c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzws();
        } else {
            if (i2 == 4) {
                return new bxvd(f171671c);
            }
            if (i2 == 5) {
                return f171671c;
            }
            bxxk bxxk = f171672d;
            if (bxxk == null) {
                synchronized (bzws.class) {
                    bxxk = f171672d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171671c);
                        f171672d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
