package p000;

/* renamed from: bmci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmci extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmci f128687d;

    /* renamed from: e */
    private static volatile bxxk f128688e;

    /* renamed from: a */
    public int f128689a;

    /* renamed from: b */
    public long f128690b;

    /* renamed from: c */
    public String f128691c = "";

    static {
        bmci bmci = new bmci();
        f128687d = bmci;
        GeneratedMessageLite.m124024a(bmci.class, bmci);
    }

    private bmci() {
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
            return GeneratedMessageLite.m124022a(f128687d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmci();
        } else {
            if (i2 == 4) {
                return new bxvd(f128687d);
            }
            if (i2 == 5) {
                return f128687d;
            }
            bxxk bxxk = f128688e;
            if (bxxk == null) {
                synchronized (bmci.class) {
                    bxxk = f128688e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128687d);
                        f128688e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
