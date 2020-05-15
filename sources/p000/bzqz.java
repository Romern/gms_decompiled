package p000;

/* renamed from: bzqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzqz f171093b;

    /* renamed from: d */
    private static volatile bxxk f171094d;

    /* renamed from: a */
    public String f171095a = "";

    /* renamed from: c */
    private int f171096c;

    static {
        bzqz bzqz = new bzqz();
        f171093b = bzqz;
        GeneratedMessageLite.m124024a(bzqz.class, bzqz);
    }

    private bzqz() {
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
            return GeneratedMessageLite.m124022a(f171093b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f171093b);
            }
            if (i2 == 5) {
                return f171093b;
            }
            bxxk bxxk = f171094d;
            if (bxxk == null) {
                synchronized (bzqz.class) {
                    bxxk = f171094d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171093b);
                        f171094d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
