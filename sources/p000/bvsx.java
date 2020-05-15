package p000;

/* renamed from: bvsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsx extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvsx f157535a;

    /* renamed from: b */
    private static volatile bxxk f157536b;

    static {
        bvsx bvsx = new bvsx();
        f157535a = bvsx;
        bxvk.m124024a(bvsx.class, bvsx);
    }

    private bvsx() {
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
            return bxvk.m124022a(f157535a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsx();
        }
        if (i2 == 4) {
            return new bxvd(f157535a);
        }
        if (i2 == 5) {
            return f157535a;
        }
        bxxk bxxk = f157536b;
        if (bxxk == null) {
            synchronized (bvsx.class) {
                bxxk = f157536b;
                if (bxxk == null) {
                    bxxk = new bxve(f157535a);
                    f157536b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
