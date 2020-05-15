package p000;

/* renamed from: cbpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbpr f177949b;

    /* renamed from: c */
    private static volatile bxxk f177950c;

    /* renamed from: a */
    public int f177951a;

    static {
        cbpr cbpr = new cbpr();
        f177949b = cbpr;
        bxvk.m124024a(cbpr.class, cbpr);
    }

    private cbpr() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f177949b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbpr();
        } else {
            if (i2 == 4) {
                return new bxvd(f177949b);
            }
            if (i2 == 5) {
                return f177949b;
            }
            bxxk bxxk = f177950c;
            if (bxxk == null) {
                synchronized (cbpr.class) {
                    bxxk = f177950c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177949b);
                        f177950c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
