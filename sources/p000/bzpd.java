package p000;

/* renamed from: bzpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzpd f170900b;

    /* renamed from: d */
    private static volatile bxxk f170901d;

    /* renamed from: a */
    public bzrk f170902a;

    /* renamed from: c */
    private int f170903c;

    static {
        bzpd bzpd = new bzpd();
        f170900b = bzpd;
        GeneratedMessageLite.m124024a(bzpd.class, bzpd);
    }

    private bzpd() {
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
            return GeneratedMessageLite.m124022a(f170900b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f170900b);
            }
            if (i2 == 5) {
                return f170900b;
            }
            bxxk bxxk = f170901d;
            if (bxxk == null) {
                synchronized (bzpd.class) {
                    bxxk = f170901d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170900b);
                        f170901d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
