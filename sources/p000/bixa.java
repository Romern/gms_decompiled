package p000;

/* renamed from: bixa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bixa extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bixa f122152a;

    /* renamed from: b */
    private static volatile bxxk f122153b;

    static {
        bixa bixa = new bixa();
        f122152a = bixa;
        bxvk.m124024a(bixa.class, bixa);
    }

    private bixa() {
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
            return bxvk.m124022a(f122152a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bixa();
        }
        if (i2 == 4) {
            return new bxvd(f122152a);
        }
        if (i2 == 5) {
            return f122152a;
        }
        bxxk bxxk = f122153b;
        if (bxxk == null) {
            synchronized (bixa.class) {
                bxxk = f122153b;
                if (bxxk == null) {
                    bxxk = new bxve(f122152a);
                    f122153b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
