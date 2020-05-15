package p000;

/* renamed from: bvqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqv f157412a;

    /* renamed from: b */
    private static volatile bxxk f157413b;

    static {
        bvqv bvqv = new bvqv();
        f157412a = bvqv;
        bxvk.m124024a(bvqv.class, bvqv);
    }

    private bvqv() {
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
            return bxvk.m124022a(f157412a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqv();
        }
        if (i2 == 4) {
            return new bxvd(f157412a);
        }
        if (i2 == 5) {
            return f157412a;
        }
        bxxk bxxk = f157413b;
        if (bxxk == null) {
            synchronized (bvqv.class) {
                bxxk = f157413b;
                if (bxxk == null) {
                    bxxk = new bxve(f157412a);
                    f157413b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
