package p000;

/* renamed from: bklb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklb extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bklb f124686k;

    /* renamed from: l */
    private static volatile bxxk f124687l;

    /* renamed from: a */
    public int f124688a;

    /* renamed from: b */
    public String f124689b = "";

    /* renamed from: c */
    public String f124690c = "";

    /* renamed from: d */
    public String f124691d = "";

    /* renamed from: e */
    public String f124692e = "";

    /* renamed from: f */
    public boolean f124693f;

    /* renamed from: g */
    public boolean f124694g;

    /* renamed from: h */
    public boolean f124695h = true;

    /* renamed from: i */
    public String f124696i = "";

    /* renamed from: j */
    public String f124697j = "";

    static {
        bklb bklb = new bklb();
        f124686k = bklb;
        GeneratedMessageLite.m124024a(bklb.class, bklb);
    }

    private bklb() {
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
            return GeneratedMessageLite.m124022a(f124686k, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0005ဈ\u0004\bဈ\u0007\tဇ\b\nဇ\t\u000bဇ\n\rဈ\u000b\u000fဈ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bklb();
        } else {
            if (i2 == 4) {
                return new bxvd(f124686k);
            }
            if (i2 == 5) {
                return f124686k;
            }
            bxxk bxxk = f124687l;
            if (bxxk == null) {
                synchronized (bklb.class) {
                    bxxk = f124687l;
                    if (bxxk == null) {
                        bxxk = new bxve(f124686k);
                        f124687l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
