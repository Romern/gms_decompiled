package p000;

/* renamed from: amkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amkw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final amkw f75120e;

    /* renamed from: f */
    private static volatile bxxk f75121f;

    /* renamed from: a */
    public int f75122a;

    /* renamed from: b */
    public int f75123b;

    /* renamed from: c */
    public int f75124c;

    /* renamed from: d */
    public int f75125d;

    static {
        amkw amkw = new amkw();
        f75120e = amkw;
        GeneratedMessageLite.m124024a(amkw.class, amkw);
    }

    private amkw() {
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
            return GeneratedMessageLite.m124022a(f75120e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", amjb.f74978a, "c", amix.f74974a, "d", amja.f74977a});
        } else if (i2 == 3) {
            return new amkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f75120e);
            }
            if (i2 == 5) {
                return f75120e;
            }
            bxxk bxxk = f75121f;
            if (bxxk == null) {
                synchronized (amkw.class) {
                    bxxk = f75121f;
                    if (bxxk == null) {
                        bxxk = new bxve(f75120e);
                        f75121f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
