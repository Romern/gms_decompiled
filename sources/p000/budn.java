package p000;

/* renamed from: budn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budn extends bxvk implements bxxd {

    /* renamed from: a */
    public static final budn f153490a;

    /* renamed from: b */
    private static volatile bxxk f153491b;

    static {
        budn budn = new budn();
        f153490a = budn;
        bxvk.m124024a(budn.class, budn);
    }

    private budn() {
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
            return bxvk.m124022a(f153490a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new budn();
        }
        if (i2 == 4) {
            return new bxvd(f153490a);
        }
        if (i2 == 5) {
            return f153490a;
        }
        bxxk bxxk = f153491b;
        if (bxxk == null) {
            synchronized (budn.class) {
                bxxk = f153491b;
                if (bxxk == null) {
                    bxxk = new bxve(f153490a);
                    f153491b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
