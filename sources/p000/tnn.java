package p000;

/* renamed from: tnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final tnn f46304b;

    /* renamed from: c */
    private static volatile bxxk f46305c;

    /* renamed from: a */
    public bxwc f46306a = bxxn.f165040b;

    static {
        tnn tnn = new tnn();
        f46304b = tnn;
        bxvk.m124024a(tnn.class, tnn);
    }

    private tnn() {
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
            return bxvk.m124022a(f46304b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxcx.class});
        } else if (i2 == 3) {
            return new tnn();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f46304b;
            }
            bxxk bxxk = f46305c;
            if (bxxk == null) {
                synchronized (tnn.class) {
                    bxxk = f46305c;
                    if (bxxk == null) {
                        bxxk = new bxve(f46304b);
                        f46305c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
