package p000;

/* renamed from: cbfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfc extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbfc f176885a;

    /* renamed from: b */
    private static volatile bxxk f176886b;

    static {
        cbfc cbfc = new cbfc();
        f176885a = cbfc;
        bxvk.m124024a(cbfc.class, cbfc);
    }

    private cbfc() {
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
            return bxvk.m124022a(f176885a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbfc();
        }
        if (i2 == 4) {
            return new bxvd(f176885a);
        }
        if (i2 == 5) {
            return f176885a;
        }
        bxxk bxxk = f176886b;
        if (bxxk == null) {
            synchronized (cbfc.class) {
                bxxk = f176886b;
                if (bxxk == null) {
                    bxxk = new bxve(f176885a);
                    f176886b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
