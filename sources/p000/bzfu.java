package p000;

/* renamed from: bzfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzfu f169871c;

    /* renamed from: d */
    private static volatile bxxk f169872d;

    /* renamed from: a */
    public int f169873a;

    /* renamed from: b */
    public int f169874b;

    static {
        bzfu bzfu = new bzfu();
        f169871c = bzfu;
        GeneratedMessageLite.m124024a(bzfu.class, bzfu);
    }

    private bzfu() {
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
            return GeneratedMessageLite.m124022a(f169871c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzfu();
        } else {
            if (i2 == 4) {
                return new bxvd(f169871c);
            }
            if (i2 == 5) {
                return f169871c;
            }
            bxxk bxxk = f169872d;
            if (bxxk == null) {
                synchronized (bzfu.class) {
                    bxxk = f169872d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169871c);
                        f169872d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
