package p000;

/* renamed from: bwgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwgr f159249e;

    /* renamed from: g */
    private static volatile bxxk f159250g;

    /* renamed from: a */
    public bmav f159251a;

    /* renamed from: b */
    public bmaq f159252b;

    /* renamed from: c */
    public bmar f159253c;

    /* renamed from: d */
    public int f159254d;

    /* renamed from: f */
    private int f159255f;

    static {
        bwgr bwgr = new bwgr();
        f159249e = bwgr;
        GeneratedMessageLite.m124024a(bwgr.class, bwgr);
    }

    private bwgr() {
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
            return GeneratedMessageLite.m124022a(f159249e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0004ဉ\u0002", new Object[]{"f", "a", "b", "d", bwgz.m121953b(), "c"});
        } else if (i2 == 3) {
            return new bwgr();
        } else {
            if (i2 == 4) {
                return new bxvd(f159249e);
            }
            if (i2 == 5) {
                return f159249e;
            }
            bxxk bxxk = f159250g;
            if (bxxk == null) {
                synchronized (bwgr.class) {
                    bxxk = f159250g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159249e);
                        f159250g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
