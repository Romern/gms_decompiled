package p000;

/* renamed from: bsrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsrf f146744d;

    /* renamed from: e */
    private static volatile bxxk f146745e;

    /* renamed from: a */
    public int f146746a;

    /* renamed from: b */
    public int f146747b;

    /* renamed from: c */
    public bsrg f146748c;

    static {
        bsrf bsrf = new bsrf();
        f146744d = bsrf;
        GeneratedMessageLite.m124024a(bsrf.class, bsrf);
    }

    private bsrf() {
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
            return GeneratedMessageLite.m124022a(f146744d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bsmz.m115998b(), "c"});
        } else if (i2 == 3) {
            return new bsrf();
        } else {
            if (i2 == 4) {
                return new bxvd(f146744d);
            }
            if (i2 == 5) {
                return f146744d;
            }
            bxxk bxxk = f146745e;
            if (bxxk == null) {
                synchronized (bsrf.class) {
                    bxxk = f146745e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146744d);
                        f146745e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
