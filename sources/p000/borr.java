package p000;

/* renamed from: borr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final borr f134490e;

    /* renamed from: f */
    private static volatile bxxk f134491f;

    /* renamed from: a */
    public int f134492a;

    /* renamed from: b */
    public String f134493b = "";

    /* renamed from: c */
    public String f134494c = "";

    /* renamed from: d */
    public String f134495d = "";

    static {
        borr borr = new borr();
        f134490e = borr;
        GeneratedMessageLite.m124024a(borr.class, borr);
    }

    private borr() {
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
            return GeneratedMessageLite.m124022a(f134490e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new borr();
        } else {
            if (i2 == 4) {
                return new bxvd(f134490e);
            }
            if (i2 == 5) {
                return f134490e;
            }
            bxxk bxxk = f134491f;
            if (bxxk == null) {
                synchronized (borr.class) {
                    bxxk = f134491f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134490e);
                        f134491f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
