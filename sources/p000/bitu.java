package p000;

/* renamed from: bitu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bitu f121721b;

    /* renamed from: d */
    private static volatile bxxk f121722d;

    /* renamed from: a */
    public bxwc f121723a = bxxn.f165040b;

    /* renamed from: c */
    private byte f121724c = 2;

    static {
        bitu bitu = new bitu();
        f121721b = bitu;
        bxvk.m124024a(bitu.class, bitu);
    }

    private bitu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121724c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121724c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121721b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bitt.class});
        } else if (i2 == 3) {
            return new bitu();
        } else {
            if (i2 == 4) {
                return new bxvd(f121721b);
            }
            if (i2 == 5) {
                return f121721b;
            }
            bxxk bxxk = f121722d;
            if (bxxk == null) {
                synchronized (bitu.class) {
                    bxxk = f121722d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121721b);
                        f121722d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
