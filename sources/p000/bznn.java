package p000;

/* renamed from: bznn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bznn f170727b;

    /* renamed from: d */
    private static volatile bxxk f170728d;

    /* renamed from: a */
    public String f170729a = "";

    /* renamed from: c */
    private int f170730c;

    static {
        bznn bznn = new bznn();
        f170727b = bznn;
        GeneratedMessageLite.m124024a(bznn.class, bznn);
    }

    private bznn() {
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
            return GeneratedMessageLite.m124022a(f170727b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bznn();
        } else {
            if (i2 == 4) {
                return new bxvd(f170727b);
            }
            if (i2 == 5) {
                return f170727b;
            }
            bxxk bxxk = f170728d;
            if (bxxk == null) {
                synchronized (bznn.class) {
                    bxxk = f170728d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170727b);
                        f170728d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
