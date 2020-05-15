package p000;

@Deprecated
/* renamed from: bzve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzve extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bzve f171513a;

    /* renamed from: b */
    private static volatile bxxk f171514b;

    static {
        bzve bzve = new bzve();
        f171513a = bzve;
        bxvk.m124024a(bzve.class, bzve);
    }

    private bzve() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f171513a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bzve();
        }
        if (i2 == 4) {
            return new bxvd(f171513a);
        }
        if (i2 == 5) {
            return f171513a;
        }
        bxxk bxxk = f171514b;
        if (bxxk == null) {
            synchronized (bzve.class) {
                bxxk = f171514b;
                if (bxxk == null) {
                    bxxk = new bxve(f171513a);
                    f171514b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
