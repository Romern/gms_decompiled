package p000;

/* renamed from: bycm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bycm f165667e;

    /* renamed from: f */
    private static volatile bxxk f165668f;

    /* renamed from: a */
    public int f165669a;

    /* renamed from: b */
    public int f165670b;

    /* renamed from: c */
    public int f165671c;

    /* renamed from: d */
    public int f165672d;

    static {
        bycm bycm = new bycm();
        f165667e = bycm;
        GeneratedMessageLite.m124024a(bycm.class, bycm);
    }

    private bycm() {
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
            return GeneratedMessageLite.m124022a(f165667e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bycm();
        } else {
            if (i2 == 4) {
                return new bxvd(f165667e);
            }
            if (i2 == 5) {
                return f165667e;
            }
            bxxk bxxk = f165668f;
            if (bxxk == null) {
                synchronized (bycm.class) {
                    bxxk = f165668f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165667e);
                        f165668f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
