package p000;

/* renamed from: btin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btin extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btin f148993b;

    /* renamed from: c */
    private static volatile bxxk f148994c;

    /* renamed from: a */
    public int f148995a;

    static {
        btin btin = new btin();
        f148993b = btin;
        bxvk.m124024a(btin.class, btin);
    }

    private btin() {
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
            return bxvk.m124022a(f148993b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btin();
        } else {
            if (i2 == 4) {
                return new bxvd(f148993b);
            }
            if (i2 == 5) {
                return f148993b;
            }
            bxxk bxxk = f148994c;
            if (bxxk == null) {
                synchronized (btin.class) {
                    bxxk = f148994c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148993b);
                        f148994c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
