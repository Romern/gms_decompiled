package p000;

/* renamed from: cbmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmx extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbmx f177692e;

    /* renamed from: f */
    private static volatile bxxk f177693f;

    /* renamed from: a */
    public cbma f177694a;

    /* renamed from: b */
    public cbmk f177695b;

    /* renamed from: c */
    public bxwc f177696c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f177697d = bxxn.f165040b;

    static {
        cbmx cbmx = new cbmx();
        f177692e = cbmx;
        bxvk.m124024a(cbmx.class, cbmx);
    }

    private cbmx() {
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
            return bxvk.m124022a(f177692e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0002\u0000\u0001\t\u0002\t\u0003\u001b\u0006\u001b", new Object[]{"a", "b", "c", cbma.class, "d", cbmy.class});
        } else if (i2 == 3) {
            return new cbmx();
        } else {
            if (i2 == 4) {
                return new bxvd(f177692e);
            }
            if (i2 == 5) {
                return f177692e;
            }
            bxxk bxxk = f177693f;
            if (bxxk == null) {
                synchronized (cbmx.class) {
                    bxxk = f177693f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177692e);
                        f177693f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
