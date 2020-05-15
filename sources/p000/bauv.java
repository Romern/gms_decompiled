package p000;

/* renamed from: bauv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bauv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bauv f101842b;

    /* renamed from: d */
    private static volatile bxxk f101843d;

    /* renamed from: a */
    public String f101844a = "";

    /* renamed from: c */
    private int f101845c;

    static {
        bauv bauv = new bauv();
        f101842b = bauv;
        GeneratedMessageLite.m124024a(bauv.class, bauv);
    }

    private bauv() {
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
            return GeneratedMessageLite.m124022a(f101842b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bauv();
        } else {
            if (i2 == 4) {
                return new bxvd(f101842b);
            }
            if (i2 == 5) {
                return f101842b;
            }
            bxxk bxxk = f101843d;
            if (bxxk == null) {
                synchronized (bauv.class) {
                    bxxk = f101843d;
                    if (bxxk == null) {
                        bxxk = new bxve(f101842b);
                        f101843d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
