package p000;

/* renamed from: bwjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwjd f159739g;

    /* renamed from: i */
    private static volatile bxxk f159740i;

    /* renamed from: a */
    public int f159741a;

    /* renamed from: b */
    public bmav f159742b;

    /* renamed from: c */
    public bmaq f159743c;

    /* renamed from: d */
    public bmar f159744d;

    /* renamed from: e */
    public bwja f159745e;

    /* renamed from: f */
    public int f159746f;

    /* renamed from: h */
    private byte f159747h = 2;

    static {
        bwjd bwjd = new bwjd();
        f159739g = bwjd;
        bxvk.m124024a(bwjd.class, bwjd);
    }

    private bwjd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159747h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159747h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f159739g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဌ\u0004\u0005ဉ\u0002", new Object[]{"a", "b", "c", "e", "f", bwgz.m121953b(), "d"});
        } else if (i2 == 3) {
            return new bwjd();
        } else {
            if (i2 == 4) {
                return new bxvd(f159739g);
            }
            if (i2 == 5) {
                return f159739g;
            }
            bxxk bxxk = f159740i;
            if (bxxk == null) {
                synchronized (bwjd.class) {
                    bxxk = f159740i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159739g);
                        f159740i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
