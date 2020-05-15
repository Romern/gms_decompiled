package p000;

/* renamed from: bvqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqu extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqu f157410a;

    /* renamed from: b */
    private static volatile bxxk f157411b;

    static {
        bvqu bvqu = new bvqu();
        f157410a = bvqu;
        bxvk.m124024a(bvqu.class, bvqu);
    }

    private bvqu() {
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
            return bxvk.m124022a(f157410a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqu();
        }
        if (i2 == 4) {
            return new bxvd(f157410a);
        }
        if (i2 == 5) {
            return f157410a;
        }
        bxxk bxxk = f157411b;
        if (bxxk == null) {
            synchronized (bvqu.class) {
                bxxk = f157411b;
                if (bxxk == null) {
                    bxxk = new bxve(f157410a);
                    f157411b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
