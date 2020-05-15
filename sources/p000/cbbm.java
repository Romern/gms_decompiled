package p000;

/* renamed from: cbbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbm extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbbm f176592a;

    /* renamed from: b */
    private static volatile bxxk f176593b;

    static {
        cbbm cbbm = new cbbm();
        f176592a = cbbm;
        bxvk.m124024a(cbbm.class, cbbm);
    }

    private cbbm() {
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
            return bxvk.m124022a(f176592a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbbm();
        }
        if (i2 == 4) {
            return new bxvd(f176592a);
        }
        if (i2 == 5) {
            return f176592a;
        }
        bxxk bxxk = f176593b;
        if (bxxk == null) {
            synchronized (cbbm.class) {
                bxxk = f176593b;
                if (bxxk == null) {
                    bxxk = new bxve(f176592a);
                    f176593b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
