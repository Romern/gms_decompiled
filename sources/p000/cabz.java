package p000;

/* renamed from: cabz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cabz f172496b;

    /* renamed from: c */
    private static volatile bxxk f172497c;

    /* renamed from: a */
    public bxwc f172498a = bxxn.f165040b;

    static {
        cabz cabz = new cabz();
        f172496b = cabz;
        bxvk.m124024a(cabz.class, cabz);
    }

    private cabz() {
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
            return bxvk.m124022a(f172496b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cabz();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f172496b;
            }
            bxxk bxxk = f172497c;
            if (bxxk == null) {
                synchronized (cabz.class) {
                    bxxk = f172497c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172496b);
                        f172497c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
