package p000;

/* renamed from: bvqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqf f157367a;

    /* renamed from: b */
    private static volatile bxxk f157368b;

    static {
        bvqf bvqf = new bvqf();
        f157367a = bvqf;
        bxvk.m124024a(bvqf.class, bvqf);
    }

    private bvqf() {
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
            return bxvk.m124022a(f157367a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqf();
        }
        if (i2 == 4) {
            return new bxvd(f157367a);
        }
        if (i2 == 5) {
            return f157367a;
        }
        bxxk bxxk = f157368b;
        if (bxxk == null) {
            synchronized (bvqf.class) {
                bxxk = f157368b;
                if (bxxk == null) {
                    bxxk = new bxve(f157367a);
                    f157368b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
