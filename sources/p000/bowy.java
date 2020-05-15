package p000;

/* renamed from: bowy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bowy f135207c;

    /* renamed from: d */
    private static volatile bxxk f135208d;

    /* renamed from: a */
    public int f135209a;

    /* renamed from: b */
    public boolean f135210b;

    static {
        bowy bowy = new bowy();
        f135207c = bowy;
        bxvk.m124024a(bowy.class, bowy);
    }

    private bowy() {
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
            return bxvk.m124022a(f135207c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bowy();
        } else {
            if (i2 == 4) {
                return new bxvd(f135207c);
            }
            if (i2 == 5) {
                return f135207c;
            }
            bxxk bxxk = f135208d;
            if (bxxk == null) {
                synchronized (bowy.class) {
                    bxxk = f135208d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135207c);
                        f135208d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
