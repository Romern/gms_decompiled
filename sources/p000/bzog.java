package p000;

/* renamed from: bzog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzog extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzog f170806c;

    /* renamed from: d */
    private static volatile bxxk f170807d;

    /* renamed from: a */
    public bzoa f170808a;

    /* renamed from: b */
    public long f170809b;

    static {
        bzog bzog = new bzog();
        f170806c = bzog;
        GeneratedMessageLite.m124024a(bzog.class, bzog);
    }

    private bzog() {
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
            return GeneratedMessageLite.m124022a(f170806c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzog();
        } else {
            if (i2 == 4) {
                return new bxvd(f170806c);
            }
            if (i2 == 5) {
                return f170806c;
            }
            bxxk bxxk = f170807d;
            if (bxxk == null) {
                synchronized (bzog.class) {
                    bxxk = f170807d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170806c);
                        f170807d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
