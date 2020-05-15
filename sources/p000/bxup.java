package p000;

/* renamed from: bxup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxup extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bxup f164867a;

    /* renamed from: b */
    private static volatile bxxk f164868b;

    static {
        bxup bxup = new bxup();
        f164867a = bxup;
        bxvk.m124024a(bxup.class, bxup);
    }

    private bxup() {
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
            return bxvk.m124022a(f164867a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxup();
        }
        if (i2 == 4) {
            return new bxvd(f164867a);
        }
        if (i2 == 5) {
            return f164867a;
        }
        bxxk bxxk = f164868b;
        if (bxxk == null) {
            synchronized (bxup.class) {
                bxxk = f164868b;
                if (bxxk == null) {
                    bxxk = new bxve(f164867a);
                    f164868b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
