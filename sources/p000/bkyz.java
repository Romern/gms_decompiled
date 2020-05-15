package p000;

/* renamed from: bkyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkyz f125536d;

    /* renamed from: e */
    private static volatile bxxk f125537e;

    /* renamed from: a */
    public int f125538a;

    /* renamed from: b */
    public int f125539b;

    /* renamed from: c */
    public boolean f125540c;

    static {
        bkyz bkyz = new bkyz();
        f125536d = bkyz;
        bxvk.m124024a(bkyz.class, bkyz);
    }

    private bkyz() {
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
            return bxvk.m124022a(f125536d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkyz();
        } else {
            if (i2 == 4) {
                return new bxvd(f125536d);
            }
            if (i2 == 5) {
                return f125536d;
            }
            bxxk bxxk = f125537e;
            if (bxxk == null) {
                synchronized (bkyz.class) {
                    bxxk = f125537e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125536d);
                        f125537e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
