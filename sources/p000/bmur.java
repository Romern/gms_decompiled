package p000;

/* renamed from: bmur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmur extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bmur f130971a;

    /* renamed from: b */
    private static volatile bxxk f130972b;

    static {
        bmur bmur = new bmur();
        f130971a = bmur;
        bxvk.m124024a(bmur.class, bmur);
    }

    private bmur() {
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
            return bxvk.m124022a(f130971a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bmur();
        }
        if (i2 == 4) {
            return new bxvd(f130971a);
        }
        if (i2 == 5) {
            return f130971a;
        }
        bxxk bxxk = f130972b;
        if (bxxk == null) {
            synchronized (bmur.class) {
                bxxk = f130972b;
                if (bxxk == null) {
                    bxxk = new bxve(f130971a);
                    f130972b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
