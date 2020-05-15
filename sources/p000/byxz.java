package p000;

/* renamed from: byxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byxz f168853e;

    /* renamed from: g */
    private static volatile bxxk f168854g;

    /* renamed from: a */
    public int f168855a;

    /* renamed from: b */
    public int f168856b;

    /* renamed from: c */
    public int f168857c;

    /* renamed from: d */
    public int f168858d;

    /* renamed from: f */
    private long f168859f;

    static {
        byxz byxz = new byxz();
        f168853e = byxz;
        GeneratedMessageLite.m124024a(byxz.class, byxz);
    }

    private byxz() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125480a(byxz byxz) {
        byxz.f168855a |= 1;
        byxz.f168859f = 3000;
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
            return GeneratedMessageLite.m124022a(f168853e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "f", "b", bzak.f169217a, "c", bzak.f169217a, "d", bzak.f169217a});
        } else if (i2 == 3) {
            return new byxz();
        } else {
            if (i2 == 4) {
                return new bxvd(f168853e);
            }
            if (i2 == 5) {
                return f168853e;
            }
            bxxk bxxk = f168854g;
            if (bxxk == null) {
                synchronized (byxz.class) {
                    bxxk = f168854g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168853e);
                        f168854g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
