package p000;

/* renamed from: mpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final mpr f34208f;

    /* renamed from: g */
    private static volatile bxxk f34209g;

    /* renamed from: a */
    public int f34210a;

    /* renamed from: b */
    public int f34211b;

    /* renamed from: c */
    public int f34212c;

    /* renamed from: d */
    public int f34213d;

    /* renamed from: e */
    public int f34214e;

    static {
        mpr mpr = new mpr();
        f34208f = mpr;
        GeneratedMessageLite.m124024a(mpr.class, mpr);
    }

    private mpr() {
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
            return GeneratedMessageLite.m124022a(f34208f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new mpr();
        } else {
            if (i2 == 4) {
                return new bxvd(f34208f);
            }
            if (i2 == 5) {
                return f34208f;
            }
            bxxk bxxk = f34209g;
            if (bxxk == null) {
                synchronized (mpr.class) {
                    bxxk = f34209g;
                    if (bxxk == null) {
                        bxxk = new bxve(f34208f);
                        f34209g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
