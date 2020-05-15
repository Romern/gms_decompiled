package p000;

/* renamed from: cbji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbji extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbji f177331c;

    /* renamed from: d */
    private static volatile bxxk f177332d;

    /* renamed from: a */
    public bxwc f177333a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f177334b = bxxn.f165040b;

    static {
        cbji cbji = new cbji();
        f177331c = cbji;
        bxvk.m124024a(cbji.class, cbji);
    }

    private cbji() {
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
            return bxvk.m124022a(f177331c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", cbma.class, "b", cbmn.class});
        } else if (i2 == 3) {
            return new cbji();
        } else {
            if (i2 == 4) {
                return new bxvd(f177331c);
            }
            if (i2 == 5) {
                return f177331c;
            }
            bxxk bxxk = f177332d;
            if (bxxk == null) {
                synchronized (cbji.class) {
                    bxxk = f177332d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177331c);
                        f177332d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
