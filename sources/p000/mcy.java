package p000;

/* renamed from: mcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mcy f33461d;

    /* renamed from: e */
    private static volatile bxxk f33462e;

    /* renamed from: a */
    public int f33463a;

    /* renamed from: b */
    public String f33464b = "";

    /* renamed from: c */
    public ByteString f33465c = ByteString.f164797b;

    static {
        mcy mcy = new mcy();
        f33461d = mcy;
        GeneratedMessageLite.m124024a(mcy.class, mcy);
    }

    private mcy() {
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
            return GeneratedMessageLite.m124022a(f33461d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mcy();
        } else {
            if (i2 == 4) {
                return new bxvd(f33461d);
            }
            if (i2 == 5) {
                return f33461d;
            }
            bxxk bxxk = f33462e;
            if (bxxk == null) {
                synchronized (mcy.class) {
                    bxxk = f33462e;
                    if (bxxk == null) {
                        bxxk = new bxve(f33461d);
                        f33462e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
