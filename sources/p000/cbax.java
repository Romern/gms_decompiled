package p000;

/* renamed from: cbax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbax extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbax f176512b;

    /* renamed from: c */
    private static volatile bxxk f176513c;

    /* renamed from: a */
    public bxwc f176514a = bxxn.f165040b;

    static {
        cbax cbax = new cbax();
        f176512b = cbax;
        bxvk.m124024a(cbax.class, cbax);
    }

    private cbax() {
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
            return bxvk.m124022a(f176512b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbaw.class});
        } else if (i2 == 3) {
            return new cbax();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f176512b;
            }
            bxxk bxxk = f176513c;
            if (bxxk == null) {
                synchronized (cbax.class) {
                    bxxk = f176513c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176512b);
                        f176513c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
