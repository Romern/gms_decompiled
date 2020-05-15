package p000;

/* renamed from: bolv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolv extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bolv f133591a;

    /* renamed from: b */
    private static volatile bxxk f133592b;

    static {
        bolv bolv = new bolv();
        f133591a = bolv;
        bxvk.m124024a(bolv.class, bolv);
    }

    private bolv() {
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
            return bxvk.m124022a(f133591a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bolv();
        }
        if (i2 == 4) {
            return new bxvd(f133591a);
        }
        if (i2 == 5) {
            return f133591a;
        }
        bxxk bxxk = f133592b;
        if (bxxk == null) {
            synchronized (bolv.class) {
                bxxk = f133592b;
                if (bxxk == null) {
                    bxxk = new bxve(f133591a);
                    f133592b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
