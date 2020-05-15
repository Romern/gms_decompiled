package p000;

/* renamed from: mpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final mpj f34153b;

    /* renamed from: d */
    private static volatile bxxk f34154d;

    /* renamed from: a */
    public ByteString f34155a = ByteString.f164797b;

    /* renamed from: c */
    private int f34156c;

    static {
        mpj mpj = new mpj();
        f34153b = mpj;
        GeneratedMessageLite.m124024a(mpj.class, mpj);
    }

    private mpj() {
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
            return GeneratedMessageLite.m124022a(f34153b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new mpj();
        } else {
            if (i2 == 4) {
                return new bxvd(f34153b);
            }
            if (i2 == 5) {
                return f34153b;
            }
            bxxk bxxk = f34154d;
            if (bxxk == null) {
                synchronized (mpj.class) {
                    bxxk = f34154d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34153b);
                        f34154d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
