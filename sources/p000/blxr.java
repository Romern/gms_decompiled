package p000;

/* renamed from: blxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxr extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blxr f128121g;

    /* renamed from: i */
    private static volatile bxxk f128122i;

    /* renamed from: a */
    public int f128123a;

    /* renamed from: b */
    public bmav f128124b;

    /* renamed from: c */
    public bmaq f128125c;

    /* renamed from: d */
    public bmar f128126d;

    /* renamed from: e */
    public blxo f128127e;

    /* renamed from: f */
    public int f128128f;

    /* renamed from: h */
    private byte f128129h = 2;

    static {
        blxr blxr = new blxr();
        f128121g = blxr;
        GeneratedMessageLite.m124024a(blxr.class, blxr);
    }

    private blxr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128129h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128129h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128121g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0005ဌ\u0005\u0007ဉ\u0002", new Object[]{"a", "b", "c", "e", "f", bwgz.m121953b(), "d"});
        } else if (i2 == 3) {
            return new blxr();
        } else {
            if (i2 == 4) {
                return new bxvd(f128121g);
            }
            if (i2 == 5) {
                return f128121g;
            }
            bxxk bxxk = f128122i;
            if (bxxk == null) {
                synchronized (blxr.class) {
                    bxxk = f128122i;
                    if (bxxk == null) {
                        bxxk = new bxve(f128121g);
                        f128122i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
