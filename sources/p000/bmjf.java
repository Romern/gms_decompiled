package p000;

/* renamed from: bmjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjf extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmjf f129685i;

    /* renamed from: j */
    private static volatile bxxk f129686j;

    /* renamed from: a */
    public int f129687a;

    /* renamed from: b */
    public long f129688b;

    /* renamed from: c */
    public bmnr f129689c;

    /* renamed from: d */
    public String f129690d = "";

    /* renamed from: e */
    public boolean f129691e;

    /* renamed from: f */
    public bmnr f129692f;

    /* renamed from: g */
    public String f129693g = "";

    /* renamed from: h */
    public int f129694h;

    static {
        bmjf bmjf = new bmjf();
        f129685i = bmjf;
        GeneratedMessageLite.m124024a(bmjf.class, bmjf);
    }

    private bmjf() {
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
            return GeneratedMessageLite.m124022a(f129685i, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဈ\u0005\u0005ဉ\u0001\u0006ဇ\u0003\u0007ဂ\u0000\bဉ\u0004\u000bဌ\u0006", new Object[]{"a", "d", "g", "c", "e", "b", "f", "h", bmjd.f129684a});
        } else if (i2 == 3) {
            return new bmjf();
        } else {
            if (i2 == 4) {
                return new bxvd(f129685i);
            }
            if (i2 == 5) {
                return f129685i;
            }
            bxxk bxxk = f129686j;
            if (bxxk == null) {
                synchronized (bmjf.class) {
                    bxxk = f129686j;
                    if (bxxk == null) {
                        bxxk = new bxve(f129685i);
                        f129686j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
