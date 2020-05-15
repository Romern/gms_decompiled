package p000;

/* renamed from: aqba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqba extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aqba f85521b;

    /* renamed from: c */
    private static volatile bxxk f85522c;

    /* renamed from: a */
    public bxwc f85523a = bxxn.f165040b;

    static {
        aqba aqba = new aqba();
        f85521b = aqba;
        GeneratedMessageLite.m124024a(aqba.class, aqba);
    }

    private aqba() {
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
            return GeneratedMessageLite.m124022a(f85521b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aqaz.class});
        } else if (i2 == 3) {
            return new aqba();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f85521b;
            }
            bxxk bxxk = f85522c;
            if (bxxk == null) {
                synchronized (aqba.class) {
                    bxxk = f85522c;
                    if (bxxk == null) {
                        bxxk = new bxve(f85521b);
                        f85522c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
