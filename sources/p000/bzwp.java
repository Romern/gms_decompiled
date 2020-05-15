package p000;

/* renamed from: bzwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzwp f171662b;

    /* renamed from: c */
    private static volatile bxxk f171663c;

    /* renamed from: a */
    public bxwc f171664a = bxxn.f165040b;

    static {
        bzwp bzwp = new bzwp();
        f171662b = bzwp;
        GeneratedMessageLite.m124024a(bzwp.class, bzwp);
    }

    private bzwp() {
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
            return GeneratedMessageLite.m124022a(f171662b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzwo.class});
        } else if (i2 == 3) {
            return new bzwp();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f171662b;
            }
            bxxk bxxk = f171663c;
            if (bxxk == null) {
                synchronized (bzwp.class) {
                    bxxk = f171663c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171662b);
                        f171663c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
