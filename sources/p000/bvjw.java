package p000;

/* renamed from: bvjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvjw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvjw f156359b;

    /* renamed from: c */
    private static volatile bxxk f156360c;

    /* renamed from: a */
    public bxwc f156361a = bxxn.f165040b;

    static {
        bvjw bvjw = new bvjw();
        f156359b = bvjw;
        bxvk.m124024a(bvjw.class, bvjw);
    }

    private bvjw() {
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
            return bxvk.m124022a(f156359b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvjv.class});
        } else if (i2 == 3) {
            return new bvjw();
        } else {
            if (i2 == 4) {
                return new bvjt();
            }
            if (i2 == 5) {
                return f156359b;
            }
            bxxk bxxk = f156360c;
            if (bxxk == null) {
                synchronized (bvjw.class) {
                    bxxk = f156360c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156359b);
                        f156360c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
