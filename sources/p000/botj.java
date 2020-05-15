package p000;

/* renamed from: botj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final botj f134781a;

    /* renamed from: b */
    private static volatile bxxk f134782b;

    static {
        botj botj = new botj();
        f134781a = botj;
        GeneratedMessageLite.m124024a(botj.class, botj);
    }

    private botj() {
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
            return GeneratedMessageLite.m124022a(f134781a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new botj();
        }
        if (i2 == 4) {
            return new bxvd(f134781a);
        }
        if (i2 == 5) {
            return f134781a;
        }
        bxxk bxxk = f134782b;
        if (bxxk == null) {
            synchronized (botj.class) {
                bxxk = f134782b;
                if (bxxk == null) {
                    bxxk = new bxve(f134781a);
                    f134782b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
