package p000;

/* renamed from: bter */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bter extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bter f148556b;

    /* renamed from: c */
    private static volatile bxxk f148557c;

    /* renamed from: a */
    public bxwc f148558a = bxxn.f165040b;

    static {
        bter bter = new bter();
        f148556b = bter;
        bxvk.m124024a(bter.class, bter);
    }

    private bter() {
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
            return bxvk.m124022a(f148556b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzkv.class});
        } else if (i2 == 3) {
            return new bter();
        } else {
            if (i2 == 4) {
                return new bxvd(f148556b);
            }
            if (i2 == 5) {
                return f148556b;
            }
            bxxk bxxk = f148557c;
            if (bxxk == null) {
                synchronized (bter.class) {
                    bxxk = f148557c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148556b);
                        f148557c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}