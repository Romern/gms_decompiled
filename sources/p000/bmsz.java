package p000;

/* renamed from: bmsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmsz f130795g;

    /* renamed from: h */
    private static volatile bxxk f130796h;

    /* renamed from: a */
    public bxtx f130797a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f130798b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f130799c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f130800d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f130801e = bxtx.f164797b;

    /* renamed from: f */
    public bxtx f130802f = bxtx.f164797b;

    static {
        bmsz bmsz = new bmsz();
        f130795g = bmsz;
        bxvk.m124024a(bmsz.class, bmsz);
    }

    private bmsz() {
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
            return bxvk.m124022a(f130795g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n\u0005\n\u0006\n", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bmsz();
        } else {
            if (i2 == 4) {
                return new bxvd(f130795g);
            }
            if (i2 == 5) {
                return f130795g;
            }
            bxxk bxxk = f130796h;
            if (bxxk == null) {
                synchronized (bmsz.class) {
                    bxxk = f130796h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130795g);
                        f130796h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
