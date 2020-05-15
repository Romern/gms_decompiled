package p000;

/* renamed from: bllz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bllz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bllz f126829b;

    /* renamed from: c */
    private static volatile bxxk f126830c;

    /* renamed from: a */
    public bxwc f126831a = bxxn.f165040b;

    static {
        bllz bllz = new bllz();
        f126829b = bllz;
        bxvk.m124024a(bllz.class, bllz);
    }

    private bllz() {
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
            return bxvk.m124022a(f126829b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", blly.class});
        } else if (i2 == 3) {
            return new bllz();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f126829b;
            }
            bxxk bxxk = f126830c;
            if (bxxk == null) {
                synchronized (bllz.class) {
                    bxxk = f126830c;
                    if (bxxk == null) {
                        bxxk = new bxve(f126829b);
                        f126830c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
