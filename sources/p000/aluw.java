package p000;

/* renamed from: aluw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aluw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aluw f74347c;

    /* renamed from: e */
    private static volatile bxxk f74348e;

    /* renamed from: a */
    public bxwc f74349a = bxxn.f165040b;

    /* renamed from: b */
    public int f74350b;

    /* renamed from: d */
    private int f74351d;

    static {
        aluw aluw = new aluw();
        f74347c = aluw;
        bxvk.m124024a(aluw.class, aluw);
    }

    private aluw() {
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
            return bxvk.m124022a(f74347c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "a", alvg.class, "b", aluu.f74346a});
        } else if (i2 == 3) {
            return new aluw();
        } else {
            if (i2 == 4) {
                return new bxvd(f74347c);
            }
            if (i2 == 5) {
                return f74347c;
            }
            bxxk bxxk = f74348e;
            if (bxxk == null) {
                synchronized (aluw.class) {
                    bxxk = f74348e;
                    if (bxxk == null) {
                        bxxk = new bxve(f74347c);
                        f74348e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
