package p000;

/* renamed from: byvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byvy f168535e;

    /* renamed from: f */
    private static volatile bxxk f168536f;

    /* renamed from: a */
    public int f168537a;

    /* renamed from: b */
    public int f168538b;

    /* renamed from: c */
    public int f168539c;

    /* renamed from: d */
    public String f168540d = "";

    static {
        byvy byvy = new byvy();
        f168535e = byvy;
        GeneratedMessageLite.m124024a(byvy.class, byvy);
    }

    private byvy() {
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
            return GeneratedMessageLite.m124022a(f168535e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", bzau.m125595b(), "d"});
        } else if (i2 == 3) {
            return new byvy();
        } else {
            if (i2 == 4) {
                return new bxvd(f168535e);
            }
            if (i2 == 5) {
                return f168535e;
            }
            bxxk bxxk = f168536f;
            if (bxxk == null) {
                synchronized (byvy.class) {
                    bxxk = f168536f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168535e);
                        f168536f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
