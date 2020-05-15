package p000;

/* renamed from: byto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byto extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byto f167695b;

    /* renamed from: d */
    private static volatile bxxk f167696d;

    /* renamed from: a */
    public String f167697a = "";

    /* renamed from: c */
    private int f167698c;

    static {
        byto byto = new byto();
        f167695b = byto;
        bxvk.m124024a(byto.class, byto);
    }

    private byto() {
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
            return bxvk.m124022a(f167695b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byto();
        } else {
            if (i2 == 4) {
                return new bxvd(f167695b);
            }
            if (i2 == 5) {
                return f167695b;
            }
            bxxk bxxk = f167696d;
            if (bxxk == null) {
                synchronized (byto.class) {
                    bxxk = f167696d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167695b);
                        f167696d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
