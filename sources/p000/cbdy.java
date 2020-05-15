package p000;

/* renamed from: cbdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbdy f176809d;

    /* renamed from: e */
    private static volatile bxxk f176810e;

    /* renamed from: a */
    public String f176811a = "";

    /* renamed from: b */
    public cbdj f176812b;

    /* renamed from: c */
    public bxtx f176813c = bxtx.f164797b;

    static {
        cbdy cbdy = new cbdy();
        f176809d = cbdy;
        bxvk.m124024a(cbdy.class, cbdy);
    }

    private cbdy() {
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
            return bxvk.m124022a(f176809d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbdy();
        } else {
            if (i2 == 4) {
                return new bxvd(f176809d);
            }
            if (i2 == 5) {
                return f176809d;
            }
            bxxk bxxk = f176810e;
            if (bxxk == null) {
                synchronized (cbdy.class) {
                    bxxk = f176810e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176809d);
                        f176810e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
