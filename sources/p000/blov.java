package p000;

/* renamed from: blov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blov extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blov f127149f;

    /* renamed from: h */
    private static volatile bxxk f127150h;

    /* renamed from: a */
    public int f127151a;

    /* renamed from: b */
    public blot f127152b;

    /* renamed from: c */
    public blou f127153c;

    /* renamed from: d */
    public boolean f127154d;

    /* renamed from: e */
    public boolean f127155e;

    /* renamed from: g */
    private byte f127156g = 2;

    static {
        blov blov = new blov();
        f127149f = blov;
        bxvk.m124024a(blov.class, blov);
    }

    private blov() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127156g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127156g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127149f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blov();
        } else {
            if (i2 == 4) {
                return new bxvd(f127149f);
            }
            if (i2 == 5) {
                return f127149f;
            }
            bxxk bxxk = f127150h;
            if (bxxk == null) {
                synchronized (blov.class) {
                    bxxk = f127150h;
                    if (bxxk == null) {
                        bxxk = new bxve(f127149f);
                        f127150h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
