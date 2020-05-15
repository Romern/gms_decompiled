package p000;

/* renamed from: byfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byfw f166076c;

    /* renamed from: d */
    private static volatile bxxk f166077d;

    /* renamed from: a */
    public int f166078a;

    /* renamed from: b */
    public String f166079b = "";

    static {
        byfw byfw = new byfw();
        f166076c = byfw;
        GeneratedMessageLite.m124024a(byfw.class, byfw);
    }

    private byfw() {
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
            return GeneratedMessageLite.m124022a(f166076c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byfw();
        } else {
            if (i2 == 4) {
                return new bxvd(f166076c);
            }
            if (i2 == 5) {
                return f166076c;
            }
            bxxk bxxk = f166077d;
            if (bxxk == null) {
                synchronized (byfw.class) {
                    bxxk = f166077d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166076c);
                        f166077d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
