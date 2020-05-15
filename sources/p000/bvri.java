package p000;

/* renamed from: bvri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvri extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvri f157438a;

    /* renamed from: b */
    private static volatile bxxk f157439b;

    static {
        bvri bvri = new bvri();
        f157438a = bvri;
        bxvk.m124024a(bvri.class, bvri);
    }

    private bvri() {
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
            return bxvk.m124022a(f157438a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvri();
        }
        if (i2 == 4) {
            return new bxvd(f157438a);
        }
        if (i2 == 5) {
            return f157438a;
        }
        bxxk bxxk = f157439b;
        if (bxxk == null) {
            synchronized (bvri.class) {
                bxxk = f157439b;
                if (bxxk == null) {
                    bxxk = new bxve(f157438a);
                    f157439b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
