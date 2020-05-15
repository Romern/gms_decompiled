package p000;

/* renamed from: btxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btxr f152840f;

    /* renamed from: g */
    private static volatile bxxk f152841g;

    /* renamed from: a */
    public int f152842a;

    /* renamed from: b */
    public int f152843b;

    /* renamed from: c */
    public btyc f152844c;

    /* renamed from: d */
    public int f152845d;

    /* renamed from: e */
    public long f152846e;

    static {
        btxr btxr = new btxr();
        f152840f = btxr;
        GeneratedMessageLite.m124024a(btxr.class, btxr);
    }

    private btxr() {
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
            return GeneratedMessageLite.m124022a(f152840f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", btxp.f152838a, "c", "d", btxq.f152839a, "e"});
        } else if (i2 == 3) {
            return new btxr();
        } else {
            if (i2 == 4) {
                return new bxvd(f152840f);
            }
            if (i2 == 5) {
                return f152840f;
            }
            bxxk bxxk = f152841g;
            if (bxxk == null) {
                synchronized (btxr.class) {
                    bxxk = f152841g;
                    if (bxxk == null) {
                        bxxk = new bxve(f152840f);
                        f152841g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
