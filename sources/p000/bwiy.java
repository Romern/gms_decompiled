package p000;

/* renamed from: bwiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwiy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwiy f159700d;

    /* renamed from: e */
    private static volatile bxxk f159701e;

    /* renamed from: a */
    public int f159702a;

    /* renamed from: b */
    public bmaj f159703b;

    /* renamed from: c */
    public ByteString f159704c = ByteString.f164797b;

    static {
        bwiy bwiy = new bwiy();
        f159700d = bwiy;
        GeneratedMessageLite.m124024a(bwiy.class, bwiy);
    }

    private bwiy() {
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
            return GeneratedMessageLite.m124022a(f159700d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwiy();
        } else {
            if (i2 == 4) {
                return new bxvd(f159700d);
            }
            if (i2 == 5) {
                return f159700d;
            }
            bxxk bxxk = f159701e;
            if (bxxk == null) {
                synchronized (bwiy.class) {
                    bxxk = f159701e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159700d);
                        f159701e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
