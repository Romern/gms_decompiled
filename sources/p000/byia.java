package p000;

/* renamed from: byia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byia extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byia f166539f;

    /* renamed from: g */
    private static volatile bxxk f166540g;

    /* renamed from: a */
    public int f166541a;

    /* renamed from: b */
    public bygz f166542b;

    /* renamed from: c */
    public byhe f166543c;

    /* renamed from: d */
    public byjj f166544d;

    /* renamed from: e */
    public byhz f166545e;

    static {
        byia byia = new byia();
        f166539f = byia;
        bxvk.m124024a(byia.class, byia);
    }

    private byia() {
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
            return bxvk.m124022a(f166539f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byia();
        } else {
            if (i2 == 4) {
                return new bxvd(f166539f);
            }
            if (i2 == 5) {
                return f166539f;
            }
            bxxk bxxk = f166540g;
            if (bxxk == null) {
                synchronized (byia.class) {
                    bxxk = f166540g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166539f);
                        f166540g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
