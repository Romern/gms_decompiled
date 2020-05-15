package p000;

/* renamed from: bvkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvkc f156383c;

    /* renamed from: d */
    private static volatile bxxk f156384d;

    /* renamed from: a */
    public bvkb f156385a;

    /* renamed from: b */
    public boolean f156386b;

    static {
        bvkc bvkc = new bvkc();
        f156383c = bvkc;
        bxvk.m124024a(bvkc.class, bvkc);
    }

    private bvkc() {
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
            return bxvk.m124022a(f156383c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvkc();
        } else {
            if (i2 == 4) {
                return new bxvd(f156383c);
            }
            if (i2 == 5) {
                return f156383c;
            }
            bxxk bxxk = f156384d;
            if (bxxk == null) {
                synchronized (bvkc.class) {
                    bxxk = f156384d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156383c);
                        f156384d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
