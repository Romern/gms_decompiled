package p000;

/* renamed from: abee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abee extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final abee f57180d;

    /* renamed from: e */
    private static volatile bxxk f57181e;

    /* renamed from: a */
    public int f57182a;

    /* renamed from: b */
    public String f57183b = "";

    /* renamed from: c */
    public int f57184c;

    static {
        abee abee = new abee();
        f57180d = abee;
        GeneratedMessageLite.m124024a(abee.class, abee);
    }

    private abee() {
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
            return GeneratedMessageLite.m124022a(f57180d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abee();
        } else {
            if (i2 == 4) {
                return new bxvd(f57180d);
            }
            if (i2 == 5) {
                return f57180d;
            }
            bxxk bxxk = f57181e;
            if (bxxk == null) {
                synchronized (abee.class) {
                    bxxk = f57181e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57180d);
                        f57181e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
