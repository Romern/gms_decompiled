package p000;

/* renamed from: eim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eim extends bxvk implements bxxd {

    /* renamed from: b */
    public static final eim f15060b;

    /* renamed from: c */
    private static volatile bxxk f15061c;

    /* renamed from: a */
    public bxwc f15062a = bxxn.f165040b;

    static {
        eim eim = new eim();
        f15060b = eim;
        bxvk.m124024a(eim.class, eim);
    }

    private eim() {
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
            return bxvk.m124022a(f15060b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", eip.class});
        } else if (i2 == 3) {
            return new eim();
        } else {
            if (i2 == 4) {
                return new bxvd(f15060b);
            }
            if (i2 == 5) {
                return f15060b;
            }
            bxxk bxxk = f15061c;
            if (bxxk == null) {
                synchronized (eim.class) {
                    bxxk = f15061c;
                    if (bxxk == null) {
                        bxxk = new bxve(f15060b);
                        f15061c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
