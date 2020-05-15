package p000;

/* renamed from: buop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buop extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buop f154565e;

    /* renamed from: f */
    private static volatile bxxk f154566f;

    /* renamed from: a */
    public double f154567a;

    /* renamed from: b */
    public double f154568b;

    /* renamed from: c */
    public double f154569c;

    /* renamed from: d */
    public double f154570d;

    static {
        buop buop = new buop();
        f154565e = buop;
        GeneratedMessageLite.m124024a(buop.class, buop);
    }

    private buop() {
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
            return GeneratedMessageLite.m124022a(f154565e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buop();
        } else {
            if (i2 == 4) {
                return new bxvd(f154565e);
            }
            if (i2 == 5) {
                return f154565e;
            }
            bxxk bxxk = f154566f;
            if (bxxk == null) {
                synchronized (buop.class) {
                    bxxk = f154566f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154565e);
                        f154566f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
