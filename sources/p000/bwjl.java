package p000;

/* renamed from: bwjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwjl f159802g;

    /* renamed from: i */
    private static volatile bxxk f159803i;

    /* renamed from: a */
    public int f159804a;

    /* renamed from: b */
    public bmaq f159805b;

    /* renamed from: c */
    public bmar f159806c;

    /* renamed from: d */
    public bmav f159807d;

    /* renamed from: e */
    public bwjm f159808e;

    /* renamed from: f */
    public int f159809f;

    /* renamed from: h */
    private byte f159810h = 2;

    static {
        bwjl bwjl = new bwjl();
        f159802g = bwjl;
        bxvk.m124024a(bwjl.class, bwjl);
    }

    private bwjl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159810h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159810h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159802g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0002\u0003ᐉ\u0003\u0004ဌ\u0004\u0005ဉ\u0001", new Object[]{"a", "b", "d", "e", "f", bwgz.m121953b(), "c"});
        } else if (i2 == 3) {
            return new bwjl();
        } else {
            if (i2 == 4) {
                return new bxvd(f159802g);
            }
            if (i2 == 5) {
                return f159802g;
            }
            bxxk bxxk = f159803i;
            if (bxxk == null) {
                synchronized (bwjl.class) {
                    bxxk = f159803i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159802g);
                        f159803i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
