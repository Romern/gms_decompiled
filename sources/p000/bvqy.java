package p000;

/* renamed from: bvqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqy f157418a;

    /* renamed from: b */
    private static volatile bxxk f157419b;

    static {
        bvqy bvqy = new bvqy();
        f157418a = bvqy;
        bxvk.m124024a(bvqy.class, bvqy);
    }

    private bvqy() {
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
            return bxvk.m124022a(f157418a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqy();
        }
        if (i2 == 4) {
            return new bxvd(f157418a);
        }
        if (i2 == 5) {
            return f157418a;
        }
        bxxk bxxk = f157419b;
        if (bxxk == null) {
            synchronized (bvqy.class) {
                bxxk = f157419b;
                if (bxxk == null) {
                    bxxk = new bxve(f157418a);
                    f157419b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
