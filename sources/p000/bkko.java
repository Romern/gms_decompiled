package p000;

/* renamed from: bkko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkko extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bkko f124592b;

    /* renamed from: d */
    private static volatile bxxk f124593d;

    /* renamed from: a */
    public String f124594a = "";

    /* renamed from: c */
    private int f124595c;

    static {
        bkko bkko = new bkko();
        f124592b = bkko;
        GeneratedMessageLite.m124024a(bkko.class, bkko);
    }

    private bkko() {
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
            return GeneratedMessageLite.m124022a(f124592b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bkko();
        } else {
            if (i2 == 4) {
                return new bxvd(f124592b);
            }
            if (i2 == 5) {
                return f124592b;
            }
            bxxk bxxk = f124593d;
            if (bxxk == null) {
                synchronized (bkko.class) {
                    bxxk = f124593d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124592b);
                        f124593d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
