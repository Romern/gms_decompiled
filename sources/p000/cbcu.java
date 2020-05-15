package p000;

/* renamed from: cbcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbcu f176689d;

    /* renamed from: e */
    private static volatile bxxk f176690e;

    /* renamed from: a */
    public cbmo f176691a;

    /* renamed from: b */
    public bxtx f176692b = bxtx.f164797b;

    /* renamed from: c */
    public bxvt f176693c = bxvm.f164965b;

    static {
        cbcu cbcu = new cbcu();
        f176689d = cbcu;
        bxvk.m124024a(cbcu.class, cbcu);
    }

    private cbcu() {
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
            return bxvk.m124022a(f176689d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\n\u0003,", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbcu();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176689d;
            }
            bxxk bxxk = f176690e;
            if (bxxk == null) {
                synchronized (cbcu.class) {
                    bxxk = f176690e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176689d);
                        f176690e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
