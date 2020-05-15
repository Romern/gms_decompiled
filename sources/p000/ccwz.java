package p000;

/* renamed from: ccwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccwz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ccwz f180139b;

    /* renamed from: c */
    private static volatile bxxk f180140c;

    /* renamed from: a */
    public bxwc f180141a = bxxn.f165040b;

    static {
        ccwz ccwz = new ccwz();
        f180139b = ccwz;
        bxvk.m124024a(ccwz.class, ccwz);
    }

    private ccwz() {
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
            return bxvk.m124022a(f180139b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ccwy.class});
        } else if (i2 == 3) {
            return new ccwz();
        } else {
            if (i2 == 4) {
                return new bxvd(f180139b);
            }
            if (i2 == 5) {
                return f180139b;
            }
            bxxk bxxk = f180140c;
            if (bxxk == null) {
                synchronized (ccwz.class) {
                    bxxk = f180140c;
                    if (bxxk == null) {
                        bxxk = new bxve(f180139b);
                        f180140c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
