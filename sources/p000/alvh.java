package p000;

/* renamed from: alvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alvh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final alvh f74376d;

    /* renamed from: e */
    private static volatile bxxk f74377e;

    /* renamed from: a */
    public int f74378a;

    /* renamed from: b */
    public amsb f74379b;

    /* renamed from: c */
    public long f74380c;

    static {
        alvh alvh = new alvh();
        f74376d = alvh;
        GeneratedMessageLite.m124024a(alvh.class, alvh);
    }

    private alvh() {
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
            return GeneratedMessageLite.m124022a(f74376d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new alvh();
        } else {
            if (i2 == 4) {
                return new bxvd(f74376d);
            }
            if (i2 == 5) {
                return f74376d;
            }
            bxxk bxxk = f74377e;
            if (bxxk == null) {
                synchronized (alvh.class) {
                    bxxk = f74377e;
                    if (bxxk == null) {
                        bxxk = new bxve(f74376d);
                        f74377e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
