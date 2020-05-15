package p000;

/* renamed from: bzlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzlz f170594d;

    /* renamed from: e */
    private static volatile bxxk f170595e;

    /* renamed from: a */
    public int f170596a;

    /* renamed from: b */
    public bzly f170597b;

    /* renamed from: c */
    public String f170598c = "";

    static {
        bzlz bzlz = new bzlz();
        f170594d = bzlz;
        GeneratedMessageLite.m124024a(bzlz.class, bzlz);
    }

    private bzlz() {
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
            return GeneratedMessageLite.m124022a(f170594d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzlz();
        } else {
            if (i2 == 4) {
                return new bxvd(f170594d);
            }
            if (i2 == 5) {
                return f170594d;
            }
            bxxk bxxk = f170595e;
            if (bxxk == null) {
                synchronized (bzlz.class) {
                    bxxk = f170595e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170594d);
                        f170595e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
