package p000;

/* renamed from: bztc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bztc f171313b;

    /* renamed from: c */
    private static volatile bxxk f171314c;

    /* renamed from: a */
    public bzte f171315a;

    static {
        bztc bztc = new bztc();
        f171313b = bztc;
        bxvk.m124024a(bztc.class, bztc);
    }

    private bztc() {
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
            return bxvk.m124022a(f171313b, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztc();
        } else {
            if (i2 == 4) {
                return new bxvd(f171313b);
            }
            if (i2 == 5) {
                return f171313b;
            }
            bxxk bxxk = f171314c;
            if (bxxk == null) {
                synchronized (bztc.class) {
                    bxxk = f171314c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171313b);
                        f171314c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
