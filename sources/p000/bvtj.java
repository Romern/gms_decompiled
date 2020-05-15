package p000;

/* renamed from: bvtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvtj f157570a;

    /* renamed from: b */
    private static volatile bxxk f157571b;

    static {
        bvtj bvtj = new bvtj();
        f157570a = bvtj;
        bxvk.m124024a(bvtj.class, bvtj);
    }

    private bvtj() {
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
            return bxvk.m124022a(f157570a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvtj();
        }
        if (i2 == 4) {
            return new bxvd(f157570a);
        }
        if (i2 == 5) {
            return f157570a;
        }
        bxxk bxxk = f157571b;
        if (bxxk == null) {
            synchronized (bvtj.class) {
                bxxk = f157571b;
                if (bxxk == null) {
                    bxxk = new bxve(f157570a);
                    f157571b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
