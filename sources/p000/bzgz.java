package p000;

/* renamed from: bzgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzgz f170007c;

    /* renamed from: e */
    private static volatile bxxk f170008e;

    /* renamed from: a */
    public String f170009a = "";

    /* renamed from: b */
    public String f170010b = "";

    /* renamed from: d */
    private int f170011d;

    static {
        bzgz bzgz = new bzgz();
        f170007c = bzgz;
        GeneratedMessageLite.m124024a(bzgz.class, bzgz);
    }

    private bzgz() {
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
            return GeneratedMessageLite.m124022a(f170007c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzgz();
        } else {
            if (i2 == 4) {
                return new bxvd(f170007c);
            }
            if (i2 == 5) {
                return f170007c;
            }
            bxxk bxxk = f170008e;
            if (bxxk == null) {
                synchronized (bzgz.class) {
                    bxxk = f170008e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170007c);
                        f170008e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
