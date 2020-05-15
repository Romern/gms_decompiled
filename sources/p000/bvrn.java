package p000;

/* renamed from: bvrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrn extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrn f157448a;

    /* renamed from: b */
    private static volatile bxxk f157449b;

    static {
        bvrn bvrn = new bvrn();
        f157448a = bvrn;
        bxvk.m124024a(bvrn.class, bvrn);
    }

    private bvrn() {
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
            return bxvk.m124022a(f157448a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrn();
        }
        if (i2 == 4) {
            return new bxvd(f157448a);
        }
        if (i2 == 5) {
            return f157448a;
        }
        bxxk bxxk = f157449b;
        if (bxxk == null) {
            synchronized (bvrn.class) {
                bxxk = f157449b;
                if (bxxk == null) {
                    bxxk = new bxve(f157448a);
                    f157449b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
