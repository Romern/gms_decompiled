package p000;

/* renamed from: byxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byxr f168783b;

    /* renamed from: c */
    private static volatile bxxk f168784c;

    /* renamed from: a */
    public bxwc f168785a = bxxn.f165040b;

    static {
        byxr byxr = new byxr();
        f168783b = byxr;
        GeneratedMessageLite.m124024a(byxr.class, byxr);
    }

    private byxr() {
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
            return GeneratedMessageLite.m124022a(f168783b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byxp.class});
        } else if (i2 == 3) {
            return new byxr();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null);
            }
            if (i2 == 5) {
                return f168783b;
            }
            bxxk bxxk = f168784c;
            if (bxxk == null) {
                synchronized (byxr.class) {
                    bxxk = f168784c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168783b);
                        f168784c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
