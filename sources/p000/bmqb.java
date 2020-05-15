package p000;

/* renamed from: bmqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmqb f130342f;

    /* renamed from: g */
    private static volatile bxxk f130343g;

    /* renamed from: a */
    public int f130344a;

    /* renamed from: b */
    public int f130345b = 0;

    /* renamed from: c */
    public Object f130346c;

    /* renamed from: d */
    public String f130347d = "";

    /* renamed from: e */
    public bwio f130348e;

    static {
        bmqb bmqb = new bmqb();
        f130342f = bmqb;
        bxvk.m124024a(bmqb.class, bmqb);
    }

    private bmqb() {
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
            return bxvk.m124022a(f130342f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ျ\u0000\u0002ဈ\u0004\u0003ဿ\u0000\u0004ဳ\u0000\u0005ဳ\u0000\u0006ဉ\u0005", new Object[]{"c", "b", "a", "d", bmpp.f130323a, "e"});
        } else if (i2 == 3) {
            return new bmqb();
        } else {
            if (i2 == 4) {
                return new bxvd(f130342f);
            }
            if (i2 == 5) {
                return f130342f;
            }
            bxxk bxxk = f130343g;
            if (bxxk == null) {
                synchronized (bmqb.class) {
                    bxxk = f130343g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130342f);
                        f130343g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
