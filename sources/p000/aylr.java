package p000;

/* renamed from: aylr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aylr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aylr f97922b;

    /* renamed from: c */
    private static volatile bxxk f97923c;

    /* renamed from: a */
    public bxwc f97924a = bxxn.f165040b;

    static {
        aylr aylr = new aylr();
        f97922b = aylr;
        GeneratedMessageLite.m124024a(aylr.class, aylr);
    }

    private aylr() {
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
            return GeneratedMessageLite.m124022a(f97922b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aylq.class});
        } else if (i2 == 3) {
            return new aylr();
        } else {
            if (i2 == 4) {
                return new bxvd(f97922b);
            }
            if (i2 == 5) {
                return f97922b;
            }
            bxxk bxxk = f97923c;
            if (bxxk == null) {
                synchronized (aylr.class) {
                    bxxk = f97923c;
                    if (bxxk == null) {
                        bxxk = new bxve(f97922b);
                        f97923c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
