package p000;

/* renamed from: bkyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkyu f125508d;

    /* renamed from: e */
    private static volatile bxxk f125509e;

    /* renamed from: a */
    public int f125510a;

    /* renamed from: b */
    public int f125511b;

    /* renamed from: c */
    public int f125512c;

    static {
        bkyu bkyu = new bkyu();
        f125508d = bkyu;
        bxvk.m124024a(bkyu.class, bkyu);
    }

    private bkyu() {
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
            return bxvk.m124022a(f125508d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", blal.f125777a, "c", blam.f125778a});
        } else if (i2 == 3) {
            return new bkyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f125508d);
            }
            if (i2 == 5) {
                return f125508d;
            }
            bxxk bxxk = f125509e;
            if (bxxk == null) {
                synchronized (bkyu.class) {
                    bxxk = f125509e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125508d);
                        f125509e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
