package p000;

/* renamed from: cabd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cabd f172424b;

    /* renamed from: d */
    private static volatile bxxk f172425d;

    /* renamed from: a */
    public bxwc f172426a = bxxn.f165040b;

    /* renamed from: c */
    private byte f172427c = 2;

    static {
        cabd cabd = new cabd();
        f172424b = cabd;
        GeneratedMessageLite.m124024a(cabd.class, cabd);
    }

    private cabd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172427c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172427c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f172424b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", cabc.class});
        } else if (i2 == 3) {
            return new cabd();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f172424b;
            }
            bxxk bxxk = f172425d;
            if (bxxk == null) {
                synchronized (cabd.class) {
                    bxxk = f172425d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172424b);
                        f172425d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
