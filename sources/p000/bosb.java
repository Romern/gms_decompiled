package p000;

/* renamed from: bosb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bosb f134550c;

    /* renamed from: d */
    private static volatile bxxk f134551d;

    /* renamed from: a */
    public int f134552a;

    /* renamed from: b */
    public int f134553b;

    static {
        bosb bosb = new bosb();
        f134550c = bosb;
        bxvk.m124024a(bosb.class, bosb);
    }

    private bosb() {
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
            return bxvk.m124022a(f134550c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bosb();
        } else {
            if (i2 == 4) {
                return new bxvd(f134550c);
            }
            if (i2 == 5) {
                return f134550c;
            }
            bxxk bxxk = f134551d;
            if (bxxk == null) {
                synchronized (bosb.class) {
                    bxxk = f134551d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134550c);
                        f134551d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
