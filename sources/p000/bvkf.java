package p000;

/* renamed from: bvkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvkf f156404c;

    /* renamed from: d */
    private static volatile bxxk f156405d;

    /* renamed from: a */
    public bvkd f156406a;

    /* renamed from: b */
    public bxuw f156407b;

    static {
        bvkf bvkf = new bvkf();
        f156404c = bvkf;
        bxvk.m124024a(bvkf.class, bvkf);
    }

    private bvkf() {
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
            return bxvk.m124022a(f156404c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f156404c);
            }
            if (i2 == 5) {
                return f156404c;
            }
            bxxk bxxk = f156405d;
            if (bxxk == null) {
                synchronized (bvkf.class) {
                    bxxk = f156405d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156404c);
                        f156405d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
