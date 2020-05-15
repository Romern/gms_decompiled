package p000;

/* renamed from: amme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amme extends bxvk implements bxxd {

    /* renamed from: d */
    public static final amme f75277d;

    /* renamed from: e */
    private static volatile bxxk f75278e;

    /* renamed from: a */
    public int f75279a;

    /* renamed from: b */
    public String f75280b = "";

    /* renamed from: c */
    public int f75281c;

    static {
        amme amme = new amme();
        f75277d = amme;
        bxvk.m124024a(amme.class, amme);
    }

    private amme() {
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
            return bxvk.m124022a(f75277d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new amme();
        } else {
            if (i2 == 4) {
                return new bxvd(f75277d);
            }
            if (i2 == 5) {
                return f75277d;
            }
            bxxk bxxk = f75278e;
            if (bxxk == null) {
                synchronized (amme.class) {
                    bxxk = f75278e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75277d);
                        f75278e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
