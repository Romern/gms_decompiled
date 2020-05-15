package p000;

/* renamed from: buol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buol extends bxvk implements bxxd {

    /* renamed from: a */
    public static final buol f154546a;

    /* renamed from: b */
    private static volatile bxxk f154547b;

    static {
        buol buol = new buol();
        f154546a = buol;
        bxvk.m124024a(buol.class, buol);
    }

    private buol() {
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
            return bxvk.m124022a(f154546a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new buol();
        }
        if (i2 == 4) {
            return new bxvd(f154546a);
        }
        if (i2 == 5) {
            return f154546a;
        }
        bxxk bxxk = f154547b;
        if (bxxk == null) {
            synchronized (buol.class) {
                bxxk = f154547b;
                if (bxxk == null) {
                    bxxk = new bxve(f154546a);
                    f154547b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
