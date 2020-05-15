package p000;

/* renamed from: bzls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzls extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzls f170570c;

    /* renamed from: d */
    private static volatile bxxk f170571d;

    /* renamed from: a */
    public int f170572a;

    /* renamed from: b */
    public long f170573b;

    static {
        bzls bzls = new bzls();
        f170570c = bzls;
        GeneratedMessageLite.m124024a(bzls.class, bzls);
    }

    private bzls() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f170570c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဂ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzls();
        } else {
            if (i2 == 4) {
                return new bxvd(f170570c);
            }
            if (i2 == 5) {
                return f170570c;
            }
            bxxk bxxk = f170571d;
            if (bxxk == null) {
                synchronized (bzls.class) {
                    bxxk = f170571d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170570c);
                        f170571d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
