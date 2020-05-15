package p000;

/* renamed from: bzxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxb extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzxb f171716f;

    /* renamed from: g */
    private static volatile bxxk f171717g;

    /* renamed from: a */
    public int f171718a;

    /* renamed from: b */
    public long f171719b;

    /* renamed from: c */
    public long f171720c;

    /* renamed from: d */
    public ByteString f171721d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f171722e = ByteString.f164797b;

    static {
        bzxb bzxb = new bzxb();
        f171716f = bzxb;
        GeneratedMessageLite.m124024a(bzxb.class, bzxb);
    }

    private bzxb() {
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
            return GeneratedMessageLite.m124022a(f171716f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0002\u0004ည\u0003\u0005ည\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzxb();
        } else {
            if (i2 == 4) {
                return new bxvd(f171716f);
            }
            if (i2 == 5) {
                return f171716f;
            }
            bxxk bxxk = f171717g;
            if (bxxk == null) {
                synchronized (bzxb.class) {
                    bxxk = f171717g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171716f);
                        f171717g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
