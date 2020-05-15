package p000;

/* renamed from: bmsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmsr f130740b;

    /* renamed from: c */
    private static volatile bxxk f130741c;

    /* renamed from: a */
    public ByteString f130742a = ByteString.f164797b;

    static {
        bmsr bmsr = new bmsr();
        f130740b = bmsr;
        GeneratedMessageLite.m124024a(bmsr.class, bmsr);
    }

    private bmsr() {
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
            return GeneratedMessageLite.m124022a(f130740b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bmsr();
        } else {
            if (i2 == 4) {
                return new bxvd(f130740b);
            }
            if (i2 == 5) {
                return f130740b;
            }
            bxxk bxxk = f130741c;
            if (bxxk == null) {
                synchronized (bmsr.class) {
                    bxxk = f130741c;
                    if (bxxk == null) {
                        bxxk = new bxve(f130740b);
                        f130741c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
