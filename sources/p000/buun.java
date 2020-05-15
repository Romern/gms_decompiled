package p000;

/* renamed from: buun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buun extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buun f154961d;

    /* renamed from: e */
    private static volatile bxxk f154962e;

    /* renamed from: a */
    public int f154963a;

    /* renamed from: b */
    public int f154964b;

    /* renamed from: c */
    public long f154965c;

    static {
        buun buun = new buun();
        f154961d = buun;
        GeneratedMessageLite.m124024a(buun.class, buun);
    }

    private buun() {
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
            return GeneratedMessageLite.m124022a(f154961d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", buum.m120465b(), "c"});
        } else if (i2 == 3) {
            return new buun();
        } else {
            if (i2 == 4) {
                return new bxvd(f154961d);
            }
            if (i2 == 5) {
                return f154961d;
            }
            bxxk bxxk = f154962e;
            if (bxxk == null) {
                synchronized (buun.class) {
                    bxxk = f154962e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154961d);
                        f154962e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
