package p000;

/* renamed from: bouy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bouy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bouy f134970d;

    /* renamed from: e */
    private static volatile bxxk f134971e;

    /* renamed from: a */
    public int f134972a;

    /* renamed from: b */
    public String f134973b = "";

    /* renamed from: c */
    public int f134974c;

    static {
        bouy bouy = new bouy();
        f134970d = bouy;
        GeneratedMessageLite.m124024a(bouy.class, bouy);
    }

    private bouy() {
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
            return GeneratedMessageLite.m124022a(f134970d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", boux.f134969a});
        } else if (i2 == 3) {
            return new bouy();
        } else {
            if (i2 == 4) {
                return new bxvd(f134970d);
            }
            if (i2 == 5) {
                return f134970d;
            }
            bxxk bxxk = f134971e;
            if (bxxk == null) {
                synchronized (bouy.class) {
                    bxxk = f134971e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134970d);
                        f134971e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
