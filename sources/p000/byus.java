package p000;

/* renamed from: byus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byus extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byus f168362d;

    /* renamed from: f */
    private static volatile bxxk f168363f;

    /* renamed from: a */
    public int f168364a;

    /* renamed from: b */
    public int f168365b;

    /* renamed from: c */
    public byuw f168366c;

    /* renamed from: e */
    private byte f168367e = 2;

    static {
        byus byus = new byus();
        f168362d = byus;
        GeneratedMessageLite.m124024a(byus.class, byus);
    }

    private byus() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168367e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168367e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168362d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", byuq.m125365b(), "c"});
        } else if (i2 == 3) {
            return new byus();
        } else {
            if (i2 == 4) {
                return new bxvd(f168362d);
            }
            if (i2 == 5) {
                return f168362d;
            }
            bxxk bxxk = f168363f;
            if (bxxk == null) {
                synchronized (byus.class) {
                    bxxk = f168363f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168362d);
                        f168363f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
