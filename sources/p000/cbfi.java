package p000;

/* renamed from: cbfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbfi f176921b;

    /* renamed from: c */
    private static volatile bxxk f176922c;

    /* renamed from: a */
    public String f176923a = "";

    static {
        cbfi cbfi = new cbfi();
        f176921b = cbfi;
        bxvk.m124024a(cbfi.class, cbfi);
    }

    private cbfi() {
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
            return bxvk.m124022a(f176921b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbfi();
        } else {
            if (i2 == 4) {
                return new bxvd(f176921b);
            }
            if (i2 == 5) {
                return f176921b;
            }
            bxxk bxxk = f176922c;
            if (bxxk == null) {
                synchronized (cbfi.class) {
                    bxxk = f176922c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176921b);
                        f176922c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
