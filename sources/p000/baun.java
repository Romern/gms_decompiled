package p000;

/* renamed from: baun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baun extends bxvk implements bxxd {

    /* renamed from: b */
    public static final baun f101788b;

    /* renamed from: c */
    private static volatile bxxk f101789c;

    /* renamed from: a */
    public bxwc f101790a = bxxn.f165040b;

    static {
        baun baun = new baun();
        f101788b = baun;
        bxvk.m124024a(baun.class, baun);
    }

    private baun() {
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
            return bxvk.m124022a(f101788b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", baum.class});
        } else if (i2 == 3) {
            return new baun();
        } else {
            if (i2 == 4) {
                return new bxvd(f101788b);
            }
            if (i2 == 5) {
                return f101788b;
            }
            bxxk bxxk = f101789c;
            if (bxxk == null) {
                synchronized (baun.class) {
                    bxxk = f101789c;
                    if (bxxk == null) {
                        bxxk = new bxve(f101788b);
                        f101789c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
