package p000;

/* renamed from: bokx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bokx f133471c;

    /* renamed from: d */
    private static volatile bxxk f133472d;

    /* renamed from: a */
    public int f133473a;

    /* renamed from: b */
    public int f133474b;

    static {
        bokx bokx = new bokx();
        f133471c = bokx;
        bxvk.m124024a(bokx.class, bokx);
    }

    private bokx() {
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
            return bxvk.m124022a(f133471c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bokx();
        } else {
            if (i2 == 4) {
                return new bxvd(f133471c);
            }
            if (i2 == 5) {
                return f133471c;
            }
            bxxk bxxk = f133472d;
            if (bxxk == null) {
                synchronized (bokx.class) {
                    bxxk = f133472d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133471c);
                        f133472d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
