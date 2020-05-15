package p000;

/* renamed from: bmck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmck extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bmck f128698j;

    /* renamed from: k */
    private static volatile bxxk f128699k;

    /* renamed from: a */
    public int f128700a;

    /* renamed from: b */
    public bmdn f128701b;

    /* renamed from: c */
    public String f128702c = "";

    /* renamed from: d */
    public bmno f128703d;

    /* renamed from: e */
    public String f128704e = "";

    /* renamed from: f */
    public bmno f128705f;

    /* renamed from: g */
    public String f128706g = "";

    /* renamed from: h */
    public bmno f128707h;

    /* renamed from: i */
    public bmcw f128708i;

    static {
        bmck bmck = new bmck();
        f128698j = bmck;
        bxvk.m124024a(bmck.class, bmck);
    }

    private bmck() {
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
            return bxvk.m124022a(f128698j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bmck();
        } else {
            if (i2 == 4) {
                return new bxvd(f128698j);
            }
            if (i2 == 5) {
                return f128698j;
            }
            bxxk bxxk = f128699k;
            if (bxxk == null) {
                synchronized (bmck.class) {
                    bxxk = f128699k;
                    if (bxxk == null) {
                        bxxk = new bxve(f128698j);
                        f128699k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
