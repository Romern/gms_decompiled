package p000;

/* renamed from: bvfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvfv f155927a;

    /* renamed from: b */
    private static volatile bxxk f155928b;

    static {
        bvfv bvfv = new bvfv();
        f155927a = bvfv;
        bxvk.m124024a(bvfv.class, bvfv);
    }

    private bvfv() {
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
            return bxvk.m124022a(f155927a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvfv();
        }
        if (i2 == 4) {
            return new bxvd(f155927a);
        }
        if (i2 == 5) {
            return f155927a;
        }
        bxxk bxxk = f155928b;
        if (bxxk == null) {
            synchronized (bvfv.class) {
                bxxk = f155928b;
                if (bxxk == null) {
                    bxxk = new bxve(f155927a);
                    f155928b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
