package p000;

/* renamed from: cbhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbhf f177125a;

    /* renamed from: b */
    private static volatile bxxk f177126b;

    static {
        cbhf cbhf = new cbhf();
        f177125a = cbhf;
        bxvk.m124024a(cbhf.class, cbhf);
    }

    private cbhf() {
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
            return bxvk.m124022a(f177125a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbhf();
        }
        if (i2 == 4) {
            return new bxvd(f177125a);
        }
        if (i2 == 5) {
            return f177125a;
        }
        bxxk bxxk = f177126b;
        if (bxxk == null) {
            synchronized (cbhf.class) {
                bxxk = f177126b;
                if (bxxk == null) {
                    bxxk = new bxve(f177125a);
                    f177126b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
