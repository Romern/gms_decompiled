package p000;

/* renamed from: bvqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqb f157359a;

    /* renamed from: b */
    private static volatile bxxk f157360b;

    static {
        bvqb bvqb = new bvqb();
        f157359a = bvqb;
        bxvk.m124024a(bvqb.class, bvqb);
    }

    private bvqb() {
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
            return bxvk.m124022a(f157359a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqb();
        }
        if (i2 == 4) {
            return new bxvd(f157359a);
        }
        if (i2 == 5) {
            return f157359a;
        }
        bxxk bxxk = f157360b;
        if (bxxk == null) {
            synchronized (bvqb.class) {
                bxxk = f157360b;
                if (bxxk == null) {
                    bxxk = new bxve(f157359a);
                    f157360b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
