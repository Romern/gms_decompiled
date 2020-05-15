package p000;

/* renamed from: mcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final mcx f33458b;

    /* renamed from: c */
    private static volatile bxxk f33459c;

    /* renamed from: a */
    public bxwc f33460a = bxxn.f165040b;

    static {
        mcx mcx = new mcx();
        f33458b = mcx;
        bxvk.m124024a(mcx.class, mcx);
    }

    private mcx() {
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
            return bxvk.m124022a(f33458b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mcw.class});
        } else if (i2 == 3) {
            return new mcx();
        } else {
            if (i2 == 4) {
                return new bxvd(f33458b);
            }
            if (i2 == 5) {
                return f33458b;
            }
            bxxk bxxk = f33459c;
            if (bxxk == null) {
                synchronized (mcx.class) {
                    bxxk = f33459c;
                    if (bxxk == null) {
                        bxxk = new bxve(f33458b);
                        f33459c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
