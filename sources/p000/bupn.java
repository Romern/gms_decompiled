package p000;

/* renamed from: bupn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bupn f154656b;

    /* renamed from: c */
    private static volatile bxxk f154657c;

    /* renamed from: a */
    public bupm f154658a;

    static {
        bupn bupn = new bupn();
        f154656b = bupn;
        bxvk.m124024a(bupn.class, bupn);
    }

    private bupn() {
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
            return bxvk.m124022a(f154656b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bupn();
        } else {
            if (i2 == 4) {
                return new bxvd(f154656b);
            }
            if (i2 == 5) {
                return f154656b;
            }
            bxxk bxxk = f154657c;
            if (bxxk == null) {
                synchronized (bupn.class) {
                    bxxk = f154657c;
                    if (bxxk == null) {
                        bxxk = new bxve(f154656b);
                        f154657c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
