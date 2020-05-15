package p000;

/* renamed from: bzlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzlt f170574b;

    /* renamed from: d */
    private static volatile bxxk f170575d;

    /* renamed from: a */
    public String f170576a = "";

    /* renamed from: c */
    private int f170577c;

    static {
        bzlt bzlt = new bzlt();
        f170574b = bzlt;
        GeneratedMessageLite.m124024a(bzlt.class, bzlt);
    }

    private bzlt() {
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
            return GeneratedMessageLite.m124022a(f170574b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzlt();
        } else {
            if (i2 == 4) {
                return new bxvd(f170574b);
            }
            if (i2 == 5) {
                return f170574b;
            }
            bxxk bxxk = f170575d;
            if (bxxk == null) {
                synchronized (bzlt.class) {
                    bxxk = f170575d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170574b);
                        f170575d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
