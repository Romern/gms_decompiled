package p000;

/* renamed from: bmcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmcl f128709d;

    /* renamed from: e */
    private static volatile bxxk f128710e;

    /* renamed from: a */
    public int f128711a;

    /* renamed from: b */
    public ByteString f128712b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f128713c = ByteString.f164797b;

    static {
        bmcl bmcl = new bmcl();
        f128709d = bmcl;
        GeneratedMessageLite.m124024a(bmcl.class, bmcl);
    }

    private bmcl() {
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
            return GeneratedMessageLite.m124022a(f128709d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmcl();
        } else {
            if (i2 == 4) {
                return new bxvd(f128709d);
            }
            if (i2 == 5) {
                return f128709d;
            }
            bxxk bxxk = f128710e;
            if (bxxk == null) {
                synchronized (bmcl.class) {
                    bxxk = f128710e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128709d);
                        f128710e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
