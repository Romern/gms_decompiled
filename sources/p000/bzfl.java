package p000;

/* renamed from: bzfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzfl f169826c;

    /* renamed from: e */
    private static volatile bxxk f169827e;

    /* renamed from: a */
    public int f169828a;

    /* renamed from: b */
    public String f169829b = "";

    /* renamed from: d */
    private int f169830d;

    static {
        bzfl bzfl = new bzfl();
        f169826c = bzfl;
        GeneratedMessageLite.m124024a(bzfl.class, bzfl);
    }

    private bzfl() {
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
            return GeneratedMessageLite.m124022a(f169826c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzfl();
        } else {
            if (i2 == 4) {
                return new bxvd(f169826c);
            }
            if (i2 == 5) {
                return f169826c;
            }
            bxxk bxxk = f169827e;
            if (bxxk == null) {
                synchronized (bzfl.class) {
                    bxxk = f169827e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169826c);
                        f169827e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
