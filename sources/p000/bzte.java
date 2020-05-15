package p000;

/* renamed from: bzte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzte extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzte f171316c;

    /* renamed from: d */
    private static volatile bxxk f171317d;

    /* renamed from: a */
    public int f171318a = 0;

    /* renamed from: b */
    public Object f171319b;

    static {
        bzte bzte = new bzte();
        f171316c = bzte;
        bxvk.m124024a(bzte.class, bzte);
    }

    private bzte() {
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
            return bxvk.m124022a(f171316c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", bztg.class, bztf.class});
        } else if (i2 == 3) {
            return new bzte();
        } else {
            if (i2 == 4) {
                return new bxvd(f171316c);
            }
            if (i2 == 5) {
                return f171316c;
            }
            bxxk bxxk = f171317d;
            if (bxxk == null) {
                synchronized (bzte.class) {
                    bxxk = f171317d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171316c);
                        f171317d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
