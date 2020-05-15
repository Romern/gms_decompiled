package p000;

/* renamed from: xak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xak extends bxvk implements bxxd {

    /* renamed from: c */
    public static final xak f51785c;

    /* renamed from: d */
    private static volatile bxxk f51786d;

    /* renamed from: a */
    public int f51787a;

    /* renamed from: b */
    public int f51788b;

    static {
        xak xak = new xak();
        f51785c = xak;
        bxvk.m124024a(xak.class, xak);
    }

    private xak() {
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
            return bxvk.m124022a(f51785c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", xaj.m42562b()});
        } else if (i2 == 3) {
            return new xak();
        } else {
            if (i2 == 4) {
                return new bxvd(f51785c);
            }
            if (i2 == 5) {
                return f51785c;
            }
            bxxk bxxk = f51786d;
            if (bxxk == null) {
                synchronized (xak.class) {
                    bxxk = f51786d;
                    if (bxxk == null) {
                        bxxk = new bxve(f51785c);
                        f51786d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
