package p000;

/* renamed from: bkls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkls extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bkls f124839g;

    /* renamed from: h */
    private static volatile bxxk f124840h;

    /* renamed from: a */
    public int f124841a;

    /* renamed from: b */
    public bklr f124842b;

    /* renamed from: c */
    public ByteString f124843c = ByteString.f164797b;

    /* renamed from: d */
    public long f124844d;

    /* renamed from: e */
    public long f124845e;

    /* renamed from: f */
    public ByteString f124846f = ByteString.f164797b;

    static {
        bkls bkls = new bkls();
        f124839g = bkls;
        GeneratedMessageLite.m124024a(bkls.class, bkls);
    }

    private bkls() {
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
            return GeneratedMessageLite.m124022a(f124839g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ည\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bkls();
        } else {
            if (i2 == 4) {
                return new bxvd(f124839g);
            }
            if (i2 == 5) {
                return f124839g;
            }
            bxxk bxxk = f124840h;
            if (bxxk == null) {
                synchronized (bkls.class) {
                    bxxk = f124840h;
                    if (bxxk == null) {
                        bxxk = new bxve(f124839g);
                        f124840h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
