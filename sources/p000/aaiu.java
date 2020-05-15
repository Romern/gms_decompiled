package p000;

/* renamed from: aaiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaiu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final aaiu f28231b;

    /* renamed from: c */
    private static volatile bxxk f28232c;

    /* renamed from: a */
    public bxwc f28233a = bxxn.f165040b;

    static {
        aaiu aaiu = new aaiu();
        f28231b = aaiu;
        bxvk.m124024a(aaiu.class, aaiu);
    }

    private aaiu() {
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
            return bxvk.m124022a(f28231b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aait.class});
        } else if (i2 == 3) {
            return new aaiu();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f28231b;
            }
            bxxk bxxk = f28232c;
            if (bxxk == null) {
                synchronized (aaiu.class) {
                    bxxk = f28232c;
                    if (bxxk == null) {
                        bxxk = new bxve(f28231b);
                        f28232c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
