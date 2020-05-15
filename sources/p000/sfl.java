package p000;

/* renamed from: sfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfl extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final sfl f44122b;

    /* renamed from: c */
    private static volatile bxxk f44123c;

    /* renamed from: a */
    public bxwc f44124a = bxxn.f165040b;

    static {
        sfl sfl = new sfl();
        f44122b = sfl;
        GeneratedMessageLite.m124024a(sfl.class, sfl);
    }

    private sfl() {
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
            return GeneratedMessageLite.m124022a(f44122b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", sfn.class});
        } else if (i2 == 3) {
            return new sfl();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f44122b;
            }
            bxxk bxxk = f44123c;
            if (bxxk == null) {
                synchronized (sfl.class) {
                    bxxk = f44123c;
                    if (bxxk == null) {
                        bxxk = new bxve(f44122b);
                        f44123c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
