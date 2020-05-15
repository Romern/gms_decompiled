package p000;

/* renamed from: bssn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bssn f146882h;

    /* renamed from: i */
    private static volatile bxxk f146883i;

    /* renamed from: a */
    public int f146884a;

    /* renamed from: b */
    public ByteString f146885b = ByteString.f164797b;

    /* renamed from: c */
    public int f146886c;

    /* renamed from: d */
    public bsst f146887d;

    /* renamed from: e */
    public bssu f146888e;

    /* renamed from: f */
    public ByteString f146889f = ByteString.f164797b;

    /* renamed from: g */
    public ByteString f146890g = ByteString.f164797b;

    static {
        bssn bssn = new bssn();
        f146882h = bssn;
        GeneratedMessageLite.m124024a(bssn.class, bssn);
    }

    private bssn() {
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
            return GeneratedMessageLite.m124022a(f146882h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ည\u0005\u0006ည\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bssn();
        } else {
            if (i2 == 4) {
                return new bxvd(f146882h);
            }
            if (i2 == 5) {
                return f146882h;
            }
            bxxk bxxk = f146883i;
            if (bxxk == null) {
                synchronized (bssn.class) {
                    bxxk = f146883i;
                    if (bxxk == null) {
                        bxxk = new bxve(f146882h);
                        f146883i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
