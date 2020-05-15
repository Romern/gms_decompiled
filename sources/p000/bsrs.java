package p000;

/* renamed from: bsrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsrs f146795a;

    /* renamed from: b */
    private static volatile bxxk f146796b;

    static {
        bsrs bsrs = new bsrs();
        f146795a = bsrs;
        bxvk.m124024a(bsrs.class, bsrs);
    }

    private bsrs() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f146795a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsrs();
        }
        if (i2 == 4) {
            return new bxvd(f146795a);
        }
        if (i2 == 5) {
            return f146795a;
        }
        bxxk bxxk = f146796b;
        if (bxxk == null) {
            synchronized (bsrs.class) {
                bxxk = f146796b;
                if (bxxk == null) {
                    bxxk = new bxve(f146795a);
                    f146796b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
