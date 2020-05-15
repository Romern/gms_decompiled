package p000;

/* renamed from: mpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final mpw f34222b;

    /* renamed from: c */
    private static volatile bxxk f34223c;

    /* renamed from: a */
    public int f34224a;

    static {
        mpw mpw = new mpw();
        f34222b = mpw;
        GeneratedMessageLite.m124024a(mpw.class, mpw);
    }

    private mpw() {
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
            return GeneratedMessageLite.m124022a(f34222b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new mpw();
        } else {
            if (i2 == 4) {
                return new bxvd(f34222b);
            }
            if (i2 == 5) {
                return f34222b;
            }
            bxxk bxxk = f34223c;
            if (bxxk == null) {
                synchronized (mpw.class) {
                    bxxk = f34223c;
                    if (bxxk == null) {
                        bxxk = new bxve(f34222b);
                        f34223c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
