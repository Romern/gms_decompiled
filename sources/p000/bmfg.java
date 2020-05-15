package p000;

/* renamed from: bmfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmfg f129092b;

    /* renamed from: c */
    private static volatile bxxk f129093c;

    /* renamed from: a */
    public bxwc f129094a = bxxn.f165040b;

    static {
        bmfg bmfg = new bmfg();
        f129092b = bmfg;
        bxvk.m124024a(bmfg.class, bmfg);
    }

    private bmfg() {
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
            return bxvk.m124022a(f129092b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bmed.class});
        } else if (i2 == 3) {
            return new bmfg();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129092b;
            }
            bxxk bxxk = f129093c;
            if (bxxk == null) {
                synchronized (bmfg.class) {
                    bxxk = f129093c;
                    if (bxxk == null) {
                        bxxk = new bxve(f129092b);
                        f129093c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
