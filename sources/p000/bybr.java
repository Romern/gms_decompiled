package p000;

/* renamed from: bybr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bybr f165586a;

    /* renamed from: b */
    private static volatile bxxk f165587b;

    static {
        bybr bybr = new bybr();
        f165586a = bybr;
        bxvk.m124024a(bybr.class, bybr);
    }

    private bybr() {
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
            return bxvk.m124022a(f165586a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bybr();
        }
        if (i2 == 4) {
            return new bxvd(f165586a);
        }
        if (i2 == 5) {
            return f165586a;
        }
        bxxk bxxk = f165587b;
        if (bxxk == null) {
            synchronized (bybr.class) {
                bxxk = f165587b;
                if (bxxk == null) {
                    bxxk = new bxve(f165586a);
                    f165587b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
