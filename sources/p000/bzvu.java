package p000;

/* renamed from: bzvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvu extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzvu f171552g;

    /* renamed from: i */
    private static volatile bxxk f171553i;

    /* renamed from: a */
    public String f171554a = "";

    /* renamed from: b */
    public String f171555b = "";

    /* renamed from: c */
    public int f171556c;

    /* renamed from: d */
    public bxwc f171557d = bxxn.f165040b;

    /* renamed from: e */
    public ByteString f171558e = ByteString.f164797b;

    /* renamed from: f */
    public ByteString f171559f = ByteString.f164797b;

    /* renamed from: h */
    private int f171560h;

    static {
        bzvu bzvu = new bzvu();
        f171552g = bzvu;
        GeneratedMessageLite.m124024a(bzvu.class, bzvu);
    }

    private bzvu() {
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
            return GeneratedMessageLite.m124022a(f171552g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0006ည\u0004\u0007ည\u0005", new Object[]{"h", "a", "b", "c", "d", bzvt.class, "e", "f"});
        } else if (i2 == 3) {
            return new bzvu();
        } else {
            if (i2 == 4) {
                return new bxvd(f171552g);
            }
            if (i2 == 5) {
                return f171552g;
            }
            bxxk bxxk = f171553i;
            if (bxxk == null) {
                synchronized (bzvu.class) {
                    bxxk = f171553i;
                    if (bxxk == null) {
                        bxxk = new bxve(f171552g);
                        f171553i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
