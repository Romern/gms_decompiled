package p000;

/* renamed from: bvgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvgq f156031c;

    /* renamed from: d */
    private static volatile bxxk f156032d;

    /* renamed from: a */
    public int f156033a;

    /* renamed from: b */
    public bvgt f156034b;

    static {
        bvgq bvgq = new bvgq();
        f156031c = bvgq;
        bxvk.m124024a(bvgq.class, bvgq);
    }

    private bvgq() {
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
            return bxvk.m124022a(f156031c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvgq();
        } else {
            if (i2 == 4) {
                return new bxvd(f156031c);
            }
            if (i2 == 5) {
                return f156031c;
            }
            bxxk bxxk = f156032d;
            if (bxxk == null) {
                synchronized (bvgq.class) {
                    bxxk = f156032d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156031c);
                        f156032d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
