package p000;

/* renamed from: bqyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqyk f141959c;

    /* renamed from: d */
    private static volatile bxxk f141960d;

    /* renamed from: a */
    public int f141961a;

    /* renamed from: b */
    public String f141962b = "";

    static {
        bqyk bqyk = new bqyk();
        f141959c = bqyk;
        GeneratedMessageLite.m124024a(bqyk.class, bqyk);
    }

    private bqyk() {
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
            return GeneratedMessageLite.m124022a(f141959c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqyk();
        } else {
            if (i2 == 4) {
                return new bxvd(f141959c);
            }
            if (i2 == 5) {
                return f141959c;
            }
            bxxk bxxk = f141960d;
            if (bxxk == null) {
                synchronized (bqyk.class) {
                    bxxk = f141960d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141959c);
                        f141960d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
