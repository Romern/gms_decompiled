package p000;

/* renamed from: bzlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzlb f170498c;

    /* renamed from: d */
    private static volatile bxxk f170499d;

    /* renamed from: a */
    public int f170500a;

    /* renamed from: b */
    public String f170501b = "";

    static {
        bzlb bzlb = new bzlb();
        f170498c = bzlb;
        GeneratedMessageLite.m124024a(bzlb.class, bzlb);
    }

    private bzlb() {
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
            return GeneratedMessageLite.m124022a(f170498c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzlb();
        } else {
            if (i2 == 4) {
                return new bxvd(f170498c);
            }
            if (i2 == 5) {
                return f170498c;
            }
            bxxk bxxk = f170499d;
            if (bxxk == null) {
                synchronized (bzlb.class) {
                    bxxk = f170499d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170498c);
                        f170499d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
