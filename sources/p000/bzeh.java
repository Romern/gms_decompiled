package p000;

/* renamed from: bzeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzeh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzeh f169647b;

    /* renamed from: c */
    private static volatile bxxk f169648c;

    /* renamed from: a */
    public int f169649a;

    static {
        bzeh bzeh = new bzeh();
        f169647b = bzeh;
        GeneratedMessageLite.m124024a(bzeh.class, bzeh);
    }

    private bzeh() {
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
            return GeneratedMessageLite.m124022a(f169647b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzeh();
        } else {
            if (i2 == 4) {
                return new bxvd(f169647b);
            }
            if (i2 == 5) {
                return f169647b;
            }
            bxxk bxxk = f169648c;
            if (bxxk == null) {
                synchronized (bzeh.class) {
                    bxxk = f169648c;
                    if (bxxk == null) {
                        bxxk = new bxve(f169647b);
                        f169648c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
