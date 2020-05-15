package p000;

/* renamed from: bmcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmcj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmcj f128692e;

    /* renamed from: f */
    private static volatile bxxk f128693f;

    /* renamed from: a */
    public int f128694a;

    /* renamed from: b */
    public bsnt f128695b;

    /* renamed from: c */
    public bmci f128696c;

    /* renamed from: d */
    public ByteString f128697d = ByteString.f164797b;

    static {
        bmcj bmcj = new bmcj();
        f128692e = bmcj;
        GeneratedMessageLite.m124024a(bmcj.class, bmcj);
    }

    private bmcj() {
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
            return GeneratedMessageLite.m124022a(f128692e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmcj();
        } else {
            if (i2 == 4) {
                return new bxvd(f128692e);
            }
            if (i2 == 5) {
                return f128692e;
            }
            bxxk bxxk = f128693f;
            if (bxxk == null) {
                synchronized (bmcj.class) {
                    bxxk = f128693f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128692e);
                        f128693f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
