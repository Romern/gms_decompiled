package p000;

/* renamed from: cbkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbkl f177422a;

    /* renamed from: b */
    private static volatile bxxk f177423b;

    static {
        cbkl cbkl = new cbkl();
        f177422a = cbkl;
        bxvk.m124024a(cbkl.class, cbkl);
    }

    private cbkl() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f177422a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbkl();
        }
        if (i2 == 4) {
            return new bxvd(f177422a);
        }
        if (i2 == 5) {
            return f177422a;
        }
        bxxk bxxk = f177423b;
        if (bxxk == null) {
            synchronized (cbkl.class) {
                bxxk = f177423b;
                if (bxxk == null) {
                    bxxk = new bxve(f177422a);
                    f177423b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
