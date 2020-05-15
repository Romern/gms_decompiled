package p000;

/* renamed from: bvqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqg extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqg f157369a;

    /* renamed from: b */
    private static volatile bxxk f157370b;

    static {
        bvqg bvqg = new bvqg();
        f157369a = bvqg;
        bxvk.m124024a(bvqg.class, bvqg);
    }

    private bvqg() {
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
            return bxvk.m124022a(f157369a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqg();
        }
        if (i2 == 4) {
            return new bxvd(f157369a);
        }
        if (i2 == 5) {
            return f157369a;
        }
        bxxk bxxk = f157370b;
        if (bxxk == null) {
            synchronized (bvqg.class) {
                bxxk = f157370b;
                if (bxxk == null) {
                    bxxk = new bxve(f157369a);
                    f157370b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
