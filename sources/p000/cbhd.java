package p000;

/* renamed from: cbhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhd extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbhd f177119a;

    /* renamed from: b */
    private static volatile bxxk f177120b;

    static {
        cbhd cbhd = new cbhd();
        f177119a = cbhd;
        bxvk.m124024a(cbhd.class, cbhd);
    }

    private cbhd() {
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
            return bxvk.m124022a(f177119a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbhd();
        }
        if (i2 == 4) {
            return new bxvd(f177119a);
        }
        if (i2 == 5) {
            return f177119a;
        }
        bxxk bxxk = f177120b;
        if (bxxk == null) {
            synchronized (cbhd.class) {
                bxxk = f177120b;
                if (bxxk == null) {
                    bxxk = new bxve(f177119a);
                    f177120b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
