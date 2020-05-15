package p000;

/* renamed from: bwib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwib extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwib f159607c;

    /* renamed from: e */
    private static volatile bxxk f159608e;

    /* renamed from: a */
    public bxwc f159609a = bxxn.f165040b;

    /* renamed from: b */
    public int f159610b;

    /* renamed from: d */
    private int f159611d;

    static {
        bwib bwib = new bwib();
        f159607c = bwib;
        bxvk.m124024a(bwib.class, bwib);
    }

    private bwib() {
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
            return bxvk.m124022a(f159607c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004\u001b\u0005ဌ\u0001", new Object[]{"d", "a", bwic.class, "b", bwhz.f159606a});
        } else if (i2 == 3) {
            return new bwib();
        } else {
            if (i2 == 4) {
                return new bxvd(f159607c);
            }
            if (i2 == 5) {
                return f159607c;
            }
            bxxk bxxk = f159608e;
            if (bxxk == null) {
                synchronized (bwib.class) {
                    bxxk = f159608e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159607c);
                        f159608e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
