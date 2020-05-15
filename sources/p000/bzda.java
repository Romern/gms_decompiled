package p000;

/* renamed from: bzda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzda extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzda f169458d;

    /* renamed from: e */
    private static volatile bxxk f169459e;

    /* renamed from: a */
    public int f169460a;

    /* renamed from: b */
    public int f169461b;

    /* renamed from: c */
    public String f169462c = "";

    static {
        bzda bzda = new bzda();
        f169458d = bzda;
        bxvk.m124024a(bzda.class, bzda);
    }

    private bzda() {
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
            return bxvk.m124022a(f169458d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bzcz.m125678b(), "c"});
        } else if (i2 == 3) {
            return new bzda();
        } else {
            if (i2 == 4) {
                return new bxvd(f169458d);
            }
            if (i2 == 5) {
                return f169458d;
            }
            bxxk bxxk = f169459e;
            if (bxxk == null) {
                synchronized (bzda.class) {
                    bxxk = f169459e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169458d);
                        f169459e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
