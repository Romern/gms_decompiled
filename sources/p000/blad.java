package p000;

/* renamed from: blad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blad extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blad f125740a;

    /* renamed from: e */
    private static volatile bxxk f125741e;

    /* renamed from: b */
    private int f125742b;

    /* renamed from: c */
    private int f125743c;

    /* renamed from: d */
    private byte f125744d = 2;

    static {
        blad blad = new blad();
        f125740a = blad;
        bxvk.m124024a(blad.class, blad);
    }

    private blad() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125744d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125744d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125740a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blfz.f126416a});
        } else if (i2 == 3) {
            return new blad();
        } else {
            if (i2 == 4) {
                return new bxvd(f125740a);
            }
            if (i2 == 5) {
                return f125740a;
            }
            bxxk bxxk = f125741e;
            if (bxxk == null) {
                synchronized (blad.class) {
                    bxxk = f125741e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125740a);
                        f125741e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
