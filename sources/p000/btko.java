package p000;

/* renamed from: btko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btko extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btko f149283c;

    /* renamed from: d */
    private static volatile bxxk f149284d;

    /* renamed from: a */
    public String f149285a = "";

    /* renamed from: b */
    public btmo f149286b;

    static {
        btko btko = new btko();
        f149283c = btko;
        GeneratedMessageLite.m124024a(btko.class, btko);
    }

    private btko() {
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
            return GeneratedMessageLite.m124022a(f149283c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btko();
        } else {
            if (i2 == 4) {
                return new bxvd(f149283c);
            }
            if (i2 == 5) {
                return f149283c;
            }
            bxxk bxxk = f149284d;
            if (bxxk == null) {
                synchronized (btko.class) {
                    bxxk = f149284d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149283c);
                        f149284d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
