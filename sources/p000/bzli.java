package p000;

/* renamed from: bzli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzli extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzli f170533a;

    /* renamed from: f */
    private static volatile bxxk f170534f;

    /* renamed from: b */
    private int f170535b;

    /* renamed from: c */
    private String f170536c = "";

    /* renamed from: d */
    private String f170537d = "";

    /* renamed from: e */
    private byte f170538e = 2;

    static {
        bzli bzli = new bzli();
        f170533a = bzli;
        GeneratedMessageLite.m124024a(bzli.class, bzli);
    }

    private bzli() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170538e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170538e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170533a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bzli();
        } else {
            if (i2 == 4) {
                return new bxvd(f170533a);
            }
            if (i2 == 5) {
                return f170533a;
            }
            bxxk bxxk = f170534f;
            if (bxxk == null) {
                synchronized (bzli.class) {
                    bxxk = f170534f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170533a);
                        f170534f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
