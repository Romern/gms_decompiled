package p000;

/* renamed from: camc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final camc f175240c;

    /* renamed from: e */
    private static volatile bxxk f175241e;

    /* renamed from: a */
    public String f175242a = "";

    /* renamed from: b */
    public String f175243b = "";

    /* renamed from: d */
    private int f175244d;

    static {
        camc camc = new camc();
        f175240c = camc;
        GeneratedMessageLite.m124024a(camc.class, camc);
    }

    private camc() {
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
            return GeneratedMessageLite.m124022a(f175240c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new camc();
        } else {
            if (i2 == 4) {
                return new bxvd(f175240c);
            }
            if (i2 == 5) {
                return f175240c;
            }
            bxxk bxxk = f175241e;
            if (bxxk == null) {
                synchronized (camc.class) {
                    bxxk = f175241e;
                    if (bxxk == null) {
                        bxxk = new bxve(f175240c);
                        f175241e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
