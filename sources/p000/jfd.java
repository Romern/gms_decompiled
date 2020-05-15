package p000;

/* renamed from: jfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfd extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final jfd f22348i;

    /* renamed from: k */
    private static volatile bxxk f22349k;

    /* renamed from: a */
    public int f22350a;

    /* renamed from: b */
    public String f22351b = "";

    /* renamed from: c */
    public String f22352c = "";

    /* renamed from: d */
    public String f22353d = "";

    /* renamed from: e */
    public String f22354e = "";

    /* renamed from: f */
    public jey f22355f;

    /* renamed from: g */
    public String f22356g = "";

    /* renamed from: h */
    public bxwc f22357h = bxxn.f165040b;

    /* renamed from: j */
    private byte f22358j = 2;

    static {
        jfd jfd = new jfd();
        f22348i = jfd;
        GeneratedMessageLite.m124024a(jfd.class, jfd);
    }

    private jfd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f22358j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f22358j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f22348i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007Л", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", jfe.class});
        } else if (i2 == 3) {
            return new jfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f22348i);
            }
            if (i2 == 5) {
                return f22348i;
            }
            bxxk bxxk = f22349k;
            if (bxxk == null) {
                synchronized (jfd.class) {
                    bxxk = f22349k;
                    if (bxxk == null) {
                        bxxk = new bxve(f22348i);
                        f22349k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
