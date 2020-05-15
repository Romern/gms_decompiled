package p000;

/* renamed from: bmeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmeg extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmeg f128929f;

    /* renamed from: g */
    private static volatile bxxk f128930g;

    /* renamed from: a */
    public int f128931a;

    /* renamed from: b */
    public String f128932b = "";

    /* renamed from: c */
    public ByteString f128933c = ByteString.f164797b;

    /* renamed from: d */
    public bxwc f128934d = bxxn.f165040b;

    /* renamed from: e */
    public String f128935e = "";

    static {
        bmeg bmeg = new bmeg();
        f128929f = bmeg;
        GeneratedMessageLite.m124024a(bmeg.class, bmeg);
    }

    private bmeg() {
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
            return GeneratedMessageLite.m124022a(f128929f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", bmdy.class, "e"});
        } else if (i2 == 3) {
            return new bmeg();
        } else {
            if (i2 == 4) {
                return new bmef();
            }
            if (i2 == 5) {
                return f128929f;
            }
            bxxk bxxk = f128930g;
            if (bxxk == null) {
                synchronized (bmeg.class) {
                    bxxk = f128930g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128929f);
                        f128930g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
