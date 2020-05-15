package p000;

/* renamed from: bvpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvpt f157343a;

    /* renamed from: b */
    private static volatile bxxk f157344b;

    static {
        bvpt bvpt = new bvpt();
        f157343a = bvpt;
        bxvk.m124024a(bvpt.class, bvpt);
    }

    private bvpt() {
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
            return bxvk.m124022a(f157343a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpt();
        }
        if (i2 == 4) {
            return new bxvd(f157343a);
        }
        if (i2 == 5) {
            return f157343a;
        }
        bxxk bxxk = f157344b;
        if (bxxk == null) {
            synchronized (bvpt.class) {
                bxxk = f157344b;
                if (bxxk == null) {
                    bxxk = new bxve(f157343a);
                    f157344b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
