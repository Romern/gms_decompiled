package p000;

/* renamed from: bxoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxoc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxoc f164133b;

    /* renamed from: c */
    private static volatile bxxk f164134c;

    /* renamed from: a */
    public bxwc f164135a = bxxn.f165040b;

    static {
        bxoc bxoc = new bxoc();
        f164133b = bxoc;
        bxvk.m124024a(bxoc.class, bxoc);
    }

    private bxoc() {
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
            return bxvk.m124022a(f164133b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxob.class});
        } else if (i2 == 3) {
            return new bxoc();
        } else {
            if (i2 == 4) {
                return new bxvd(f164133b);
            }
            if (i2 == 5) {
                return f164133b;
            }
            bxxk bxxk = f164134c;
            if (bxxk == null) {
                synchronized (bxoc.class) {
                    bxxk = f164134c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164133b);
                        f164134c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
