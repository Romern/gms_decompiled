package p000;

/* renamed from: byag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byag extends bxvk implements bxxd {

    /* renamed from: g */
    public static final byag f165248g;

    /* renamed from: h */
    private static volatile bxxk f165249h;

    /* renamed from: a */
    public int f165250a;

    /* renamed from: b */
    public long f165251b;

    /* renamed from: c */
    public long f165252c;

    /* renamed from: d */
    public int f165253d;

    /* renamed from: e */
    public long f165254e;

    /* renamed from: f */
    public long f165255f;

    static {
        byag byag = new byag();
        f165248g = byag;
        bxvk.m124024a(byag.class, byag);
    }

    private byag() {
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
            return bxvk.m124022a(f165248g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0003\u0004ဂ\u0004\u0005င\u0002", new Object[]{"a", "b", "c", "e", "f", "d"});
        } else if (i2 == 3) {
            return new byag();
        } else {
            if (i2 == 4) {
                return new bxvd(f165248g);
            }
            if (i2 == 5) {
                return f165248g;
            }
            bxxk bxxk = f165249h;
            if (bxxk == null) {
                synchronized (byag.class) {
                    bxxk = f165249h;
                    if (bxxk == null) {
                        bxxk = new bxve(f165248g);
                        f165249h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
