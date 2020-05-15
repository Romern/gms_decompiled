package p000;

/* renamed from: blxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final blxp f128108g;

    /* renamed from: h */
    private static volatile bxxk f128109h;

    /* renamed from: a */
    public int f128110a;

    /* renamed from: b */
    public int f128111b = 0;

    /* renamed from: c */
    public Object f128112c;

    /* renamed from: d */
    public ByteString f128113d = ByteString.f164797b;

    /* renamed from: e */
    public bxwc f128114e = bxxn.f165040b;

    /* renamed from: f */
    public bmdk f128115f;

    static {
        blxp blxp = new blxp();
        f128108g = blxp;
        GeneratedMessageLite.m124024a(blxp.class, blxp);
    }

    private blxp() {
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
            return GeneratedMessageLite.m124022a(f128108g, "\u0001\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ည\u0002\u0005\u001a\u0006ဉ\u0003", new Object[]{"c", "b", "a", bmgo.class, bmft.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new blxp();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f128108g;
            }
            bxxk bxxk = f128109h;
            if (bxxk == null) {
                synchronized (blxp.class) {
                    bxxk = f128109h;
                    if (bxxk == null) {
                        bxxk = new bxve(f128108g);
                        f128109h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
