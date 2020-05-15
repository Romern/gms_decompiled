package p000;

/* renamed from: bzub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzub extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzub f171399d;

    /* renamed from: e */
    private static volatile bxxk f171400e;

    /* renamed from: a */
    public String f171401a = "";

    /* renamed from: b */
    public String f171402b = "";

    /* renamed from: c */
    public bxtx f171403c = bxtx.f164797b;

    static {
        bzub bzub = new bzub();
        f171399d = bzub;
        bxvk.m124024a(bzub.class, bzub);
    }

    private bzub() {
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
            return bxvk.m124022a(f171399d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzub();
        } else {
            if (i2 == 4) {
                return new bxvd(f171399d);
            }
            if (i2 == 5) {
                return f171399d;
            }
            bxxk bxxk = f171400e;
            if (bxxk == null) {
                synchronized (bzub.class) {
                    bxxk = f171400e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171399d);
                        f171400e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
