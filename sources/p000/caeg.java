package p000;

/* renamed from: caeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caeg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final caeg f172816c;

    /* renamed from: e */
    private static volatile bxxk f172817e;

    /* renamed from: a */
    public int f172818a;

    /* renamed from: b */
    public long f172819b;

    /* renamed from: d */
    private int f172820d;

    static {
        caeg caeg = new caeg();
        f172816c = caeg;
        GeneratedMessageLite.m124024a(caeg.class, caeg);
    }

    private caeg() {
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
            return GeneratedMessageLite.m124022a(f172816c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new caeg();
        } else {
            if (i2 == 4) {
                return new bxvd(f172816c);
            }
            if (i2 == 5) {
                return f172816c;
            }
            bxxk bxxk = f172817e;
            if (bxxk == null) {
                synchronized (caeg.class) {
                    bxxk = f172817e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172816c);
                        f172817e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
