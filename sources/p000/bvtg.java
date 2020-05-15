package p000;

/* renamed from: bvtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtg extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvtg f157564a;

    /* renamed from: b */
    private static volatile bxxk f157565b;

    static {
        bvtg bvtg = new bvtg();
        f157564a = bvtg;
        bxvk.m124024a(bvtg.class, bvtg);
    }

    private bvtg() {
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
            return bxvk.m124022a(f157564a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvtg();
        }
        if (i2 == 4) {
            return new bxvd(f157564a);
        }
        if (i2 == 5) {
            return f157564a;
        }
        bxxk bxxk = f157565b;
        if (bxxk == null) {
            synchronized (bvtg.class) {
                bxxk = f157565b;
                if (bxxk == null) {
                    bxxk = new bxve(f157564a);
                    f157565b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
