package p000;

/* renamed from: bxni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxni extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxni f164032d;

    /* renamed from: e */
    private static volatile bxxk f164033e;

    /* renamed from: a */
    public int f164034a;

    /* renamed from: b */
    public int f164035b;

    /* renamed from: c */
    public bxvw f164036c = bxwq.f165002b;

    static {
        bxni bxni = new bxni();
        f164032d = bxni;
        bxvk.m124024a(bxni.class, bxni);
    }

    private bxni() {
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
            return bxvk.m124022a(f164032d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0014", new Object[]{"a", "b", bxng.f164031a, "c"});
        } else if (i2 == 3) {
            return new bxni();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f164032d;
            }
            bxxk bxxk = f164033e;
            if (bxxk == null) {
                synchronized (bxni.class) {
                    bxxk = f164033e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164032d);
                        f164033e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
