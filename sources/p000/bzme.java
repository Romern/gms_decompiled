package p000;

/* renamed from: bzme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzme extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzme f170605c;

    /* renamed from: d */
    private static volatile bxxk f170606d;

    /* renamed from: a */
    public int f170607a;

    /* renamed from: b */
    public int f170608b;

    static {
        bzme bzme = new bzme();
        f170605c = bzme;
        bxvk.m124024a(bzme.class, bzme);
    }

    private bzme() {
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
            return bxvk.m124022a(f170605c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzmc.f170604a});
        } else if (i2 == 3) {
            return new bzme();
        } else {
            if (i2 == 4) {
                return new bxvd(f170605c);
            }
            if (i2 == 5) {
                return f170605c;
            }
            bxxk bxxk = f170606d;
            if (bxxk == null) {
                synchronized (bzme.class) {
                    bxxk = f170606d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170605c);
                        f170606d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
