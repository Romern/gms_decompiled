package p000;

/* renamed from: asij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asij extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final asij f89039c;

    /* renamed from: d */
    private static volatile bxxk f89040d;

    /* renamed from: a */
    public int f89041a;

    /* renamed from: b */
    public int f89042b;

    static {
        asij asij = new asij();
        f89039c = asij;
        GeneratedMessageLite.m124024a(asij.class, asij);
    }

    private asij() {
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
            return GeneratedMessageLite.m124022a(f89039c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new asij();
        } else {
            if (i2 == 4) {
                return new bxvd(f89039c);
            }
            if (i2 == 5) {
                return f89039c;
            }
            bxxk bxxk = f89040d;
            if (bxxk == null) {
                synchronized (asij.class) {
                    bxxk = f89040d;
                    if (bxxk == null) {
                        bxxk = new bxve(f89039c);
                        f89040d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
