package p000;

/* renamed from: bxsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxsr f164725b;

    /* renamed from: c */
    private static volatile bxxk f164726c;

    /* renamed from: a */
    public bxvt f164727a = bxvm.f164965b;

    static {
        bxsr bxsr = new bxsr();
        f164725b = bxsr;
        bxvk.m124024a(bxsr.class, bxsr);
    }

    private bxsr() {
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
            return bxvk.m124022a(f164725b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxsr();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f164725b;
            }
            bxxk bxxk = f164726c;
            if (bxxk == null) {
                synchronized (bxsr.class) {
                    bxxk = f164726c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164725b);
                        f164726c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
