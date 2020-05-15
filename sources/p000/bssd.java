package p000;

/* renamed from: bssd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssd extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bssd f146839f;

    /* renamed from: g */
    private static volatile bxxk f146840g;

    /* renamed from: a */
    public int f146841a;

    /* renamed from: b */
    public int f146842b;

    /* renamed from: c */
    public bssa f146843c;

    /* renamed from: d */
    public bssa f146844d;

    /* renamed from: e */
    public bssa f146845e;

    static {
        bssd bssd = new bssd();
        f146839f = bssd;
        bxvk.m124024a(bssd.class, bssd);
    }

    private bssd() {
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
            return bxvk.m124022a(f146839f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", bssc.m116142b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new bssd();
        } else {
            if (i2 == 4) {
                return new bxvd(f146839f);
            }
            if (i2 == 5) {
                return f146839f;
            }
            bxxk bxxk = f146840g;
            if (bxxk == null) {
                synchronized (bssd.class) {
                    bxxk = f146840g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146839f);
                        f146840g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
