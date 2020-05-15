package p000;

/* renamed from: kaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kaw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kaw f23666c;

    /* renamed from: e */
    private static volatile bxxk f23667e;

    /* renamed from: a */
    public String f23668a = "";

    /* renamed from: b */
    public String f23669b = "";

    /* renamed from: d */
    private int f23670d;

    static {
        kaw kaw = new kaw();
        f23666c = kaw;
        GeneratedMessageLite.m124024a(kaw.class, kaw);
    }

    private kaw() {
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
            return GeneratedMessageLite.m124022a(f23666c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new kaw();
        } else {
            if (i2 == 4) {
                return new bxvd(f23666c);
            }
            if (i2 == 5) {
                return f23666c;
            }
            bxxk bxxk = f23667e;
            if (bxxk == null) {
                synchronized (kaw.class) {
                    bxxk = f23667e;
                    if (bxxk == null) {
                        bxxk = new bxve(f23666c);
                        f23667e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
