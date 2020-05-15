package p000;

/* renamed from: bxre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxre extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxre f164546c;

    /* renamed from: d */
    private static volatile bxxk f164547d;

    /* renamed from: a */
    public int f164548a;

    /* renamed from: b */
    public String f164549b = "";

    static {
        bxre bxre = new bxre();
        f164546c = bxre;
        bxvk.m124024a(bxre.class, bxre);
    }

    private bxre() {
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
            return bxvk.m124022a(f164546c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxre();
        } else {
            if (i2 == 4) {
                return new bxvd(f164546c);
            }
            if (i2 == 5) {
                return f164546c;
            }
            bxxk bxxk = f164547d;
            if (bxxk == null) {
                synchronized (bxre.class) {
                    bxxk = f164547d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164546c);
                        f164547d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
