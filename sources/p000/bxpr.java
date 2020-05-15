package p000;

/* renamed from: bxpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxpr f164303d;

    /* renamed from: e */
    private static volatile bxxk f164304e;

    /* renamed from: a */
    public int f164305a;

    /* renamed from: b */
    public int f164306b;

    /* renamed from: c */
    public int f164307c;

    static {
        bxpr bxpr = new bxpr();
        f164303d = bxpr;
        GeneratedMessageLite.m124024a(bxpr.class, bxpr);
    }

    private bxpr() {
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
            return GeneratedMessageLite.m124022a(f164303d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bxpq.f164302a, "c"});
        } else if (i2 == 3) {
            return new bxpr();
        } else {
            if (i2 == 4) {
                return new bxvd(f164303d);
            }
            if (i2 == 5) {
                return f164303d;
            }
            bxxk bxxk = f164304e;
            if (bxxk == null) {
                synchronized (bxpr.class) {
                    bxxk = f164304e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164303d);
                        f164304e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
