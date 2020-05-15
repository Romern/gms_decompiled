package p000;

/* renamed from: botx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final botx f134887e;

    /* renamed from: f */
    private static volatile bxxk f134888f;

    /* renamed from: a */
    public int f134889a;

    /* renamed from: b */
    public String f134890b = "";

    /* renamed from: c */
    public long f134891c;

    /* renamed from: d */
    public long f134892d;

    static {
        botx botx = new botx();
        f134887e = botx;
        GeneratedMessageLite.m124024a(botx.class, botx);
    }

    private botx() {
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
            return GeneratedMessageLite.m124022a(f134887e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0001\u0002ဈ\u0000\u0003ဂ\u0002", new Object[]{"a", "c", "b", "d"});
        } else if (i2 == 3) {
            return new botx();
        } else {
            if (i2 == 4) {
                return new bxvd(f134887e);
            }
            if (i2 == 5) {
                return f134887e;
            }
            bxxk bxxk = f134888f;
            if (bxxk == null) {
                synchronized (botx.class) {
                    bxxk = f134888f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134887e);
                        f134888f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
