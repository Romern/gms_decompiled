package p000;

/* renamed from: bvrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrf f157432a;

    /* renamed from: b */
    private static volatile bxxk f157433b;

    static {
        bvrf bvrf = new bvrf();
        f157432a = bvrf;
        bxvk.m124024a(bvrf.class, bvrf);
    }

    private bvrf() {
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
            return bxvk.m124022a(f157432a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrf();
        }
        if (i2 == 4) {
            return new bxvd(f157432a);
        }
        if (i2 == 5) {
            return f157432a;
        }
        bxxk bxxk = f157433b;
        if (bxxk == null) {
            synchronized (bvrf.class) {
                bxxk = f157433b;
                if (bxxk == null) {
                    bxxk = new bxve(f157432a);
                    f157433b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
