package p000;

/* renamed from: bvsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvsj f157494a;

    /* renamed from: b */
    private static volatile bxxk f157495b;

    static {
        bvsj bvsj = new bvsj();
        f157494a = bvsj;
        bxvk.m124024a(bvsj.class, bvsj);
    }

    private bvsj() {
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
            return bxvk.m124022a(f157494a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsj();
        }
        if (i2 == 4) {
            return new bxvd(f157494a);
        }
        if (i2 == 5) {
            return f157494a;
        }
        bxxk bxxk = f157495b;
        if (bxxk == null) {
            synchronized (bvsj.class) {
                bxxk = f157495b;
                if (bxxk == null) {
                    bxxk = new bxve(f157494a);
                    f157495b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
