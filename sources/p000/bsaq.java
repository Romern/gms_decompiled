package p000;

/* renamed from: bsaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsaq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsaq f143891b;

    /* renamed from: c */
    private static volatile bxxk f143892c;

    /* renamed from: a */
    public bxwc f143893a = bxxn.f165040b;

    static {
        bsaq bsaq = new bsaq();
        f143891b = bsaq;
        bxvk.m124024a(bsaq.class, bsaq);
    }

    private bsaq() {
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
            return bxvk.m124022a(f143891b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bsap.class});
        } else if (i2 == 3) {
            return new bsaq();
        } else {
            if (i2 == 4) {
                return new bxvd(f143891b);
            }
            if (i2 == 5) {
                return f143891b;
            }
            bxxk bxxk = f143892c;
            if (bxxk == null) {
                synchronized (bsaq.class) {
                    bxxk = f143892c;
                    if (bxxk == null) {
                        bxxk = new bxve(f143891b);
                        f143892c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
