package p000;

/* renamed from: abej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abej extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final abej f57235e;

    /* renamed from: f */
    private static volatile bxxk f57236f;

    /* renamed from: a */
    public int f57237a;

    /* renamed from: b */
    public abdu f57238b;

    /* renamed from: c */
    public abdn f57239c;

    /* renamed from: d */
    public abdy f57240d;

    static {
        abej abej = new abej();
        f57235e = abej;
        GeneratedMessageLite.m124024a(abej.class, abej);
    }

    private abej() {
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
            return GeneratedMessageLite.m124022a(f57235e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abej();
        } else {
            if (i2 == 4) {
                return new bxvd(f57235e);
            }
            if (i2 == 5) {
                return f57235e;
            }
            bxxk bxxk = f57236f;
            if (bxxk == null) {
                synchronized (abej.class) {
                    bxxk = f57236f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57235e);
                        f57236f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
