package p000;

/* renamed from: bons */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bons extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bons f133851b;

    /* renamed from: c */
    private static volatile bxxk f133852c;

    /* renamed from: a */
    public int f133853a;

    static {
        bons bons = new bons();
        f133851b = bons;
        GeneratedMessageLite.m124024a(bons.class, bons);
    }

    private bons() {
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
            return GeneratedMessageLite.m124022a(f133851b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bons();
        } else {
            if (i2 == 4) {
                return new bxvd(f133851b);
            }
            if (i2 == 5) {
                return f133851b;
            }
            bxxk bxxk = f133852c;
            if (bxxk == null) {
                synchronized (bons.class) {
                    bxxk = f133852c;
                    if (bxxk == null) {
                        bxxk = new bxve(f133851b);
                        f133852c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
