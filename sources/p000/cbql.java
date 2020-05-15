package p000;

/* renamed from: cbql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbql extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbql f178040b;

    /* renamed from: c */
    private static volatile bxxk f178041c;

    /* renamed from: a */
    public cbpi f178042a;

    static {
        cbql cbql = new cbql();
        f178040b = cbql;
        bxvk.m124024a(cbql.class, cbql);
    }

    private cbql() {
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
            return bxvk.m124022a(f178040b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbql();
        } else {
            if (i2 == 4) {
                return new bxvd(f178040b);
            }
            if (i2 == 5) {
                return f178040b;
            }
            bxxk bxxk = f178041c;
            if (bxxk == null) {
                synchronized (cbql.class) {
                    bxxk = f178041c;
                    if (bxxk == null) {
                        bxxk = new bxve(f178040b);
                        f178041c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
