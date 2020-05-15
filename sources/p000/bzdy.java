package p000;

/* renamed from: bzdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzdy f169613e;

    /* renamed from: f */
    private static volatile bxxk f169614f;

    /* renamed from: a */
    public boolean f169615a;

    /* renamed from: b */
    public boolean f169616b;

    /* renamed from: c */
    public int f169617c;

    /* renamed from: d */
    public int f169618d;

    static {
        bzdy bzdy = new bzdy();
        f169613e = bzdy;
        GeneratedMessageLite.m124024a(bzdy.class, bzdy);
    }

    private bzdy() {
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
            return GeneratedMessageLite.m124022a(f169613e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzdy();
        } else {
            if (i2 == 4) {
                return new bxvd(f169613e);
            }
            if (i2 == 5) {
                return f169613e;
            }
            bxxk bxxk = f169614f;
            if (bxxk == null) {
                synchronized (bzdy.class) {
                    bxxk = f169614f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169613e);
                        f169614f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
