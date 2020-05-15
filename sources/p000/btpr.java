package p000;

/* renamed from: btpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btpr f149879b;

    /* renamed from: c */
    private static volatile bxxk f149880c;

    /* renamed from: a */
    public int f149881a;

    static {
        btpr btpr = new btpr();
        f149879b = btpr;
        GeneratedMessageLite.m124024a(btpr.class, btpr);
    }

    private btpr() {
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
            return GeneratedMessageLite.m124022a(f149879b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btpr();
        } else {
            if (i2 == 4) {
                return new bxvd(f149879b);
            }
            if (i2 == 5) {
                return f149879b;
            }
            bxxk bxxk = f149880c;
            if (bxxk == null) {
                synchronized (btpr.class) {
                    bxxk = f149880c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149879b);
                        f149880c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
