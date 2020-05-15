package p000;

/* renamed from: bmlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmlk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmlk f129941b;

    /* renamed from: d */
    private static volatile bxxk f129942d;

    /* renamed from: a */
    public int f129943a;

    /* renamed from: c */
    private int f129944c;

    static {
        bmlk bmlk = new bmlk();
        f129941b = bmlk;
        bxvk.m124024a(bmlk.class, bmlk);
    }

    private bmlk() {
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
            return bxvk.m124022a(f129941b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"c", "a", bmli.f129940a});
        } else if (i2 == 3) {
            return new bmlk();
        } else {
            if (i2 == 4) {
                return new bxvd(f129941b);
            }
            if (i2 == 5) {
                return f129941b;
            }
            bxxk bxxk = f129942d;
            if (bxxk == null) {
                synchronized (bmlk.class) {
                    bxxk = f129942d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129941b);
                        f129942d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
