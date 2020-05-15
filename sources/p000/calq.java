package p000;

/* renamed from: calq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final calq f175170a;

    /* renamed from: b */
    private static volatile bxxk f175171b;

    static {
        calq calq = new calq();
        f175170a = calq;
        bxvk.m124024a(calq.class, calq);
    }

    private calq() {
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
            return bxvk.m124022a(f175170a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new calq();
        }
        if (i2 == 4) {
            return new bxvd(f175170a);
        }
        if (i2 == 5) {
            return f175170a;
        }
        bxxk bxxk = f175171b;
        if (bxxk == null) {
            synchronized (calq.class) {
                bxxk = f175171b;
                if (bxxk == null) {
                    bxxk = new bxve(f175170a);
                    f175171b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
