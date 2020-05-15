package p000;

/* renamed from: bavs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bavs f101923c;

    /* renamed from: d */
    private static volatile bxxk f101924d;

    /* renamed from: a */
    public int f101925a;

    /* renamed from: b */
    public boolean f101926b;

    static {
        bavs bavs = new bavs();
        f101923c = bavs;
        GeneratedMessageLite.m124024a(bavs.class, bavs);
    }

    private bavs() {
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
            return GeneratedMessageLite.m124022a(f101923c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bavs();
        } else {
            if (i2 == 4) {
                return new bxvd(f101923c);
            }
            if (i2 == 5) {
                return f101923c;
            }
            bxxk bxxk = f101924d;
            if (bxxk == null) {
                synchronized (bavs.class) {
                    bxxk = f101924d;
                    if (bxxk == null) {
                        bxxk = new bxve(f101923c);
                        f101924d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
