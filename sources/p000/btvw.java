package p000;

/* renamed from: btvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btvw f152646a;

    /* renamed from: b */
    private static volatile bxxk f152647b;

    static {
        btvw btvw = new btvw();
        f152646a = btvw;
        bxvk.m124024a(btvw.class, btvw);
    }

    private btvw() {
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
            return bxvk.m124022a(f152646a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvw();
        }
        if (i2 == 4) {
            return new bxvd(f152646a);
        }
        if (i2 == 5) {
            return f152646a;
        }
        bxxk bxxk = f152647b;
        if (bxxk == null) {
            synchronized (btvw.class) {
                bxxk = f152647b;
                if (bxxk == null) {
                    bxxk = new bxve(f152646a);
                    f152647b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
