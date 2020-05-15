package p000;

/* renamed from: bmhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmhd f129402c;

    /* renamed from: d */
    private static volatile bxxk f129403d;

    /* renamed from: a */
    public int f129404a = 0;

    /* renamed from: b */
    public Object f129405b;

    static {
        bmhd bmhd = new bmhd();
        f129402c = bmhd;
        bxvk.m124024a(bmhd.class, bmhd);
    }

    private bmhd() {
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
            return bxvk.m124022a(f129402c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", bmqk.class, bmbs.class, bmdt.class});
        } else if (i2 == 3) {
            return new bmhd();
        } else {
            if (i2 == 4) {
                return new bxvd(f129402c);
            }
            if (i2 == 5) {
                return f129402c;
            }
            bxxk bxxk = f129403d;
            if (bxxk == null) {
                synchronized (bmhd.class) {
                    bxxk = f129403d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129402c);
                        f129403d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
