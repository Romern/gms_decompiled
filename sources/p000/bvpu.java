package p000;

/* renamed from: bvpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpu extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvpu f157345a;

    /* renamed from: b */
    private static volatile bxxk f157346b;

    static {
        bvpu bvpu = new bvpu();
        f157345a = bvpu;
        bxvk.m124024a(bvpu.class, bvpu);
    }

    private bvpu() {
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
            return bxvk.m124022a(f157345a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpu();
        }
        if (i2 == 4) {
            return new bxvd(f157345a);
        }
        if (i2 == 5) {
            return f157345a;
        }
        bxxk bxxk = f157346b;
        if (bxxk == null) {
            synchronized (bvpu.class) {
                bxxk = f157346b;
                if (bxxk == null) {
                    bxxk = new bxve(f157345a);
                    f157346b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
