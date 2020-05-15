package p000;

/* renamed from: bzpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzpc f170896b;

    /* renamed from: d */
    private static volatile bxxk f170897d;

    /* renamed from: a */
    public String f170898a = "";

    /* renamed from: c */
    private int f170899c;

    static {
        bzpc bzpc = new bzpc();
        f170896b = bzpc;
        GeneratedMessageLite.m124024a(bzpc.class, bzpc);
    }

    private bzpc() {
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
            return GeneratedMessageLite.m124022a(f170896b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzpc();
        } else {
            if (i2 == 4) {
                return new bxvd(f170896b);
            }
            if (i2 == 5) {
                return f170896b;
            }
            bxxk bxxk = f170897d;
            if (bxxk == null) {
                synchronized (bzpc.class) {
                    bxxk = f170897d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170896b);
                        f170897d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
