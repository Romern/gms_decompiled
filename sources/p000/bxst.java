package p000;

/* renamed from: bxst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxst extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxst f164738e;

    /* renamed from: f */
    private static volatile bxxk f164739f;

    /* renamed from: a */
    public int f164740a;

    /* renamed from: b */
    public bxtx f164741b = bxtx.f164797b;

    /* renamed from: c */
    public int f164742c;

    /* renamed from: d */
    public bxso f164743d;

    static {
        bxst bxst = new bxst();
        f164738e = bxst;
        bxvk.m124024a(bxst.class, bxst);
    }

    private bxst() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f164738e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ည\u0000\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", bxsm.f164713a, "d"});
        } else if (i2 == 3) {
            return new bxst();
        } else {
            if (i2 == 4) {
                return new bxvd(f164738e);
            }
            if (i2 == 5) {
                return f164738e;
            }
            bxxk bxxk = f164739f;
            if (bxxk == null) {
                synchronized (bxst.class) {
                    bxxk = f164739f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164738e);
                        f164739f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
