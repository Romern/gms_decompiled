package p000;

/* renamed from: bzjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzjj f170293e;

    /* renamed from: g */
    private static volatile bxxk f170294g;

    /* renamed from: a */
    public String f170295a = "";

    /* renamed from: b */
    public String f170296b = "";

    /* renamed from: c */
    public String f170297c = "";

    /* renamed from: d */
    public String f170298d = "";

    /* renamed from: f */
    private int f170299f;

    static {
        bzjj bzjj = new bzjj();
        f170293e = bzjj;
        bxvk.m124024a(bzjj.class, bzjj);
    }

    private bzjj() {
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
            return bxvk.m124022a(f170293e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzjj();
        } else {
            if (i2 == 4) {
                return new bxvd(f170293e);
            }
            if (i2 == 5) {
                return f170293e;
            }
            bxxk bxxk = f170294g;
            if (bxxk == null) {
                synchronized (bzjj.class) {
                    bxxk = f170294g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170293e);
                        f170294g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
