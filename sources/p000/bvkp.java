package p000;

/* renamed from: bvkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvkp f156451b;

    /* renamed from: c */
    private static volatile bxxk f156452c;

    /* renamed from: a */
    public bvkn f156453a;

    static {
        bvkp bvkp = new bvkp();
        f156451b = bvkp;
        bxvk.m124024a(bvkp.class, bvkp);
    }

    private bvkp() {
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
            return bxvk.m124022a(f156451b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bvkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f156451b);
            }
            if (i2 == 5) {
                return f156451b;
            }
            bxxk bxxk = f156452c;
            if (bxxk == null) {
                synchronized (bvkp.class) {
                    bxxk = f156452c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156451b);
                        f156452c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
