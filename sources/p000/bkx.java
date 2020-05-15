package p000;

/* renamed from: bkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bkx f5046d;

    /* renamed from: e */
    private static volatile bxxk f5047e;

    /* renamed from: a */
    public int f5048a;

    /* renamed from: b */
    public long f5049b;

    /* renamed from: c */
    public int f5050c;

    static {
        bkx bkx = new bkx();
        f5046d = bkx;
        GeneratedMessageLite.m124024a(bkx.class, bkx);
    }

    private bkx() {
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
            return GeneratedMessageLite.m124022a(f5046d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f5046d);
            }
            if (i2 == 5) {
                return f5046d;
            }
            bxxk bxxk = f5047e;
            if (bxxk == null) {
                synchronized (bkx.class) {
                    bxxk = f5047e;
                    if (bxxk == null) {
                        bxxk = new bxve(f5046d);
                        f5047e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
