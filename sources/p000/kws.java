package p000;

/* renamed from: kws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kws extends bxvk implements bxxd {

    /* renamed from: b */
    public static final kws f25323b;

    /* renamed from: c */
    private static volatile bxxk f25324c;

    /* renamed from: a */
    public String f25325a = "";

    static {
        kws kws = new kws();
        f25323b = kws;
        bxvk.m124024a(kws.class, kws);
    }

    private kws() {
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
            return bxvk.m124022a(f25323b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new kws();
        } else {
            if (i2 == 4) {
                return new bxvd(f25323b);
            }
            if (i2 == 5) {
                return f25323b;
            }
            bxxk bxxk = f25324c;
            if (bxxk == null) {
                synchronized (kws.class) {
                    bxxk = f25324c;
                    if (bxxk == null) {
                        bxxk = new bxve(f25323b);
                        f25324c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
