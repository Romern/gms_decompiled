package p000;

/* renamed from: bvry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvry extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvry f157470a;

    /* renamed from: b */
    private static volatile bxxk f157471b;

    static {
        bvry bvry = new bvry();
        f157470a = bvry;
        bxvk.m124024a(bvry.class, bvry);
    }

    private bvry() {
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
            return bxvk.m124022a(f157470a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvry();
        }
        if (i2 == 4) {
            return new bxvd(f157470a);
        }
        if (i2 == 5) {
            return f157470a;
        }
        bxxk bxxk = f157471b;
        if (bxxk == null) {
            synchronized (bvry.class) {
                bxxk = f157471b;
                if (bxxk == null) {
                    bxxk = new bxve(f157470a);
                    f157471b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
