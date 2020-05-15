package p000;

/* renamed from: bzfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzfd f169785c;

    /* renamed from: d */
    public static final bxvj f169786d;

    /* renamed from: f */
    private static volatile bxxk f169787f;

    /* renamed from: a */
    public bxwc f169788a = bxxn.f165040b;

    /* renamed from: b */
    public bzft f169789b;

    /* renamed from: e */
    private int f169790e;

    static {
        bzfd bzfd = new bzfd();
        f169785c = bzfd;
        GeneratedMessageLite.m124024a(bzfd.class, bzfd);
        blcd blcd = blcd.f125907a;
        bzfd bzfd2 = f169785c;
        f169786d = GeneratedMessageLite.m124006a(blcd, bzfd2, bzfd2, 71464408, bxzf.MESSAGE);
    }

    private bzfd() {
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
            return GeneratedMessageLite.m124022a(f169785c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"e", "a", bzfr.class, "b"});
        } else if (i2 == 3) {
            return new bzfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f169785c);
            }
            if (i2 == 5) {
                return f169785c;
            }
            bxxk bxxk = f169787f;
            if (bxxk == null) {
                synchronized (bzfd.class) {
                    bxxk = f169787f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169785c);
                        f169787f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
