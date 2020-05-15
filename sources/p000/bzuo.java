package p000;

/* renamed from: bzuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzuo f171443b;

    /* renamed from: c */
    private static volatile bxxk f171444c;

    /* renamed from: a */
    public bzuk f171445a;

    static {
        bzuo bzuo = new bzuo();
        f171443b = bzuo;
        GeneratedMessageLite.m124024a(bzuo.class, bzuo);
    }

    private bzuo() {
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
            return GeneratedMessageLite.m124022a(f171443b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzuo();
        } else {
            if (i2 == 4) {
                return new bxvd(f171443b);
            }
            if (i2 == 5) {
                return f171443b;
            }
            bxxk bxxk = f171444c;
            if (bxxk == null) {
                synchronized (bzuo.class) {
                    bxxk = f171444c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171443b);
                        f171444c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
