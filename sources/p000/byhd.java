package p000;

/* renamed from: byhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byhd f166431c;

    /* renamed from: d */
    private static volatile bxxk f166432d;

    /* renamed from: a */
    public int f166433a;

    /* renamed from: b */
    public String f166434b = "";

    static {
        byhd byhd = new byhd();
        f166431c = byhd;
        bxvk.m124024a(byhd.class, byhd);
    }

    private byhd() {
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
            return bxvk.m124022a(f166431c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byhd();
        } else {
            if (i2 == 4) {
                return new bxvd(f166431c);
            }
            if (i2 == 5) {
                return f166431c;
            }
            bxxk bxxk = f166432d;
            if (bxxk == null) {
                synchronized (byhd.class) {
                    bxxk = f166432d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166431c);
                        f166432d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
