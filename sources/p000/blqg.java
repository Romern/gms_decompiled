package p000;

/* renamed from: blqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blqg f127329e;

    /* renamed from: g */
    private static volatile bxxk f127330g;

    /* renamed from: a */
    public boolean f127331a;

    /* renamed from: b */
    public bxwc f127332b = bxxn.f165040b;

    /* renamed from: c */
    public long f127333c;

    /* renamed from: d */
    public boolean f127334d;

    /* renamed from: f */
    private int f127335f;

    static {
        blqg blqg = new blqg();
        f127329e = blqg;
        bxvk.m124024a(blqg.class, blqg);
    }

    private blqg() {
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
            return bxvk.m124022a(f127329e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u0003ဃ\u0001\u0004ဇ\u0002", new Object[]{"f", "a", "b", blqf.class, "c", "d"});
        } else if (i2 == 3) {
            return new blqg();
        } else {
            if (i2 == 4) {
                return new bxvd(f127329e);
            }
            if (i2 == 5) {
                return f127329e;
            }
            bxxk bxxk = f127330g;
            if (bxxk == null) {
                synchronized (blqg.class) {
                    bxxk = f127330g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127329e);
                        f127330g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
