package p000;

/* renamed from: byvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvs extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byvs f168496f;

    /* renamed from: g */
    private static volatile bxxk f168497g;

    /* renamed from: a */
    public int f168498a;

    /* renamed from: b */
    public int f168499b;

    /* renamed from: c */
    public long f168500c;

    /* renamed from: d */
    public long f168501d;

    /* renamed from: e */
    public int f168502e;

    static {
        byvs byvs = new byvs();
        f168496f = byvs;
        bxvk.m124024a(byvs.class, byvs);
    }

    private byvs() {
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
            return bxvk.m124022a(f168496f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byvs();
        } else {
            if (i2 == 4) {
                return new bxvd(f168496f);
            }
            if (i2 == 5) {
                return f168496f;
            }
            bxxk bxxk = f168497g;
            if (bxxk == null) {
                synchronized (byvs.class) {
                    bxxk = f168497g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168496f);
                        f168497g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
