package p000;

/* renamed from: bzwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzwy f171700c;

    /* renamed from: d */
    private static volatile bxxk f171701d;

    /* renamed from: a */
    public int f171702a;

    /* renamed from: b */
    public bsaa f171703b;

    static {
        bzwy bzwy = new bzwy();
        f171700c = bzwy;
        GeneratedMessageLite.m124024a(bzwy.class, bzwy);
    }

    private bzwy() {
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
            return GeneratedMessageLite.m124022a(f171700c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzwy();
        } else {
            if (i2 == 4) {
                return new bxvd(f171700c);
            }
            if (i2 == 5) {
                return f171700c;
            }
            bxxk bxxk = f171701d;
            if (bxxk == null) {
                synchronized (bzwy.class) {
                    bxxk = f171701d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171700c);
                        f171701d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
