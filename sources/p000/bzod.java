package p000;

/* renamed from: bzod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzod extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzod f170795c;

    /* renamed from: d */
    private static volatile bxxk f170796d;

    /* renamed from: a */
    public String f170797a = "";

    /* renamed from: b */
    public int f170798b;

    static {
        bzod bzod = new bzod();
        f170795c = bzod;
        GeneratedMessageLite.m124024a(bzod.class, bzod);
    }

    private bzod() {
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
            return GeneratedMessageLite.m124022a(f170795c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzod();
        } else {
            if (i2 == 4) {
                return new bxvd(f170795c);
            }
            if (i2 == 5) {
                return f170795c;
            }
            bxxk bxxk = f170796d;
            if (bxxk == null) {
                synchronized (bzod.class) {
                    bxxk = f170796d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170795c);
                        f170796d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
