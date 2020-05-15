package p000;

/* renamed from: ciwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwd extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final ciwd f191560h;

    /* renamed from: i */
    private static volatile bxxk f191561i;

    /* renamed from: a */
    public int f191562a;

    /* renamed from: b */
    public int f191563b;

    /* renamed from: c */
    public int f191564c;

    /* renamed from: d */
    public int f191565d;

    /* renamed from: e */
    public ByteString f191566e = ByteString.f164797b;

    /* renamed from: f */
    public ByteString f191567f = ByteString.f164797b;

    /* renamed from: g */
    public ByteString f191568g = ByteString.f164797b;

    static {
        ciwd ciwd = new ciwd();
        f191560h = ciwd;
        GeneratedMessageLite.m124024a(ciwd.class, ciwd);
    }

    private ciwd() {
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
            return GeneratedMessageLite.m124022a(f191560h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0001\u0002ည\u0003\u0003ည\u0004\u0004ည\u0005\u0005ဋ\u0000\u0006ဋ\u0002", new Object[]{"a", "c", "e", "f", "g", "b", "d"});
        } else if (i2 == 3) {
            return new ciwd();
        } else {
            if (i2 == 4) {
                return new bxvd(f191560h);
            }
            if (i2 == 5) {
                return f191560h;
            }
            bxxk bxxk = f191561i;
            if (bxxk == null) {
                synchronized (ciwd.class) {
                    bxxk = f191561i;
                    if (bxxk == null) {
                        bxxk = new bxve(f191560h);
                        f191561i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
