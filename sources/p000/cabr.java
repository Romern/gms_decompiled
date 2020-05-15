package p000;

/* renamed from: cabr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cabr f172468b;

    /* renamed from: c */
    private static volatile bxxk f172469c;

    /* renamed from: a */
    public bxwc f172470a = bxxn.f165040b;

    static {
        cabr cabr = new cabr();
        f172468b = cabr;
        bxvk.m124024a(cabr.class, cabr);
    }

    private cabr() {
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
            return bxvk.m124022a(f172468b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cabr();
        } else {
            if (i2 == 4) {
                return new bxvd(f172468b);
            }
            if (i2 == 5) {
                return f172468b;
            }
            bxxk bxxk = f172469c;
            if (bxxk == null) {
                synchronized (cabr.class) {
                    bxxk = f172469c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172468b);
                        f172469c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
