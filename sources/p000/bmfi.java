package p000;

/* renamed from: bmfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmfi f129099c;

    /* renamed from: e */
    private static volatile bxxk f129100e;

    /* renamed from: a */
    public int f129101a = 0;

    /* renamed from: b */
    public Object f129102b;

    /* renamed from: d */
    private byte f129103d = 2;

    static {
        bmfi bmfi = new bmfi();
        f129099c = bmfi;
        bxvk.m124024a(bmfi.class, bmfi);
    }

    private bmfi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129103d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129103d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f129099c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"b", "a", bmeb.class});
        } else if (i2 == 3) {
            return new bmfi();
        } else {
            if (i2 == 4) {
                return new bxvd(f129099c);
            }
            if (i2 == 5) {
                return f129099c;
            }
            bxxk bxxk = f129100e;
            if (bxxk == null) {
                synchronized (bmfi.class) {
                    bxxk = f129100e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129099c);
                        f129100e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
