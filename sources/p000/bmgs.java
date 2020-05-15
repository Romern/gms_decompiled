package p000;

/* renamed from: bmgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmgs f129319c;

    /* renamed from: d */
    private static volatile bxxk f129320d;

    /* renamed from: a */
    public int f129321a = 0;

    /* renamed from: b */
    public Object f129322b;

    static {
        bmgs bmgs = new bmgs();
        f129319c = bmgs;
        GeneratedMessageLite.m124024a(bmgs.class, bmgs);
    }

    private bmgs() {
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
            return GeneratedMessageLite.m124022a(f129319c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", bmgz.class, bmgu.class, bmhb.class});
        } else if (i2 == 3) {
            return new bmgs();
        } else {
            if (i2 == 4) {
                return new bxvd(f129319c);
            }
            if (i2 == 5) {
                return f129319c;
            }
            bxxk bxxk = f129320d;
            if (bxxk == null) {
                synchronized (bmgs.class) {
                    bxxk = f129320d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129319c);
                        f129320d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
