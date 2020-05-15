package p000;

/* renamed from: byhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhi extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byhi f166451f;

    /* renamed from: g */
    private static volatile bxxk f166452g;

    /* renamed from: a */
    public int f166453a;

    /* renamed from: b */
    public long f166454b = -1;

    /* renamed from: c */
    public bxtx f166455c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f166456d = bxtx.f164797b;

    /* renamed from: e */
    public byhh f166457e;

    static {
        byhi byhi = new byhi();
        f166451f = byhi;
        bxvk.m124024a(byhi.class, byhi);
    }

    private byhi() {
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
            return bxvk.m124022a(f166451f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byhi();
        } else {
            if (i2 == 4) {
                return new bxvd(f166451f);
            }
            if (i2 == 5) {
                return f166451f;
            }
            bxxk bxxk = f166452g;
            if (bxxk == null) {
                synchronized (byhi.class) {
                    bxxk = f166452g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166451f);
                        f166452g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
