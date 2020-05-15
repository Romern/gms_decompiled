package p000;

/* renamed from: btsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btsy f150304c;

    /* renamed from: d */
    private static volatile bxxk f150305d;

    /* renamed from: a */
    public int f150306a;

    /* renamed from: b */
    public bzvu f150307b;

    static {
        btsy btsy = new btsy();
        f150304c = btsy;
        bxvk.m124024a(btsy.class, btsy);
    }

    private btsy() {
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
            return bxvk.m124022a(f150304c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btsy();
        } else {
            if (i2 == 4) {
                return new bxvd(f150304c);
            }
            if (i2 == 5) {
                return f150304c;
            }
            bxxk bxxk = f150305d;
            if (bxxk == null) {
                synchronized (btsy.class) {
                    bxxk = f150305d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150304c);
                        f150305d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
