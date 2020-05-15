package p000;

/* renamed from: bvej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvej extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvej f155734f;

    /* renamed from: g */
    private static volatile bxxk f155735g;

    /* renamed from: a */
    public int f155736a;

    /* renamed from: b */
    public long f155737b;

    /* renamed from: c */
    public long f155738c;

    /* renamed from: d */
    public int f155739d;

    /* renamed from: e */
    public int f155740e;

    static {
        bvej bvej = new bvej();
        f155734f = bvej;
        bxvk.m124024a(bvej.class, bvej);
    }

    private bvej() {
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
            return bxvk.m124022a(f155734f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", bvhy.f156125a, "e", bvhy.f156125a});
        } else if (i2 == 3) {
            return new bvej();
        } else {
            if (i2 == 4) {
                return new bxvd(f155734f);
            }
            if (i2 == 5) {
                return f155734f;
            }
            bxxk bxxk = f155735g;
            if (bxxk == null) {
                synchronized (bvej.class) {
                    bxxk = f155735g;
                    if (bxxk == null) {
                        bxxk = new bxve(f155734f);
                        f155735g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
