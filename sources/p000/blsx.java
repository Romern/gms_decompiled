package p000;

/* renamed from: blsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blsx extends bxvk implements bxxd {

    /* renamed from: k */
    public static final blsx f127637k;

    /* renamed from: m */
    private static volatile bxxk f127638m;

    /* renamed from: a */
    public int f127639a;

    /* renamed from: b */
    public int f127640b;

    /* renamed from: c */
    public String f127641c = "";

    /* renamed from: d */
    public String f127642d = "";

    /* renamed from: e */
    public String f127643e = "";

    /* renamed from: f */
    public int f127644f;

    /* renamed from: g */
    public String f127645g = "";

    /* renamed from: h */
    public bxtx f127646h = bxtx.f164797b;

    /* renamed from: i */
    public boolean f127647i;

    /* renamed from: j */
    public int f127648j;

    /* renamed from: l */
    private byte f127649l = 2;

    static {
        blsx blsx = new blsx();
        f127637k = blsx;
        bxvk.m124024a(blsx.class, blsx);
    }

    private blsx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127649l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127649l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127637k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0005\u0001ᔌ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔌ\u0004\u0006ဈ\u0005\u0007ည\u0006\bဇ\u0007\tဋ\b", new Object[]{"a", "b", blsw.m107540b(), "c", "d", "e", "f", blst.f127628a, "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new blsx();
        } else {
            if (i2 == 4) {
                return new bxvd(f127637k);
            }
            if (i2 == 5) {
                return f127637k;
            }
            bxxk bxxk = f127638m;
            if (bxxk == null) {
                synchronized (blsx.class) {
                    bxxk = f127638m;
                    if (bxxk == null) {
                        bxxk = new bxve(f127637k);
                        f127638m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
