package p000;

/* renamed from: bqtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqtb extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bqtb f141617a;

    /* renamed from: b */
    private static volatile bxxk f141618b;

    static {
        bqtb bqtb = new bqtb();
        f141617a = bqtb;
        bxvk.m124024a(bqtb.class, bqtb);
    }

    private bqtb() {
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
            return bxvk.m124022a(f141617a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqtb();
        }
        if (i2 == 4) {
            return new bxvd(f141617a);
        }
        if (i2 == 5) {
            return f141617a;
        }
        bxxk bxxk = f141618b;
        if (bxxk == null) {
            synchronized (bqtb.class) {
                bxxk = f141618b;
                if (bxxk == null) {
                    bxxk = new bxve(f141617a);
                    f141618b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
