package p000;

/* renamed from: bsrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsrr f146791c;

    /* renamed from: d */
    private static volatile bxxk f146792d;

    /* renamed from: a */
    public int f146793a;

    /* renamed from: b */
    public bssl f146794b;

    static {
        bsrr bsrr = new bsrr();
        f146791c = bsrr;
        bxvk.m124024a(bsrr.class, bsrr);
    }

    private bsrr() {
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
            return bxvk.m124022a(f146791c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsrr();
        } else {
            if (i2 == 4) {
                return new bxvd(f146791c);
            }
            if (i2 == 5) {
                return f146791c;
            }
            bxxk bxxk = f146792d;
            if (bxxk == null) {
                synchronized (bsrr.class) {
                    bxxk = f146792d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146791c);
                        f146792d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
