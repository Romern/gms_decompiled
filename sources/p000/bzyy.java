package p000;

/* renamed from: bzyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzyy f171941b;

    /* renamed from: d */
    private static volatile bxxk f171942d;

    /* renamed from: a */
    public bzyv f171943a;

    /* renamed from: c */
    private int f171944c;

    static {
        bzyy bzyy = new bzyy();
        f171941b = bzyy;
        bxvk.m124024a(bzyy.class, bzyy);
    }

    private bzyy() {
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
            return bxvk.m124022a(f171941b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzyy();
        } else {
            if (i2 == 4) {
                return new bxvd(f171941b);
            }
            if (i2 == 5) {
                return f171941b;
            }
            bxxk bxxk = f171942d;
            if (bxxk == null) {
                synchronized (bzyy.class) {
                    bxxk = f171942d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171941b);
                        f171942d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
