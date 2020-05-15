package p000;

/* renamed from: bisy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bisy f121611c;

    /* renamed from: e */
    private static volatile bxxk f121612e;

    /* renamed from: a */
    public int f121613a;

    /* renamed from: b */
    public int f121614b;

    /* renamed from: d */
    private byte f121615d = 2;

    static {
        bisy bisy = new bisy();
        f121611c = bisy;
        bxvk.m124024a(bisy.class, bisy);
    }

    private bisy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121615d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121615d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121611c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", bisw.f121610a});
        } else if (i2 == 3) {
            return new bisy();
        } else {
            if (i2 == 4) {
                return new bxvd(f121611c);
            }
            if (i2 == 5) {
                return f121611c;
            }
            bxxk bxxk = f121612e;
            if (bxxk == null) {
                synchronized (bisy.class) {
                    bxxk = f121612e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121611c);
                        f121612e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
