package p000;

/* renamed from: bpjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpjp f137899c;

    /* renamed from: d */
    private static volatile bxxk f137900d;

    /* renamed from: a */
    public int f137901a;

    /* renamed from: b */
    public int f137902b;

    static {
        bpjp bpjp = new bpjp();
        f137899c = bpjp;
        GeneratedMessageLite.m124024a(bpjp.class, bpjp);
    }

    private bpjp() {
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
            return GeneratedMessageLite.m124022a(f137899c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpjp();
        } else {
            if (i2 == 4) {
                return new bxvd(f137899c);
            }
            if (i2 == 5) {
                return f137899c;
            }
            bxxk bxxk = f137900d;
            if (bxxk == null) {
                synchronized (bpjp.class) {
                    bxxk = f137900d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137899c);
                        f137900d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
