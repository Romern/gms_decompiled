package p000;

/* renamed from: bkzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bkzz f125719a;

    /* renamed from: e */
    private static volatile bxxk f125720e;

    /* renamed from: b */
    private int f125721b;

    /* renamed from: c */
    private int f125722c;

    /* renamed from: d */
    private byte f125723d = 2;

    static {
        bkzz bkzz = new bkzz();
        f125719a = bkzz;
        bxvk.m124024a(bkzz.class, bkzz);
    }

    private bkzz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125723d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125723d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125719a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blfu.f126411a});
        } else if (i2 == 3) {
            return new bkzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f125719a);
            }
            if (i2 == 5) {
                return f125719a;
            }
            bxxk bxxk = f125720e;
            if (bxxk == null) {
                synchronized (bkzz.class) {
                    bxxk = f125720e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125719a);
                        f125720e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
