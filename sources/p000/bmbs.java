package p000;

/* renamed from: bmbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmbs extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bmbs f128609j;

    /* renamed from: k */
    private static volatile bxxk f128610k;

    /* renamed from: a */
    public int f128611a;

    /* renamed from: b */
    public String f128612b = "";

    /* renamed from: c */
    public long f128613c;

    /* renamed from: d */
    public ByteString f128614d = ByteString.f164797b;

    /* renamed from: e */
    public btwp f128615e;

    /* renamed from: f */
    public String f128616f = "";

    /* renamed from: g */
    public bxwc f128617g = bxxn.f165040b;

    /* renamed from: h */
    public boolean f128618h;

    /* renamed from: i */
    public ByteString f128619i = ByteString.f164797b;

    static {
        bmbs bmbs = new bmbs();
        f128609j = bmbs;
        GeneratedMessageLite.m124024a(bmbs.class, bmbs);
    }

    private bmbs() {
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
            return GeneratedMessageLite.m124022a(f128609j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဉ\u0003\u0002ဈ\u0004\u0003ဇ\u0005\u0005ဈ\u0000\u0006ည\u0006\u0007ည\u0002\bဂ\u0001\n\u001b", new Object[]{"a", "e", "f", "h", "b", "i", "d", "c", "g", bmqk.class});
        } else if (i2 == 3) {
            return new bmbs();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f128609j;
            }
            bxxk bxxk = f128610k;
            if (bxxk == null) {
                synchronized (bmbs.class) {
                    bxxk = f128610k;
                    if (bxxk == null) {
                        bxxk = new bxve(f128609j);
                        f128610k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
