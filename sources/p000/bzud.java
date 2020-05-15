package p000;

/* renamed from: bzud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzud extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzud f171408b;

    /* renamed from: c */
    private static volatile bxxk f171409c;

    /* renamed from: a */
    public bxwc f171410a = bxxn.f165040b;

    static {
        bzud bzud = new bzud();
        f171408b = bzud;
        GeneratedMessageLite.m124024a(bzud.class, bzud);
    }

    private bzud() {
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
            return GeneratedMessageLite.m124022a(f171408b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzuc.class});
        } else if (i2 == 3) {
            return new bzud();
        } else {
            if (i2 == 4) {
                return new bxvd(f171408b);
            }
            if (i2 == 5) {
                return f171408b;
            }
            bxxk bxxk = f171409c;
            if (bxxk == null) {
                synchronized (bzud.class) {
                    bxxk = f171409c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171408b);
                        f171409c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
