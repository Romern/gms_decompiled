package p000;

/* renamed from: mpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mpf f34120d;

    /* renamed from: e */
    private static volatile bxxk f34121e;

    /* renamed from: a */
    public int f34122a;

    /* renamed from: b */
    public String f34123b = "";

    /* renamed from: c */
    public long f34124c;

    static {
        mpf mpf = new mpf();
        f34120d = mpf;
        GeneratedMessageLite.m124024a(mpf.class, mpf);
    }

    private mpf() {
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
            return GeneratedMessageLite.m124022a(f34120d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f34120d);
            }
            if (i2 == 5) {
                return f34120d;
            }
            bxxk bxxk = f34121e;
            if (bxxk == null) {
                synchronized (mpf.class) {
                    bxxk = f34121e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34120d);
                        f34121e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
