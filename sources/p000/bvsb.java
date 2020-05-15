package p000;

/* renamed from: bvsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvsb f157476a;

    /* renamed from: b */
    private static volatile bxxk f157477b;

    static {
        bvsb bvsb = new bvsb();
        f157476a = bvsb;
        bxvk.m124024a(bvsb.class, bvsb);
    }

    private bvsb() {
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
            return bxvk.m124022a(f157476a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsb();
        }
        if (i2 == 4) {
            return new bxvd(f157476a);
        }
        if (i2 == 5) {
            return f157476a;
        }
        bxxk bxxk = f157477b;
        if (bxxk == null) {
            synchronized (bvsb.class) {
                bxxk = f157477b;
                if (bxxk == null) {
                    bxxk = new bxve(f157476a);
                    f157477b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
