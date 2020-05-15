package p000;

/* renamed from: bitd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitd extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bitd f121631a;

    /* renamed from: b */
    private static volatile bxxk f121632b;

    static {
        bitd bitd = new bitd();
        f121631a = bitd;
        bxvk.m124024a(bitd.class, bitd);
    }

    private bitd() {
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
            return bxvk.m124022a(f121631a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bitd();
        }
        if (i2 == 4) {
            return new bxvd(f121631a);
        }
        if (i2 == 5) {
            return f121631a;
        }
        bxxk bxxk = f121632b;
        if (bxxk == null) {
            synchronized (bitd.class) {
                bxxk = f121632b;
                if (bxxk == null) {
                    bxxk = new bxve(f121631a);
                    f121632b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
