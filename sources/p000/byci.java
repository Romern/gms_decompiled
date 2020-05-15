package p000;

/* renamed from: byci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byci extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byci f165652d;

    /* renamed from: f */
    private static volatile bxxk f165653f;

    /* renamed from: a */
    public int f165654a;

    /* renamed from: b */
    public String f165655b = "";

    /* renamed from: c */
    public bxwc f165656c = bxxn.f165040b;

    /* renamed from: e */
    private int f165657e;

    static {
        byci byci = new byci();
        f165652d = byci;
        bxvk.m124024a(byci.class, byci);
    }

    private byci() {
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
            return bxvk.m124022a(f165652d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"e", "a", "b", "c", bych.class});
        } else if (i2 == 3) {
            return new byci();
        } else {
            if (i2 == 4) {
                return new bxvd(f165652d);
            }
            if (i2 == 5) {
                return f165652d;
            }
            bxxk bxxk = f165653f;
            if (bxxk == null) {
                synchronized (byci.class) {
                    bxxk = f165653f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165652d);
                        f165653f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
