package p000;

/* renamed from: biws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biws extends bxvk implements bxxd {

    /* renamed from: a */
    public static final biws f122120a;

    /* renamed from: b */
    private static volatile bxxk f122121b;

    static {
        biws biws = new biws();
        f122120a = biws;
        bxvk.m124024a(biws.class, biws);
    }

    private biws() {
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
            return bxvk.m124022a(f122120a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new biws();
        }
        if (i2 == 4) {
            return new bxvd(f122120a);
        }
        if (i2 == 5) {
            return f122120a;
        }
        bxxk bxxk = f122121b;
        if (bxxk == null) {
            synchronized (biws.class) {
                bxxk = f122121b;
                if (bxxk == null) {
                    bxxk = new bxve(f122120a);
                    f122121b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
