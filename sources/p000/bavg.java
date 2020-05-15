package p000;

/* renamed from: bavg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bavg f101884g;

    /* renamed from: h */
    private static volatile bxxk f101885h;

    /* renamed from: a */
    public int f101886a;

    /* renamed from: b */
    public String f101887b = "";

    /* renamed from: c */
    public int f101888c;

    /* renamed from: d */
    public String f101889d = "";

    /* renamed from: e */
    public int f101890e;

    /* renamed from: f */
    public bauv f101891f;

    static {
        bavg bavg = new bavg();
        f101884g = bavg;
        GeneratedMessageLite.m124024a(bavg.class, bavg);
    }

    private bavg() {
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
            return GeneratedMessageLite.m124022a(f101884g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005ဌ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", bave.f101883a, "f"});
        } else if (i2 == 3) {
            return new bavg();
        } else {
            if (i2 == 4) {
                return new bxvd(f101884g);
            }
            if (i2 == 5) {
                return f101884g;
            }
            bxxk bxxk = f101885h;
            if (bxxk == null) {
                synchronized (bavg.class) {
                    bxxk = f101885h;
                    if (bxxk == null) {
                        bxxk = new bxve(f101884g);
                        f101885h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
