package p000;

/* renamed from: cage */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cage extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cage f173082f;

    /* renamed from: g */
    private static volatile bxxk f173083g;

    /* renamed from: a */
    public int f173084a;

    /* renamed from: b */
    public boolean f173085b;

    /* renamed from: c */
    public boolean f173086c;

    /* renamed from: d */
    public int f173087d;

    /* renamed from: e */
    public boolean f173088e;

    static {
        cage cage = new cage();
        f173082f = cage;
        GeneratedMessageLite.m124024a(cage.class, cage);
    }

    private cage() {
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
            return GeneratedMessageLite.m124022a(f173082f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", cagd.f173081a, "e"});
        } else if (i2 == 3) {
            return new cage();
        } else {
            if (i2 == 4) {
                return new bxvd(f173082f);
            }
            if (i2 == 5) {
                return f173082f;
            }
            bxxk bxxk = f173083g;
            if (bxxk == null) {
                synchronized (cage.class) {
                    bxxk = f173083g;
                    if (bxxk == null) {
                        bxxk = new bxve(f173082f);
                        f173083g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
