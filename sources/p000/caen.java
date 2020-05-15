package p000;

/* renamed from: caen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caen extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final caen f172838b;

    /* renamed from: c */
    private static volatile bxxk f172839c;

    /* renamed from: a */
    public bxwc f172840a = bxxn.f165040b;

    static {
        caen caen = new caen();
        f172838b = caen;
        GeneratedMessageLite.m124024a(caen.class, caen);
    }

    private caen() {
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
            return GeneratedMessageLite.m124022a(f172838b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", caem.class});
        } else if (i2 == 3) {
            return new caen();
        } else {
            if (i2 == 4) {
                return new bxvd(f172838b);
            }
            if (i2 == 5) {
                return f172838b;
            }
            bxxk bxxk = f172839c;
            if (bxxk == null) {
                synchronized (caen.class) {
                    bxxk = f172839c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172838b);
                        f172839c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
