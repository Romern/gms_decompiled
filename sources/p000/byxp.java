package p000;

/* renamed from: byxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byxp f168775b;

    /* renamed from: c */
    private static volatile bxxk f168776c;

    /* renamed from: a */
    public bxwc f168777a = bxxn.f165040b;

    static {
        byxp byxp = new byxp();
        f168775b = byxp;
        GeneratedMessageLite.m124024a(byxp.class, byxp);
    }

    private byxp() {
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
            return GeneratedMessageLite.m124022a(f168775b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byxq.class});
        } else if (i2 == 3) {
            return new byxp();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f168775b;
            }
            bxxk bxxk = f168776c;
            if (bxxk == null) {
                synchronized (byxp.class) {
                    bxxk = f168776c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168775b);
                        f168776c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
