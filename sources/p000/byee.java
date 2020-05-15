package p000;

/* renamed from: byee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byee extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byee f165893d;

    /* renamed from: e */
    private static volatile bxxk f165894e;

    /* renamed from: a */
    public int f165895a;

    /* renamed from: b */
    public String f165896b = "";

    /* renamed from: c */
    public String f165897c = "";

    static {
        byee byee = new byee();
        f165893d = byee;
        GeneratedMessageLite.m124024a(byee.class, byee);
    }

    private byee() {
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
            return GeneratedMessageLite.m124022a(f165893d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byee();
        } else {
            if (i2 == 4) {
                return new bxvd(f165893d);
            }
            if (i2 == 5) {
                return f165893d;
            }
            bxxk bxxk = f165894e;
            if (bxxk == null) {
                synchronized (byee.class) {
                    bxxk = f165894e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165893d);
                        f165894e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
