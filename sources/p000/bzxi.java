package p000;

/* renamed from: bzxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzxi f171753d;

    /* renamed from: e */
    private static volatile bxxk f171754e;

    /* renamed from: a */
    public int f171755a;

    /* renamed from: b */
    public int f171756b;

    /* renamed from: c */
    public int f171757c;

    static {
        bzxi bzxi = new bzxi();
        f171753d = bzxi;
        bxvk.m124024a(bzxi.class, bzxi);
    }

    private bzxi() {
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
            return bxvk.m124022a(f171753d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzxi();
        } else {
            if (i2 == 4) {
                return new bxvd(f171753d);
            }
            if (i2 == 5) {
                return f171753d;
            }
            bxxk bxxk = f171754e;
            if (bxxk == null) {
                synchronized (bzxi.class) {
                    bxxk = f171754e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171753d);
                        f171754e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
