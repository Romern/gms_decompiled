package p000;

/* renamed from: biux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biux extends bxvk implements bxxd {

    /* renamed from: b */
    public static final biux f121881b;

    /* renamed from: e */
    private static volatile bxxk f121882e;

    /* renamed from: a */
    public int f121883a = 1;

    /* renamed from: c */
    private int f121884c;

    /* renamed from: d */
    private byte f121885d = 2;

    static {
        biux biux = new biux();
        f121881b = biux;
        bxvk.m124024a(biux.class, biux);
    }

    private biux() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121885d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121885d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121881b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"c", "a", biva.m102864b()});
        } else if (i2 == 3) {
            return new biux();
        } else {
            if (i2 == 4) {
                return new bxvd(f121881b);
            }
            if (i2 == 5) {
                return f121881b;
            }
            bxxk bxxk = f121882e;
            if (bxxk == null) {
                synchronized (biux.class) {
                    bxxk = f121882e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121881b);
                        f121882e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
