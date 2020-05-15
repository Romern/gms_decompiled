package p000;

/* renamed from: btcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btcb f148246c;

    /* renamed from: d */
    private static volatile bxxk f148247d;

    /* renamed from: a */
    public String f148248a = "";

    /* renamed from: b */
    public String f148249b = "";

    static {
        btcb btcb = new btcb();
        f148246c = btcb;
        GeneratedMessageLite.m124024a(btcb.class, btcb);
    }

    private btcb() {
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
            return GeneratedMessageLite.m124022a(f148246c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btcb();
        } else {
            if (i2 == 4) {
                return new bxvd(f148246c);
            }
            if (i2 == 5) {
                return f148246c;
            }
            bxxk bxxk = f148247d;
            if (bxxk == null) {
                synchronized (btcb.class) {
                    bxxk = f148247d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148246c);
                        f148247d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
