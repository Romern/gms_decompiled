package p000;

/* renamed from: cbmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmu extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbmu f177681a;

    /* renamed from: b */
    private static volatile bxxk f177682b;

    static {
        cbmu cbmu = new cbmu();
        f177681a = cbmu;
        bxvk.m124024a(cbmu.class, cbmu);
    }

    private cbmu() {
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
            return bxvk.m124022a(f177681a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbmu();
        }
        if (i2 == 4) {
            return new bxvd(f177681a);
        }
        if (i2 == 5) {
            return f177681a;
        }
        bxxk bxxk = f177682b;
        if (bxxk == null) {
            synchronized (cbmu.class) {
                bxxk = f177682b;
                if (bxxk == null) {
                    bxxk = new bxve(f177681a);
                    f177682b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
