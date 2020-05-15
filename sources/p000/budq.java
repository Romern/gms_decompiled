package p000;

/* renamed from: budq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final budq f153503a;

    /* renamed from: b */
    private static volatile bxxk f153504b;

    static {
        budq budq = new budq();
        f153503a = budq;
        bxvk.m124024a(budq.class, budq);
    }

    private budq() {
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
            return bxvk.m124022a(f153503a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new budq();
        }
        if (i2 == 4) {
            return new bxvd(f153503a);
        }
        if (i2 == 5) {
            return f153503a;
        }
        bxxk bxxk = f153504b;
        if (bxxk == null) {
            synchronized (budq.class) {
                bxxk = f153504b;
                if (bxxk == null) {
                    bxxk = new bxve(f153503a);
                    f153504b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
