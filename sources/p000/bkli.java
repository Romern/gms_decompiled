package p000;

/* renamed from: bkli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkli extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bkli f124768j;

    /* renamed from: l */
    private static volatile bxxk f124769l;

    /* renamed from: a */
    public String f124770a = "";

    /* renamed from: b */
    public String f124771b = "";

    /* renamed from: c */
    public long f124772c;

    /* renamed from: d */
    public String f124773d = "";

    /* renamed from: e */
    public boolean f124774e;

    /* renamed from: f */
    public String f124775f = "";

    /* renamed from: g */
    public String f124776g = "";

    /* renamed from: h */
    public long f124777h;

    /* renamed from: i */
    public String f124778i = "";

    /* renamed from: k */
    private int f124779k;

    static {
        bkli bkli = new bkli();
        f124768j = bkli;
        bxvk.m124024a(bkli.class, bkli);
    }

    private bkli() {
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
            return bxvk.m124022a(f124768j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tဈ\b", new Object[]{"k", "a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bkli();
        } else {
            if (i2 == 4) {
                return new bxvd(f124768j);
            }
            if (i2 == 5) {
                return f124768j;
            }
            bxxk bxxk = f124769l;
            if (bxxk == null) {
                synchronized (bkli.class) {
                    bxxk = f124769l;
                    if (bxxk == null) {
                        bxxk = new bxve(f124768j);
                        f124769l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
