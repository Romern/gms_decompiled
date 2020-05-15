package p000;

/* renamed from: blfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final blfr f126407a;

    /* renamed from: b */
    private static volatile bxxk f126408b;

    static {
        blfr blfr = new blfr();
        f126407a = blfr;
        bxvk.m124024a(blfr.class, blfr);
    }

    private blfr() {
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
            return bxvk.m124022a(f126407a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blfr();
        }
        if (i2 == 4) {
            return new bxvd(f126407a);
        }
        if (i2 == 5) {
            return f126407a;
        }
        bxxk bxxk = f126408b;
        if (bxxk == null) {
            synchronized (blfr.class) {
                bxxk = f126408b;
                if (bxxk == null) {
                    bxxk = new bxve(f126407a);
                    f126408b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
