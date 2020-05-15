package p000;

/* renamed from: bvzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzm extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvzm f158528a;

    /* renamed from: b */
    private static volatile bxxk f158529b;

    static {
        bvzm bvzm = new bvzm();
        f158528a = bvzm;
        bxvk.m124024a(bvzm.class, bvzm);
    }

    private bvzm() {
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
            return bxvk.m124022a(f158528a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvzm();
        }
        if (i2 == 4) {
            return new bxvd(f158528a);
        }
        if (i2 == 5) {
            return f158528a;
        }
        bxxk bxxk = f158529b;
        if (bxxk == null) {
            synchronized (bvzm.class) {
                bxxk = f158529b;
                if (bxxk == null) {
                    bxxk = new bxve(f158528a);
                    f158529b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
