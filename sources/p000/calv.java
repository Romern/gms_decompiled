package p000;

/* renamed from: calv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calv extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final calv f175180j;

    /* renamed from: k */
    private static volatile bxxk f175181k;

    /* renamed from: a */
    public int f175182a;

    /* renamed from: b */
    public String f175183b = "";

    /* renamed from: c */
    public ByteString f175184c = ByteString.f164797b;

    /* renamed from: d */
    public long f175185d;

    /* renamed from: e */
    public boolean f175186e;

    /* renamed from: f */
    public String f175187f = "";

    /* renamed from: g */
    public int f175188g;

    /* renamed from: h */
    public String f175189h = "";

    /* renamed from: i */
    public String f175190i = "";

    static {
        calv calv = new calv();
        f175180j = calv;
        GeneratedMessageLite.m124024a(calv.class, calv);
    }

    private calv() {
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
            return GeneratedMessageLite.m124022a(f175180j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new calv();
        } else {
            if (i2 == 4) {
                return new bxvd(f175180j);
            }
            if (i2 == 5) {
                return f175180j;
            }
            bxxk bxxk = f175181k;
            if (bxxk == null) {
                synchronized (calv.class) {
                    bxxk = f175181k;
                    if (bxxk == null) {
                        bxxk = new bxve(f175180j);
                        f175181k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
