package p000;

/* renamed from: cbcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbcd f176642b;

    /* renamed from: c */
    private static volatile bxxk f176643c;

    /* renamed from: a */
    public bxwc f176644a = bxxn.f165040b;

    static {
        cbcd cbcd = new cbcd();
        f176642b = cbcd;
        bxvk.m124024a(cbcd.class, cbcd);
    }

    private cbcd() {
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
            return bxvk.m124022a(f176642b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", cbce.class});
        } else if (i2 == 3) {
            return new cbcd();
        } else {
            if (i2 == 4) {
                return new bxvd(f176642b);
            }
            if (i2 == 5) {
                return f176642b;
            }
            bxxk bxxk = f176643c;
            if (bxxk == null) {
                synchronized (cbcd.class) {
                    bxxk = f176643c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176642b);
                        f176643c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
