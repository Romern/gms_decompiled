package p000;

/* renamed from: bztb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bztb f171309b;

    /* renamed from: d */
    private static volatile bxxk f171310d;

    /* renamed from: a */
    public int f171311a = 0;

    /* renamed from: c */
    private Object f171312c;

    static {
        bztb bztb = new bztb();
        f171309b = bztb;
        GeneratedMessageLite.m124024a(bztb.class, bztb);
    }

    private bztb() {
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
            return GeneratedMessageLite.m124022a(f171309b, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "a", bxuo.class, bxuo.class, bzta.class, bxuo.class, bzsz.class});
        } else if (i2 == 3) {
            return new bztb();
        } else {
            if (i2 == 4) {
                return new bxvd(f171309b);
            }
            if (i2 == 5) {
                return f171309b;
            }
            bxxk bxxk = f171310d;
            if (bxxk == null) {
                synchronized (bztb.class) {
                    bxxk = f171310d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171309b);
                        f171310d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
