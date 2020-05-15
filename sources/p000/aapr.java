package p000;

/* renamed from: aapr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final aapr f28826a;

    /* renamed from: b */
    private static volatile bxxk f28827b;

    static {
        aapr aapr = new aapr();
        f28826a = aapr;
        bxvk.m124024a(aapr.class, aapr);
    }

    private aapr() {
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
            return bxvk.m124022a(f28826a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new aapr();
        }
        if (i2 == 4) {
            return new bxvd(f28826a);
        }
        if (i2 == 5) {
            return f28826a;
        }
        bxxk bxxk = f28827b;
        if (bxxk == null) {
            synchronized (aapr.class) {
                bxxk = f28827b;
                if (bxxk == null) {
                    bxxk = new bxve(f28826a);
                    f28827b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
