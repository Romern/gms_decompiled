package p000;

/* renamed from: cejf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cejf f182759a;

    /* renamed from: b */
    private static volatile bxxk f182760b;

    static {
        cejf cejf = new cejf();
        f182759a = cejf;
        bxvk.m124024a(cejf.class, cejf);
    }

    private cejf() {
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
            return bxvk.m124022a(f182759a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cejf();
        }
        if (i2 == 4) {
            return new bxvd(f182759a);
        }
        if (i2 == 5) {
            return f182759a;
        }
        bxxk bxxk = f182760b;
        if (bxxk == null) {
            synchronized (cejf.class) {
                bxxk = f182760b;
                if (bxxk == null) {
                    bxxk = new bxve(f182759a);
                    f182760b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
