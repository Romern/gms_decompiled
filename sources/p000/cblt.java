package p000;

/* renamed from: cblt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cblt f177561a;

    /* renamed from: b */
    private static volatile bxxk f177562b;

    static {
        cblt cblt = new cblt();
        f177561a = cblt;
        bxvk.m124024a(cblt.class, cblt);
    }

    private cblt() {
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
            return bxvk.m124022a(f177561a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cblt();
        }
        if (i2 == 4) {
            return new bxvd(f177561a);
        }
        if (i2 == 5) {
            return f177561a;
        }
        bxxk bxxk = f177562b;
        if (bxxk == null) {
            synchronized (cblt.class) {
                bxxk = f177562b;
                if (bxxk == null) {
                    bxxk = new bxve(f177561a);
                    f177562b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
