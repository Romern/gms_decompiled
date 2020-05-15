package p000;

/* renamed from: bqky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqky extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqky f141063b;

    /* renamed from: c */
    private static volatile bxxk f141064c;

    /* renamed from: a */
    public bxwc f141065a = bxxn.f165040b;

    static {
        bqky bqky = new bqky();
        f141063b = bqky;
        bxvk.m124024a(bqky.class, bqky);
    }

    private bqky() {
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
            return bxvk.m124022a(f141063b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bqlc.class});
        } else if (i2 == 3) {
            return new bqky();
        } else {
            if (i2 == 4) {
                return new bxvd(f141063b);
            }
            if (i2 == 5) {
                return f141063b;
            }
            bxxk bxxk = f141064c;
            if (bxxk == null) {
                synchronized (bqky.class) {
                    bxxk = f141064c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141063b);
                        f141064c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
