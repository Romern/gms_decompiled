package p000;

/* renamed from: bkkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkkr f124611e;

    /* renamed from: f */
    private static volatile bxxk f124612f;

    /* renamed from: a */
    public int f124613a;

    /* renamed from: b */
    public String f124614b = "";

    /* renamed from: c */
    public String f124615c = "";

    /* renamed from: d */
    public String f124616d = "";

    static {
        bkkr bkkr = new bkkr();
        f124611e = bkkr;
        GeneratedMessageLite.m124024a(bkkr.class, bkkr);
    }

    private bkkr() {
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
            return GeneratedMessageLite.m124022a(f124611e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f124611e);
            }
            if (i2 == 5) {
                return f124611e;
            }
            bxxk bxxk = f124612f;
            if (bxxk == null) {
                synchronized (bkkr.class) {
                    bxxk = f124612f;
                    if (bxxk == null) {
                        bxxk = new bxve(f124611e);
                        f124612f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
