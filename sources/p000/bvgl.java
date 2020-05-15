package p000;

/* renamed from: bvgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvgl f156007d;

    /* renamed from: e */
    private static volatile bxxk f156008e;

    /* renamed from: a */
    public int f156009a;

    /* renamed from: b */
    public bxtx f156010b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f156011c = bxtx.f164797b;

    static {
        bvgl bvgl = new bvgl();
        f156007d = bvgl;
        bxvk.m124024a(bvgl.class, bvgl);
    }

    private bvgl() {
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
            return bxvk.m124022a(f156007d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvgl();
        } else {
            if (i2 == 4) {
                return new bxvd(f156007d);
            }
            if (i2 == 5) {
                return f156007d;
            }
            bxxk bxxk = f156008e;
            if (bxxk == null) {
                synchronized (bvgl.class) {
                    bxxk = f156008e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156007d);
                        f156008e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
