package p000;

/* renamed from: botv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final botv f134879b;

    /* renamed from: c */
    private static volatile bxxk f134880c;

    /* renamed from: a */
    public bxwc f134881a = bxxn.f165040b;

    static {
        botv botv = new botv();
        f134879b = botv;
        bxvk.m124024a(botv.class, botv);
    }

    private botv() {
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
            return bxvk.m124022a(f134879b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", botw.class});
        } else if (i2 == 3) {
            return new botv();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f134879b;
            }
            bxxk bxxk = f134880c;
            if (bxxk == null) {
                synchronized (botv.class) {
                    bxxk = f134880c;
                    if (bxxk == null) {
                        bxxk = new bxve(f134879b);
                        f134880c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
