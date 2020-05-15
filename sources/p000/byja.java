package p000;

/* renamed from: byja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byja extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byja f166624d;

    /* renamed from: e */
    private static volatile bxxk f166625e;

    /* renamed from: a */
    public int f166626a;

    /* renamed from: b */
    public ByteString f166627b = ByteString.f164797b;

    /* renamed from: c */
    public int f166628c;

    static {
        byja byja = new byja();
        f166624d = byja;
        GeneratedMessageLite.m124024a(byja.class, byja);
    }

    private byja() {
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
            return GeneratedMessageLite.m124022a(f166624d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", byiy.f166623a});
        } else if (i2 == 3) {
            return new byja();
        } else {
            if (i2 == 4) {
                return new bxvd(f166624d);
            }
            if (i2 == 5) {
                return f166624d;
            }
            bxxk bxxk = f166625e;
            if (bxxk == null) {
                synchronized (byja.class) {
                    bxxk = f166625e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166624d);
                        f166625e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
