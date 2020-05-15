package p000;

/* renamed from: brar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brar extends bxvk implements bxxd {

    /* renamed from: e */
    public static final brar f142175e;

    /* renamed from: f */
    private static volatile bxxk f142176f;

    /* renamed from: a */
    public int f142177a;

    /* renamed from: b */
    public brak f142178b;

    /* renamed from: c */
    public int f142179c;

    /* renamed from: d */
    public bxtx f142180d = bxtx.f164797b;

    static {
        brar brar = new brar();
        f142175e = brar;
        bxvk.m124024a(brar.class, brar);
    }

    private brar() {
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
            return bxvk.m124022a(f142175e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", brcm.m113876b(), "d"});
        } else if (i2 == 3) {
            return new brar();
        } else {
            if (i2 == 4) {
                return new bxvd(f142175e);
            }
            if (i2 == 5) {
                return f142175e;
            }
            bxxk bxxk = f142176f;
            if (bxxk == null) {
                synchronized (brar.class) {
                    bxxk = f142176f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142175e);
                        f142176f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
