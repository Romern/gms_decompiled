package p000;

/* renamed from: bzkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzkb f170369c;

    /* renamed from: d */
    private static volatile bxxk f170370d;

    /* renamed from: a */
    public int f170371a;

    /* renamed from: b */
    public bzkd f170372b;

    static {
        bzkb bzkb = new bzkb();
        f170369c = bzkb;
        GeneratedMessageLite.m124024a(bzkb.class, bzkb);
    }

    private bzkb() {
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
            return GeneratedMessageLite.m124022a(f170369c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzkb();
        } else {
            if (i2 == 4) {
                return new bxvd(f170369c);
            }
            if (i2 == 5) {
                return f170369c;
            }
            bxxk bxxk = f170370d;
            if (bxxk == null) {
                synchronized (bzkb.class) {
                    bxxk = f170370d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170369c);
                        f170370d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
