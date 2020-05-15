package p000;

/* renamed from: bupv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bupv f154678c;

    /* renamed from: d */
    private static volatile bxxk f154679d;

    /* renamed from: a */
    public int f154680a = 0;

    /* renamed from: b */
    public Object f154681b;

    static {
        bupv bupv = new bupv();
        f154678c = bupv;
        bxvk.m124024a(bupv.class, bupv);
    }

    private bupv() {
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
            return bxvk.m124022a(f154678c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", bupr.class, bupt.class, bupk.class, bupi.class});
        } else if (i2 == 3) {
            return new bupv();
        } else {
            if (i2 == 4) {
                return new bxvd(f154678c);
            }
            if (i2 == 5) {
                return f154678c;
            }
            bxxk bxxk = f154679d;
            if (bxxk == null) {
                synchronized (bupv.class) {
                    bxxk = f154679d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154678c);
                        f154679d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
