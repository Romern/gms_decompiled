package p000;

/* renamed from: bmrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bmrt f130579a;

    /* renamed from: b */
    private static volatile bxxk f130580b;

    static {
        bmrt bmrt = new bmrt();
        f130579a = bmrt;
        bxvk.m124024a(bmrt.class, bmrt);
    }

    private bmrt() {
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
            return bxvk.m124022a(f130579a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bmrt();
        }
        if (i2 == 4) {
            return new bxvd(f130579a);
        }
        if (i2 == 5) {
            return f130579a;
        }
        bxxk bxxk = f130580b;
        if (bxxk == null) {
            synchronized (bmrt.class) {
                bxxk = f130580b;
                if (bxxk == null) {
                    bxxk = new bxve(f130579a);
                    f130580b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
