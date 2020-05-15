package p000;

/* renamed from: bvgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvgn f156018c;

    /* renamed from: d */
    private static volatile bxxk f156019d;

    /* renamed from: a */
    public int f156020a;

    /* renamed from: b */
    public bvgt f156021b;

    static {
        bvgn bvgn = new bvgn();
        f156018c = bvgn;
        bxvk.m124024a(bvgn.class, bvgn);
    }

    private bvgn() {
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
            return bxvk.m124022a(f156018c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvgn();
        } else {
            if (i2 == 4) {
                return new bxvd(f156018c);
            }
            if (i2 == 5) {
                return f156018c;
            }
            bxxk bxxk = f156019d;
            if (bxxk == null) {
                synchronized (bvgn.class) {
                    bxxk = f156019d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156018c);
                        f156019d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
