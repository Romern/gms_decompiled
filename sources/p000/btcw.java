package p000;

/* renamed from: btcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btcw f148359b;

    /* renamed from: c */
    private static volatile bxxk f148360c;

    /* renamed from: a */
    public bxwc f148361a = bxxn.f165040b;

    static {
        btcw btcw = new btcw();
        f148359b = btcw;
        bxvk.m124024a(btcw.class, btcw);
    }

    private btcw() {
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
            return bxvk.m124022a(f148359b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", btez.class});
        } else if (i2 == 3) {
            return new btcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f148359b);
            }
            if (i2 == 5) {
                return f148359b;
            }
            bxxk bxxk = f148360c;
            if (bxxk == null) {
                synchronized (btcw.class) {
                    bxxk = f148360c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148359b);
                        f148360c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
