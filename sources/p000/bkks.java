package p000;

/* renamed from: bkks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkks extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bkks f124617b;

    /* renamed from: d */
    private static volatile bxxk f124618d;

    /* renamed from: a */
    public String f124619a = "";

    /* renamed from: c */
    private int f124620c;

    static {
        bkks bkks = new bkks();
        f124617b = bkks;
        GeneratedMessageLite.m124024a(bkks.class, bkks);
    }

    private bkks() {
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
            return GeneratedMessageLite.m124022a(f124617b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bkks();
        } else {
            if (i2 == 4) {
                return new bxvd(f124617b);
            }
            if (i2 == 5) {
                return f124617b;
            }
            bxxk bxxk = f124618d;
            if (bxxk == null) {
                synchronized (bkks.class) {
                    bxxk = f124618d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124617b);
                        f124618d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
