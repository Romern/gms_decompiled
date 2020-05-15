package p000;

/* renamed from: bvmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvmz f156831c;

    /* renamed from: e */
    private static volatile bxxk f156832e;

    /* renamed from: a */
    public bvow f156833a;

    /* renamed from: b */
    public bxwc f156834b = bxxn.f165040b;

    /* renamed from: d */
    private int f156835d;

    static {
        bvmz bvmz = new bvmz();
        f156831c = bvmz;
        bxvk.m124024a(bvmz.class, bvmz);
    }

    private bvmz() {
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
            return bxvk.m124022a(f156831c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvmv.class});
        } else if (i2 == 3) {
            return new bvmz();
        } else {
            if (i2 == 4) {
                return new bxvd(f156831c);
            }
            if (i2 == 5) {
                return f156831c;
            }
            bxxk bxxk = f156832e;
            if (bxxk == null) {
                synchronized (bvmz.class) {
                    bxxk = f156832e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156831c);
                        f156832e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
