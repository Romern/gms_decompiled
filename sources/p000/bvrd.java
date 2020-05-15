package p000;

/* renamed from: bvrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrd extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrd f157428a;

    /* renamed from: b */
    private static volatile bxxk f157429b;

    static {
        bvrd bvrd = new bvrd();
        f157428a = bvrd;
        bxvk.m124024a(bvrd.class, bvrd);
    }

    private bvrd() {
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
            return bxvk.m124022a(f157428a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrd();
        }
        if (i2 == 4) {
            return new bxvd(f157428a);
        }
        if (i2 == 5) {
            return f157428a;
        }
        bxxk bxxk = f157429b;
        if (bxxk == null) {
            synchronized (bvrd.class) {
                bxxk = f157429b;
                if (bxxk == null) {
                    bxxk = new bxve(f157428a);
                    f157429b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
