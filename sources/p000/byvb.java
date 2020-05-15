package p000;

/* renamed from: byvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byvb f168410b;

    /* renamed from: c */
    private static volatile bxxk f168411c;

    /* renamed from: a */
    public bxwc f168412a = bxxn.f165040b;

    static {
        byvb byvb = new byvb();
        f168410b = byvb;
        bxvk.m124024a(byvb.class, byvb);
    }

    private byvb() {
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
            return bxvk.m124022a(f168410b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byvd.class});
        } else if (i2 == 3) {
            return new byvb();
        } else {
            if (i2 == 4) {
                return new bxvd(f168410b);
            }
            if (i2 == 5) {
                return f168410b;
            }
            bxxk bxxk = f168411c;
            if (bxxk == null) {
                synchronized (byvb.class) {
                    bxxk = f168411c;
                    if (bxxk == null) {
                        bxxk = new bxve(f168410b);
                        f168411c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
