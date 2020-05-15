package p000;

/* renamed from: bzxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzxv f171803b;

    /* renamed from: d */
    private static volatile bxxk f171804d;

    /* renamed from: a */
    public bzxu f171805a;

    /* renamed from: c */
    private int f171806c;

    static {
        bzxv bzxv = new bzxv();
        f171803b = bzxv;
        bxvk.m124024a(bzxv.class, bzxv);
    }

    private bzxv() {
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
            return bxvk.m124022a(f171803b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzxv();
        } else {
            if (i2 == 4) {
                return new bxvd(f171803b);
            }
            if (i2 == 5) {
                return f171803b;
            }
            bxxk bxxk = f171804d;
            if (bxxk == null) {
                synchronized (bzxv.class) {
                    bxxk = f171804d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171803b);
                        f171804d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
