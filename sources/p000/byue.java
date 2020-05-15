package p000;

/* renamed from: byue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byue extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byue f167766b;

    /* renamed from: d */
    private static volatile bxxk f167767d;

    /* renamed from: a */
    public String f167768a = "";

    /* renamed from: c */
    private int f167769c;

    static {
        byue byue = new byue();
        f167766b = byue;
        GeneratedMessageLite.m124024a(byue.class, byue);
    }

    private byue() {
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
            return GeneratedMessageLite.m124022a(f167766b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byue();
        } else {
            if (i2 == 4) {
                return new bxvd(f167766b);
            }
            if (i2 == 5) {
                return f167766b;
            }
            bxxk bxxk = f167767d;
            if (bxxk == null) {
                synchronized (byue.class) {
                    bxxk = f167767d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167766b);
                        f167767d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
