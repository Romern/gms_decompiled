package p000;

/* renamed from: cbps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbps extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbps f177952b;

    /* renamed from: c */
    private static volatile bxxk f177953c;

    /* renamed from: a */
    public String f177954a = "";

    static {
        cbps cbps = new cbps();
        f177952b = cbps;
        bxvk.m124024a(cbps.class, cbps);
    }

    private cbps() {
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
            return bxvk.m124022a(f177952b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbps();
        } else {
            if (i2 == 4) {
                return new bxvd(f177952b);
            }
            if (i2 == 5) {
                return f177952b;
            }
            bxxk bxxk = f177953c;
            if (bxxk == null) {
                synchronized (cbps.class) {
                    bxxk = f177953c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177952b);
                        f177953c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
