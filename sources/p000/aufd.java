package p000;

/* renamed from: aufd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aufd f91633b;

    /* renamed from: c */
    private static volatile bxxk f91634c;

    /* renamed from: a */
    public bxwc f91635a = bxxn.f165040b;

    static {
        aufd aufd = new aufd();
        f91633b = aufd;
        GeneratedMessageLite.m124024a(aufd.class, aufd);
    }

    private aufd() {
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
            return GeneratedMessageLite.m124022a(f91633b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", auez.class});
        } else if (i2 == 3) {
            return new aufd();
        } else {
            if (i2 == 4) {
                return new aufc();
            }
            if (i2 == 5) {
                return f91633b;
            }
            bxxk bxxk = f91634c;
            if (bxxk == null) {
                synchronized (aufd.class) {
                    bxxk = f91634c;
                    if (bxxk == null) {
                        bxxk = new bxve(f91633b);
                        f91634c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
