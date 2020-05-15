package p000;

/* renamed from: bvqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqj f157375a;

    /* renamed from: b */
    private static volatile bxxk f157376b;

    static {
        bvqj bvqj = new bvqj();
        f157375a = bvqj;
        bxvk.m124024a(bvqj.class, bvqj);
    }

    private bvqj() {
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
            return bxvk.m124022a(f157375a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqj();
        }
        if (i2 == 4) {
            return new bxvd(f157375a);
        }
        if (i2 == 5) {
            return f157375a;
        }
        bxxk bxxk = f157376b;
        if (bxxk == null) {
            synchronized (bvqj.class) {
                bxxk = f157376b;
                if (bxxk == null) {
                    bxxk = new bxve(f157375a);
                    f157376b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
