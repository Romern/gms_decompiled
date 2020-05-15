package p000;

/* renamed from: bivo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bivo f122021b;

    /* renamed from: c */
    private static volatile bxxk f122022c;

    /* renamed from: a */
    public bxvt f122023a = bxvm.f164965b;

    static {
        bivo bivo = new bivo();
        f122021b = bivo;
        bxvk.m124024a(bivo.class, bivo);
    }

    private bivo() {
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
            return bxvk.m124022a(f122021b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bivo();
        } else {
            if (i2 == 4) {
                return new bxvd(f122021b);
            }
            if (i2 == 5) {
                return f122021b;
            }
            bxxk bxxk = f122022c;
            if (bxxk == null) {
                synchronized (bivo.class) {
                    bxxk = f122022c;
                    if (bxxk == null) {
                        bxxk = new bxve(f122021b);
                        f122022c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
