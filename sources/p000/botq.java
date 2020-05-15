package p000;

/* renamed from: botq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final botq f134857e;

    /* renamed from: f */
    private static volatile bxxk f134858f;

    /* renamed from: a */
    public int f134859a;

    /* renamed from: b */
    public int f134860b = 0;

    /* renamed from: c */
    public Object f134861c;

    /* renamed from: d */
    public int f134862d;

    static {
        botq botq = new botq();
        f134857e = botq;
        GeneratedMessageLite.m124024a(botq.class, botq);
    }

    private botq() {
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
            return GeneratedMessageLite.m124022a(f134857e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"c", "b", "a", "d", both.f134780a, botg.class, botc.class, botp.class, bota.class, bosz.class});
        } else if (i2 == 3) {
            return new botq();
        } else {
            if (i2 == 4) {
                return new bxvd(f134857e);
            }
            if (i2 == 5) {
                return f134857e;
            }
            bxxk bxxk = f134858f;
            if (bxxk == null) {
                synchronized (botq.class) {
                    bxxk = f134858f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134857e);
                        f134858f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
