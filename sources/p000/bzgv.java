package p000;

/* renamed from: bzgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzgv f169987e;

    /* renamed from: f */
    private static volatile bxxk f169988f;

    /* renamed from: a */
    public int f169989a;

    /* renamed from: b */
    public long f169990b;

    /* renamed from: c */
    public bzru f169991c;

    /* renamed from: d */
    public String f169992d = "";

    static {
        bzgv bzgv = new bzgv();
        f169987e = bzgv;
        bxvk.m124024a(bzgv.class, bzgv);
    }

    private bzgv() {
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
            return bxvk.m124022a(f169987e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဈ\u0003\u0005ဉ\u0002", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new bzgv();
        } else {
            if (i2 == 4) {
                return new bxvd(f169987e);
            }
            if (i2 == 5) {
                return f169987e;
            }
            bxxk bxxk = f169988f;
            if (bxxk == null) {
                synchronized (bzgv.class) {
                    bxxk = f169988f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169987e);
                        f169988f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
