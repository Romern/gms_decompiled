package p000;

/* renamed from: bzot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzot extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzot f170863d;

    /* renamed from: e */
    private static volatile bxxk f170864e;

    /* renamed from: a */
    public bzoa f170865a;

    /* renamed from: b */
    public long f170866b;

    /* renamed from: c */
    public bxtj f170867c;

    static {
        bzot bzot = new bzot();
        f170863d = bzot;
        bxvk.m124024a(bzot.class, bzot);
    }

    private bzot() {
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
            return bxvk.m124022a(f170863d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0002\u0002\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzot();
        } else {
            if (i2 == 4) {
                return new bxvd(f170863d);
            }
            if (i2 == 5) {
                return f170863d;
            }
            bxxk bxxk = f170864e;
            if (bxxk == null) {
                synchronized (bzot.class) {
                    bxxk = f170864e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170863d);
                        f170864e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
