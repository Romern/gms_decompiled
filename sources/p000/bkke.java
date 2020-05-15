package p000;

/* renamed from: bkke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkke extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bkke f124516i;

    /* renamed from: m */
    private static volatile bxxk f124517m;

    /* renamed from: a */
    public String f124518a = "";

    /* renamed from: b */
    public String f124519b = "";

    /* renamed from: c */
    public String f124520c = "";

    /* renamed from: d */
    public long f124521d;

    /* renamed from: e */
    public String f124522e = "";

    /* renamed from: f */
    public boolean f124523f;

    /* renamed from: g */
    public String f124524g = "";

    /* renamed from: h */
    public bxwc f124525h = bxxn.f165040b;

    /* renamed from: j */
    private int f124526j;

    /* renamed from: k */
    private String f124527k = "";

    /* renamed from: l */
    private byte f124528l = 2;

    static {
        bkke bkke = new bkke();
        f124516i = bkke;
        GeneratedMessageLite.m124024a(bkke.class, bkke);
    }

    private bkke() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124528l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124528l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f124516i, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဈ\u0007\t\u001b", new Object[]{"j", "k", "a", "b", "c", "d", "e", "f", "g", "h", bkll.class});
        } else if (i2 == 3) {
            return new bkke();
        } else {
            if (i2 == 4) {
                return new bxvd(f124516i);
            }
            if (i2 == 5) {
                return f124516i;
            }
            bxxk bxxk = f124517m;
            if (bxxk == null) {
                synchronized (bkke.class) {
                    bxxk = f124517m;
                    if (bxxk == null) {
                        bxxk = new bxve(f124516i);
                        f124517m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
