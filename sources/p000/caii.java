package p000;

/* renamed from: caii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caii extends bxvk implements bxxd {

    /* renamed from: i */
    public static final caii f174700i;

    /* renamed from: j */
    private static volatile bxxk f174701j;

    /* renamed from: a */
    public int f174702a;

    /* renamed from: b */
    public int f174703b;

    /* renamed from: c */
    public int f174704c;

    /* renamed from: d */
    public int f174705d;

    /* renamed from: e */
    public int f174706e;

    /* renamed from: f */
    public int f174707f;

    /* renamed from: g */
    public int f174708g;

    /* renamed from: h */
    public int f174709h;

    static {
        caii caii = new caii();
        f174700i = caii;
        bxvk.m124024a(caii.class, caii);
    }

    private caii() {
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
            return bxvk.m124022a(f174700i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0005\u0002င\u0006\u0003င\u0007\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007င\u0003", new Object[]{"a", "f", "g", "h", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new caii();
        } else {
            if (i2 == 4) {
                return new bxvd(f174700i);
            }
            if (i2 == 5) {
                return f174700i;
            }
            bxxk bxxk = f174701j;
            if (bxxk == null) {
                synchronized (caii.class) {
                    bxxk = f174701j;
                    if (bxxk == null) {
                        bxxk = new bxve(f174700i);
                        f174701j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
