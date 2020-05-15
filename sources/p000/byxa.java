package p000;

/* renamed from: byxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxa extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byxa f168694c;

    /* renamed from: d */
    private static volatile bxxk f168695d;

    /* renamed from: a */
    public int f168696a;

    /* renamed from: b */
    public String f168697b = "";

    static {
        byxa byxa = new byxa();
        f168694c = byxa;
        GeneratedMessageLite.m124024a(byxa.class, byxa);
    }

    private byxa() {
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
            return GeneratedMessageLite.m124022a(f168694c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byxa();
        } else {
            if (i2 == 4) {
                return new bxvd(f168694c);
            }
            if (i2 == 5) {
                return f168694c;
            }
            bxxk bxxk = f168695d;
            if (bxxk == null) {
                synchronized (byxa.class) {
                    bxxk = f168695d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168694c);
                        f168695d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
