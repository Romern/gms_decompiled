package p000;

/* renamed from: byix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byix extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byix f166620b;

    /* renamed from: c */
    private static volatile bxxk f166621c;

    /* renamed from: a */
    public bxwc f166622a = bxxn.f165040b;

    static {
        byix byix = new byix();
        f166620b = byix;
        GeneratedMessageLite.m124024a(byix.class, byix);
    }

    private byix() {
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
            return GeneratedMessageLite.m124022a(f166620b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byja.class});
        } else if (i2 == 3) {
            return new byix();
        } else {
            if (i2 == 4) {
                return new bxvd(f166620b);
            }
            if (i2 == 5) {
                return f166620b;
            }
            bxxk bxxk = f166621c;
            if (bxxk == null) {
                synchronized (byix.class) {
                    bxxk = f166621c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166620b);
                        f166621c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
