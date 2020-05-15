package p000;

/* renamed from: buot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buot extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buot f154584c;

    /* renamed from: d */
    private static volatile bxxk f154585d;

    /* renamed from: a */
    public buov f154586a;

    /* renamed from: b */
    public buof f154587b;

    static {
        buot buot = new buot();
        f154584c = buot;
        bxvk.m124024a(buot.class, buot);
    }

    private buot() {
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
            return bxvk.m124022a(f154584c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buot();
        } else {
            if (i2 == 4) {
                return new bxvd(f154584c);
            }
            if (i2 == 5) {
                return f154584c;
            }
            bxxk bxxk = f154585d;
            if (bxxk == null) {
                synchronized (buot.class) {
                    bxxk = f154585d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154584c);
                        f154585d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
