package p000;

/* renamed from: bipy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bipy f121238c;

    /* renamed from: d */
    private static volatile bxxk f121239d;

    /* renamed from: a */
    public int f121240a;

    /* renamed from: b */
    public ByteString f121241b = ByteString.f164797b;

    static {
        bipy bipy = new bipy();
        f121238c = bipy;
        GeneratedMessageLite.m124024a(bipy.class, bipy);
    }

    private bipy() {
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
            return GeneratedMessageLite.m124022a(f121238c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bipy();
        } else {
            if (i2 == 4) {
                return new bxvd(f121238c);
            }
            if (i2 == 5) {
                return f121238c;
            }
            bxxk bxxk = f121239d;
            if (bxxk == null) {
                synchronized (bipy.class) {
                    bxxk = f121239d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121238c);
                        f121239d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
