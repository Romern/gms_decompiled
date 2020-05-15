package p000;

/* renamed from: cbop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbop extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbop f177846b;

    /* renamed from: c */
    private static volatile bxxk f177847c;

    /* renamed from: a */
    public bxtx f177848a = bxtx.f164797b;

    static {
        cbop cbop = new cbop();
        f177846b = cbop;
        bxvk.m124024a(cbop.class, cbop);
    }

    private cbop() {
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
            return bxvk.m124022a(f177846b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbop();
        } else {
            if (i2 == 4) {
                return new bxvd(f177846b);
            }
            if (i2 == 5) {
                return f177846b;
            }
            bxxk bxxk = f177847c;
            if (bxxk == null) {
                synchronized (cbop.class) {
                    bxxk = f177847c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177846b);
                        f177847c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
