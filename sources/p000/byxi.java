package p000;

/* renamed from: byxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byxi f168740c;

    /* renamed from: d */
    private static volatile bxxk f168741d;

    /* renamed from: a */
    public int f168742a;

    /* renamed from: b */
    public byxj f168743b;

    static {
        byxi byxi = new byxi();
        f168740c = byxi;
        GeneratedMessageLite.m124024a(byxi.class, byxi);
    }

    private byxi() {
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
            return GeneratedMessageLite.m124022a(f168740c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byxi();
        } else {
            if (i2 == 4) {
                return new bxvd(f168740c);
            }
            if (i2 == 5) {
                return f168740c;
            }
            bxxk bxxk = f168741d;
            if (bxxk == null) {
                synchronized (byxi.class) {
                    bxxk = f168741d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168740c);
                        f168741d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
