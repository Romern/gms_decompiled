package p000;

/* renamed from: bsnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnt extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsnt f146330f;

    /* renamed from: g */
    private static volatile bxxk f146331g;

    /* renamed from: a */
    public int f146332a;

    /* renamed from: b */
    public bxtx f146333b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f146334c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f146335d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f146336e = bxtx.f164797b;

    static {
        bsnt bsnt = new bsnt();
        f146330f = bsnt;
        bxvk.m124024a(bsnt.class, bsnt);
    }

    private bsnt() {
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
            return bxvk.m124022a(f146330f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsnt();
        } else {
            if (i2 == 4) {
                return new bxvd(f146330f);
            }
            if (i2 == 5) {
                return f146330f;
            }
            bxxk bxxk = f146331g;
            if (bxxk == null) {
                synchronized (bsnt.class) {
                    bxxk = f146331g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146330f);
                        f146331g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
