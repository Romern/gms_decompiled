package p000;

/* renamed from: qnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final qnz f41820b;

    /* renamed from: c */
    private static volatile bxxk f41821c;

    /* renamed from: a */
    public bxww f41822a = bxww.f165013b;

    static {
        qnz qnz = new qnz();
        f41820b = qnz;
        bxvk.m124024a(qnz.class, qnz);
    }

    private qnz() {
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
            return bxvk.m124022a(f41820b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", qny.f41819a});
        } else if (i2 == 3) {
            return new qnz();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f41820b;
            }
            bxxk bxxk = f41821c;
            if (bxxk == null) {
                synchronized (qnz.class) {
                    bxxk = f41821c;
                    if (bxxk == null) {
                        bxxk = new bxve(f41820b);
                        f41821c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
