package p000;

/* renamed from: bvew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvew extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvew f155805c;

    /* renamed from: d */
    private static volatile bxxk f155806d;

    /* renamed from: a */
    public int f155807a;

    /* renamed from: b */
    public int f155808b;

    static {
        bvew bvew = new bvew();
        f155805c = bvew;
        bxvk.m124024a(bvew.class, bvew);
    }

    private bvew() {
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
            return bxvk.m124022a(f155805c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvew();
        } else {
            if (i2 == 4) {
                return new bxvd(f155805c);
            }
            if (i2 == 5) {
                return f155805c;
            }
            bxxk bxxk = f155806d;
            if (bxxk == null) {
                synchronized (bvew.class) {
                    bxxk = f155806d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155805c);
                        f155806d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
