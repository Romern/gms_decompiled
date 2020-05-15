package p000;

/* renamed from: aaop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaop extends bxvk implements bxxd {

    /* renamed from: a */
    public static final aaop f28711a;

    /* renamed from: b */
    private static volatile bxxk f28712b;

    static {
        aaop aaop = new aaop();
        f28711a = aaop;
        bxvk.m124024a(aaop.class, aaop);
    }

    private aaop() {
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
            return bxvk.m124022a(f28711a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new aaop();
        }
        if (i2 == 4) {
            return new bxvd(f28711a);
        }
        if (i2 == 5) {
            return f28711a;
        }
        bxxk bxxk = f28712b;
        if (bxxk == null) {
            synchronized (aaop.class) {
                bxxk = f28712b;
                if (bxxk == null) {
                    bxxk = new bxve(f28711a);
                    f28712b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
