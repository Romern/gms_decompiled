package p000;

/* renamed from: btyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btyu f152982d;

    /* renamed from: e */
    private static volatile bxxk f152983e;

    /* renamed from: a */
    public int f152984a;

    /* renamed from: b */
    public int f152985b;

    /* renamed from: c */
    public long f152986c;

    static {
        btyu btyu = new btyu();
        f152982d = btyu;
        GeneratedMessageLite.m124024a(btyu.class, btyu);
    }

    private btyu() {
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
            return GeneratedMessageLite.m124022a(f152982d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", btyt.f152981a, "c"});
        } else if (i2 == 3) {
            return new btyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f152982d);
            }
            if (i2 == 5) {
                return f152982d;
            }
            bxxk bxxk = f152983e;
            if (bxxk == null) {
                synchronized (btyu.class) {
                    bxxk = f152983e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152982d);
                        f152983e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
