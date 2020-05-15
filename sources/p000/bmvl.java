package p000;

/* renamed from: bmvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmvl f131062d;

    /* renamed from: e */
    private static volatile bxxk f131063e;

    /* renamed from: a */
    public int f131064a;

    /* renamed from: b */
    public String f131065b = "";

    /* renamed from: c */
    public String f131066c = "";

    static {
        bmvl bmvl = new bmvl();
        f131062d = bmvl;
        bxvk.m124024a(bmvl.class, bmvl);
    }

    private bmvl() {
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
            return bxvk.m124022a(f131062d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvl();
        } else {
            if (i2 == 4) {
                return new bxvd(f131062d);
            }
            if (i2 == 5) {
                return f131062d;
            }
            bxxk bxxk = f131063e;
            if (bxxk == null) {
                synchronized (bmvl.class) {
                    bxxk = f131063e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131062d);
                        f131063e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
