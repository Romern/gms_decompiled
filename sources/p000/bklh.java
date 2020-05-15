package p000;

/* renamed from: bklh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklh extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bklh f124757j;

    /* renamed from: k */
    private static volatile bxxk f124758k;

    /* renamed from: a */
    public int f124759a;

    /* renamed from: b */
    public String f124760b = "";

    /* renamed from: c */
    public String f124761c = "";

    /* renamed from: d */
    public String f124762d = "";

    /* renamed from: e */
    public String f124763e = "";

    /* renamed from: f */
    public String f124764f = "";

    /* renamed from: g */
    public String f124765g = "";

    /* renamed from: h */
    public int f124766h;

    /* renamed from: i */
    public String f124767i = "";

    static {
        bklh bklh = new bklh();
        f124757j = bklh;
        GeneratedMessageLite.m124024a(bklh.class, bklh);
    }

    private bklh() {
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
            return GeneratedMessageLite.m124022a(f124757j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bklq.f124833a, "i"});
        } else if (i2 == 3) {
            return new bklh();
        } else {
            if (i2 == 4) {
                return new bxvd(f124757j);
            }
            if (i2 == 5) {
                return f124757j;
            }
            bxxk bxxk = f124758k;
            if (bxxk == null) {
                synchronized (bklh.class) {
                    bxxk = f124758k;
                    if (bxxk == null) {
                        bxxk = new bxve(f124757j);
                        f124758k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
