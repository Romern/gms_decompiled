package p000;

/* renamed from: bmsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmsv f130756d;

    /* renamed from: e */
    private static volatile bxxk f130757e;

    /* renamed from: a */
    public ByteString f130758a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f130759b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f130760c = ByteString.f164797b;

    static {
        bmsv bmsv = new bmsv();
        f130756d = bmsv;
        GeneratedMessageLite.m124024a(bmsv.class, bmsv);
    }

    private bmsv() {
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
            return GeneratedMessageLite.m124022a(f130756d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmsv();
        } else {
            if (i2 == 4) {
                return new bxvd(f130756d);
            }
            if (i2 == 5) {
                return f130756d;
            }
            bxxk bxxk = f130757e;
            if (bxxk == null) {
                synchronized (bmsv.class) {
                    bxxk = f130757e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130756d);
                        f130757e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
