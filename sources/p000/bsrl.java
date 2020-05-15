package p000;

/* renamed from: bsrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsrl f146774a;

    /* renamed from: b */
    private static volatile bxxk f146775b;

    static {
        bsrl bsrl = new bsrl();
        f146774a = bsrl;
        bxvk.m124024a(bsrl.class, bsrl);
    }

    private bsrl() {
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
            return bxvk.m124022a(f146774a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsrl();
        }
        if (i2 == 4) {
            return new bxvd(f146774a);
        }
        if (i2 == 5) {
            return f146774a;
        }
        bxxk bxxk = f146775b;
        if (bxxk == null) {
            synchronized (bsrl.class) {
                bxxk = f146775b;
                if (bxxk == null) {
                    bxxk = new bxve(f146774a);
                    f146775b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
