package p000;

/* renamed from: bvus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvus extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvus f157735d;

    /* renamed from: e */
    private static volatile bxxk f157736e;

    /* renamed from: a */
    public int f157737a;

    /* renamed from: b */
    public int f157738b;

    /* renamed from: c */
    public int f157739c;

    static {
        bvus bvus = new bvus();
        f157735d = bvus;
        bxvk.m124024a(bvus.class, bvus);
    }

    private bvus() {
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
            return bxvk.m124022a(f157735d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvus();
        } else {
            if (i2 == 4) {
                return new bxvd(f157735d);
            }
            if (i2 == 5) {
                return f157735d;
            }
            bxxk bxxk = f157736e;
            if (bxxk == null) {
                synchronized (bvus.class) {
                    bxxk = f157736e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157735d);
                        f157736e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
