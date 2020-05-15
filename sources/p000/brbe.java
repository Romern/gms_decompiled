package p000;

/* renamed from: brbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbe extends bxvk implements bxxd {

    /* renamed from: f */
    public static final brbe f142234f;

    /* renamed from: g */
    private static volatile bxxk f142235g;

    /* renamed from: a */
    public int f142236a;

    /* renamed from: b */
    public String f142237b = "";

    /* renamed from: c */
    public int f142238c;

    /* renamed from: d */
    public brbd f142239d;

    /* renamed from: e */
    public brbt f142240e;

    static {
        brbe brbe = new brbe();
        f142234f = brbe;
        bxvk.m124024a(brbe.class, brbe);
    }

    private brbe() {
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
            return bxvk.m124022a(f142234f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", brbc.f142229a, "d", "e"});
        } else if (i2 == 3) {
            return new brbe();
        } else {
            if (i2 == 4) {
                return new bxvd(f142234f);
            }
            if (i2 == 5) {
                return f142234f;
            }
            bxxk bxxk = f142235g;
            if (bxxk == null) {
                synchronized (brbe.class) {
                    bxxk = f142235g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142234f);
                        f142235g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
