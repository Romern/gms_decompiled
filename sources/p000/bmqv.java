package p000;

/* renamed from: bmqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmqv f130437d;

    /* renamed from: e */
    private static volatile bxxk f130438e;

    /* renamed from: a */
    public int f130439a;

    /* renamed from: b */
    public bmav f130440b;

    /* renamed from: c */
    public ByteString f130441c = ByteString.f164797b;

    static {
        bmqv bmqv = new bmqv();
        f130437d = bmqv;
        GeneratedMessageLite.m124024a(bmqv.class, bmqv);
    }

    private bmqv() {
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
            return GeneratedMessageLite.m124022a(f130437d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f130437d);
            }
            if (i2 == 5) {
                return f130437d;
            }
            bxxk bxxk = f130438e;
            if (bxxk == null) {
                synchronized (bmqv.class) {
                    bxxk = f130438e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130437d);
                        f130438e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
