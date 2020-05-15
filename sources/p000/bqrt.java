package p000;

/* renamed from: bqrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bqrt f141481a;

    /* renamed from: b */
    private static volatile bxxk f141482b;

    static {
        bqrt bqrt = new bqrt();
        f141481a = bqrt;
        bxvk.m124024a(bqrt.class, bqrt);
    }

    private bqrt() {
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
            return bxvk.m124022a(f141481a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqrt();
        }
        if (i2 == 4) {
            return new bxvd(f141481a);
        }
        if (i2 == 5) {
            return f141481a;
        }
        bxxk bxxk = f141482b;
        if (bxxk == null) {
            synchronized (bqrt.class) {
                bxxk = f141482b;
                if (bxxk == null) {
                    bxxk = new bxve(f141481a);
                    f141482b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
