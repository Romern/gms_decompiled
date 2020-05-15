package p000;

/* renamed from: bzjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzjq f170326c;

    /* renamed from: d */
    private static volatile bxxk f170327d;

    /* renamed from: a */
    public int f170328a;

    /* renamed from: b */
    public bzhw f170329b;

    static {
        bzjq bzjq = new bzjq();
        f170326c = bzjq;
        GeneratedMessageLite.m124024a(bzjq.class, bzjq);
    }

    private bzjq() {
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
            return GeneratedMessageLite.m124022a(f170326c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzjq();
        } else {
            if (i2 == 4) {
                return new bxvd(f170326c);
            }
            if (i2 == 5) {
                return f170326c;
            }
            bxxk bxxk = f170327d;
            if (bxxk == null) {
                synchronized (bzjq.class) {
                    bxxk = f170327d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170326c);
                        f170327d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
