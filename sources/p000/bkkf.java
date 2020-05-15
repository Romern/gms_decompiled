package p000;

/* renamed from: bkkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkf extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bkkf f124529g;

    /* renamed from: h */
    private static volatile bxxk f124530h;

    /* renamed from: a */
    public int f124531a;

    /* renamed from: b */
    public int f124532b = 0;

    /* renamed from: c */
    public Object f124533c;

    /* renamed from: d */
    public String f124534d = "";

    /* renamed from: e */
    public int f124535e;

    /* renamed from: f */
    public String f124536f = "";

    static {
        bkkf bkkf = new bkkf();
        f124529g = bkkf;
        GeneratedMessageLite.m124024a(bkkf.class, bkkf);
    }

    private bkkf() {
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
            return GeneratedMessageLite.m124022a(f124529g, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", "e", bybu.f165599a, "f", bybs.class});
        } else if (i2 == 3) {
            return new bkkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f124529g);
            }
            if (i2 == 5) {
                return f124529g;
            }
            bxxk bxxk = f124530h;
            if (bxxk == null) {
                synchronized (bkkf.class) {
                    bxxk = f124530h;
                    if (bxxk == null) {
                        bxxk = new bxve(f124529g);
                        f124530h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
