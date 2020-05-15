package p000;

/* renamed from: bqrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqrr f141470e;

    /* renamed from: f */
    private static volatile bxxk f141471f;

    /* renamed from: a */
    public int f141472a;

    /* renamed from: b */
    public bqrp f141473b;

    /* renamed from: c */
    public ByteString f141474c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f141475d = ByteString.f164797b;

    static {
        bqrr bqrr = new bqrr();
        f141470e = bqrr;
        GeneratedMessageLite.m124024a(bqrr.class, bqrr);
    }

    private bqrr() {
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
            return GeneratedMessageLite.m124022a(f141470e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqrr();
        } else {
            if (i2 == 4) {
                return new bxvd(f141470e);
            }
            if (i2 == 5) {
                return f141470e;
            }
            bxxk bxxk = f141471f;
            if (bxxk == null) {
                synchronized (bqrr.class) {
                    bxxk = f141471f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141470e);
                        f141471f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
