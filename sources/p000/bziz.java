package p000;

/* renamed from: bziz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bziz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bziz f170260c;

    /* renamed from: d */
    private static volatile bxxk f170261d;

    /* renamed from: a */
    public int f170262a;

    /* renamed from: b */
    public bzjv f170263b;

    static {
        bziz bziz = new bziz();
        f170260c = bziz;
        GeneratedMessageLite.m124024a(bziz.class, bziz);
    }

    private bziz() {
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
            return GeneratedMessageLite.m124022a(f170260c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bziz();
        } else {
            if (i2 == 4) {
                return new bxvd(f170260c);
            }
            if (i2 == 5) {
                return f170260c;
            }
            bxxk bxxk = f170261d;
            if (bxxk == null) {
                synchronized (bziz.class) {
                    bxxk = f170261d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170260c);
                        f170261d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
