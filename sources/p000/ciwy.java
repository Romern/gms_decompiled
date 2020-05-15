package p000;

/* renamed from: ciwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwy extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ciwy f191626f;

    /* renamed from: g */
    private static volatile bxxk f191627g;

    /* renamed from: a */
    public int f191628a;

    /* renamed from: b */
    public int f191629b;

    /* renamed from: c */
    public ByteString f191630c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f191631d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f191632e = ByteString.f164797b;

    static {
        ciwy ciwy = new ciwy();
        f191626f = ciwy;
        GeneratedMessageLite.m124024a(ciwy.class, ciwy);
    }

    private ciwy() {
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
            return GeneratedMessageLite.m124022a(f191626f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ciwy();
        } else {
            if (i2 == 4) {
                return new bxvd(f191626f);
            }
            if (i2 == 5) {
                return f191626f;
            }
            bxxk bxxk = f191627g;
            if (bxxk == null) {
                synchronized (ciwy.class) {
                    bxxk = f191627g;
                    if (bxxk == null) {
                        bxxk = new bxve(f191626f);
                        f191627g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
