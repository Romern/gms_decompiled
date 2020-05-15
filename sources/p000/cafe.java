package p000;

/* renamed from: cafe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cafe f172889e;

    /* renamed from: f */
    private static volatile bxxk f172890f;

    /* renamed from: a */
    public int f172891a;

    /* renamed from: b */
    public int f172892b;

    /* renamed from: c */
    public int f172893c;

    /* renamed from: d */
    public bxvt f172894d = bxvm.f164965b;

    static {
        cafe cafe = new cafe();
        f172889e = cafe;
        bxvk.m124024a(cafe.class, cafe);
    }

    private cafe() {
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
            return bxvk.m124022a(f172889e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003/", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cafe();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f172889e;
            }
            bxxk bxxk = f172890f;
            if (bxxk == null) {
                synchronized (cafe.class) {
                    bxxk = f172890f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172889e);
                        f172890f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
