package p000;

/* renamed from: blas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blas extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blas f125788a;

    /* renamed from: e */
    private static volatile bxxk f125789e;

    /* renamed from: b */
    private int f125790b;

    /* renamed from: c */
    private blar f125791c;

    /* renamed from: d */
    private byte f125792d = 2;

    static {
        blas blas = new blas();
        f125788a = blas;
        GeneratedMessageLite.m124024a(blas.class, blas);
    }

    private blas() {
        bxvm bxvm = bxvm.f164965b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125792d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125792d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125788a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new blas();
        } else {
            if (i2 == 4) {
                return new bxvd(f125788a);
            }
            if (i2 == 5) {
                return f125788a;
            }
            bxxk bxxk = f125789e;
            if (bxxk == null) {
                synchronized (blas.class) {
                    bxxk = f125789e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125788a);
                        f125789e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
