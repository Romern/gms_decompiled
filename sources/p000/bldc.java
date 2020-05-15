package p000;

/* renamed from: bldc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bldc f126041c;

    /* renamed from: e */
    private static volatile bxxk f126042e;

    /* renamed from: a */
    public String f126043a = "";

    /* renamed from: b */
    public boolean f126044b;

    /* renamed from: d */
    private int f126045d;

    static {
        bldc bldc = new bldc();
        f126041c = bldc;
        GeneratedMessageLite.m124024a(bldc.class, bldc);
    }

    private bldc() {
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
            return GeneratedMessageLite.m124022a(f126041c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bldc();
        } else {
            if (i2 == 4) {
                return new bxvd(f126041c);
            }
            if (i2 == 5) {
                return f126041c;
            }
            bxxk bxxk = f126042e;
            if (bxxk == null) {
                synchronized (bldc.class) {
                    bxxk = f126042e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126041c);
                        f126042e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
