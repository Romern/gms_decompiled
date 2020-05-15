package p000;

/* renamed from: bzft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzft extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzft f169867c;

    /* renamed from: d */
    private static volatile bxxk f169868d;

    /* renamed from: a */
    public int f169869a;

    /* renamed from: b */
    public bzfm f169870b;

    static {
        bzft bzft = new bzft();
        f169867c = bzft;
        GeneratedMessageLite.m124024a(bzft.class, bzft);
    }

    private bzft() {
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
            return GeneratedMessageLite.m124022a(f169867c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzft();
        } else {
            if (i2 == 4) {
                return new bxvd(f169867c);
            }
            if (i2 == 5) {
                return f169867c;
            }
            bxxk bxxk = f169868d;
            if (bxxk == null) {
                synchronized (bzft.class) {
                    bxxk = f169868d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169867c);
                        f169868d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
