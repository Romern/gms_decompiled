package p000;

/* renamed from: bwwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwwr f161286b;

    /* renamed from: d */
    private static volatile bxxk f161287d;

    /* renamed from: a */
    public int f161288a;

    /* renamed from: c */
    private int f161289c;

    static {
        bwwr bwwr = new bwwr();
        f161286b = bwwr;
        bxvk.m124024a(bwwr.class, bwwr);
    }

    private bwwr() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f161286b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bwws.f161290a});
        } else if (i2 == 3) {
            return new bwwr();
        } else {
            if (i2 == 4) {
                return new bxvd(f161286b);
            }
            if (i2 == 5) {
                return f161286b;
            }
            bxxk bxxk = f161287d;
            if (bxxk == null) {
                synchronized (bwwr.class) {
                    bxxk = f161287d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161286b);
                        f161287d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
