package p000;

/* renamed from: bphh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bphh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bphh f137646f;

    /* renamed from: g */
    private static volatile bxxk f137647g;

    /* renamed from: a */
    public int f137648a;

    /* renamed from: b */
    public int f137649b;

    /* renamed from: c */
    public String f137650c = "";

    /* renamed from: d */
    public long f137651d = -1;

    /* renamed from: e */
    public ByteString f137652e = ByteString.f164797b;

    static {
        bphh bphh = new bphh();
        f137646f = bphh;
        GeneratedMessageLite.m124024a(bphh.class, bphh);
    }

    private bphh() {
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
            return GeneratedMessageLite.m124022a(f137646f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ည\u0003", new Object[]{"a", "b", bphf.f137645a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bphh();
        } else {
            if (i2 == 4) {
                return new bxvd(f137646f);
            }
            if (i2 == 5) {
                return f137646f;
            }
            bxxk bxxk = f137647g;
            if (bxxk == null) {
                synchronized (bphh.class) {
                    bxxk = f137647g;
                    if (bxxk == null) {
                        bxxk = new bxve(f137646f);
                        f137647g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
