package p000;

/* renamed from: bmkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkr extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bmkr f129866k;

    /* renamed from: l */
    private static volatile bxxk f129867l;

    /* renamed from: a */
    public int f129868a;

    /* renamed from: b */
    public String f129869b = "";

    /* renamed from: c */
    public int f129870c;

    /* renamed from: d */
    public int f129871d;

    /* renamed from: e */
    public String f129872e = "";

    /* renamed from: f */
    public bxtx f129873f = bxtx.f164797b;

    /* renamed from: g */
    public String f129874g = "";

    /* renamed from: h */
    public String f129875h = "";

    /* renamed from: i */
    public int f129876i;

    /* renamed from: j */
    public boolean f129877j;

    static {
        bmkr bmkr = new bmkr();
        f129866k = bmkr;
        bxvk.m124024a(bmkr.class, bmkr);
    }

    private bmkr() {
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
            return bxvk.m124022a(f129866k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0003\u0005ည\u0004\u0006ဈ\u0005\u0007ဌ\u0007\bဌ\u0002\tဈ\u0006\nဇ\b", new Object[]{"a", "b", "c", bmko.f129864a, "e", "f", "g", "i", bmkq.f129865a, "d", blwg.m107711b(), "h", "j"});
        } else if (i2 == 3) {
            return new bmkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f129866k);
            }
            if (i2 == 5) {
                return f129866k;
            }
            bxxk bxxk = f129867l;
            if (bxxk == null) {
                synchronized (bmkr.class) {
                    bxxk = f129867l;
                    if (bxxk == null) {
                        bxxk = new bxve(f129866k);
                        f129867l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
