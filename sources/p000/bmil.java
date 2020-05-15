package p000;

/* renamed from: bmil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmil extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmil f129588g;

    /* renamed from: h */
    private static volatile bxxk f129589h;

    /* renamed from: a */
    public int f129590a;

    /* renamed from: b */
    public bmdn f129591b;

    /* renamed from: c */
    public bxwc f129592c = bxxn.f165040b;

    /* renamed from: d */
    public String f129593d = "";

    /* renamed from: e */
    public String f129594e = "";

    /* renamed from: f */
    public bmjf f129595f;

    static {
        bmil bmil = new bmil();
        f129588g = bmil;
        bxvk.m124024a(bmil.class, bmil);
    }

    private bmil() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f129588g, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0001\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဉ\t\u0004ဉ\u0000\u000b\u001b", new Object[]{"a", "d", "e", "f", "b", "c", bmqf.class});
        } else if (i2 == 3) {
            return new bmil();
        } else {
            if (i2 == 4) {
                return new bxvd(f129588g);
            }
            if (i2 == 5) {
                return f129588g;
            }
            bxxk bxxk = f129589h;
            if (bxxk == null) {
                synchronized (bmil.class) {
                    bxxk = f129589h;
                    if (bxxk == null) {
                        bxxk = new bxve(f129588g);
                        f129589h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
