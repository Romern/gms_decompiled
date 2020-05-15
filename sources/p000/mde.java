package p000;

/* renamed from: mde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mde extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final mde f33472f;

    /* renamed from: g */
    private static volatile bxxk f33473g;

    /* renamed from: a */
    public int f33474a;

    /* renamed from: b */
    public int f33475b;

    /* renamed from: c */
    public ByteString f33476c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f33477d = ByteString.f164797b;

    /* renamed from: e */
    public mdb f33478e;

    static {
        mde mde = new mde();
        f33472f = mde;
        GeneratedMessageLite.m124024a(mde.class, mde);
    }

    private mde() {
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
            return GeneratedMessageLite.m124022a(f33472f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဉ\u0003", new Object[]{"a", "b", mdc.f33471a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new mde();
        } else {
            if (i2 == 4) {
                return new bxvd(f33472f);
            }
            if (i2 == 5) {
                return f33472f;
            }
            bxxk bxxk = f33473g;
            if (bxxk == null) {
                synchronized (mde.class) {
                    bxxk = f33473g;
                    if (bxxk == null) {
                        bxxk = new bxve(f33472f);
                        f33473g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
