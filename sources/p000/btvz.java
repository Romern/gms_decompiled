package p000;

/* renamed from: btvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btvz f152667a;

    /* renamed from: b */
    private static volatile bxxk f152668b;

    static {
        btvz btvz = new btvz();
        f152667a = btvz;
        bxvk.m124024a(btvz.class, btvz);
    }

    private btvz() {
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
            return bxvk.m124022a(f152667a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvz();
        }
        if (i2 == 4) {
            return new bxvd(f152667a);
        }
        if (i2 == 5) {
            return f152667a;
        }
        bxxk bxxk = f152668b;
        if (bxxk == null) {
            synchronized (btvz.class) {
                bxxk = f152668b;
                if (bxxk == null) {
                    bxxk = new bxve(f152667a);
                    f152668b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
