package p000;

/* renamed from: bonl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bonl f133822c;

    /* renamed from: d */
    private static volatile bxxk f133823d;

    /* renamed from: a */
    public int f133824a;

    /* renamed from: b */
    public bxtx f133825b = bxtx.f164797b;

    static {
        bonl bonl = new bonl();
        f133822c = bonl;
        bxvk.m124024a(bonl.class, bonl);
    }

    private bonl() {
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
            return bxvk.m124022a(f133822c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bonl();
        } else {
            if (i2 == 4) {
                return new bxvd(f133822c);
            }
            if (i2 == 5) {
                return f133822c;
            }
            bxxk bxxk = f133823d;
            if (bxxk == null) {
                synchronized (bonl.class) {
                    bxxk = f133823d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133822c);
                        f133823d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
