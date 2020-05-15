package p000;

/* renamed from: xau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xau extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final xau f51823d;

    /* renamed from: e */
    private static volatile bxxk f51824e;

    /* renamed from: a */
    public int f51825a;

    /* renamed from: b */
    public int f51826b;

    /* renamed from: c */
    public String f51827c = "";

    static {
        xau xau = new xau();
        f51823d = xau;
        GeneratedMessageLite.m124024a(xau.class, xau);
    }

    private xau() {
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
            return GeneratedMessageLite.m124022a(f51823d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", xas.f51822a, "c"});
        } else if (i2 == 3) {
            return new xau();
        } else {
            if (i2 == 4) {
                return new bxvd(f51823d);
            }
            if (i2 == 5) {
                return f51823d;
            }
            bxxk bxxk = f51824e;
            if (bxxk == null) {
                synchronized (xau.class) {
                    bxxk = f51824e;
                    if (bxxk == null) {
                        bxxk = new bxve(f51823d);
                        f51824e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
