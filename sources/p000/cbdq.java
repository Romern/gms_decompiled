package p000;

/* renamed from: cbdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbdq f176772b;

    /* renamed from: c */
    private static volatile bxxk f176773c;

    /* renamed from: a */
    public bxwc f176774a = bxxn.f165040b;

    static {
        cbdq cbdq = new cbdq();
        f176772b = cbdq;
        bxvk.m124024a(cbdq.class, cbdq);
    }

    private cbdq() {
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
            return bxvk.m124022a(f176772b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbds.class});
        } else if (i2 == 3) {
            return new cbdq();
        } else {
            if (i2 == 4) {
                return new bxvd(f176772b);
            }
            if (i2 == 5) {
                return f176772b;
            }
            bxxk bxxk = f176773c;
            if (bxxk == null) {
                synchronized (cbdq.class) {
                    bxxk = f176773c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176772b);
                        f176773c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
