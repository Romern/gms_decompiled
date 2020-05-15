package p000;

/* renamed from: cbgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbgf f177024b;

    /* renamed from: c */
    private static volatile bxxk f177025c;

    /* renamed from: a */
    public bxwc f177026a = bxxn.f165040b;

    static {
        cbgf cbgf = new cbgf();
        f177024b = cbgf;
        bxvk.m124024a(cbgf.class, cbgf);
    }

    private cbgf() {
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
            return bxvk.m124022a(f177024b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbgc.class});
        } else if (i2 == 3) {
            return new cbgf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f177024b;
            }
            bxxk bxxk = f177025c;
            if (bxxk == null) {
                synchronized (cbgf.class) {
                    bxxk = f177025c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177024b);
                        f177025c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
