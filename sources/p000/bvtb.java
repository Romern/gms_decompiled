package p000;

/* renamed from: bvtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvtb f157554a;

    /* renamed from: b */
    private static volatile bxxk f157555b;

    static {
        bvtb bvtb = new bvtb();
        f157554a = bvtb;
        bxvk.m124024a(bvtb.class, bvtb);
    }

    private bvtb() {
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
            return bxvk.m124022a(f157554a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvtb();
        }
        if (i2 == 4) {
            return new bxvd(f157554a);
        }
        if (i2 == 5) {
            return f157554a;
        }
        bxxk bxxk = f157555b;
        if (bxxk == null) {
            synchronized (bvtb.class) {
                bxxk = f157555b;
                if (bxxk == null) {
                    bxxk = new bxve(f157554a);
                    f157555b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
