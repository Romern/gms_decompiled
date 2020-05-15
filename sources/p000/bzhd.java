package p000;

/* renamed from: bzhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzhd f170026c;

    /* renamed from: e */
    private static volatile bxxk f170027e;

    /* renamed from: a */
    public String f170028a = "";

    /* renamed from: b */
    public String f170029b = "";

    /* renamed from: d */
    private int f170030d;

    static {
        bzhd bzhd = new bzhd();
        f170026c = bzhd;
        GeneratedMessageLite.m124024a(bzhd.class, bzhd);
    }

    private bzhd() {
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
            return GeneratedMessageLite.m124022a(f170026c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzhd();
        } else {
            if (i2 == 4) {
                return new bxvd(f170026c);
            }
            if (i2 == 5) {
                return f170026c;
            }
            bxxk bxxk = f170027e;
            if (bxxk == null) {
                synchronized (bzhd.class) {
                    bxxk = f170027e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170026c);
                        f170027e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
