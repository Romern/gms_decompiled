package p000;

/* renamed from: bmqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmqs f130419c;

    /* renamed from: e */
    private static volatile bxxk f130420e;

    /* renamed from: a */
    public String f130421a = "";

    /* renamed from: b */
    public long f130422b;

    /* renamed from: d */
    private int f130423d;

    static {
        bmqs bmqs = new bmqs();
        f130419c = bmqs;
        GeneratedMessageLite.m124024a(bmqs.class, bmqs);
    }

    private bmqs() {
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
            return GeneratedMessageLite.m124022a(f130419c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f130419c);
            }
            if (i2 == 5) {
                return f130419c;
            }
            bxxk bxxk = f130420e;
            if (bxxk == null) {
                synchronized (bmqs.class) {
                    bxxk = f130420e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130419c);
                        f130420e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
