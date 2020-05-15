package p000;

/* renamed from: aptt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aptt f84871d;

    /* renamed from: f */
    private static volatile bxxk f84872f;

    /* renamed from: a */
    public String f84873a = "";

    /* renamed from: b */
    public ByteString f84874b = ByteString.f164797b;

    /* renamed from: c */
    public String f84875c = "";

    /* renamed from: e */
    private int f84876e;

    static {
        aptt aptt = new aptt();
        f84871d = aptt;
        GeneratedMessageLite.m124024a(aptt.class, aptt);
    }

    private aptt() {
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
            return GeneratedMessageLite.m124022a(f84871d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0002\u0004ဈ\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new aptt();
        } else {
            if (i2 == 4) {
                return new bxvd(f84871d);
            }
            if (i2 == 5) {
                return f84871d;
            }
            bxxk bxxk = f84872f;
            if (bxxk == null) {
                synchronized (aptt.class) {
                    bxxk = f84872f;
                    if (bxxk == null) {
                        bxxk = new bxve(f84871d);
                        f84872f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
