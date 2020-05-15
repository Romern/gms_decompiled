package p000;

/* renamed from: bosn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosn extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bosn f134621f;

    /* renamed from: g */
    private static volatile bxxk f134622g;

    /* renamed from: a */
    public int f134623a;

    /* renamed from: b */
    public String f134624b = "";

    /* renamed from: c */
    public String f134625c = "";

    /* renamed from: d */
    public String f134626d = "";

    /* renamed from: e */
    public String f134627e = "";

    static {
        bosn bosn = new bosn();
        f134621f = bosn;
        bxvk.m124024a(bosn.class, bosn);
    }

    private bosn() {
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
            return bxvk.m124022a(f134621f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bosn();
        } else {
            if (i2 == 4) {
                return new bxvd(f134621f);
            }
            if (i2 == 5) {
                return f134621f;
            }
            bxxk bxxk = f134622g;
            if (bxxk == null) {
                synchronized (bosn.class) {
                    bxxk = f134622g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134621f);
                        f134622g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
