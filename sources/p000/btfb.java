package p000;

/* renamed from: btfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btfb f148607b;

    /* renamed from: c */
    private static volatile bxxk f148608c;

    /* renamed from: a */
    public String f148609a = "";

    static {
        btfb btfb = new btfb();
        f148607b = btfb;
        GeneratedMessageLite.m124024a(btfb.class, btfb);
    }

    private btfb() {
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
            return GeneratedMessageLite.m124022a(f148607b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btfb();
        } else {
            if (i2 == 4) {
                return new bxvd(f148607b);
            }
            if (i2 == 5) {
                return f148607b;
            }
            bxxk bxxk = f148608c;
            if (bxxk == null) {
                synchronized (btfb.class) {
                    bxxk = f148608c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148607b);
                        f148608c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
