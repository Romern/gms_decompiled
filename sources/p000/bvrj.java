package p000;

/* renamed from: bvrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrj f157440a;

    /* renamed from: b */
    private static volatile bxxk f157441b;

    static {
        bvrj bvrj = new bvrj();
        f157440a = bvrj;
        bxvk.m124024a(bvrj.class, bvrj);
    }

    private bvrj() {
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
            return bxvk.m124022a(f157440a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrj();
        }
        if (i2 == 4) {
            return new bxvd(f157440a);
        }
        if (i2 == 5) {
            return f157440a;
        }
        bxxk bxxk = f157441b;
        if (bxxk == null) {
            synchronized (bvrj.class) {
                bxxk = f157441b;
                if (bxxk == null) {
                    bxxk = new bxve(f157440a);
                    f157441b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
