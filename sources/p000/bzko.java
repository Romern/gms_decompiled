package p000;

/* renamed from: bzko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzko extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzko f170448b;

    /* renamed from: d */
    private static volatile bxxk f170449d;

    /* renamed from: a */
    public int f170450a;

    /* renamed from: c */
    private int f170451c;

    static {
        bzko bzko = new bzko();
        f170448b = bzko;
        GeneratedMessageLite.m124024a(bzko.class, bzko);
    }

    private bzko() {
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
            return GeneratedMessageLite.m124022a(f170448b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bzkm.f170447a});
        } else if (i2 == 3) {
            return new bzko();
        } else {
            if (i2 == 4) {
                return new bxvd(f170448b);
            }
            if (i2 == 5) {
                return f170448b;
            }
            bxxk bxxk = f170449d;
            if (bxxk == null) {
                synchronized (bzko.class) {
                    bxxk = f170449d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170448b);
                        f170449d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
