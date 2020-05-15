package p000;

/* renamed from: bmdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdb extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bmdb f128767k;

    /* renamed from: l */
    private static volatile bxxk f128768l;

    /* renamed from: a */
    public int f128769a;

    /* renamed from: b */
    public long f128770b;

    /* renamed from: c */
    public boolean f128771c;

    /* renamed from: d */
    public bmno f128772d;

    /* renamed from: e */
    public String f128773e = "";

    /* renamed from: f */
    public String f128774f = "";

    /* renamed from: g */
    public String f128775g = "";

    /* renamed from: h */
    public int f128776h;

    /* renamed from: i */
    public int f128777i;

    /* renamed from: j */
    public int f128778j;

    static {
        bmdb bmdb = new bmdb();
        f128767k = bmdb;
        bxvk.m124024a(bmdb.class, bmdb);
    }

    private bmdb() {
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
            return bxvk.m124022a(f128767k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006င\u0006\u0007ဌ\u0007\nဉ\u0002\u0010ဌ\b", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", bmcz.f128766a, "d", "j", bmcx.f128765a});
        } else if (i2 == 3) {
            return new bmdb();
        } else {
            if (i2 == 4) {
                return new bxvd(f128767k);
            }
            if (i2 == 5) {
                return f128767k;
            }
            bxxk bxxk = f128768l;
            if (bxxk == null) {
                synchronized (bmdb.class) {
                    bxxk = f128768l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128767k);
                        f128768l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
