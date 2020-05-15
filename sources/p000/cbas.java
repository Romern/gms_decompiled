package p000;

/* renamed from: cbas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbas extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbas f176484b;

    /* renamed from: c */
    private static volatile bxxk f176485c;

    /* renamed from: a */
    public cbba f176486a;

    static {
        cbas cbas = new cbas();
        f176484b = cbas;
        GeneratedMessageLite.m124024a(cbas.class, cbas);
    }

    private cbas() {
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
            return GeneratedMessageLite.m124022a(f176484b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbas();
        } else {
            if (i2 == 4) {
                return new bxvd(f176484b);
            }
            if (i2 == 5) {
                return f176484b;
            }
            bxxk bxxk = f176485c;
            if (bxxk == null) {
                synchronized (cbas.class) {
                    bxxk = f176485c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176484b);
                        f176485c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
