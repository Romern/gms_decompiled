package p000;

/* renamed from: bmvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmvn f131070b;

    /* renamed from: c */
    private static volatile bxxk f131071c;

    /* renamed from: a */
    public bxwc f131072a = bxxn.f165040b;

    static {
        bmvn bmvn = new bmvn();
        f131070b = bmvn;
        bxvk.m124024a(bmvn.class, bmvn);
    }

    private bmvn() {
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
            return bxvk.m124022a(f131070b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bmvq.class});
        } else if (i2 == 3) {
            return new bmvn();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f131070b;
            }
            bxxk bxxk = f131071c;
            if (bxxk == null) {
                synchronized (bmvn.class) {
                    bxxk = f131071c;
                    if (bxxk == null) {
                        bxxk = new bxve(f131070b);
                        f131071c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
