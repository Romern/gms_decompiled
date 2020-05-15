package p000;

/* renamed from: caep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caep extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final caep f172846b;

    /* renamed from: c */
    private static volatile bxxk f172847c;

    /* renamed from: a */
    public bxwc f172848a = bxxn.f165040b;

    static {
        caep caep = new caep();
        f172846b = caep;
        GeneratedMessageLite.m124024a(caep.class, caep);
    }

    private caep() {
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
            return GeneratedMessageLite.m124022a(f172846b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", caeo.class});
        } else if (i2 == 3) {
            return new caep();
        } else {
            if (i2 == 4) {
                return new bxvd(f172846b);
            }
            if (i2 == 5) {
                return f172846b;
            }
            bxxk bxxk = f172847c;
            if (bxxk == null) {
                synchronized (caep.class) {
                    bxxk = f172847c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172846b);
                        f172847c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
