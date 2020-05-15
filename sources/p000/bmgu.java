package p000;

/* renamed from: bmgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmgu f129333e;

    /* renamed from: f */
    private static volatile bxxk f129334f;

    /* renamed from: a */
    public int f129335a;

    /* renamed from: b */
    public String f129336b = "";

    /* renamed from: c */
    public bxtx f129337c = bxtx.f164797b;

    /* renamed from: d */
    public bmqk f129338d;

    static {
        bmgu bmgu = new bmgu();
        f129333e = bmgu;
        bxvk.m124024a(bmgu.class, bmgu);
    }

    private bmgu() {
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
            return bxvk.m124022a(f129333e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmgu();
        } else {
            if (i2 == 4) {
                return new bxvd(f129333e);
            }
            if (i2 == 5) {
                return f129333e;
            }
            bxxk bxxk = f129334f;
            if (bxxk == null) {
                synchronized (bmgu.class) {
                    bxxk = f129334f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129333e);
                        f129334f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
