package p000;

/* renamed from: bzuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzuq f171454a;

    /* renamed from: b */
    private static volatile bxxk f171455b;

    static {
        bzuq bzuq = new bzuq();
        f171454a = bzuq;
        bxvk.m124024a(bzuq.class, bzuq);
    }

    private bzuq() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f171454a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzuq();
        }
        if (i2 == 4) {
            return new bxvd(f171454a);
        }
        if (i2 == 5) {
            return f171454a;
        }
        bxxk bxxk = f171455b;
        if (bxxk == null) {
            synchronized (bzuq.class) {
                bxxk = f171455b;
                if (bxxk == null) {
                    bxxk = new bxve(f171454a);
                    f171455b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
