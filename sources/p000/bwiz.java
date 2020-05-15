package p000;

/* renamed from: bwiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwiz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwiz f159705g;

    /* renamed from: i */
    private static volatile bxxk f159706i;

    /* renamed from: a */
    public int f159707a;

    /* renamed from: b */
    public bmav f159708b;

    /* renamed from: c */
    public bmaq f159709c;

    /* renamed from: d */
    public bmar f159710d;

    /* renamed from: e */
    public bwja f159711e;

    /* renamed from: f */
    public int f159712f;

    /* renamed from: h */
    private byte f159713h = 2;

    static {
        bwiz bwiz = new bwiz();
        f159705g = bwiz;
        bxvk.m124024a(bwiz.class, bwiz);
    }

    private bwiz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159713h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159713h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159705g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဌ\u0004\u0005ဉ\u0002", new Object[]{"a", "b", "c", "e", "f", bwgz.m121953b(), "d"});
        } else if (i2 == 3) {
            return new bwiz();
        } else {
            if (i2 == 4) {
                return new bxvd(f159705g);
            }
            if (i2 == 5) {
                return f159705g;
            }
            bxxk bxxk = f159706i;
            if (bxxk == null) {
                synchronized (bwiz.class) {
                    bxxk = f159706i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159705g);
                        f159706i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
