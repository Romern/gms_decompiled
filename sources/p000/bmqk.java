package p000;

/* renamed from: bmqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqk extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmqk f130403g;

    /* renamed from: h */
    private static volatile bxxk f130404h;

    /* renamed from: a */
    public int f130405a;

    /* renamed from: b */
    public int f130406b = 0;

    /* renamed from: c */
    public Object f130407c;

    /* renamed from: d */
    public String f130408d = "";

    /* renamed from: e */
    public String f130409e = "";

    /* renamed from: f */
    public ByteString f130410f = ByteString.f164797b;

    static {
        bmqk bmqk = new bmqk();
        f130403g = bmqk;
        GeneratedMessageLite.m124024a(bmqk.class, bmqk);
    }

    private bmqk() {
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
            return GeneratedMessageLite.m124022a(f130403g, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ဈ\u0007\u0005ဿ\u0000\u0006ည\b\u0007ြ\u0000\bျ\u0000\nွ\u0000\u000bြ\u0000", new Object[]{"c", "b", "a", "d", "e", bmqh.m108282b(), "f", blxc.class, bmqj.class});
        } else if (i2 == 3) {
            return new bmqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f130403g);
            }
            if (i2 == 5) {
                return f130403g;
            }
            bxxk bxxk = f130404h;
            if (bxxk == null) {
                synchronized (bmqk.class) {
                    bxxk = f130404h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130403g);
                        f130404h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
