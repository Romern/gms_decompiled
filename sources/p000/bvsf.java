package p000;

/* renamed from: bvsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvsf f157484a;

    /* renamed from: b */
    private static volatile bxxk f157485b;

    static {
        bvsf bvsf = new bvsf();
        f157484a = bvsf;
        bxvk.m124024a(bvsf.class, bvsf);
    }

    private bvsf() {
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
            return bxvk.m124022a(f157484a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsf();
        }
        if (i2 == 4) {
            return new bxvd(f157484a);
        }
        if (i2 == 5) {
            return f157484a;
        }
        bxxk bxxk = f157485b;
        if (bxxk == null) {
            synchronized (bvsf.class) {
                bxxk = f157485b;
                if (bxxk == null) {
                    bxxk = new bxve(f157484a);
                    f157485b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
