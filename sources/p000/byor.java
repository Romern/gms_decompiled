package p000;

/* renamed from: byor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byor extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byor f167234f;

    /* renamed from: h */
    private static volatile bxxk f167235h;

    /* renamed from: a */
    public int f167236a;

    /* renamed from: b */
    public int f167237b = 1;

    /* renamed from: c */
    public int f167238c;

    /* renamed from: d */
    public bxvt f167239d = bxvm.f164965b;

    /* renamed from: e */
    public boolean f167240e;

    /* renamed from: g */
    private byov f167241g;

    static {
        byor byor = new byor();
        f167234f = byor;
        bxvk.m124024a(byor.class, byor);
    }

    private byor() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f167234f, "\u0001\u0005\u0000\u0001\u0001\u001c\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003\u0016\u001bဇ\u0012\u001cဌ\u0002", new Object[]{"a", "g", "b", byot.f167269a, "d", "e", "c", byop.f167233a});
        } else if (i2 == 3) {
            return new byor();
        } else {
            if (i2 == 4) {
                return new bxvd(f167234f);
            }
            if (i2 == 5) {
                return f167234f;
            }
            bxxk bxxk = f167235h;
            if (bxxk == null) {
                synchronized (byor.class) {
                    bxxk = f167235h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167234f);
                        f167235h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
