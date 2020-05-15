package p000;

/* renamed from: msw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final msw f34597c;

    /* renamed from: d */
    private static volatile bxxk f34598d;

    /* renamed from: a */
    public int f34599a;

    /* renamed from: b */
    public int f34600b;

    static {
        msw msw = new msw();
        f34597c = msw;
        bxvk.m124024a(msw.class, msw);
    }

    private msw() {
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
            return bxvk.m124022a(f34597c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", msv.f34596a});
        } else if (i2 == 3) {
            return new msw();
        } else {
            if (i2 == 4) {
                return new bxvd(f34597c);
            }
            if (i2 == 5) {
                return f34597c;
            }
            bxxk bxxk = f34598d;
            if (bxxk == null) {
                synchronized (msw.class) {
                    bxxk = f34598d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34597c);
                        f34598d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
