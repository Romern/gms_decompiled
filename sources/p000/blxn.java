package p000;

/* renamed from: blxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxn extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blxn f128087f;

    /* renamed from: h */
    private static volatile bxxk f128088h;

    /* renamed from: a */
    public int f128089a;

    /* renamed from: b */
    public bmav f128090b;

    /* renamed from: c */
    public bmaq f128091c;

    /* renamed from: d */
    public bmar f128092d;

    /* renamed from: e */
    public blxo f128093e;

    /* renamed from: g */
    private byte f128094g = 2;

    static {
        blxn blxn = new blxn();
        f128087f = blxn;
        bxvk.m124024a(blxn.class, blxn);
    }

    private blxn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128094g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128094g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f128087f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new blxn();
        } else {
            if (i2 == 4) {
                return new bxvd(f128087f);
            }
            if (i2 == 5) {
                return f128087f;
            }
            bxxk bxxk = f128088h;
            if (bxxk == null) {
                synchronized (blxn.class) {
                    bxxk = f128088h;
                    if (bxxk == null) {
                        bxxk = new bxve(f128087f);
                        f128088h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
