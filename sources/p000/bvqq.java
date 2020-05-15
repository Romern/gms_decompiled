package p000;

/* renamed from: bvqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqq f157402a;

    /* renamed from: b */
    private static volatile bxxk f157403b;

    static {
        bvqq bvqq = new bvqq();
        f157402a = bvqq;
        bxvk.m124024a(bvqq.class, bvqq);
    }

    private bvqq() {
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
            return bxvk.m124022a(f157402a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqq();
        }
        if (i2 == 4) {
            return new bxvd(f157402a);
        }
        if (i2 == 5) {
            return f157402a;
        }
        bxxk bxxk = f157403b;
        if (bxxk == null) {
            synchronized (bvqq.class) {
                bxxk = f157403b;
                if (bxxk == null) {
                    bxxk = new bxve(f157402a);
                    f157403b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
