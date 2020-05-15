package p000;

/* renamed from: xae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xae extends bxvk implements bxxd {

    /* renamed from: d */
    public static final xae f51700d;

    /* renamed from: e */
    private static volatile bxxk f51701e;

    /* renamed from: a */
    public int f51702a;

    /* renamed from: b */
    public String f51703b = "";

    /* renamed from: c */
    public int f51704c;

    static {
        xae xae = new xae();
        f51700d = xae;
        bxvk.m124024a(xae.class, xae);
    }

    private xae() {
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
            return bxvk.m124022a(f51700d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", xac.f51699a});
        } else if (i2 == 3) {
            return new xae();
        } else {
            if (i2 == 4) {
                return new bxvd(f51700d);
            }
            if (i2 == 5) {
                return f51700d;
            }
            bxxk bxxk = f51701e;
            if (bxxk == null) {
                synchronized (xae.class) {
                    bxxk = f51701e;
                    if (bxxk == null) {
                        bxxk = new bxve(f51700d);
                        f51701e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
