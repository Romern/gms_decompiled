package p000;

/* renamed from: cbcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbcb f176638a;

    /* renamed from: b */
    private static volatile bxxk f176639b;

    static {
        cbcb cbcb = new cbcb();
        f176638a = cbcb;
        bxvk.m124024a(cbcb.class, cbcb);
    }

    private cbcb() {
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
            return bxvk.m124022a(f176638a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbcb();
        }
        if (i2 == 4) {
            return new bxvd(f176638a);
        }
        if (i2 == 5) {
            return f176638a;
        }
        bxxk bxxk = f176639b;
        if (bxxk == null) {
            synchronized (cbcb.class) {
                bxxk = f176639b;
                if (bxxk == null) {
                    bxxk = new bxve(f176638a);
                    f176639b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
