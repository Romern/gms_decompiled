package p000;

/* renamed from: bzfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzfw f169881e;

    /* renamed from: f */
    private static volatile bxxk f169882f;

    /* renamed from: a */
    public int f169883a;

    /* renamed from: b */
    public String f169884b = "";

    /* renamed from: c */
    public String f169885c = "";

    /* renamed from: d */
    public String f169886d = "";

    static {
        bzfw bzfw = new bzfw();
        f169881e = bzfw;
        bxvk.m124024a(bzfw.class, bzfw);
    }

    private bzfw() {
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
            return bxvk.m124022a(f169881e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzfw();
        } else {
            if (i2 == 4) {
                return new bxvd(f169881e);
            }
            if (i2 == 5) {
                return f169881e;
            }
            bxxk bxxk = f169882f;
            if (bxxk == null) {
                synchronized (bzfw.class) {
                    bxxk = f169882f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169881e);
                        f169882f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
