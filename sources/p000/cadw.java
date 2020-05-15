package p000;

/* renamed from: cadw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadw extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cadw f172748g;

    /* renamed from: i */
    private static volatile bxxk f172749i;

    /* renamed from: a */
    public int f172750a;

    /* renamed from: b */
    public String f172751b = "";

    /* renamed from: c */
    public String f172752c = "";

    /* renamed from: d */
    public String f172753d = "";

    /* renamed from: e */
    public String f172754e = "";

    /* renamed from: f */
    public int f172755f;

    /* renamed from: h */
    private byte f172756h = 2;

    static {
        cadw cadw = new cadw();
        f172748g = cadw;
        bxvk.m124024a(cadw.class, cadw);
    }

    private cadw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172756h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172756h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172748g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cadw();
        } else {
            if (i2 == 4) {
                return new bxvd(f172748g);
            }
            if (i2 == 5) {
                return f172748g;
            }
            bxxk bxxk = f172749i;
            if (bxxk == null) {
                synchronized (cadw.class) {
                    bxxk = f172749i;
                    if (bxxk == null) {
                        bxxk = new bxve(f172748g);
                        f172749i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
