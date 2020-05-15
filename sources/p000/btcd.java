package p000;

/* renamed from: btcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btcd f148255b;

    /* renamed from: c */
    private static volatile bxxk f148256c;

    /* renamed from: a */
    public bxwc f148257a = bxxn.f165040b;

    static {
        btcd btcd = new btcd();
        f148255b = btcd;
        GeneratedMessageLite.m124024a(btcd.class, btcd);
    }

    private btcd() {
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
            return GeneratedMessageLite.m124022a(f148255b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzkv.class});
        } else if (i2 == 3) {
            return new btcd();
        } else {
            if (i2 == 4) {
                return new bxvd(f148255b);
            }
            if (i2 == 5) {
                return f148255b;
            }
            bxxk bxxk = f148256c;
            if (bxxk == null) {
                synchronized (btcd.class) {
                    bxxk = f148256c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148255b);
                        f148256c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
