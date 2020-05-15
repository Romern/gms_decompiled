package p000;

/* renamed from: bkkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkl extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final bkkl f124568o;

    /* renamed from: p */
    private static volatile bxxk f124569p;

    /* renamed from: a */
    public int f124570a;

    /* renamed from: b */
    public int f124571b;

    /* renamed from: c */
    public String f124572c = "";

    /* renamed from: d */
    public String f124573d = "";

    /* renamed from: e */
    public String f124574e = "";

    /* renamed from: f */
    public String f124575f = "";

    /* renamed from: g */
    public String f124576g = "";

    /* renamed from: h */
    public String f124577h = "";

    /* renamed from: i */
    public String f124578i = "";

    /* renamed from: j */
    public boolean f124579j;

    /* renamed from: k */
    public String f124580k = "";

    /* renamed from: l */
    public boolean f124581l;

    /* renamed from: m */
    public String f124582m = "";

    /* renamed from: n */
    public String f124583n = "";

    static {
        bkkl bkkl = new bkkl();
        f124568o = bkkl;
        GeneratedMessageLite.m124024a(bkkl.class, bkkl);
    }

    private bkkl() {
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
            return GeneratedMessageLite.m124022a(f124568o, "\u0001\r\u0000\u0001\u0001\u0012\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဇ\u000b\rဈ\f\u000eဇ\r\u000fဈ\u000e\u0012ဈ\u000f", new Object[]{"a", "b", bsmm.m115979b(), "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new bkkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f124568o);
            }
            if (i2 == 5) {
                return f124568o;
            }
            bxxk bxxk = f124569p;
            if (bxxk == null) {
                synchronized (bkkl.class) {
                    bxxk = f124569p;
                    if (bxxk == null) {
                        bxxk = new bxve(f124568o);
                        f124569p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
