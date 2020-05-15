package p000;

/* renamed from: bkkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkd extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bkkd f124509f;

    /* renamed from: g */
    private static volatile bxxk f124510g;

    /* renamed from: a */
    public int f124511a;

    /* renamed from: b */
    public String f124512b = "";

    /* renamed from: c */
    public String f124513c = "";

    /* renamed from: d */
    public String f124514d = "";

    /* renamed from: e */
    public String f124515e = "";

    static {
        bkkd bkkd = new bkkd();
        f124509f = bkkd;
        bxvk.m124024a(bkkd.class, bkkd);
    }

    private bkkd() {
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
            return bxvk.m124022a(f124509f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bkkd();
        } else {
            if (i2 == 4) {
                return new bxvd(f124509f);
            }
            if (i2 == 5) {
                return f124509f;
            }
            bxxk bxxk = f124510g;
            if (bxxk == null) {
                synchronized (bkkd.class) {
                    bxxk = f124510g;
                    if (bxxk == null) {
                        bxxk = new bxve(f124509f);
                        f124510g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
