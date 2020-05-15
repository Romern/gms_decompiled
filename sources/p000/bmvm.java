package p000;

/* renamed from: bmvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvm extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmvm f131067b;

    /* renamed from: c */
    private static volatile bxxk f131068c;

    /* renamed from: a */
    public bxwc f131069a = bxxn.f165040b;

    static {
        bmvm bmvm = new bmvm();
        f131067b = bmvm;
        bxvk.m124024a(bmvm.class, bmvm);
    }

    private bmvm() {
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
            return bxvk.m124022a(f131067b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", bmvl.class});
        } else if (i2 == 3) {
            return new bmvm();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f131067b;
            }
            bxxk bxxk = f131068c;
            if (bxxk == null) {
                synchronized (bmvm.class) {
                    bxxk = f131068c;
                    if (bxxk == null) {
                        bxxk = new bxve(f131067b);
                        f131068c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
