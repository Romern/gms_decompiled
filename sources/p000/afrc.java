package p000;

/* renamed from: afrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afrc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final afrc f64601d;

    /* renamed from: e */
    private static volatile bxxk f64602e;

    /* renamed from: a */
    public int f64603a;

    /* renamed from: b */
    public int f64604b;

    /* renamed from: c */
    public afrb f64605c;

    static {
        afrc afrc = new afrc();
        f64601d = afrc;
        GeneratedMessageLite.m124024a(afrc.class, afrc);
    }

    private afrc() {
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
            return GeneratedMessageLite.m124022a(f64601d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", afrg.m53476b(), "c"});
        } else if (i2 == 3) {
            return new afrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f64601d);
            }
            if (i2 == 5) {
                return f64601d;
            }
            bxxk bxxk = f64602e;
            if (bxxk == null) {
                synchronized (afrc.class) {
                    bxxk = f64602e;
                    if (bxxk == null) {
                        bxxk = new bxve(f64601d);
                        f64602e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
