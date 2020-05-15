package p000;

/* renamed from: bmof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmof extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmof f130215h;

    /* renamed from: j */
    private static volatile bxxk f130216j;

    /* renamed from: a */
    public String f130217a = "";

    /* renamed from: b */
    public long f130218b;

    /* renamed from: c */
    public String f130219c = "";

    /* renamed from: d */
    public bxwc f130220d = bxxn.f165040b;

    /* renamed from: e */
    public int f130221e;

    /* renamed from: f */
    public bmnr f130222f;

    /* renamed from: g */
    public int f130223g;

    /* renamed from: i */
    private int f130224i;

    static {
        bmof bmof = new bmof();
        f130215h = bmof;
        bxvk.m124024a(bmof.class, bmof);
    }

    private bmof() {
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
            return bxvk.m124022a(f130215h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003\u001b\u0004င\u0003\u0005ဉ\u0004\u0006ဂ\u0001\u0007ဌ\u0005", new Object[]{"i", "a", "c", "d", bmqf.class, "e", "f", "b", "g", bmod.f130214a});
        } else if (i2 == 3) {
            return new bmof();
        } else {
            if (i2 == 4) {
                return new bxvd(f130215h);
            }
            if (i2 == 5) {
                return f130215h;
            }
            bxxk bxxk = f130216j;
            if (bxxk == null) {
                synchronized (bmof.class) {
                    bxxk = f130216j;
                    if (bxxk == null) {
                        bxxk = new bxve(f130215h);
                        f130216j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
