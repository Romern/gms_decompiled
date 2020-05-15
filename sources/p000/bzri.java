package p000;

/* renamed from: bzri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzri extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzri f171135e;

    /* renamed from: g */
    private static volatile bxxk f171136g;

    /* renamed from: a */
    public String f171137a = "";

    /* renamed from: b */
    public String f171138b = "";

    /* renamed from: c */
    public int f171139c;

    /* renamed from: d */
    public int f171140d;

    /* renamed from: f */
    private int f171141f;

    static {
        bzri bzri = new bzri();
        f171135e = bzri;
        bxvk.m124024a(bzri.class, bzri);
    }

    private bzri() {
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
            return bxvk.m124022a(f171135e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဌ\u0004", new Object[]{"f", "a", "b", "c", "d", bzpz.m126031b()});
        } else if (i2 == 3) {
            return new bzri();
        } else {
            if (i2 == 4) {
                return new bxvd(f171135e);
            }
            if (i2 == 5) {
                return f171135e;
            }
            bxxk bxxk = f171136g;
            if (bxxk == null) {
                synchronized (bzri.class) {
                    bxxk = f171136g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171135e);
                        f171136g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
