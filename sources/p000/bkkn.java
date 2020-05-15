package p000;

/* renamed from: bkkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bkkn f124589b;

    /* renamed from: c */
    private static volatile bxxk f124590c;

    /* renamed from: a */
    public bxwc f124591a = bxxn.f165040b;

    static {
        bkkn bkkn = new bkkn();
        f124589b = bkkn;
        bxvk.m124024a(bkkn.class, bkkn);
    }

    private bkkn() {
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
            return bxvk.m124022a(f124589b, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0000\u0006\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bkkn();
        } else {
            if (i2 == 4) {
                return new bxvd(f124589b);
            }
            if (i2 == 5) {
                return f124589b;
            }
            bxxk bxxk = f124590c;
            if (bxxk == null) {
                synchronized (bkkn.class) {
                    bxxk = f124590c;
                    if (bxxk == null) {
                        bxxk = new bxve(f124589b);
                        f124590c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
