package p000;

/* renamed from: brbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brbo f142295d;

    /* renamed from: e */
    private static volatile bxxk f142296e;

    /* renamed from: a */
    public int f142297a;

    /* renamed from: b */
    public brak f142298b;

    /* renamed from: c */
    public String f142299c = "";

    static {
        brbo brbo = new brbo();
        f142295d = brbo;
        bxvk.m124024a(brbo.class, brbo);
    }

    private brbo() {
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
            return bxvk.m124022a(f142295d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brbo();
        } else {
            if (i2 == 4) {
                return new bxvd(f142295d);
            }
            if (i2 == 5) {
                return f142295d;
            }
            bxxk bxxk = f142296e;
            if (bxxk == null) {
                synchronized (brbo.class) {
                    bxxk = f142296e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142295d);
                        f142296e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
