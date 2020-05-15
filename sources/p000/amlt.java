package p000;

/* renamed from: amlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final amlt f75217b;

    /* renamed from: c */
    private static volatile bxxk f75218c;

    /* renamed from: a */
    public bxvt f75219a = bxvm.f164965b;

    static {
        amlt amlt = new amlt();
        f75217b = amlt;
        GeneratedMessageLite.m124024a(amlt.class, amlt);
    }

    private amlt() {
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
            return GeneratedMessageLite.m124022a(f75217b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", amls.m63044b()});
        } else if (i2 == 3) {
            return new amlt();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f75217b;
            }
            bxxk bxxk = f75218c;
            if (bxxk == null) {
                synchronized (amlt.class) {
                    bxxk = f75218c;
                    if (bxxk == null) {
                        bxxk = new bxve(f75217b);
                        f75218c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
