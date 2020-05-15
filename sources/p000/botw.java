package p000;

/* renamed from: botw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final botw f134882d;

    /* renamed from: e */
    private static volatile bxxk f134883e;

    /* renamed from: a */
    public int f134884a;

    /* renamed from: b */
    public long f134885b;

    /* renamed from: c */
    public int f134886c;

    static {
        botw botw = new botw();
        f134882d = botw;
        bxvk.m124024a(botw.class, botw);
    }

    private botw() {
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
            return bxvk.m124022a(f134882d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bots.f134870a});
        } else if (i2 == 3) {
            return new botw();
        } else {
            if (i2 == 4) {
                return new bxvd(f134882d);
            }
            if (i2 == 5) {
                return f134882d;
            }
            bxxk bxxk = f134883e;
            if (bxxk == null) {
                synchronized (botw.class) {
                    bxxk = f134883e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134882d);
                        f134883e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
