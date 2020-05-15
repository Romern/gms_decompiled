package p000;

/* renamed from: abdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdk extends bxvk implements bxxd {

    /* renamed from: a */
    public static final abdk f57097a;

    /* renamed from: b */
    private static volatile bxxk f57098b;

    static {
        abdk abdk = new abdk();
        f57097a = abdk;
        bxvk.m124024a(abdk.class, abdk);
    }

    private abdk() {
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
            return bxvk.m124022a(f57097a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdk();
        }
        if (i2 == 4) {
            return new bxvd(f57097a);
        }
        if (i2 == 5) {
            return f57097a;
        }
        bxxk bxxk = f57098b;
        if (bxxk == null) {
            synchronized (abdk.class) {
                bxxk = f57098b;
                if (bxxk == null) {
                    bxxk = new bxve(f57097a);
                    f57098b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
