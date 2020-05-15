package p000;

/* renamed from: lax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lax extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final lax f25633d;

    /* renamed from: e */
    private static volatile bxxk f25634e;

    /* renamed from: a */
    public int f25635a;

    /* renamed from: b */
    public int f25636b;

    /* renamed from: c */
    public int f25637c;

    static {
        lax lax = new lax();
        f25633d = lax;
        GeneratedMessageLite.m124024a(lax.class, lax);
    }

    private lax() {
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
            return GeneratedMessageLite.m124022a(f25633d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new lax();
        } else {
            if (i2 == 4) {
                return new bxvd(f25633d);
            }
            if (i2 == 5) {
                return f25633d;
            }
            bxxk bxxk = f25634e;
            if (bxxk == null) {
                synchronized (lax.class) {
                    bxxk = f25634e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25633d);
                        f25634e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
