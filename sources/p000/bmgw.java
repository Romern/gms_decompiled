package p000;

/* renamed from: bmgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmgw f129350e;

    /* renamed from: f */
    private static volatile bxxk f129351f;

    /* renamed from: a */
    public int f129352a;

    /* renamed from: b */
    public String f129353b = "";

    /* renamed from: c */
    public bxtx f129354c = bxtx.f164797b;

    /* renamed from: d */
    public String f129355d = "";

    static {
        bmgw bmgw = new bmgw();
        f129350e = bmgw;
        bxvk.m124024a(bmgw.class, bmgw);
    }

    private bmgw() {
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
            return bxvk.m124022a(f129350e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmgw();
        } else {
            if (i2 == 4) {
                return new bxvd(f129350e);
            }
            if (i2 == 5) {
                return f129350e;
            }
            bxxk bxxk = f129351f;
            if (bxxk == null) {
                synchronized (bmgw.class) {
                    bxxk = f129351f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129350e);
                        f129351f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
