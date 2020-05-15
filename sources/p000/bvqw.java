package p000;

/* renamed from: bvqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqw f157414a;

    /* renamed from: b */
    private static volatile bxxk f157415b;

    static {
        bvqw bvqw = new bvqw();
        f157414a = bvqw;
        bxvk.m124024a(bvqw.class, bvqw);
    }

    private bvqw() {
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
            return bxvk.m124022a(f157414a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqw();
        }
        if (i2 == 4) {
            return new bxvd(f157414a);
        }
        if (i2 == 5) {
            return f157414a;
        }
        bxxk bxxk = f157415b;
        if (bxxk == null) {
            synchronized (bvqw.class) {
                bxxk = f157415b;
                if (bxxk == null) {
                    bxxk = new bxve(f157414a);
                    f157415b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
