package p000;

/* renamed from: bzxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzxm f171773d;

    /* renamed from: e */
    private static volatile bxxk f171774e;

    /* renamed from: a */
    public int f171775a;

    /* renamed from: b */
    public cama f171776b;

    /* renamed from: c */
    public bzxl f171777c;

    static {
        bzxm bzxm = new bzxm();
        f171773d = bzxm;
        bxvk.m124024a(bzxm.class, bzxm);
    }

    private bzxm() {
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
            return bxvk.m124022a(f171773d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzxm();
        } else {
            if (i2 == 4) {
                return new bxvd(f171773d);
            }
            if (i2 == 5) {
                return f171773d;
            }
            bxxk bxxk = f171774e;
            if (bxxk == null) {
                synchronized (bzxm.class) {
                    bxxk = f171774e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171773d);
                        f171774e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
