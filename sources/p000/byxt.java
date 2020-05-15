package p000;

/* renamed from: byxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxt extends bxvk implements bxxd {

    /* renamed from: g */
    public static final byxt f168792g;

    /* renamed from: h */
    private static volatile bxxk f168793h;

    /* renamed from: a */
    public int f168794a;

    /* renamed from: b */
    public long f168795b = 8;

    /* renamed from: c */
    public long f168796c;

    /* renamed from: d */
    public long f168797d;

    /* renamed from: e */
    public long f168798e = 40;

    /* renamed from: f */
    public double f168799f = 1.0d;

    static {
        byxt byxt = new byxt();
        f168792g = byxt;
        bxvk.m124024a(byxt.class, byxt);
    }

    private byxt() {
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
            return bxvk.m124022a(f168792g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005က\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new byxt();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f168792g;
            }
            bxxk bxxk = f168793h;
            if (bxxk == null) {
                synchronized (byxt.class) {
                    bxxk = f168793h;
                    if (bxxk == null) {
                        bxxk = new bxve(f168792g);
                        f168793h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
