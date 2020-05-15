package p000;

/* renamed from: bwmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwmx f160326c;

    /* renamed from: d */
    private static volatile bxxk f160327d;

    /* renamed from: a */
    public int f160328a = 0;

    /* renamed from: b */
    public Object f160329b;

    static {
        bwmx bwmx = new bwmx();
        f160326c = bwmx;
        bxvk.m124024a(bwmx.class, bwmx);
    }

    private bwmx() {
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
            return bxvk.m124022a(f160326c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bwmu.m122116b(), bwmw.class});
        } else if (i2 == 3) {
            return new bwmx();
        } else {
            if (i2 == 4) {
                return new bxvd(f160326c);
            }
            if (i2 == 5) {
                return f160326c;
            }
            bxxk bxxk = f160327d;
            if (bxxk == null) {
                synchronized (bwmx.class) {
                    bxxk = f160327d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160326c);
                        f160327d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
