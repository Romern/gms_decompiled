package p000;

/* renamed from: bxay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxay extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxay f161761b;

    /* renamed from: d */
    private static volatile bxxk f161762d;

    /* renamed from: a */
    public long f161763a;

    /* renamed from: c */
    private int f161764c;

    static {
        bxay bxay = new bxay();
        f161761b = bxay;
        GeneratedMessageLite.m124024a(bxay.class, bxay);
    }

    private bxay() {
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
            return GeneratedMessageLite.m124022a(f161761b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxay();
        } else {
            if (i2 == 4) {
                return new bxvd(f161761b);
            }
            if (i2 == 5) {
                return f161761b;
            }
            bxxk bxxk = f161762d;
            if (bxxk == null) {
                synchronized (bxay.class) {
                    bxxk = f161762d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161761b);
                        f161762d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
