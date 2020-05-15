package p000;

/* renamed from: bzfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzfq f169849g;

    /* renamed from: h */
    private static volatile bxxk f169850h;

    /* renamed from: a */
    public int f169851a;

    /* renamed from: b */
    public int f169852b;

    /* renamed from: c */
    public String f169853c = "";

    /* renamed from: d */
    public ByteString f169854d = ByteString.f164797b;

    /* renamed from: e */
    public int f169855e;

    /* renamed from: f */
    public int f169856f;

    static {
        bzfq bzfq = new bzfq();
        f169849g = bzfq;
        GeneratedMessageLite.m124024a(bzfq.class, bzfq);
    }

    private bzfq() {
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
            return GeneratedMessageLite.m124022a(f169849g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", bzfp.f169848a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzfq();
        } else {
            if (i2 == 4) {
                return new bxvd(f169849g);
            }
            if (i2 == 5) {
                return f169849g;
            }
            bxxk bxxk = f169850h;
            if (bxxk == null) {
                synchronized (bzfq.class) {
                    bxxk = f169850h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169849g);
                        f169850h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
