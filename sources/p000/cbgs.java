package p000;

/* renamed from: cbgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgs extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbgs f177079b;

    /* renamed from: c */
    private static volatile bxxk f177080c;

    /* renamed from: a */
    public bxwc f177081a = bxxn.f165040b;

    static {
        cbgs cbgs = new cbgs();
        f177079b = cbgs;
        bxvk.m124024a(cbgs.class, cbgs);
    }

    private cbgs() {
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
            return bxvk.m124022a(f177079b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbhu.class});
        } else if (i2 == 3) {
            return new cbgs();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f177079b;
            }
            bxxk bxxk = f177080c;
            if (bxxk == null) {
                synchronized (cbgs.class) {
                    bxxk = f177080c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177079b);
                        f177080c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
