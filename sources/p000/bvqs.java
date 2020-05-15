package p000;

/* renamed from: bvqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqs f157406a;

    /* renamed from: b */
    private static volatile bxxk f157407b;

    static {
        bvqs bvqs = new bvqs();
        f157406a = bvqs;
        bxvk.m124024a(bvqs.class, bvqs);
    }

    private bvqs() {
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
            return bxvk.m124022a(f157406a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqs();
        }
        if (i2 == 4) {
            return new bxvd(f157406a);
        }
        if (i2 == 5) {
            return f157406a;
        }
        bxxk bxxk = f157407b;
        if (bxxk == null) {
            synchronized (bvqs.class) {
                bxxk = f157407b;
                if (bxxk == null) {
                    bxxk = new bxve(f157406a);
                    f157407b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
