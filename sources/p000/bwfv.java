package p000;

/* renamed from: bwfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfv extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwfv f159143e;

    /* renamed from: f */
    private static volatile bxxk f159144f;

    /* renamed from: a */
    public int f159145a;

    /* renamed from: b */
    public ByteString f159146b = ByteString.f164797b;

    /* renamed from: c */
    public bxvt f159147c = bxvm.f164965b;

    /* renamed from: d */
    public bxvt f159148d = bxvm.f164965b;

    static {
        bwfv bwfv = new bwfv();
        f159143e = bwfv;
        GeneratedMessageLite.m124024a(bwfv.class, bwfv);
    }

    private bwfv() {
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
            return GeneratedMessageLite.m124022a(f159143e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ည\u0000\u0002'\u0003'", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwfv();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f159143e;
            }
            bxxk bxxk = f159144f;
            if (bxxk == null) {
                synchronized (bwfv.class) {
                    bxxk = f159144f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159143e);
                        f159144f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
