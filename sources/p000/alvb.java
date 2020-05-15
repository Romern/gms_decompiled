package p000;

/* renamed from: alvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alvb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final alvb f74354c;

    /* renamed from: e */
    private static volatile bxxk f74355e;

    /* renamed from: a */
    public int f74356a;

    /* renamed from: b */
    public String f74357b = "";

    /* renamed from: d */
    private int f74358d;

    static {
        alvb alvb = new alvb();
        f74354c = alvb;
        GeneratedMessageLite.m124024a(alvb.class, alvb);
    }

    private alvb() {
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
            return GeneratedMessageLite.m124022a(f74354c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", aluz.f74353a, "b"});
        } else if (i2 == 3) {
            return new alvb();
        } else {
            if (i2 == 4) {
                return new bxvd(f74354c);
            }
            if (i2 == 5) {
                return f74354c;
            }
            bxxk bxxk = f74355e;
            if (bxxk == null) {
                synchronized (alvb.class) {
                    bxxk = f74355e;
                    if (bxxk == null) {
                        bxxk = new bxve(f74354c);
                        f74355e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
