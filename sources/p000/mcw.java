package p000;

/* renamed from: mcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mcw f33453d;

    /* renamed from: e */
    private static volatile bxxk f33454e;

    /* renamed from: a */
    public int f33455a;

    /* renamed from: b */
    public String f33456b = "";

    /* renamed from: c */
    public ByteString f33457c = ByteString.f164797b;

    static {
        mcw mcw = new mcw();
        f33453d = mcw;
        GeneratedMessageLite.m124024a(mcw.class, mcw);
    }

    private mcw() {
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
            return GeneratedMessageLite.m124022a(f33453d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f33453d);
            }
            if (i2 == 5) {
                return f33453d;
            }
            bxxk bxxk = f33454e;
            if (bxxk == null) {
                synchronized (mcw.class) {
                    bxxk = f33454e;
                    if (bxxk == null) {
                        bxxk = new bxve(f33453d);
                        f33454e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
