package p000;

/* renamed from: bsnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsnr f146322d;

    /* renamed from: e */
    private static volatile bxxk f146323e;

    /* renamed from: a */
    public ByteString f146324a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f146325b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f146326c = ByteString.f164797b;

    static {
        bsnr bsnr = new bsnr();
        f146322d = bsnr;
        GeneratedMessageLite.m124024a(bsnr.class, bsnr);
    }

    private bsnr() {
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
            return GeneratedMessageLite.m124022a(f146322d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsnr();
        } else {
            if (i2 == 4) {
                return new bxvd(f146322d);
            }
            if (i2 == 5) {
                return f146322d;
            }
            bxxk bxxk = f146323e;
            if (bxxk == null) {
                synchronized (bsnr.class) {
                    bxxk = f146323e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146322d);
                        f146323e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
