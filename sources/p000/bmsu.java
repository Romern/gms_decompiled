package p000;

/* renamed from: bmsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmsu f130749f;

    /* renamed from: g */
    private static volatile bxxk f130750g;

    /* renamed from: a */
    public bxtx f130751a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f130752b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f130753c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f130754d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f130755e = bxtx.f164797b;

    static {
        bmsu bmsu = new bmsu();
        f130749f = bmsu;
        bxvk.m124024a(bmsu.class, bmsu);
    }

    private bmsu() {
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
            return bxvk.m124022a(f130749f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n\u0005\n", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmsu();
        } else {
            if (i2 == 4) {
                return new bxvd(f130749f);
            }
            if (i2 == 5) {
                return f130749f;
            }
            bxxk bxxk = f130750g;
            if (bxxk == null) {
                synchronized (bmsu.class) {
                    bxxk = f130750g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130749f);
                        f130750g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
